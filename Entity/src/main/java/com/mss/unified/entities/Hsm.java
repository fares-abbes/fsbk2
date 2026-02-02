package com.mss.unified.entities;

import javax.persistence.*;
import java.net.Socket;

@Entity
@Table(schema = "SWITCH",name = "HSM_SERVER")
public class Hsm implements Comparable<Hsm> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "hsmseq")
    @SequenceGenerator(name = "hsmseq", sequenceName = "SWITCH.hsmseq", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private int id;
    private String address;
    private int port;
    private Integer weight;
    private Integer attempts;
    private Integer remaining;
    private boolean isActive;
    private String env;
    @Transient
    private Socket connection;
    //private Integer index;

    public Hsm(int id,String address,int port, Integer weight, Integer attempts , Integer remaining, boolean isActive) {
        this.id = id;
        this.address = address;
        this.port=port;
        this.weight = weight;
        this.attempts = attempts;
        this.isActive = isActive;
        this.remaining = remaining;
        //this.index = index;
    }

    public Hsm(int id,String address,int port, Integer weight, Integer attempts , Integer remaining, boolean isActive,Socket connection) {
        this.id = id;
        this.address = address;
        this.port=port;
        this.weight = weight;
        this.attempts = attempts;
        this.isActive = isActive;
        this.remaining = remaining;
        this.connection=connection;
        //this.index = index;
    }

    public Hsm() {

    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Socket getConnection() {
        return connection;
    }

    public void setConnection(Socket connection) {
        this.connection = connection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address =address;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public boolean isActive() {
        return isActive;
    }

    /*public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }*/

    public void setActive(boolean active) {
        isActive = active;
    }
    
    

    public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append(address).append(',');
        sb.append(weight).append(",");
        sb.append(attempts).append(",");
        sb.append(remaining).append(",");
        if (isActive)
            sb.append("Active");
        else
            sb.append("error!!");

        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Hsm hsm) {
        return hsm.getWeight().compareTo(this.getWeight());

    }
}
