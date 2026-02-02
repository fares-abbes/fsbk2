package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Summary_Compensation_OnUs", schema = "FRANSABANK")
public class SummaryCompensationOnUs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newSummary_Compensation_OnUseg")
	@SequenceGenerator(name = "newSummary_Compensation_OnUseg", sequenceName = "FRANSABANK.Summary_Compensation_OnUsegns", allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private int id;

	@Column(name = "exec_DATE")
	private String execDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExecDate() {
		return execDate;
	}

	public void setExecDate(String execDate) {
		this.execDate = execDate;
	}

}
