package com.mss.unified.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(schema = "PORTEUR",name = "COMM")

public class Comm{




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CommmSequence")
    @SequenceGenerator(name = "CommmSequence", sequenceName = "PORTEUR.CommmSequence", allocationSize = 1)
    @Column(name = "Id", nullable = false)
    private int id;
    @Column(name = "TRANSACTION_SOURCE", nullable = true)
    private Integer transactionSource;
    @Column(name = "FIXED_COMMISSION", nullable = true)
    private String fixedCommission;
    @Column(name = "VARIABLE_COMISSION", nullable = true)
    private String variableComission;
    @Column(name = "LABEL", nullable = false)

    private String libelle;
    @Column(name = "CURRENCY", nullable = true)
    private String currency;
    @OneToOne
    @JoinColumn(name = "PROGRAM")
    private Program program;
    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.DETACH)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(name = "PROG_COMM", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "PROG_COMM_ID"),
            inverseJoinColumns = @JoinColumn(name = "CODE_TRANS"))
    private Set<EmvServiceValues> emvServiceValues = new HashSet<>();
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.DETACH)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "TRANS")
    private EmvServiceValues transaction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getTransactionSource() {
        return transactionSource;
    }

    public void setTransactionSource(Integer transactionSource) {
        this.transactionSource = transactionSource;
    }

    public String getFixedCommission() {
        return fixedCommission;
    }

    public void setFixedCommission(String fixedCommission) {
        this.fixedCommission = fixedCommission;
    }

    public String getVariableComission() {
        return variableComission;
    }

    public void setVariableComission(String variableComission) {
        this.variableComission = variableComission;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Set<EmvServiceValues> getEmvServiceValues() {
        return emvServiceValues;
    }

    public void setEmvServiceValues(Set<EmvServiceValues> emvServiceValues) {
        this.emvServiceValues = emvServiceValues;
    }

    public EmvServiceValues getTransaction() {
        return transaction;
    }

    public void setTransaction(EmvServiceValues transaction) {
        this.transaction = transaction;
    }
}
