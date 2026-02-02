package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS",schema = "PORTEUR")
public class Customer {

    public Customer(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CustomerSequence")
    @SequenceGenerator(name = "CustomerSequence", sequenceName = "PORTEUR.CustomerSequence", allocationSize = 1)
    @Column(name = "CUS_CODE", nullable = false)
    private int customerCode;



    @Column(name = "IDEN_CODE")
    private Integer identityCode;



    @Column(name = "GLRISK_CODE")
    private Integer globalRiskCode;



    @Column(name = "CUST_CODE")
    private Integer customerStatusCode;



    @Column(name = "CUS_IDEN")
    private String customerIdentidy;



    @Column(name = "CUS_NAME", nullable = true)
    private String customerName;
    
    private String customerFirstName;
    
    private String customerLastName;

    @Column(name = "CUS_ADRESSE", nullable = true)
    private String customerAddress;



    @Column(name = "CUS_GSM", nullable = true)
    private String customerGSM;




    @Column(name = "CUS_CITY", nullable = true)
    private String customerCity;




    @Column(name = "CUS_TOWN", nullable = true)
    private String customerTown;



    @Column(name = "CUS_POSTAL", nullable = true)
    private String customerPostal;

    private String girlName;
    private String birthDate;
    private String birthPlace;
    private String email;
    private String homePhone;
    
    private String radical;







    public String getRadical() {
		return radical;
	}


	public void setRadical(String radical) {
		this.radical = radical;
	}


	public String getCustomerFirstName() {
		return customerFirstName;
	}


	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}


	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Customer(Integer identityCode, Integer globalRiskCode, Integer customerStatusCode, String customerIdentidy,
                    String customerName, String customerAddress, String customerGSM, String customerCity, String customerTown,
                    String customerPostal) {
        super();
        this.identityCode = identityCode;
        this.globalRiskCode = globalRiskCode;
        this.customerStatusCode = customerStatusCode;
        this.customerIdentidy = customerIdentidy;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerGSM = customerGSM;
        this.customerCity = customerCity;
        this.customerTown = customerTown;
        this.customerPostal = customerPostal;


    }


    public int getCustomerCode() {
        return customerCode;
    }



    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }



    public Integer getIdentityCode() {
        return identityCode;
    }



    public void setIdentityCode(Integer identityCode) {
        this.identityCode = identityCode;
    }



    public Integer getGlobalRiskCode() {
        return globalRiskCode;
    }



    public void setGlobalRiskCode(Integer globalRiskCode) {
        this.globalRiskCode = globalRiskCode;
    }



    public Integer getCustomerStatusCode() {
        return customerStatusCode;
    }



    public void setCustomerStatusCode(Integer customerStatusCode) {
        this.customerStatusCode = customerStatusCode;
    }



    public String getCustomerIdentidy() {
    	if (customerIdentidy.length()>=4)
        return String.valueOf(customerIdentidy)
                .replace(String.valueOf(customerIdentidy).substring(3), "xxxxxx");
    	else return customerIdentidy;
    }
    public String getClearCustomerIdentidy() {
        return customerIdentidy;
    }





    public void setCustomerIdentidy(String customerIdentidy) {
        this.customerIdentidy = customerIdentidy;
    }





    public String getCustomerName() {
        return customerName;
    }



    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



    public String getCustomerAddress() {
        return customerAddress;
    }



    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }



    public String getCustomerGSM() {
        return customerGSM;
    }



    public void setCustomerGSM(String customerGSM) {
        this.customerGSM = customerGSM;
    }



    public String getCustomerCity() {
        return customerCity;
    }



    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }



    public String getCustomerTown() {
        return customerTown;
    }



    public void setCustomerTown(String customerTown) {
        this.customerTown = customerTown;
    }



    public String getCustomerPostal() {
        return customerPostal;
    }



    public void setCustomerPostal(String customerPostal) {
        this.customerPostal = customerPostal;
    }

    public String getGirlName() {
		return girlName;
	}


	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getBirthPlace() {
		return birthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHomePhone() {
		return homePhone;
	}


	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	@Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", identityCode=" + identityCode +
                ", globalRiskCode=" + globalRiskCode +
                ", customerStatusCode=" + customerStatusCode +
                ", customerIdentidy='" + customerIdentidy + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerGSM='" + customerGSM + '\'' +
                ", customerCity='" + customerCity + '\'' +
                ", customerTown='" + customerTown + '\'' +
                ", customerPostal='" + customerPostal + '\'' +
                '}';
    }
}
