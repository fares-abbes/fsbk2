package com.mss.unified.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "VISA_OUTGOING_ATM", schema = "FRANSABANK")
public class VisaOutGoingAtm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	private Integer outComingCode;

	private String issuerIdentification;
	private String treat;
	private String affiBin;

	private String settlementDate;

	private String transactionIdentification;

	private String validationCode;

	private String retrRefNumber;

	private String tracNumber;

	private String batchNumber;

	private String requestMessageType;

	private String responseCode;

	private String procCode;
	private String givFlag;
	private String cardNumber;
	private String accountNumberExtension;
	private double transactionAmount;
	@Column(name = "CURRENCY_CODE_TRANXN_AMOUNT")
	private String currencyCodeTransactionAmount;
	private String rawDataReci;

	private String localTransactionDate;

	private String localTransactionTime;

	private String givFlagPrev;

	private String acquirerInstId;

	private String acquirerBusinessId;

	private String sourceStatId;

	private String destinationStatId;

	private String messageReasonCode;
	private String stipReasonCode;
	@Column(name = "AUTHORIZATION_ID_RESP_CODE")
	private String authorizationIdResponseCode;
	private String netwId;
	private String adviSourceFlag;

	private String adviTransactionFlag;

	@Column(name = "BASE_L_BILLING_FLAG")
	private String baseLBillingFlag;
	private String tracDataIndi;
	private String reimAttr;
	private String reimFeeDebiCreditIndi;
	private String reimFee;
	private Integer summaryCode;

	private String pvsPerfIndi;

	private String transactionDate;

	private String transactionTime;

	private String transactionOtherAmount;

	private String downReasonCode;

	private String authCharIndi;

	private String cardSequenceNumber;
	private String cardExpiryDate;
	private String cvvResultCode;
	private String servSele;
	private String irfOpti;

	@Column(name = "MAIL_ELECTRO_COMMERCE_INDI")
	private String mailElectronicCommerceIndi;
	private String merchantVolumeIndi;
	private String additionalDataIndi;
	private String feeProgramIndi;
	private String posCondCode;

	private String posEntryMode;
	private String posTerminalType;
	private String posTerminalCapability;
	private String merchantType;
	private String cardAcceptorTerminalId;
	private String cardAcceptorName;
	private String cardAcceptorCity;
	private String cardAcceptorCountry;
	private String geoStatCode;
	private String geoZipCode;
	private String geoZipFour;
	private String geoCountryCode;
	private String aquirerInstCounCode;
	private String panExteCounCode;
	private String forwInstCountCode;

	private String custIdenMeth;
	private String issuAffiBin;
	private String plusSettDate;
	private String plusTimeStam;
	private String plusAcquiPmc;
	private String plusIssuPmc;
	private String surcSign;
	private double surcAmount;
	private String rateTablDate;
	private double transAmo2;
	private String tranCurrencyCode;
	private double settAmount;
	private String settCurrencyCode;
	private String cardBillingAmount;
	private String cardBillCurrCode;
	private String responseMessageType;
	private String settServRequ;
	private String settServSele;
	private String cardAccepId;
	private String forwInstId;

	private String cardBillOtherAmount;
	private String convFeesCurr;
	private String alloConvFeesCurr;
	private String optiIssuFeesCurr;
	private String optiIssuFeecBillCurr;
	private String convFeecBillCurr;

	private String chipCondCode;
	private String termCapaProf;
	private String authResCode;
	private String arpcRespCode;
	private String cardAuthResu;
	private String unrpNumb;

	private String termVerifResu;
	private String termSeriNumb;
	private String deriKeyInde;
	private String crypVer;
	private String cardVerifResu;
	private String ccpsTransIndi;

	private String cardAuthReliIndi;
	private String crypArqTcAac;
	private String applTransCoun;
	private String applIntfProf;
	private String termCounCode;
	private String termTranDate;

	private String crypAmount;
	private String crypCurrCode;
	private String crypCashAmount;

	private String crypTransType;

	private String ODE_MESSAGE_TYPE;
	private String ODE_TRAC_NUMBER;
	private String ODE_TRAN_DATE;
	private String ODE_TRAN_TIME;
	private String ODE_ACQU_INST_ID;
	private String ODE_FWDN_INST_ID;
	private String USAG_CODE;
	private String DOCU_INDI;
	private String CHAR_REFE_NUMB;
	private String MESS_TEXT;
	private String AVS_RESP_CODE;
	private String PURC_ID_FORM;
	private String PURC_ID_NUMB;
	private String CHEC_IN_CHEC_OUT;
	private String NO_SHOW_INDI;
	private String EXTR_CHAR;
	private String MULT_CLEA_SEQU_NO;
	private String MULT_CLEA_SEQU_COUN;
	private String REST_TICK_INDI;
	private String TOTA_AMOU_AUTH;
	private String REQU_PAYM_SERV;
	private String CHAR_RIGH_INDI;
	private String REPL_AMOU;
	private String CRS_VALI_RETU_CODE;
	private String CHAR_FLOO_LIMI_INDI;
	private String CHAR_CRB_INDI;
	private String CHAR_STIP_INDI;
	private String CHAR_MAIL_PHON_INDI;
	private String SPEC_CHAR_INDI;
	private String CHAR_SPEC_COND_RIS_INDI;
	private String CHAR_SPEC_COND_MERC_INDI;
	private String SI_REIM_ATTR;
	private String OD_ORIG_TRAC;
	private String OD_ORIG_TRAN_DATE;
	private String OD_ORIG_TRAN_TIME;
	private String FREE_TEXT;
	private String LOCA_DATE;
	private String LOCA_TIME;
	private String ADDI_TRAC_DATA;
	private String ISSU_ROUT_NUMB;
	private String MI_FINA_INST_ID;
	private String MI_MERC_ABA_NUMB;
	private String ISSU_DISC_DATA;
	private String ISSU_SCRI_RESU;
	private String FIEL_55_LENG;
	private String VISA_CASH_CEPS_DATA4;
	private String VISA_CASH_CEPS_DATA2;
	private String VISA_CASH_CEPS_DATA3;
	private String CHEC_SETT_CODE;
	private String ABA_NUMB;
	private String ACCO_NUMB;
	private String CHEC_NUMB;
	private String atmCode;

	private Integer cpCode;

	private String reversal;

	private LocalDateTime lastDateEnvoiMail;
	private String fileDate;

	public VisaOutGoingAtm() {
	}

	public VisaOutGoingAtm(int summary) {
		super();
		this.summaryCode = summary;
	}

	public void visaOutGoingAtmSetter(String visa) {
		switch (visa.substring(34, 40)) {
		case "V22200":
			this.issuerIdentification = visa.substring(40, 41);
			this.affiBin = visa.substring(61, 71);
			this.settlementDate = visa.substring(71, 77);
			this.transactionIdentification = visa.substring(77, 92);
			this.validationCode = visa.substring(92, 96);
			this.retrRefNumber = visa.substring(96, 108);
			this.tracNumber = visa.substring(108, 114);
			this.batchNumber = visa.substring(114, 118);
			this.requestMessageType = visa.substring(118, 122);
			this.responseCode = visa.substring(122, 124);
			this.procCode = visa.substring(124, 130);
			this.cardNumber = visa.substring(130, 146).trim();
			this.accountNumberExtension = visa.substring(146, 149).trim();

			this.currencyCodeTransactionAmount = visa.substring(161, 164);
			this.transactionAmount = convertAmount(convertCurrency(visa.substring(149, 161)));
			if (visa.substring(164).contains("0")) {
				this.rawDataReci = visa.substring(164).replace("0", "");
			}
			break;
		case "V22210":
			this.localTransactionDate = visa.substring(40, 44);
			this.localTransactionTime = visa.substring(44, 50);
			this.givFlag = visa.substring(50, 51);
			this.givFlagPrev = visa.substring(51, 52);
			this.acquirerInstId = visa.substring(52, 63);
			this.acquirerBusinessId = visa.substring(63, 71);
			this.sourceStatId = visa.substring(71, 77);
			this.destinationStatId = visa.substring(77, 83);
			this.messageReasonCode = visa.substring(83, 87);
			this.stipReasonCode = visa.substring(87, 91);
			this.authorizationIdResponseCode = visa.substring(91, 97);
			this.netwId = visa.substring(97, 101);
			this.adviSourceFlag = visa.substring(101, 102);
			this.adviTransactionFlag = visa.substring(102, 103);
			this.baseLBillingFlag = visa.substring(103, 104);
			this.tracDataIndi = visa.substring(104, 105);
			this.reimAttr = visa.substring(105, 106);
			this.reimFeeDebiCreditIndi = visa.substring(106, 107);
			this.reimFee = convertCurrency(visa.substring(107, 114));
			this.pvsPerfIndi = visa.substring(114, 115);
			this.transactionDate = visa.substring(115, 119);
			this.transactionTime = visa.substring(119, 125);
			this.transactionOtherAmount = convertCurrency(visa.substring(125, 137));
			this.downReasonCode = visa.substring(137, 139);
			this.authCharIndi = visa.substring(139, 140);
			this.responseMessageType = visa.substring(140, 144);
			this.cardSequenceNumber = visa.substring(144, 147);
			if (visa.substring(147, 151).equals("0000")) {
				setCardExpiryDate(null);
			}
			this.cardExpiryDate = visa.substring(147, 151);
			this.cvvResultCode = visa.substring(151, 152);
			this.settServRequ = visa.substring(152, 153);
			this.settServSele = visa.substring(153, 154);
			this.irfOpti = visa.substring(154, 155);
			this.mailElectronicCommerceIndi = visa.substring(155, 156);
			this.merchantVolumeIndi = visa.substring(156, 158);
			this.additionalDataIndi = visa.substring(158, 159);
			this.feeProgramIndi = visa.substring(159, 162);
			break;
		case "V22220":
			this.posCondCode = visa.substring(40, 42);
			this.posEntryMode = visa.substring(42, 45);
			this.posTerminalType = visa.substring(45, 47);
			this.posTerminalCapability = visa.substring(47, 48);
			this.merchantType = visa.substring(48, 52);
			this.cardAcceptorTerminalId = visa.substring(52, 60);
			this.cardAccepId = visa.substring(60, 75);
			this.cardAcceptorName = visa.substring(75, 100);
			this.cardAcceptorCity = visa.substring(100, 113);
			this.cardAcceptorCountry = visa.substring(113, 115);
			this.geoStatCode = visa.substring(115, 117);
			this.geoZipCode = visa.substring(117, 122);
			this.geoZipFour = visa.substring(122, 126);
			this.geoCountryCode = visa.substring(126, 129);
			this.aquirerInstCounCode = visa.substring(129, 132);
			this.panExteCounCode = visa.substring(132, 135);
			this.forwInstId = visa.substring(135, 146);
			this.forwInstCountCode = visa.substring(146, 149);
			this.custIdenMeth = visa.substring(149, 150);
			this.issuAffiBin = visa.substring(150, 160);
			break;
		case "V22250":
			this.plusSettDate = visa.substring(40, 46);
			this.plusTimeStam = visa.substring(46, 52);
			this.plusAcquiPmc = visa.substring(55, 61);
			this.plusIssuPmc = visa.substring(61, 67);
			this.surcSign = visa.substring(67, 68);
			this.surcAmount = convertAmount(convertCurrency(visa.substring(68, visa.length() - 1).trim()));
			break;
		case "V22260":
			if (!visa.startsWith("0000", 40)) {
				setRateTablDate(visa.substring(40, 44));
			} else {
				setRateTablDate(null);
			}
			this.tranCurrencyCode = visa.substring(56, 59);
			this.transAmo2 = convertAmount(convertCurrency(visa.substring(44, 56)));
			this.settAmount = convertAmount(convertCurrency(visa.substring(59, 71)));
			this.settCurrencyCode = visa.substring(71, 74);
			this.cardBillingAmount = convertCurrency(visa.substring(74, 86)).substring(1);
			this.cardBillCurrCode = visa.substring(86, 89);
			this.cardBillOtherAmount = convertCurrency(visa.substring(89, 110));
			this.convFeesCurr = convertCurrency(visa.substring(110, 119));
			this.alloConvFeesCurr = convertCurrency(visa.substring(119, 128));
			this.optiIssuFeesCurr = convertCurrency(visa.substring(128, 137));
			this.optiIssuFeecBillCurr = convertCurrency(visa.substring(137, 146));
			this.convFeecBillCurr = convertCurrency(visa.substring(146, 155));
			break;
		case "V22280":
			this.chipCondCode = visa.substring(40, 41);
			this.termCapaProf = visa.substring(41, 47);
			this.authResCode = visa.substring(47, 63);
			this.arpcRespCode = visa.substring(63, 65);
			this.cardAuthResu = visa.substring(65, 66);
			this.unrpNumb = visa.substring(66, 74);
			this.termVerifResu = visa.substring(74, 84);
			this.termSeriNumb = visa.substring(84, 92);
			this.deriKeyInde = visa.substring(92, 94);
			this.crypVer = visa.substring(94, 96);
			this.cardVerifResu = visa.substring(96, 104);
			this.ccpsTransIndi = visa.substring(104, 105);
			this.cardAuthReliIndi = visa.substring(105, 106);
			break;
		case "V22281":
			this.crypArqTcAac = visa.substring(40, 56);
			this.applTransCoun = visa.substring(56, 61);
			this.applIntfProf = visa.substring(61, 65);
			this.crypTransType = visa.substring(65, 67);
			this.termCounCode = visa.substring(67, 70);
			this.termTranDate = visa.substring(70, 76);
			this.crypAmount = visa.substring(76, 88);
			this.crypCurrCode = visa.substring(88, 91);
			this.crypCashAmount = visa.substring(91, 103);
			break;
		case "V22282":
			this.ISSU_DISC_DATA = visa.substring(40, 70);
			this.ISSU_SCRI_RESU = visa.substring(70, 110);
			break;
		case "V22287":
			this.VISA_CASH_CEPS_DATA3 = visa.substring(41, 51);
			break;
		case "V22285":
			this.FIEL_55_LENG = visa.substring(40, 43);
			this.VISA_CASH_CEPS_DATA4 = visa.substring(43, 164);
			break;
		case "V22286":
			this.VISA_CASH_CEPS_DATA2 = visa.substring(40, 164);
			break;
		case "V22290":
			this.CHEC_SETT_CODE = visa.substring(40, 41);
			this.ABA_NUMB = visa.substring(41, 50);
			this.ACCO_NUMB = visa.substring(50, 69);
			this.CHEC_NUMB = visa.substring(69, 84);
			break;
		case "V22225":
			this.ODE_MESSAGE_TYPE = visa.substring(40, 44);
			this.ODE_TRAC_NUMBER = visa.substring(44, 50);
			this.ODE_TRAN_DATE = visa.substring(50, 54);
			this.ODE_TRAN_TIME = visa.substring(54, 60);
			this.ODE_ACQU_INST_ID = visa.substring(60, 71);
			this.ODE_FWDN_INST_ID = visa.substring(71, 82);
			this.USAG_CODE = visa.substring(82, 83);
			this.DOCU_INDI = visa.substring(83, 84);
			this.CHAR_REFE_NUMB = visa.substring(84, 90);
			this.MESS_TEXT = visa.substring(90, 140);
			break;
		case "V22240":
			this.SI_REIM_ATTR = visa.substring(40, 41);
			this.OD_ORIG_TRAC = visa.substring(41, 47);
			this.OD_ORIG_TRAN_DATE = visa.substring(47, 51);
			this.OD_ORIG_TRAN_TIME = visa.substring(51, 55);
			this.FREE_TEXT = visa.substring(55, 64);
			this.LOCA_DATE = visa.substring(64, 70);
			this.LOCA_TIME = visa.substring(70, 74);
			break;
		case "V22230":
			this.AVS_RESP_CODE = visa.substring(40, 41);
			this.PURC_ID_FORM = visa.substring(41, 42);
			this.PURC_ID_NUMB = visa.substring(42, 58);
			this.CHEC_IN_CHEC_OUT = visa.substring(58, 64);
			this.NO_SHOW_INDI = visa.substring(64, 65);
			this.EXTR_CHAR = visa.substring(65, 71);
			this.MULT_CLEA_SEQU_NO = visa.substring(71, 73);
			this.MULT_CLEA_SEQU_COUN = visa.substring(73, 75);
			this.REST_TICK_INDI = visa.substring(75, 76);
			this.TOTA_AMOU_AUTH = convertCurrency(visa.substring(76, 88));
			this.REQU_PAYM_SERV = visa.substring(88, 89);
			this.CHAR_RIGH_INDI = visa.substring(89, 91);
			this.REPL_AMOU = convertCurrency(visa.substring(91, 103));
			this.CRS_VALI_RETU_CODE = visa.substring(103, 118);
			this.CHAR_FLOO_LIMI_INDI = visa.substring(118, 119);
			this.CHAR_CRB_INDI = visa.substring(119, 120);
			this.CHAR_STIP_INDI = visa.substring(120, 121);
			this.CHAR_MAIL_PHON_INDI = visa.substring(121, 122);
			this.SPEC_CHAR_INDI = visa.substring(122, 123);
			this.CHAR_SPEC_COND_RIS_INDI = visa.substring(123, 124);
			this.CHAR_SPEC_COND_MERC_INDI = visa.substring(124, 125);
			break;
		}
	}

	private double convertAmount(String amount) {
		double number = Double.parseDouble(amount);
		number = number / Math.pow(10, 2);
		return number;
	}

	public String convertCurrency(String s) {
		if (s.contains("{") || s.contains("P")) {
			s = s.replace("{", "0").replace("P", "0");
		} else if (s.contains("A") || s.contains("Q")) {
			s = s.replace("A", "1").replace("Q", "1");

		} else if (s.contains("B") || s.contains("R")) {
			s = s.replace("B", "2").replace("R", "2");
		} else if (s.contains("C") || s.contains("S")) {
			s = s.replace("C", "3").replace("S", "3");
		} else if (s.contains("D") || s.contains("T")) {
			s = s.replace("D", "4").replace("T", "4");
		} else if (s.contains("E") || s.contains("U")) {
			s = s.replace("E", "5").replace("E", "5");

		} else if (s.contains("F") || s.contains("V")) {
			s = s.replace("F", "6").replace("F", "6");
		} else if (s.contains("G") || s.contains("W")) {
			s = s.replace("G", "7").replace("W", "7");
		} else if (s.contains("H") || s.contains("X")) {
			s = s.replace("H", "8").replace("X", "8");
		} else if (s.contains("I") || s.contains("Y")) {
			s = s.replace("I", "9").replace("Y", "9");
		}
		return s;
	}

	public String getAtmCode() {
		return atmCode;
	}

	public void setAtmCode(String atmCode) {
		this.atmCode = atmCode;
	}

	public String getODE_MESSAGE_TYPE() {
		return ODE_MESSAGE_TYPE;
	}

	public void setODE_MESSAGE_TYPE(String ODE_MESSAGE_TYPE) {
		this.ODE_MESSAGE_TYPE = ODE_MESSAGE_TYPE;
	}

	public String getODE_TRAC_NUMBER() {
		return ODE_TRAC_NUMBER;
	}

	public void setODE_TRAC_NUMBER(String ODE_TRAC_NUMBER) {
		this.ODE_TRAC_NUMBER = ODE_TRAC_NUMBER;
	}

	public String getTreat() {
		return treat;
	}

	public void setTreat(String treat) {
		this.treat = treat;
	}

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getODE_TRAN_DATE() {
		return ODE_TRAN_DATE;
	}

	public void setODE_TRAN_DATE(String ODE_TRAN_DATE) {
		this.ODE_TRAN_DATE = ODE_TRAN_DATE;
	}

	public String getODE_TRAN_TIME() {
		return ODE_TRAN_TIME;
	}

	public void setODE_TRAN_TIME(String ODE_TRAN_TIME) {
		this.ODE_TRAN_TIME = ODE_TRAN_TIME;
	}

	public String getODE_ACQU_INST_ID() {
		return ODE_ACQU_INST_ID;
	}

	public void setODE_ACQU_INST_ID(String ODE_ACQU_INST_ID) {
		this.ODE_ACQU_INST_ID = ODE_ACQU_INST_ID;
	}

	public String getODE_FWDN_INST_ID() {
		return ODE_FWDN_INST_ID;
	}

	public void setODE_FWDN_INST_ID(String ODE_FWDN_INST_ID) {
		this.ODE_FWDN_INST_ID = ODE_FWDN_INST_ID;
	}

	public String getUSAG_CODE() {
		return USAG_CODE;
	}

	public void setUSAG_CODE(String USAG_CODE) {
		this.USAG_CODE = USAG_CODE;
	}

	public String getDOCU_INDI() {
		return DOCU_INDI;
	}

	public void setDOCU_INDI(String DOCU_INDI) {
		this.DOCU_INDI = DOCU_INDI;
	}

	public String getCHAR_REFE_NUMB() {
		return CHAR_REFE_NUMB;
	}

	public void setCHAR_REFE_NUMB(String CHAR_REFE_NUMB) {
		this.CHAR_REFE_NUMB = CHAR_REFE_NUMB;
	}

	public String getMESS_TEXT() {
		return MESS_TEXT;
	}

	public void setMESS_TEXT(String MESS_TEXT) {
		this.MESS_TEXT = MESS_TEXT;
	}

	public String getAVS_RESP_CODE() {
		return AVS_RESP_CODE;
	}

	public void setAVS_RESP_CODE(String AVS_RESP_CODE) {
		this.AVS_RESP_CODE = AVS_RESP_CODE;
	}

	public String getPURC_ID_FORM() {
		return PURC_ID_FORM;
	}

	public void setPURC_ID_FORM(String PURC_ID_FORM) {
		this.PURC_ID_FORM = PURC_ID_FORM;
	}

	public String getPURC_ID_NUMB() {
		return PURC_ID_NUMB;
	}

	public void setPURC_ID_NUMB(String PURC_ID_NUMB) {
		this.PURC_ID_NUMB = PURC_ID_NUMB;
	}

	public String getCHEC_IN_CHEC_OUT() {
		return CHEC_IN_CHEC_OUT;
	}

	public void setCHEC_IN_CHEC_OUT(String CHEC_IN_CHEC_OUT) {
		this.CHEC_IN_CHEC_OUT = CHEC_IN_CHEC_OUT;
	}

	public String getNO_SHOW_INDI() {
		return NO_SHOW_INDI;
	}

	public void setNO_SHOW_INDI(String NO_SHOW_INDI) {
		this.NO_SHOW_INDI = NO_SHOW_INDI;
	}

	public String getEXTR_CHAR() {
		return EXTR_CHAR;
	}

	public void setEXTR_CHAR(String EXTR_CHAR) {
		this.EXTR_CHAR = EXTR_CHAR;
	}

	public String getMULT_CLEA_SEQU_NO() {
		return MULT_CLEA_SEQU_NO;
	}

	public void setMULT_CLEA_SEQU_NO(String MULT_CLEA_SEQU_NO) {
		this.MULT_CLEA_SEQU_NO = MULT_CLEA_SEQU_NO;
	}

	public String getMULT_CLEA_SEQU_COUN() {
		return MULT_CLEA_SEQU_COUN;
	}

	public void setMULT_CLEA_SEQU_COUN(String MULT_CLEA_SEQU_COUN) {
		this.MULT_CLEA_SEQU_COUN = MULT_CLEA_SEQU_COUN;
	}

	public String getREST_TICK_INDI() {
		return REST_TICK_INDI;
	}

	public void setREST_TICK_INDI(String REST_TICK_INDI) {
		this.REST_TICK_INDI = REST_TICK_INDI;
	}

	public String getTOTA_AMOU_AUTH() {
		return TOTA_AMOU_AUTH;
	}

	public void setTOTA_AMOU_AUTH(String TOTA_AMOU_AUTH) {
		this.TOTA_AMOU_AUTH = TOTA_AMOU_AUTH;
	}

	public String getREQU_PAYM_SERV() {
		return REQU_PAYM_SERV;
	}

	public void setREQU_PAYM_SERV(String REQU_PAYM_SERV) {
		this.REQU_PAYM_SERV = REQU_PAYM_SERV;
	}

	public String getCHAR_RIGH_INDI() {
		return CHAR_RIGH_INDI;
	}

	public void setCHAR_RIGH_INDI(String CHAR_RIGH_INDI) {
		this.CHAR_RIGH_INDI = CHAR_RIGH_INDI;
	}

	public String getREPL_AMOU() {
		return REPL_AMOU;
	}

	public void setREPL_AMOU(String REPL_AMOU) {
		this.REPL_AMOU = REPL_AMOU;
	}

	public String getCRS_VALI_RETU_CODE() {
		return CRS_VALI_RETU_CODE;
	}

	public void setCRS_VALI_RETU_CODE(String CRS_VALI_RETU_CODE) {
		this.CRS_VALI_RETU_CODE = CRS_VALI_RETU_CODE;
	}

	public String getCHAR_FLOO_LIMI_INDI() {
		return CHAR_FLOO_LIMI_INDI;
	}

	public void setCHAR_FLOO_LIMI_INDI(String CHAR_FLOO_LIMI_INDI) {
		this.CHAR_FLOO_LIMI_INDI = CHAR_FLOO_LIMI_INDI;
	}

	public String getCHAR_CRB_INDI() {
		return CHAR_CRB_INDI;
	}

	public void setCHAR_CRB_INDI(String CHAR_CRB_INDI) {
		this.CHAR_CRB_INDI = CHAR_CRB_INDI;
	}

	public String getCHAR_STIP_INDI() {
		return CHAR_STIP_INDI;
	}

	public void setCHAR_STIP_INDI(String CHAR_STIP_INDI) {
		this.CHAR_STIP_INDI = CHAR_STIP_INDI;
	}

	public String getCHAR_MAIL_PHON_INDI() {
		return CHAR_MAIL_PHON_INDI;
	}

	public void setCHAR_MAIL_PHON_INDI(String CHAR_MAIL_PHON_INDI) {
		this.CHAR_MAIL_PHON_INDI = CHAR_MAIL_PHON_INDI;
	}

	public String getSPEC_CHAR_INDI() {
		return SPEC_CHAR_INDI;
	}

	public void setSPEC_CHAR_INDI(String SPEC_CHAR_INDI) {
		this.SPEC_CHAR_INDI = SPEC_CHAR_INDI;
	}

	public String getCHAR_SPEC_COND_RIS_INDI() {
		return CHAR_SPEC_COND_RIS_INDI;
	}

	public void setCHAR_SPEC_COND_RIS_INDI(String CHAR_SPEC_COND_RIS_INDI) {
		this.CHAR_SPEC_COND_RIS_INDI = CHAR_SPEC_COND_RIS_INDI;
	}

	public String getCHAR_SPEC_COND_MERC_INDI() {
		return CHAR_SPEC_COND_MERC_INDI;
	}

	public void setCHAR_SPEC_COND_MERC_INDI(String CHAR_SPEC_COND_MERC_INDI) {
		this.CHAR_SPEC_COND_MERC_INDI = CHAR_SPEC_COND_MERC_INDI;
	}

	public String getSI_REIM_ATTR() {
		return SI_REIM_ATTR;
	}

	public void setSI_REIM_ATTR(String SI_REIM_ATTR) {
		this.SI_REIM_ATTR = SI_REIM_ATTR;
	}

	public String getOD_ORIG_TRAC() {
		return OD_ORIG_TRAC;
	}

	public void setOD_ORIG_TRAC(String OD_ORIG_TRAC) {
		this.OD_ORIG_TRAC = OD_ORIG_TRAC;
	}

	public String getOD_ORIG_TRAN_DATE() {
		return OD_ORIG_TRAN_DATE;
	}

	public void setOD_ORIG_TRAN_DATE(String OD_ORIG_TRAN_DATE) {
		this.OD_ORIG_TRAN_DATE = OD_ORIG_TRAN_DATE;
	}

	public String getOD_ORIG_TRAN_TIME() {
		return OD_ORIG_TRAN_TIME;
	}

	public void setOD_ORIG_TRAN_TIME(String OD_ORIG_TRAN_TIME) {
		this.OD_ORIG_TRAN_TIME = OD_ORIG_TRAN_TIME;
	}

	public String getFREE_TEXT() {
		return FREE_TEXT;
	}

	public void setFREE_TEXT(String FREE_TEXT) {
		this.FREE_TEXT = FREE_TEXT;
	}

	public String getLOCA_DATE() {
		return LOCA_DATE;
	}

	public void setLOCA_DATE(String LOCA_DATE) {
		this.LOCA_DATE = LOCA_DATE;
	}

	public String getLOCA_TIME() {
		return LOCA_TIME;
	}

	public void setLOCA_TIME(String LOCA_TIME) {
		this.LOCA_TIME = LOCA_TIME;
	}

	public String getADDI_TRAC_DATA() {
		return ADDI_TRAC_DATA;
	}

	public void setADDI_TRAC_DATA(String ADDI_TRAC_DATA) {
		this.ADDI_TRAC_DATA = ADDI_TRAC_DATA;
	}

	public String getISSU_ROUT_NUMB() {
		return ISSU_ROUT_NUMB;
	}

	public void setISSU_ROUT_NUMB(String ISSU_ROUT_NUMB) {
		this.ISSU_ROUT_NUMB = ISSU_ROUT_NUMB;
	}

	public String getMI_FINA_INST_ID() {
		return MI_FINA_INST_ID;
	}

	public void setMI_FINA_INST_ID(String MI_FINA_INST_ID) {
		this.MI_FINA_INST_ID = MI_FINA_INST_ID;
	}

	public String getMI_MERC_ABA_NUMB() {
		return MI_MERC_ABA_NUMB;
	}

	public void setMI_MERC_ABA_NUMB(String MI_MERC_ABA_NUMB) {
		this.MI_MERC_ABA_NUMB = MI_MERC_ABA_NUMB;
	}

	public String getISSU_DISC_DATA() {
		return ISSU_DISC_DATA;
	}

	public void setISSU_DISC_DATA(String ISSU_DISC_DATA) {
		this.ISSU_DISC_DATA = ISSU_DISC_DATA;
	}

	public String getISSU_SCRI_RESU() {
		return ISSU_SCRI_RESU;
	}

	public void setISSU_SCRI_RESU(String ISSU_SCRI_RESU) {
		this.ISSU_SCRI_RESU = ISSU_SCRI_RESU;
	}

	public String getFIEL_55_LENG() {
		return FIEL_55_LENG;
	}

	public void setFIEL_55_LENG(String FIEL_55_LENG) {
		this.FIEL_55_LENG = FIEL_55_LENG;
	}

	public String getVISA_CASH_CEPS_DATA4() {
		return VISA_CASH_CEPS_DATA4;
	}

	public void setVISA_CASH_CEPS_DATA4(String VISA_CASH_CEPS_DATA4) {
		this.VISA_CASH_CEPS_DATA4 = VISA_CASH_CEPS_DATA4;
	}

	public String getVISA_CASH_CEPS_DATA2() {
		return VISA_CASH_CEPS_DATA2;
	}

	public void setVISA_CASH_CEPS_DATA2(String VISA_CASH_CEPS_DATA2) {
		this.VISA_CASH_CEPS_DATA2 = VISA_CASH_CEPS_DATA2;
	}

	public String getVISA_CASH_CEPS_DATA3() {
		return VISA_CASH_CEPS_DATA3;
	}

	public void setVISA_CASH_CEPS_DATA3(String VISA_CASH_CEPS_DATA3) {
		this.VISA_CASH_CEPS_DATA3 = VISA_CASH_CEPS_DATA3;
	}

	public String getCHEC_SETT_CODE() {
		return CHEC_SETT_CODE;
	}

	public void setCHEC_SETT_CODE(String CHEC_SETT_CODE) {
		this.CHEC_SETT_CODE = CHEC_SETT_CODE;
	}

	public String getABA_NUMB() {
		return ABA_NUMB;
	}

	public void setABA_NUMB(String ABA_NUMB) {
		this.ABA_NUMB = ABA_NUMB;
	}

	public String getACCO_NUMB() {
		return ACCO_NUMB;
	}

	public void setACCO_NUMB(String ACCO_NUMB) {
		this.ACCO_NUMB = ACCO_NUMB;
	}

	public String getCHEC_NUMB() {
		return CHEC_NUMB;
	}

	public void setCHEC_NUMB(String CHEC_NUMB) {
		this.CHEC_NUMB = CHEC_NUMB;
	}

	public String getCrypTransType() {
		return crypTransType;
	}

	public void setCrypTransType(String crypTransType) {
		this.crypTransType = crypTransType;
	}

	public String getChipCondCode() {
		return chipCondCode;
	}

	public void setChipCondCode(String chipCondCode) {
		this.chipCondCode = chipCondCode;
	}

	public String getTermCapaProf() {
		return termCapaProf;
	}

	public void setTermCapaProf(String termCapaProf) {
		this.termCapaProf = termCapaProf;
	}

	public String getAuthResCode() {
		return authResCode;
	}

	public void setAuthResCode(String authResCode) {
		this.authResCode = authResCode;
	}

	public String getArpcRespCode() {
		return arpcRespCode;
	}

	public void setArpcRespCode(String arpcRespCode) {
		this.arpcRespCode = arpcRespCode;
	}

	public String getCardAuthResu() {
		return cardAuthResu;
	}

	public void setCardAuthResu(String cardAuthResu) {
		this.cardAuthResu = cardAuthResu;
	}

	public String getUnrpNumb() {
		return unrpNumb;
	}

	public void setUnrpNumb(String unrpNumb) {
		this.unrpNumb = unrpNumb;
	}

	public String getTermVerifResu() {
		return termVerifResu;
	}

	public void setTermVerifResu(String termVerifResu) {
		this.termVerifResu = termVerifResu;
	}

	public String getTermSeriNumb() {
		return termSeriNumb;
	}

	public void setTermSeriNumb(String termSeriNumb) {
		this.termSeriNumb = termSeriNumb;
	}

	public String getDeriKeyInde() {
		return deriKeyInde;
	}

	public void setDeriKeyInde(String deriKeyInde) {
		this.deriKeyInde = deriKeyInde;
	}

	public String getCrypVer() {
		return crypVer;
	}

	public void setCrypVer(String crypVer) {
		this.crypVer = crypVer;
	}

	public String getCardVerifResu() {
		return cardVerifResu;
	}

	public void setCardVerifResu(String cardVerifResu) {
		this.cardVerifResu = cardVerifResu;
	}

	public String getCcpsTransIndi() {
		return ccpsTransIndi;
	}

	public void setCcpsTransIndi(String ccpsTransIndi) {
		this.ccpsTransIndi = ccpsTransIndi;
	}

	public String getCardAuthReliIndi() {
		return cardAuthReliIndi;
	}

	public void setCardAuthReliIndi(String cardAuthReliIndi) {
		this.cardAuthReliIndi = cardAuthReliIndi;
	}

	public String getCrypArqTcAac() {
		return crypArqTcAac;
	}

	public void setCrypArqTcAac(String crypArqTcAac) {
		this.crypArqTcAac = crypArqTcAac;
	}

	public String getApplTransCoun() {
		return applTransCoun;
	}

	public void setApplTransCoun(String applTransCoun) {
		this.applTransCoun = applTransCoun;
	}

	public String getApplIntfProf() {
		return applIntfProf;
	}

	public void setApplIntfProf(String applIntfProf) {
		this.applIntfProf = applIntfProf;
	}

	public String getTermCounCode() {
		return termCounCode;
	}

	public void setTermCounCode(String termCounCode) {
		this.termCounCode = termCounCode;
	}

	public String getTermTranDate() {
		return termTranDate;
	}

	public void setTermTranDate(String termTranDate) {
		this.termTranDate = termTranDate;
	}

	public String getCrypAmount() {
		return crypAmount;
	}

	public void setCrypAmount(String crypAmount) {
		this.crypAmount = crypAmount;
	}

	public String getCrypCurrCode() {
		return crypCurrCode;
	}

	public void setCrypCurrCode(String crypCurrCode) {
		this.crypCurrCode = crypCurrCode;
	}

	public String getCrypCashAmount() {
		return crypCashAmount;
	}

	public void setCrypCashAmount(String crypCashAmount) {
		this.crypCashAmount = crypCashAmount;
	}

	public String getCardBillOtherAmount() {
		return cardBillOtherAmount;
	}

	public void setCardBillOtherAmount(String cardBillOtherAmount) {
		this.cardBillOtherAmount = cardBillOtherAmount;
	}

	public String getConvFeesCurr() {
		return convFeesCurr;
	}

	public void setConvFeesCurr(String convFeesCurr) {
		this.convFeesCurr = convFeesCurr;
	}

	public String getAlloConvFeesCurr() {
		return alloConvFeesCurr;
	}

	public void setAlloConvFeesCurr(String alloConvFeesCurr) {
		this.alloConvFeesCurr = alloConvFeesCurr;
	}

	public String getOptiIssuFeesCurr() {
		return optiIssuFeesCurr;
	}

	public void setOptiIssuFeesCurr(String optiIssuFeesCurr) {
		this.optiIssuFeesCurr = optiIssuFeesCurr;
	}

	public String getOptiIssuFeecBillCurr() {
		return optiIssuFeecBillCurr;
	}

	public void setOptiIssuFeecBillCurr(String optiIssuFeecBillCurr) {
		this.optiIssuFeecBillCurr = optiIssuFeecBillCurr;
	}

	public String getConvFeecBillCurr() {
		return convFeecBillCurr;
	}

	public void setConvFeecBillCurr(String convFeecBillCurr) {
		this.convFeecBillCurr = convFeecBillCurr;
	}

	public String getForwInstId() {
		return forwInstId;
	}

	public void setForwInstId(String forwInstId) {
		this.forwInstId = forwInstId;
	}

	public String getCardAccepId() {
		return cardAccepId;
	}

	public void setCardAccepId(String cardAccepId) {
		this.cardAccepId = cardAccepId;
	}

	public String getSettServRequ() {
		return settServRequ;
	}

	public void setSettServRequ(String settServRequ) {
		this.settServRequ = settServRequ;
	}

	public String getSettServSele() {
		return settServSele;
	}

	public void setSettServSele(String settServSele) {
		this.settServSele = settServSele;
	}

	public String getResponseMessageType() {
		return responseMessageType;
	}

	public void setResponseMessageType(String responseMessageType) {
		this.responseMessageType = responseMessageType;
	}

	public Integer getOutComingCode() {
		return outComingCode;
	}

	public void setOutComingCode(Integer outComingCode) {
		this.outComingCode = outComingCode;
	}

	public String getIssuerIdentification() {
		return issuerIdentification;
	}

	public void setIssuerIdentification(String issuerIdentification) {
		this.issuerIdentification = issuerIdentification;
	}

	public String getAffiBin() {
		return affiBin;
	}

	public void setAffiBin(String affiBin) {
		this.affiBin = affiBin;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(String transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public String getValidationCode() {
		return validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

	public String getRetrRefNumber() {
		return retrRefNumber;
	}

	public void setRetrRefNumber(String retrRefNumber) {
		this.retrRefNumber = retrRefNumber;
	}

	public String getGivFlag() {
		return givFlag;
	}

	public void setGivFlag(String givFlag) {
		this.givFlag = givFlag;
	}

	public String getTracNumber() {
		return tracNumber;
	}

	public void setTracNumber(String tracNumber) {
		this.tracNumber = tracNumber;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getRequestMessageType() {
		return requestMessageType;
	}

	public void setRequestMessageType(String requestMessageType) {
		this.requestMessageType = requestMessageType;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getProcCode() {
		return procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCurrencyCodeTransactionAmount() {
		return currencyCodeTransactionAmount;
	}

	public void setCurrencyCodeTransactionAmount(String currencyCodeTransactionAmount) {
		this.currencyCodeTransactionAmount = currencyCodeTransactionAmount;
	}

	public String getRawDataReci() {
		return rawDataReci;
	}

	public void setRawDataReci(String rawDataReci) {
		this.rawDataReci = rawDataReci;
	}

	public String getLocalTransactionDate() {
		return localTransactionDate;
	}

	public void setLocalTransactionDate(String localTransactionDate) {
		this.localTransactionDate = localTransactionDate;
	}

	public String getLocalTransactionTime() {
		return localTransactionTime;
	}

	public void setLocalTransactionTime(String localTransactionTime) {
		this.localTransactionTime = localTransactionTime;
	}

	public String getGivFlagPrev() {
		return givFlagPrev;
	}

	public void setGivFlagPrev(String givFlagPrev) {
		this.givFlagPrev = givFlagPrev;
	}

	public String getAcquirerInstId() {
		return acquirerInstId;
	}

	public void setAcquirerInstId(String acquirerInstId) {
		this.acquirerInstId = acquirerInstId;
	}

	public String getAcquirerBusinessId() {
		return acquirerBusinessId;
	}

	public void setAcquirerBusinessId(String acquirerBusinessId) {
		this.acquirerBusinessId = acquirerBusinessId;
	}

	public String getSourceStatId() {
		return sourceStatId;
	}

	public void setSourceStatId(String sourceStatId) {
		this.sourceStatId = sourceStatId;
	}

	public String getDestinationStatId() {
		return destinationStatId;
	}

	public void setDestinationStatId(String destinationStatId) {
		this.destinationStatId = destinationStatId;
	}

	public String getMessageReasonCode() {
		return messageReasonCode;
	}

	public void setMessageReasonCode(String messageReasonCode) {
		this.messageReasonCode = messageReasonCode;
	}

	public String getStipReasonCode() {
		return stipReasonCode;
	}

	public void setStipReasonCode(String stipReasonCode) {
		this.stipReasonCode = stipReasonCode;
	}

	public String getAuthorizationIdResponseCode() {
		return authorizationIdResponseCode;
	}

	public void setAuthorizationIdResponseCode(String authorizationIdResponseCode) {
		this.authorizationIdResponseCode = authorizationIdResponseCode;
	}

	public String getNetwId() {
		return netwId;
	}

	public void setNetwId(String netwId) {
		this.netwId = netwId;
	}

	public String getAdviSourceFlag() {
		return adviSourceFlag;
	}

	public void setAdviSourceFlag(String adviSourceFlag) {
		this.adviSourceFlag = adviSourceFlag;
	}

	public String getAdviTransactionFlag() {
		return adviTransactionFlag;
	}

	public void setAdviTransactionFlag(String adviTransactionFlag) {
		this.adviTransactionFlag = adviTransactionFlag;
	}

	public String getBaseLBillingFlag() {
		return baseLBillingFlag;
	}

	public void setBaseLBillingFlag(String baseLBillingFlag) {
		this.baseLBillingFlag = baseLBillingFlag;
	}

	public String getTracDataIndi() {
		return tracDataIndi;
	}

	public void setTracDataIndi(String tracDataIndi) {
		this.tracDataIndi = tracDataIndi;
	}

	public String getReimAttr() {
		return reimAttr;
	}

	public void setReimAttr(String reimAttr) {
		this.reimAttr = reimAttr;
	}

	public String getReimFeeDebiCreditIndi() {
		return reimFeeDebiCreditIndi;
	}

	public void setReimFeeDebiCreditIndi(String reimFeeDebiCreditIndi) {
		this.reimFeeDebiCreditIndi = reimFeeDebiCreditIndi;
	}

	public String getReimFee() {
		return reimFee;
	}

	public void setReimFee(String reimFee) {
		this.reimFee = reimFee;
	}

	public String getPvsPerfIndi() {
		return pvsPerfIndi;
	}

	public void setPvsPerfIndi(String pvsPerfIndi) {
		this.pvsPerfIndi = pvsPerfIndi;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public String getTransactionDateWithYear() {
		return transactionDate + settlementDate.substring(4, 6);
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getTransactionOtherAmount() {
		return transactionOtherAmount;
	}

	public void setTransactionOtherAmount(String transactionOtherAmount) {
		this.transactionOtherAmount = transactionOtherAmount;
	}

	public String getDownReasonCode() {
		return downReasonCode;
	}

	public void setDownReasonCode(String downReasonCode) {
		this.downReasonCode = downReasonCode;
	}

	public String getAuthCharIndi() {
		return authCharIndi;
	}

	public void setAuthCharIndi(String authCharIndi) {
		this.authCharIndi = authCharIndi;
	}

	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public String getCvvResultCode() {
		return cvvResultCode;
	}

	public void setCvvResultCode(String cvvResultCode) {
		this.cvvResultCode = cvvResultCode;
	}

	public String getServSele() {
		return servSele;
	}

	public void setServSele(String servSele) {
		this.servSele = servSele;
	}

	public String getIrfOpti() {
		return irfOpti;
	}

	public void setIrfOpti(String irfOpti) {
		this.irfOpti = irfOpti;
	}

	public String getMailElectronicCommerceIndi() {
		return mailElectronicCommerceIndi;
	}

	public void setMailElectronicCommerceIndi(String mailElectronicCommerceIndi) {
		this.mailElectronicCommerceIndi = mailElectronicCommerceIndi;
	}

	public String getMerchantVolumeIndi() {
		return merchantVolumeIndi;
	}

	public void setMerchantVolumeIndi(String merchantVolumeIndi) {
		this.merchantVolumeIndi = merchantVolumeIndi;
	}

	public String getAdditionalDataIndi() {
		return additionalDataIndi;
	}

	public void setAdditionalDataIndi(String additionalDataIndi) {
		this.additionalDataIndi = additionalDataIndi;
	}

	public String getFeeProgramIndi() {
		return feeProgramIndi;
	}

	public void setFeeProgramIndi(String feeProgramIndi) {
		this.feeProgramIndi = feeProgramIndi;
	}

	public String getPosCondCode() {
		return posCondCode;
	}

	public void setPosCondCode(String posCondCode) {
		this.posCondCode = posCondCode;
	}

	public String getPosEntryMode() {
		return posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getPosTerminalType() {
		return posTerminalType;
	}

	public void setPosTerminalType(String posTerminalType) {
		this.posTerminalType = posTerminalType;
	}

	public String getPosTerminalCapability() {
		return posTerminalCapability;
	}

	public void setPosTerminalCapability(String posTerminalCapability) {
		this.posTerminalCapability = posTerminalCapability;
	}

	public String getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getCardAcceptorTerminalId() {
		return cardAcceptorTerminalId;
	}

	public void setCardAcceptorTerminalId(String cardAcceptorTerminalId) {
		this.cardAcceptorTerminalId = cardAcceptorTerminalId;
	}

	public String getCardAcceptorName() {
		return cardAcceptorName;
	}

	public void setCardAcceptorName(String cardAcceptorName) {
		this.cardAcceptorName = cardAcceptorName;
	}

	public String getCardAcceptorCity() {
		return cardAcceptorCity;
	}

	public void setCardAcceptorCity(String cardAcceptorCity) {
		this.cardAcceptorCity = cardAcceptorCity;
	}

	public String getCardAcceptorCountry() {
		return cardAcceptorCountry;
	}

	public void setCardAcceptorCountry(String cardAcceptorCountry) {
		this.cardAcceptorCountry = cardAcceptorCountry;
	}

	public String getGeoStatCode() {
		return geoStatCode;
	}

	public void setGeoStatCode(String geoStatCode) {
		this.geoStatCode = geoStatCode;
	}

	public String getGeoZipCode() {
		return geoZipCode;
	}

	public void setGeoZipCode(String geoZipCode) {
		this.geoZipCode = geoZipCode;
	}

	public String getGeoZipFour() {
		return geoZipFour;
	}

	public void setGeoZipFour(String geoZipFour) {
		this.geoZipFour = geoZipFour;
	}

	public String getGeoCountryCode() {
		return geoCountryCode;
	}

	public void setGeoCountryCode(String geoCountryCode) {
		this.geoCountryCode = geoCountryCode;
	}

	public String getAquirerInstCounCode() {
		return aquirerInstCounCode;
	}

	public void setAquirerInstCounCode(String aquirerInstCounCode) {
		this.aquirerInstCounCode = aquirerInstCounCode;
	}

	public String getPanExteCounCode() {
		return panExteCounCode;
	}

	public void setPanExteCounCode(String panExteCounCode) {
		this.panExteCounCode = panExteCounCode;
	}

	public String getForwInstCountCode() {
		return forwInstCountCode;
	}

	public void setForwInstCountCode(String forwInstCountCode) {
		this.forwInstCountCode = forwInstCountCode;
	}

	public String getCustIdenMeth() {
		return custIdenMeth;
	}

	public void setCustIdenMeth(String custIdenMeth) {
		this.custIdenMeth = custIdenMeth;
	}

	public String getIssuAffiBin() {
		return issuAffiBin;
	}

	public void setIssuAffiBin(String issuAffiBin) {
		this.issuAffiBin = issuAffiBin;
	}

	public String getPlusSettDate() {
		return plusSettDate;
	}

	public void setPlusSettDate(String plusSettDate) {
		this.plusSettDate = plusSettDate;
	}

	public String getPlusTimeStam() {
		return plusTimeStam;
	}

	public void setPlusTimeStam(String plusTimeStam) {
		this.plusTimeStam = plusTimeStam;
	}

	public String getPlusAcquiPmc() {
		return plusAcquiPmc;
	}

	public void setPlusAcquiPmc(String plusAcquiPmc) {
		this.plusAcquiPmc = plusAcquiPmc;
	}

	public String getPlusIssuPmc() {
		return plusIssuPmc;
	}

	public void setPlusIssuPmc(String plusIssuPmc) {
		this.plusIssuPmc = plusIssuPmc;
	}

	public String getSurcSign() {
		return surcSign;
	}

	public void setSurcSign(String surcSign) {
		this.surcSign = surcSign;
	}

	public double getSurcAmount() {
		return surcAmount;
	}

	public void setSurcAmount(double surcAmount) {
		this.surcAmount = surcAmount;
	}

	public String getRateTablDate() {
		return rateTablDate;
	}

	public void setRateTablDate(String rateTablDate) {
		this.rateTablDate = rateTablDate;
	}

	public double getTransAmo2() {
		return transAmo2;
	}

	public void setTransAmo2(double transAmo2) {
		this.transAmo2 = transAmo2;
	}

	public String getTranCurrencyCode() {
		return tranCurrencyCode;
	}

	public void setTranCurrencyCode(String tranCurrencyCode) {
		this.tranCurrencyCode = tranCurrencyCode;
	}

	public double getSettAmount() {
		return settAmount;
	}

	public void setSettAmount(double settAmount) {
		this.settAmount = settAmount;
	}

	public String getSettCurrencyCode() {
		return settCurrencyCode;
	}

	public void setSettCurrencyCode(String settCurrencyCode) {
		this.settCurrencyCode = settCurrencyCode;
	}

	public String getCardBillingAmount() {
		return cardBillingAmount;
	}

	public void setCardBillingAmount(String cardBillingAmount) {
		this.cardBillingAmount = cardBillingAmount;
	}

	public String getCardBillCurrCode() {
		return cardBillCurrCode;
	}

	public void setCardBillCurrCode(String cardBillCurrCode) {
		this.cardBillCurrCode = cardBillCurrCode;
	}

	public Integer getCpCode() {
		return cpCode;
	}

	public void setCpCode(Integer cpCode) {
		this.cpCode = cpCode;
	}

	public String getReversal() {
		return reversal;
	}

	public void setReversal(String reversal) {
		this.reversal = reversal;
	}

	public LocalDateTime getLastDateEnvoiMail() {
		return lastDateEnvoiMail;
	}

	public void setLastDateEnvoiMail(LocalDateTime lastDateEnvoiMail) {
		this.lastDateEnvoiMail = lastDateEnvoiMail;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(String accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

}
