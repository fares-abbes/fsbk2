package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST_STATUS", schema = "PORTEUR")
public class RequestCardStatus {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "RequestStatusSequence")
	  @SequenceGenerator(name = "RequestStatusSequence", sequenceName = "PORTEUR.RequestStatusSequence", allocationSize = 1)
	  @Column(name = "CODE_status", nullable = false)
	  private int requestStatusCode;
	
	  @Column(name = "LIBELLE")
	  private String status;

	public int getRequestStatusCode() {
		return requestStatusCode;
	}

	public void setRequestStatusCode(int requestStatusCode) {
		this.requestStatusCode = requestStatusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RequestCardStatus(String status) {
		super();
		this.status = status;
	}

	@Override
	public String toString() {
		return "RequestCardStatus{" +
				"requestStatusCode=" + requestStatusCode +
				", status='" + status + '\'' +
				'}';
	}

	public RequestCardStatus() {
	}
}
