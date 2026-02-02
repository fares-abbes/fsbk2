package com.mss.unified.entities;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;

@Entity
@Table(name = "remise_total",schema="POS")
public class RemiseTotal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Embedded
	RemiseTotalIdentifiey identify;
	private String currency;
	private String Amount;
	private int count=0;
	private String amount2;
	private String count2;
	private String status;
	private Date created_at;

	@OneToMany(mappedBy = "identify", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<RemiseDetails> detail= new HashSet<>();

}
