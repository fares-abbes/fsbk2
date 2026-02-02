package com.mss.unified.services;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.mss.unified.entities.BkmvtiFransaBank;
import com.mss.unified.entities.BkmHistory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DynamicQueryService {

    public <T> Specification<T> buildSpecification(Map<String, String> criteria, Class<T> entityClass) {
        return (Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            criteria.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    Predicate predicate = buildPredicate(root, cb, key, value);
                    if (predicate != null) {
                        predicates.add(predicate);
                    }
                }
            });

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }

    private <T> Predicate buildPredicate(Root<T> root, CriteriaBuilder cb, String key, String value) {
        if (key.endsWith("S")) {
            String fieldName = key.substring(0, key.length() - 1);
            if (hasField(root, fieldName)) {
                return cb.greaterThanOrEqualTo(root.get(fieldName), value);
            }
        }
        
        if (key.endsWith("E")) {
            String fieldName = key.substring(0, key.length() - 1);
            if (hasField(root, fieldName)) {
                return cb.lessThanOrEqualTo(root.get(fieldName), value);
            }
        }

        if (!hasField(root, key)) {
            return null;
        }

        return cb.like(root.get(key), "%" + value + "%");
    }

    private <T> boolean hasField(Root<T> root, String fieldName) {
        try {
            root.get(fieldName);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public <T> Specification<T> addAcceptedCondition(Specification<T> spec, String accepted) {
        if (accepted == null) {
            return spec;
        }

        Specification<T> acceptedSpec;
        
        switch (accepted) {
            case "4":
                acceptedSpec = (root, query, cb) -> cb.or(
                    cb.equal(root.get("accepted"), "3"),
                    cb.isNull(root.get("accepted"))
                );
                break;
            case "21":
                acceptedSpec = (root, query, cb) -> cb.and(
                    cb.equal(root.get("accepted"), "2"),
                    cb.like(root.get("flag"), "1%")
                );
                break;
            case "22":
                acceptedSpec = (root, query, cb) -> cb.and(
                    cb.equal(root.get("accepted"), "2"),
                    cb.like(root.get("flag"), "2%")
                );
                break;
            case "23":
                acceptedSpec = (root, query, cb) -> cb.and(
                    cb.equal(root.get("accepted"), "2"),
                    cb.isNull(root.get("flag"))
                );
                break;
            default:
                acceptedSpec = (root, query, cb) -> cb.equal(root.get("accepted"), accepted);
                break;
        }

        return spec == null ? acceptedSpec : spec.and(acceptedSpec);
    }

    public <T> Specification<T> addStatusTechniqueCondition(Specification<T> spec, String accepted) {
        if (accepted == null) {
            return spec;
        }

        Specification<T> statusSpec;
        
        switch (accepted) {
            case "1":
                statusSpec = (root, query, cb) -> cb.and(
                    cb.equal(root.get("statusTechnique"), "000"),
                    cb.isNull(root.get("accepted"))
                );
                break;
            case "2":
                statusSpec = (root, query, cb) -> cb.and(
                    cb.equal(root.get("statusTechnique"), "000"),
                    cb.equal(root.get("accepted"), "1")
                );
                break;
            case "3":
                statusSpec = (root, query, cb) -> cb.and(
                    cb.isNotNull(root.get("statusTechnique")),
                    cb.notEqual(root.get("statusTechnique"), "000")
                );
                break;
            case "4":
                statusSpec = (root, query, cb) -> cb.isNull(root.get("statusTechnique"));
                break;
            default:
                return spec;
        }

        return spec == null ? statusSpec : spec.and(statusSpec);
    }

    private static final DateTimeFormatter INPUT_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter SORTABLE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    public String toSortableDate(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        try {
            LocalDate date = LocalDate.parse(dateStr, INPUT_FORMAT);
            return date.format(SORTABLE_FORMAT);
        } catch (Exception e) {
            return null;
        }
    }

    public Specification<BkmvtiFransaBank> buildBkmvtiSpecification(
            String dcoStart, String dcoEnd, String dvaStart, String dvaEnd,
            String codeOperation, String agence, String numCompte, String numPiece,
            String pieceComptable, String refDossier) {

        String dcoStartSortable = toSortableDate(dcoStart);
        String dcoEndSortable = toSortableDate(dcoEnd);
        String dvaStartSortable = toSortableDate(dvaStart);
        String dvaEndSortable = toSortableDate(dvaEnd);
        
        return (Root<BkmvtiFransaBank> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (codeOperation != null && !codeOperation.isEmpty()) {
                predicates.add(cb.equal(root.get("codeOperation"), codeOperation));
            }
            if (agence != null && !agence.isEmpty()) {
                predicates.add(cb.like(root.get("agence"), "%" + agence + "%"));
            }
            if (numCompte != null && !numCompte.isEmpty()) {
                predicates.add(cb.like(root.get("numCompte"), "%" + numCompte + "%"));
            }
            if (numPiece != null && !numPiece.isEmpty()) {
                predicates.add(cb.like(root.get("numPiece"), "%" + numPiece + "%"));
            }
            if (pieceComptable != null && !pieceComptable.isEmpty()) {
                predicates.add(cb.like(root.get("pieceComptable"), "%" + pieceComptable + "%"));
            }
            if (refDossier != null && !refDossier.isEmpty()) {
                predicates.add(cb.like(root.get("refDossier"), "%" + refDossier + "%"));
            }

            if (dcoStartSortable != null) {
                predicates.add(cb.greaterThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateComptable"), 7, 4), cb.substring(root.get("dateComptable"), 4, 2)), cb.substring(root.get("dateComptable"), 1, 2)),
                    dcoStartSortable));
            }
            if (dcoEndSortable != null) {
                predicates.add(cb.lessThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateComptable"), 7, 4), cb.substring(root.get("dateComptable"), 4, 2)), cb.substring(root.get("dateComptable"), 1, 2)),
                    dcoEndSortable));
            }
            if (dvaStartSortable != null) {
                predicates.add(cb.greaterThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateValeur"), 7, 4), cb.substring(root.get("dateValeur"), 4, 2)), cb.substring(root.get("dateValeur"), 1, 2)),
                    dvaStartSortable));
            }
            if (dvaEndSortable != null) {
                predicates.add(cb.lessThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateValeur"), 7, 4), cb.substring(root.get("dateValeur"), 4, 2)), cb.substring(root.get("dateValeur"), 1, 2)),
                    dvaEndSortable));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
    public Specification<BkmHistory> buildBkmHistorySpecification(
            String dcoStart, String dcoEnd, String dvaStart, String dvaEnd,
            String codeOperation, String agence, String numCompte, String numPiece,
            String pieceComptable, String refDossier) {

        String dcoStartSortable = toSortableDate(dcoStart);
        String dcoEndSortable = toSortableDate(dcoEnd);
        String dvaStartSortable = toSortableDate(dvaStart);
        String dvaEndSortable = toSortableDate(dvaEnd);

        return (Root<BkmHistory> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (codeOperation != null && !codeOperation.isEmpty()) {
                predicates.add(cb.equal(root.get("codeOperation"), codeOperation));
            }
            if (agence != null && !agence.isEmpty()) {
                predicates.add(cb.like(root.get("agence"), "%" + agence + "%"));
            }
            if (numCompte != null && !numCompte.isEmpty()) {
                predicates.add(cb.like(root.get("numCompte"), "%" + numCompte + "%"));
            }
            if (numPiece != null && !numPiece.isEmpty()) {
                predicates.add(cb.like(root.get("numPiece"), "%" + numPiece + "%"));
            }
            if (pieceComptable != null && !pieceComptable.isEmpty()) {
                predicates.add(cb.like(root.get("pieceComptable"), "%" + pieceComptable + "%"));
            }
            if (refDossier != null && !refDossier.isEmpty()) {
                predicates.add(cb.like(root.get("refDossier"), "%" + refDossier + "%"));
            }

            if (dcoStartSortable != null) {
                predicates.add(cb.greaterThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateComptable"), 7, 4), cb.substring(root.get("dateComptable"), 4, 2)), cb.substring(root.get("dateComptable"), 1, 2)),
                    dcoStartSortable));
            }
            if (dcoEndSortable != null) {
                predicates.add(cb.lessThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateComptable"), 7, 4), cb.substring(root.get("dateComptable"), 4, 2)), cb.substring(root.get("dateComptable"), 1, 2)),
                    dcoEndSortable));
            }
            if (dvaStartSortable != null) {
                predicates.add(cb.greaterThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateValeur"), 7, 4), cb.substring(root.get("dateValeur"), 4, 2)), cb.substring(root.get("dateValeur"), 1, 2)),
                    dvaStartSortable));
            }
            if (dvaEndSortable != null) {
                predicates.add(cb.lessThanOrEqualTo(
                    cb.concat(cb.concat(cb.substring(root.get("dateValeur"), 7, 4), cb.substring(root.get("dateValeur"), 4, 2)), cb.substring(root.get("dateValeur"), 1, 2)),
                    dvaEndSortable));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
