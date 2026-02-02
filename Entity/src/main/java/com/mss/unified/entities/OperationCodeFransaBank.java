package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "OPERATION_FRANSABANK", schema = "FRANSABANK")
public class OperationCodeFransaBank {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newoperation_fransaBank_sequence")
    @SequenceGenerator(name = "newoperation_fransaBank_sequence", sequenceName = "FRANSABANK.operation_fransaBank_sequencens", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "type_operation")
    private String type;
    @Column(name = "libelle")
    private String identification;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
