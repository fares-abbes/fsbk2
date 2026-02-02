package com.mss.unified.repositories;
import com.mss.unified.entities.BkmHistory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BkmHistory;


@Repository
public interface BkmHistoryRepository extends JpaRepository<BkmHistory, Long>, JpaSpecificationExecutor<BkmHistory> {
	@Query("SELECT b FROM BkmHistory b WHERE  (b.codeOperation = :ope OR :ope IS NULL) "
			+"AND  (  :dvaStart IS NULL OR  b.dateValeur >=  :dvaStart ) AND  (  :dcoEnd IS NULL OR b.dateValeur <=:dvaEnd)"
			+"AND  (  :dcoStart IS NULL OR  b.dateComptable >=  :dcoStart ) AND  (  :dcoEnd IS NULL OR b.dateComptable<=:dcoEnd )"
			+ "AND (b.agence like %:age% OR :age IS NULL) " 
			+ "AND (b.numCompte like %:ncp% OR :ncp IS NULL) " 
			+ "AND (b.numPiece like %:pie% OR :pie IS NULL) "
			+ "AND (b.pieceComptable like %:pieceComptable% OR :pieceComptable IS NULL) "
			+ "AND (b.refernceLettrage like %:referenceLettrage% OR :referenceLettrage IS NULL)")
	Page<BkmHistory>   findByfiltred(Pageable pageable, String dcoStart,String dcoEnd, String dvaStart,String dvaEnd,  String ope, String age
			, String ncp, String pie, String pieceComptable, String referenceLettrage);

}
