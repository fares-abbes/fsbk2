package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SWITCH_ARCHIVE",schema="SWITCH")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SwitchTransactionArchive{

	@Id
	@Column(name = "SWITCH_CODE", nullable = false)
	private int switchCode;
	
	@Column(name = "REQUESTDATE")
	private Date switchRequestDate;
	
	@Column(name = "RESPONSEDATE")
	private Date switchResponseDate;
	
	@Column(name = "MTI_MESSAGE_TYPE_IDENTIFIER")
	private String switchMtiMessage;
	
	@Column(name = "DE01_BITMAPS")
	private String switchBitmaps;
	
	@Column(name = "DE02_PAN")
	private String switchPan;
	
	@Column(name = "DE03_PROCESSING_CODE")
	private String switchProcessingCode;
	
	@Column(name = "DE04_AMOUNT_TRANSACTION")
	private String switchAmountTransaction;
	
	@Column(name = "DE05_AMOUNT_SETTELEMNT")
	private String switchAmountSettelement;
	
	@Column(name = "DE06_AMOUNT_CARD_BELLING")
	private String switchAmountCardBelling;
	
	@Column(name = "DE07_TRANSMISSION_DATE_TIME")
	private String switchTransmissionDate;
	
	@Column(name = "DE08_FEES_CARDHOLDER_BELLING")
	private String switchFeesCardHolderBelling;
	
	@Column(name = "DE09_CONVERSION_RATE_SETT")
	private String switchConversionRateSettelement;
	
	@Column(name = "DE10_CONVERSION_RATE_BELLING")
	private String switchConversionRateBelling;
	
	@Column(name = "DE11_STAN")
	private String switchStan;
	
	@Column(name = "DE12_TIME_LOCAL_TRANSACTION")
	private String switchTimeLocalTransaction;
	
	@Column(name = "DE13_DATE_LOCAL_TRANSACTION")
	private String switchDateLocalTransaction;
	
	@Column(name = "DE14_EXPIRATION_DATE")
	private String switchExpirationDate;
	
	@Column(name = "DE15_SETTELEMENT_DATE")
	private String switchSettelementDate;
	
	@Column(name = "DE16_CONVERSION_DATE")
	private String switchConversionDate;
	
	@Column(name = "DE17_CAPTURE_DATE")
	private String switchCaptureDate;
	
	@Column(name = "DE18_MERCHANT_TYPE")
	private String switchMerchantType;
	
	@Column(name = "DE19_ACQUIRER_COUNTRY_CODE")
	private String switchAcquirerCountryCode;
	
	@Column(name = "DE20_ISSERU_COUNTY_CODE")
	private String switchIssuerCountryCode;
	
	@Column(name = "DE21_FORW_OUNTRY_CODE")
	private String switchForwCountryCode;
	
	@Column(name = "DE22_POS_ENTRY_MODE")
	private String switchPosEntryMode;
	
	@Column(name = "DE23_SEQUANCE_NUMBER")
	private String switchSequanceNumber;
	
	@Column(name = "DE24_NETWORK_IDENTIFIER")
	private String switchNetworkIdientifier;
	
	@Column(name = "DE25_POS_CONDITION_CODE")
	private String switchPosConditionCode;
	
	@Column(name = "DE26_POS_PIN_CAPTURE_CODE")
	private String switchPosPinCaptureCode;
	
	@Column(name = "DE27_AUTH_IDEN_LENGTH")
	private String switchAuthIdenLength;
	
	@Column(name = "DE28_TRANSACTION_AMOUNT_FEES")
	private String switchTransactionAmountFees;
	
	@Column(name = "DE29_SETT_AMOUNT_FEES")
	private String switchSettelementAmountFees;
	
	@Column(name = "DE30_TRANS_AMOUNT_PROC_FEES")
	private String switchTransAmountProcFees;
	
	@Column(name = "DE31_SETT_AMOUNT_PROC_FEES")
	private String switchSettAmountProcFees;
	
	@Column(name = "DE32_AQCUIRER_IDENTI_CODE")
	private String switchAcquirerIdenCode;
	
	@Column(name = "DE33_FORWAR_IDENTIF_CODE")
	private String switchForwardIdentCode;
	
	@Column(name = "DE34_EXTENDED_PAN")
	private String switchExtendedPan;
	
	@Column(name = "DE35_TRACK2DATA")
	private String switchTrack2Data;
	
	@Column(name = "DE36_TRACK3DATA")
	private String switchTrack3Data;
	
	@Column(name = "DE37_RRN")
	private String switchRRN;
	
	@Column(name = "DE38_AUTH_IDENTIF_NUMBER")
	private String switchAuthNumber;
	
	@Column(name = "DE39_RESPONSE_CODE")
	private String switchResponseCode;
	
	@Column(name = "DE40_SERVICE_RESTRICTION_CODE")
	private String switchServiceRestrictionCode;
	
	@Column(name = "DE41_ACCEPTOR_TERMINAL_ID")
	private String switchAcceptorTerminalId;
	
	@Column(name = "DE42_ACEPTOR_MERCHANT_CODE")
	private String switchAcceptorMerchantCode;
	
	@Column(name = "DE43_CARD_ACCEPTOR_NAME")
	private String switchAcceptorAcceptorName;
	
	@Column(name = "DE44_ADDITIONAL_RESP_DATA")
	private String switchAdditionalRespData;
	
	@Column(name = "DE45_TRACK1DATA")
	private String switchTrack1Data;
	
	@Column(name = "DE46_AMOUNT_FEES")
	private String switchAmountFees;
	
	@Column(name = "DE47_NATIONAL_ADDIT_DATA")
	private String switchNationalAdditionalData;
	
	@Column(name = "DE48_ADDITIONAL_DATA")
	private String switchAdditionalData;
	
	@Column(name = "DE49_TRANS_CURR_CODE")
	private String switchTransactionCurrencyCode;
	
	@Column(name = "DE50_SETT_CURR_CODE")
	private String switchSettelementCurrencyCode;
	
	@Column(name = "DE51_BILLING_CURR_CODE")
	private String switchBillingCurrencyCode;
	
	@Column(name = "DE52_PIN_DATA")
	private String switchPinBlock;
	
	@Column(name = "DE53_SECUR_RELA_INFO")
	private String switchSecurRelaInfo;
	
	@Column(name = "DE54_ADDITONAL_AMOUNT")
	private String switchAdditionalAmount;
	
	@Column(name = "DE55_EMV_DATA")
	private String switchEmvData;
	
	@Column(name = "DE56_RESERVED_ISO")
	private String switchReservedIso;
	
	@Column(name = "DE57_RESREVED")
	private String switchDE57;
	
	@Column(name = "DE58_RESERVED")
	private String switchDE58;
	
	@Column(name = "DE59_NATIONAL_POS_GEO_DATA")
	private String switchNationalPosGeoData;
	
	@Column(name = "DE60_ADDITIONAL_POS_DATA")
	private String switchAdditonalPosData;
	
	@Column(name = "DE61_OTHER_AMOUNT")
	private String switchOtherAmount;
	
	@Column(name = "DE62_SERVICE_FILEDS_BITMAPS")
	private String switchServiceFieldsBitmaps;
	
	@Column(name = "DE63_SMS_PRIVATE_USE")
	private String switchSmsPrivateUse;
	
	@Column(name = "DE64")
	private String switchDE64;
	
	@Column(name = "DE65")
	private String switchDE65;
	
	@Column(name = "DE66_SETTELEMENT_CODE")
	private String switchSettelemeentCode;
	
	@Column(name = "DE67_EXTEND_PAYEMENT_CODE")
	private String switchExtendedPayementCode;
	
	@Column(name = "DE68_RECEIVING_COUNTRY_CODE")
	private String switchReceivingCountryCode;
	
	@Column(name = "DE69_SETT_COUNTRY_CODE")
	private String switchSettelementCountryCode;
	
	@Column(name = "DE70_NETWORL_MANAG_INFO")
	private String switchNetworkManageInfo;
	
	@Column(name = "DE71_MESSAGE_NUMBER")
	private String switchMessageNumber;
	
	@Column(name = "DE72_MESSAGE_NUMBER_LAST")
	private String switchMessageNumberLast;
	
	@Column(name = "DE73_DATE_ACTION")
	private String switchDateAction;
	
	@Column(name = "DE74_CREDIT_NUMBER")
	private String switchCreditNumber;
	
	@Column(name = "DE75_CREDIT_REVERS_NUMB")
	private String switchCreditRevrsalNumber;
	
	@Column(name = "DE76_DEBIT_NUMB")
	private String switchDebitNumber;
	
	@Column(name = "DE77_DEBIT_REVERS_NUMB")
	private String switchDebitReversalNumber;
	
	@Column(name = "DE78_TRANSFER_NUMBER")
	private String switchTransferNumber;
	
	@Column(name = "DE79_TRANSFER_REV_NUMB")
	private String switchTransferReversalNumber;
	
	@Column(name = "DE80_INQUERERS_NUMB")
	private String switchInsuerersNumber;
	
	@Column(name = "DE81_AUTHORIZATION_NUMBER")
	private String switchAuthorizationNumber;
	
	@Column(name = "DE82_CREDIT_PROC_FEE_NUMB")
	private String switchCreditProcFeesNumber;
	
	@Column(name = "DE83_CREDIT_TRANS_FEE_AMOU")
	private String switchCreditTransFeesAmount;
	
	@Column(name = "DE84_DEBIT_PROC_FEE_NUMB")
	private String switchDebitProcFeesNumber;
	
	@Column(name = "DE85_DEBIT_TRANS_FEE_AMOU")
	private String switchDebitTransFeesAmount;
	
	@Column(name = "DE86_CREDIT_AMOUNT")
	private String switchCreditAmount;
	
	@Column(name = "DE87_CREDIT_REB_AMOUNT")
	private String switchCreditReversalAmount;
	
	@Column(name = "DE88_DEBIT_AMOUNT")
	private String switchDebitAmount;
	
	@Column(name = "DE89_DEBIT_REV_AMOU")
	private String switchDebitReversalAmount;
	
	@Column(name = "DE90_ORIGINAL_DATA_ELEMENT")
	private String switchOriginalDataElement;
	
	@Column(name = "DE91_FILE_UPDATE_CODE")
	private String switchFileUpdateCode;
	
	@Column(name = "DE92_FILE_SECURITY_CODE")
	private String switchFileSecurityCode;
	
	@Column(name = "DE93")
	private String switchDE93;
	
	@Column(name = "DE94_SERVICE_INDICATOR")
	private String switchServiceIndicator;
	
	@Column(name = "DE95_REPLACEMENNTS_AMOIUNT")
	private String switchReplacementsAmount;
	
	@Column(name = "DE96_MESSAGE_SECURITY_CODE")
	private String switchMessageSecurityCode;
	
	@Column(name = "DE97_AMOUNT_NET_SETT")
	private String switchAmountNetSettelement;
	
	@Column(name = "DE98_PAYEE")
	private String switchPayee;
	
	@Column(name = "DE99_SETT_IDEN_CODE")
	private String switchSettelementIdenCode;
	
	@Column(name = "DE100_RECEIB_IDEN_CODE")
	private String switchReceibIdenCode;
	
	@Column(name = "DE101_FILE_NAME")
	private String switchFileName;
	
	@Column(name = "DE102_ACCOUNT_ID1")
	private String switchAccountId1;
	
	@Column(name = "DE103_ACCOUNT_ID2")
	private String switchAccountId2;
	
	@Column(name = "DE104_TRANSACTION_DESCRIPTION")
	private String switchTransactionDescription;

	@Column(name = "DE105_DES_KEY")
	private String switchDesKey;
	
	@Column(name = "DE106_RESERVED")
	private String switchDE106;
	
	@Column(name = "DE107_RESERVED")
	private String switchDE107;
	
	@Column(name = "DE108_RESERVED")
	private String switchDE108;
	
	@Column(name = "DE109_RESERVED")
	private String switchDE109;
	
	@Column(name = "DE110_RESERVED")
	private String switchDE110;
	
	@Column(name = "DE111_RESERVED")
	private String switchDE111;
	
	@Column(name = "DE112_RESERVED")
	private String switchDE112;
	
	@Column(name = "DE113_RESERVED")
	private String switchDE113;
	
	@Column(name = "DE114_RESERVED")
	private String switchDE114;
	
	@Column(name = "DE115_ADDITONAL_TRACE_DATA1")
	private String switchAdditioanlTraceData;
	
	@Column(name = "DE116_CARD_ISSUER_REF_DATA")
	private String switchCardIssuerRefData;
	
	@Column(name = "DE117_NATIONAL_USE")
	private String switchNationalUse;
	
	@Column(name = "DE118_INTRA_COUNTRY_DATA")
	private String switchIntraCounrtyData;
	
	@Column(name = "DE119_SETT_SERVICE_DATA")
	private String switchSettelementServiceData;
	
	@Column(name = "DE120")
	private String switchDE120;
	
	@Column(name = "DE121_ISSUER_IDEN_CODE")
	private String switchIssuerIdenCode;
	
	@Column(name = "DE122")
	private String switchDE122;
	
	@Column(name = "DE123_VERIFICATION_DATA")
	private String switchVerificationData;
	
	@Column(name = "DE124")
	private String switchDE124;
	
	@Column(name = "DE125_SUPPORTING_INFORMATION")
	private String switchSupportingInformation;
	
	@Column(name = "DE126_VISA_PRIVATE_USE")
	private String switchVisaPrivateUse;
	
	@Column(name = "DE127")
	private String switchDE127;
	
	@Column(name = "DE128")
	private String switchDE128;
	
	@Column(name = "DE129")
	private String switchDE129;
	
	@Column(name = "DE130_TERMINAL_COAPA_PROF")
	private String switchTerminalCapaProf;
	
	@Column(name = "DE131_TERMINAL_VERIF_RESULT")
	private String switchTerminamVerifResult;
	
	@Column(name = "DE132_UNPREDICTIBLE_NUMBER")
	private String switchUnpredictibleNumber;
	
	@Column(name = "DE133_TERMINAL_SERIAL_NUMBER")
	private String switchTerminalSerialNumber;
	
	@Column(name = "DE134_VISA_DISCRET_DATA")
	private String switchVisaDiscretData;
	
	@Column(name = "DE135_ISSUER_DISCRET_DATA")
	private String switchIssuerDiscretData;
	
	@Column(name = "DE136_CRYPTOGRAM")
	private String switchCrytpogram;
	
	@Column(name = "DE137_APP_TRANS_COUNTER")
	private String switchAppTransCounter;
	
	@Column(name = "DE138_APP_INTERCHANGE_PROFILE")
	private String switchAppInterchangeProfile;
	
	@Column(name = "DE139_ARPC")
	private String switchARPC;
	
	@Column(name = "DE140_ISSUER_AUTH_DATA")
	private String switchIssuerAuthData;
	
	@Column(name = "DE141")
	private String switchDE141;
	
	@Column(name = "DE142_ISSUER_SCRIPT")
	private String switchIssuerScript;
	
	@Column(name = "DE143_ISSUER_SCRIPT_RESULT")
	private String switchIssuerScriptResult;
	
	@Column(name = "DE144_CRYOT_TRANS_TYPE")
	private String switchCryptTransType;
	
	@Column(name = "DE145_TERMINAL_COUNTRY_CODE")
	private String switchTerminalCountryCode;
	
	@Column(name = "DE146_TERMINAL_TRANS_DATA")
	private String switchTerminalCountryCodeTransData;
	
	@Column(name = "DE147_CRYPTOGRAM_AMOUNT")
	private String switchCryptogramAmount;
	
	@Column(name = "DE148_CRYPT_CURR_CODE")
	private String switchCryptogramCurrencyCode;
	
	@Column(name = "DE149_CRYPT_CASHBACK_AMOUNT")
	private String switchCryptogramCashBackAmount;
	
	@Column(name = "DE150")
	private String switchDE150;
	
	@Column(name = "DE151")
	private String switchDE151;
	
	@Column(name = "DE152_SECONDARY_PINBLOCK")
	private String switchSecondaryPinBlock;
	//used
	@Column(name = "DE153")
	private String switchDE153;
	//used
	@Column(name = "DE154")
	private String switchDE154;
	//used
	@Column(name = "DE155")
	private String switchDE155;
	
	
	// for moneim
	@Column(name = "DE156")
	private String switchDE156;
	
	@Column(name = "DE157")
	private String switchDE157;
	
	@Column(name = "DE158")
	private String switchDE158;
	
	@Column(name = "DE159")
	private String switchDE159;
	
	@Column(name = "DE160")
	private String switchDE160;
	
	@Column(name = "DE161")
	private String switchDE161;
	
	@Column(name = "DE162")
	private String switchDE162;
	
	@Column(name = "DE163")
	private String switchDE163;
	
	@Column(name = "DE164")
	private String switchDE164;
	
	@Column(name = "DE165")
	private String switchDE165;
	
	@Column(name = "DE166")
	private String switchDE166;
	
	@Column(name = "DE167")
	private String switchDE167;
	
	@Column(name = "DE168")
	private String switchDE168;
	
	@Column(name = "DE169")
	private String switchDE169;
	
	@Column(name = "DE170")
	private String switchDE170;
	
	@Column(name = "DE171")
	private String switchDE171;
	
	@Column(name = "DE172")
	private String switchDE172;
	
	@Column(name = "DE173")
	private String switchDE173;
	
	@Column(name = "DE174")
	private String switchDE174;
	
	@Column(name = "DE175")
	private String switchDE175;
	
	@Column(name = "DE176")
	private String switchDE176;
	
	@Column(name = "DE177")
	private String switchDE177;
	
	@Column(name = "DE178")
	private String switchDE178;
	
	@Column(name = "DE179")
	private String switchDE179;
	
	@Column(name = "DE180")
	private String switchDE180;
	
	@Column(name = "DE181")
	private String switchDE181;
	
	@Column(name = "DE182")
	private String switchDE182;
	
	@Column(name = "DE183")
	private String switchDE183;
	
	@Column(name = "DE184")
	private String switchDE184;
	
	@Column(name = "DE185")
	private String switchDE185;
	
	@Column(name = "DE186")
	private String switchDE186;
	
	@Column(name = "DE187")
	private String switchDE187;
	
	@Column(name = "DE188")
	private String switchDE188;
	
	@Column(name = "DE189")
	private String switchDE189;
	
	@Column(name = "DE190")
	private String switchDE190;
	
	@Column(name = "DE191")
	private String switchDE191;
	
	@Column(name = "DE192_MESSAGE_AUTHENTI_BLOC")
	private String switchMessageAuthentiBloc;

	@Column(name = "STAT_TRANSACTION")
	private String switchStatTransaction;
	
	@Column(name = "TAG_9F36")
	  private String tag9F36;

	  @Column(name = "TAG_9F37")
	  private String tag9F37;

	  @Column(name = "TAG_9F02")
	  private String tag9F02;

	  @Column(name = "TAG_9F03")
	  private String tag9F03;

	  @Column(name = "TAG_9F1A")
	  private String tag9F1A;

	  @Column(name = "TAG_95")
	  private String tag95;

	  @Column(name = "TAG_5F2A")
	  private String tag5F2A;

	  @Column(name = "TAG_9A")
	  private String tag9A;

	  @Column(name = "TAG_9C")
	  private String tag9C;

	  @Column(name = "TAG_82")
	  private String tag82;

	  @Column(name = "TAG_9F10")
	  private String tag9F10;

	  @Column(name = "TAG_9F26")
	  private String tag9F26;

	  @Column(name = "TAG_9F33")
	  private String tag9F33;

	  @Column(name = "TAG_9F34")
	  private String tag9F34;

	  @Column(name = "TAG_91")
	  private String tag91;

	  @Column(name = "TAG_71")
	  private String tag71;

	  @Column(name = "TAG_72")
	  private String tag72;

	  @Column(name = "TAG_57")
	  private String tag57;

	  @Column(name = "SOURCE")
	  private String source;
	
	  @Column(name = "TAG_5F34")
	  private String tag5F34;
	  
	  @Column(name = "TAG_84")
	  private String tag84;

		@Column(name = "DATE_ARCHIVE")
		private String dateArchive;
	
	public String getTag84() {
		return tag84;
	}

	public void setTag84(String tag84) {
		this.tag84 = tag84;
	}

	public String getTag5F34() {
		return tag5F34;
	}

	public void setTag5F34(String tag5f34) {
		tag5F34 = tag5f34;
	}

	public int getSwitchCode() {
		return switchCode;
	}

	public void setSwitchCode(int switchCode) {
		this.switchCode = switchCode;
	}

	public Date getSwitchRequestDate() {
		return switchRequestDate;
	}

	public void setSwitchRequestDate(Date switchRequestDate) {
		this.switchRequestDate = switchRequestDate;
	}

	public Date getSwitchResponseDate() {
		return switchResponseDate;
	}

	public void setSwitchResponseDate(Date switchResponseDate) {
		this.switchResponseDate = switchResponseDate;
	}

	public String getSwitchMtiMessage() {
		return switchMtiMessage;
	}

	public void setSwitchMtiMessage(String switchMtiMessage) {
		this.switchMtiMessage = switchMtiMessage;
	}

	public String getSwitchBitmaps() {
		return switchBitmaps;
	}

	public void setSwitchBitmaps(String switchBitmaps) {
		this.switchBitmaps = switchBitmaps;
	}

	public String getSwitchPan() {
		return switchPan;
	}

	public void setSwitchPan(String switchPan) {
		this.switchPan = switchPan;
	}

	public String getSwitchProcessingCode() {
		return switchProcessingCode;
	}

	public void setSwitchProcessingCode(String switchProcessingCode) {
		this.switchProcessingCode = switchProcessingCode;
	}

	public String getSwitchAmountTransaction() {
		return switchAmountTransaction;
	}

	public void setSwitchAmountTransaction(String switchAmountTransaction) {
		this.switchAmountTransaction = switchAmountTransaction;
	}

	public String getSwitchAmountSettelement() {
		return switchAmountSettelement;
	}

	public void setSwitchAmountSettelement(String switchAmountSettelement) {
		this.switchAmountSettelement = switchAmountSettelement;
	}

	public String getSwitchAmountCardBelling() {
		return switchAmountCardBelling;
	}

	public void setSwitchAmountCardBelling(String switchAmountCardBelling) {
		this.switchAmountCardBelling = switchAmountCardBelling;
	}

	public String getSwitchTransmissionDate() {
		return switchTransmissionDate;
	}

	public void setSwitchTransmissionDate(String switchTransmissionDate) {
		this.switchTransmissionDate = switchTransmissionDate;
	}

	public String getSwitchFeesCardHolderBelling() {
		return switchFeesCardHolderBelling;
	}

	public void setSwitchFeesCardHolderBelling(String switchFeesCardHolderBelling) {
		this.switchFeesCardHolderBelling = switchFeesCardHolderBelling;
	}

	public String getSwitchConversionRateSettelement() {
		return switchConversionRateSettelement;
	}

	public void setSwitchConversionRateSettelement(String switchConversionRateSettelement) {
		this.switchConversionRateSettelement = switchConversionRateSettelement;
	}

	public String getSwitchConversionRateBelling() {
		return switchConversionRateBelling;
	}

	public void setSwitchConversionRateBelling(String switchConversionRateBelling) {
		this.switchConversionRateBelling = switchConversionRateBelling;
	}

	public String getSwitchStan() {
		return switchStan;
	}

	public void setSwitchStan(String switchStan) {
		this.switchStan = switchStan;
	}

	public String getSwitchTimeLocalTransaction() {
		return switchTimeLocalTransaction;
	}

	public void setSwitchTimeLocalTransaction(String switchTimeLocalTransaction) {
		this.switchTimeLocalTransaction = switchTimeLocalTransaction;
	}

	public String getSwitchDateLocalTransaction() {
		return switchDateLocalTransaction;
	}

	public void setSwitchDateLocalTransaction(String switchDateLocalTransaction) {
		this.switchDateLocalTransaction = switchDateLocalTransaction;
	}

	public String getSwitchExpirationDate() {
		return switchExpirationDate;
	}

	public void setSwitchExpirationDate(String switchExpirationDate) {
		this.switchExpirationDate = switchExpirationDate;
	}

	public String getSwitchSettelementDate() {
		return switchSettelementDate;
	}

	public void setSwitchSettelementDate(String switchSettelementDate) {
		this.switchSettelementDate = switchSettelementDate;
	}

	public String getSwitchConversionDate() {
		return switchConversionDate;
	}

	public void setSwitchConversionDate(String switchConversionDate) {
		this.switchConversionDate = switchConversionDate;
	}

	public String getSwitchCaptureDate() {
		return switchCaptureDate;
	}

	public void setSwitchCaptureDate(String switchCaptureDate) {
		this.switchCaptureDate = switchCaptureDate;
	}

	public String getSwitchMerchantType() {
		return switchMerchantType;
	}

	public void setSwitchMerchantType(String switchMerchantType) {
		this.switchMerchantType = switchMerchantType;
	}

	public String getSwitchAcquirerCountryCode() {
		return switchAcquirerCountryCode;
	}

	public void setSwitchAcquirerCountryCode(String switchAcquirerCountryCode) {
		this.switchAcquirerCountryCode = switchAcquirerCountryCode;
	}

	public String getSwitchIssuerCountryCode() {
		return switchIssuerCountryCode;
	}

	public void setSwitchIssuerCountryCode(String switchIssuerCountryCode) {
		this.switchIssuerCountryCode = switchIssuerCountryCode;
	}

	public String getSwitchForwCountryCode() {
		return switchForwCountryCode;
	}

	public void setSwitchForwCountryCode(String switchForwCountryCode) {
		this.switchForwCountryCode = switchForwCountryCode;
	}

	public String getSwitchPosEntryMode() {
		return switchPosEntryMode;
	}

	public void setSwitchPosEntryMode(String switchPosEntryMode) {
		this.switchPosEntryMode = switchPosEntryMode;
	}

	public String getSwitchSequanceNumber() {
		return switchSequanceNumber;
	}

	public void setSwitchSequanceNumber(String switchSequanceNumber) {
		this.switchSequanceNumber = switchSequanceNumber;
	}

	public String getSwitchNetworkIdientifier() {
		return switchNetworkIdientifier;
	}

	public void setSwitchNetworkIdientifier(String switchNetworkIdientifier) {
		this.switchNetworkIdientifier = switchNetworkIdientifier;
	}

	public String getSwitchPosConditionCode() {
		return switchPosConditionCode;
	}

	public void setSwitchPosConditionCode(String switchPosConditionCode) {
		this.switchPosConditionCode = switchPosConditionCode;
	}

	public String getSwitchPosPinCaptureCode() {
		return switchPosPinCaptureCode;
	}

	public void setSwitchPosPinCaptureCode(String switchPosPinCaptureCode) {
		this.switchPosPinCaptureCode = switchPosPinCaptureCode;
	}

	public String getSwitchAuthIdenLength() {
		return switchAuthIdenLength;
	}

	public void setSwitchAuthIdenLength(String switchAuthIdenLength) {
		this.switchAuthIdenLength = switchAuthIdenLength;
	}

	public String getSwitchTransactionAmountFees() {
		return switchTransactionAmountFees;
	}

	public void setSwitchTransactionAmountFees(String switchTransactionAmountFees) {
		this.switchTransactionAmountFees = switchTransactionAmountFees;
	}

	public String getSwitchSettelementAmountFees() {
		return switchSettelementAmountFees;
	}

	public void setSwitchSettelementAmountFees(String switchSettelementAmountFees) {
		this.switchSettelementAmountFees = switchSettelementAmountFees;
	}

	public String getSwitchTransAmountProcFees() {
		return switchTransAmountProcFees;
	}

	public void setSwitchTransAmountProcFees(String switchTransAmountProcFees) {
		this.switchTransAmountProcFees = switchTransAmountProcFees;
	}

	public String getSwitchSettAmountProcFees() {
		return switchSettAmountProcFees;
	}

	public void setSwitchSettAmountProcFees(String switchSettAmountProcFees) {
		this.switchSettAmountProcFees = switchSettAmountProcFees;
	}

	public String getSwitchAcquirerIdenCode() {
		return switchAcquirerIdenCode;
	}

	public void setSwitchAcquirerIdenCode(String switchAcquirerIdenCode) {
		this.switchAcquirerIdenCode = switchAcquirerIdenCode;
	}

	public String getSwitchForwardIdentCode() {
		return switchForwardIdentCode;
	}

	public void setSwitchForwardIdentCode(String switchForwardIdentCode) {
		this.switchForwardIdentCode = switchForwardIdentCode;
	}

	public String getSwitchExtendedPan() {
		return switchExtendedPan;
	}

	public void setSwitchExtendedPan(String switchExtendedPan) {
		this.switchExtendedPan = switchExtendedPan;
	}

	public String getSwitchTrack2Data() {
		return switchTrack2Data;
	}

	public void setSwitchTrack2Data(String switchTrack2Data) {
		this.switchTrack2Data = switchTrack2Data;
	}

	public String getSwitchTrack3Data() {
		return switchTrack3Data;
	}

	public void setSwitchTrack3Data(String switchTrack3Data) {
		this.switchTrack3Data = switchTrack3Data;
	}

	public String getSwitchRRN() {
		return switchRRN;
	}

	public void setSwitchRRN(String switchRRN) {
		this.switchRRN = switchRRN;
	}

	public String getSwitchAuthNumber() {
		return switchAuthNumber;
	}

	public void setSwitchAuthNumber(String switchAuthNumber) {
		this.switchAuthNumber = switchAuthNumber;
	}

	public String getSwitchResponseCode() {
		return switchResponseCode;
	}

	public void setSwitchResponseCode(String switchResponseCode) {
		this.switchResponseCode = switchResponseCode;
	}

	public String getSwitchServiceRestrictionCode() {
		return switchServiceRestrictionCode;
	}

	public void setSwitchServiceRestrictionCode(String switchServiceRestrictionCode) {
		this.switchServiceRestrictionCode = switchServiceRestrictionCode;
	}

	public String getSwitchAcceptorTerminalId() {
		return switchAcceptorTerminalId;
	}

	public void setSwitchAcceptorTerminalId(String switchAcceptorTerminalId) {
		this.switchAcceptorTerminalId = switchAcceptorTerminalId;
	}

	public String getSwitchAcceptorMerchantCode() {
		return switchAcceptorMerchantCode;
	}

	public void setSwitchAcceptorMerchantCode(String switchAcceptorMerchantCode) {
		this.switchAcceptorMerchantCode = switchAcceptorMerchantCode;
	}

	public String getSwitchAcceptorAcceptorName() {
		return switchAcceptorAcceptorName;
	}

	public void setSwitchAcceptorAcceptorName(String switchAcceptorAcceptorName) {
		this.switchAcceptorAcceptorName = switchAcceptorAcceptorName;
	}

	public String getSwitchAdditionalRespData() {
		return switchAdditionalRespData;
	}

	public void setSwitchAdditionalRespData(String switchAdditionalRespData) {
		this.switchAdditionalRespData = switchAdditionalRespData;
	}

	public String getSwitchTrack1Data() {
		return switchTrack1Data;
	}

	public void setSwitchTrack1Data(String switchTrack1Data) {
		this.switchTrack1Data = switchTrack1Data;
	}

	public String getSwitchAmountFees() {
		return switchAmountFees;
	}

	public void setSwitchAmountFees(String switchAmountFees) {
		this.switchAmountFees = switchAmountFees;
	}

	public String getSwitchNationalAdditionalData() {
		return switchNationalAdditionalData;
	}

	public void setSwitchNationalAdditionalData(String switchNationalAdditionalData) {
		this.switchNationalAdditionalData = switchNationalAdditionalData;
	}

	public String getSwitchAdditionalData() {
		return switchAdditionalData;
	}

	public void setSwitchAdditionalData(String switchAdditionalData) {
		this.switchAdditionalData = switchAdditionalData;
	}

	public String getSwitchTransactionCurrencyCode() {
		return switchTransactionCurrencyCode;
	}

	public void setSwitchTransactionCurrencyCode(String switchTransactionCurrencyCode) {
		this.switchTransactionCurrencyCode = switchTransactionCurrencyCode;
	}

	public String getSwitchSettelementCurrencyCode() {
		return switchSettelementCurrencyCode;
	}

	public void setSwitchSettelementCurrencyCode(String switchSettelementCurrencyCode) {
		this.switchSettelementCurrencyCode = switchSettelementCurrencyCode;
	}

	public String getSwitchBillingCurrencyCode() {
		return switchBillingCurrencyCode;
	}

	public void setSwitchBillingCurrencyCode(String switchBillingCurrencyCode) {
		this.switchBillingCurrencyCode = switchBillingCurrencyCode;
	}

	public String getSwitchPinBlock() {
		return switchPinBlock;
	}

	public void setSwitchPinBlock(String switchPinBlock) {
		this.switchPinBlock = switchPinBlock;
	}

	public String getSwitchSecurRelaInfo() {
		return switchSecurRelaInfo;
	}

	public void setSwitchSecurRelaInfo(String switchSecurRelaInfo) {
		this.switchSecurRelaInfo = switchSecurRelaInfo;
	}

	public String getSwitchAdditionalAmount() {
		return switchAdditionalAmount;
	}

	public void setSwitchAdditionalAmount(String switchAdditionalAmount) {
		this.switchAdditionalAmount = switchAdditionalAmount;
	}

	public String getSwitchEmvData() {
		return switchEmvData;
	}

	public void setSwitchEmvData(String switchEmvData) {
		this.switchEmvData = switchEmvData;
	}

	public String getSwitchReservedIso() {
		return switchReservedIso;
	}

	public void setSwitchReservedIso(String switchReservedIso) {
		this.switchReservedIso = switchReservedIso;
	}

	public String getSwitchDE57() {
		return switchDE57;
	}

	public void setSwitchDE57(String switchDE57) {
		this.switchDE57 = switchDE57;
	}

	public String getSwitchDE58() {
		return switchDE58;
	}

	public void setSwitchDE58(String switchDE58) {
		this.switchDE58 = switchDE58;
	}

	public String getSwitchNationalPosGeoData() {
		return switchNationalPosGeoData;
	}

	public void setSwitchNationalPosGeoData(String switchNationalPosGeoData) {
		this.switchNationalPosGeoData = switchNationalPosGeoData;
	}

	public String getSwitchAdditonalPosData() {
		return switchAdditonalPosData;
	}

	public void setSwitchAdditonalPosData(String switchAdditonalPosData) {
		this.switchAdditonalPosData = switchAdditonalPosData;
	}

	public String getSwitchOtherAmount() {
		return switchOtherAmount;
	}

	public void setSwitchOtherAmount(String switchOtherAmount) {
		this.switchOtherAmount = switchOtherAmount;
	}

	public String getSwitchServiceFieldsBitmaps() {
		return switchServiceFieldsBitmaps;
	}

	public void setSwitchServiceFieldsBitmaps(String switchServiceFieldsBitmaps) {
		this.switchServiceFieldsBitmaps = switchServiceFieldsBitmaps;
	}

	public String getSwitchSmsPrivateUse() {
		return switchSmsPrivateUse;
	}

	public void setSwitchSmsPrivateUse(String switchSmsPrivateUse) {
		this.switchSmsPrivateUse = switchSmsPrivateUse;
	}

	public String getSwitchDE64() {
		return switchDE64;
	}

	public void setSwitchDE64(String switchDE64) {
		this.switchDE64 = switchDE64;
	}

	public String getSwitchDE65() {
		return switchDE65;
	}

	public void setSwitchDE65(String switchDE65) {
		this.switchDE65 = switchDE65;
	}

	public String getSwitchSettelemeentCode() {
		return switchSettelemeentCode;
	}

	public void setSwitchSettelemeentCode(String switchSettelemeentCode) {
		this.switchSettelemeentCode = switchSettelemeentCode;
	}

	public String getSwitchExtendedPayementCode() {
		return switchExtendedPayementCode;
	}

	public void setSwitchExtendedPayementCode(String switchExtendedPayementCode) {
		this.switchExtendedPayementCode = switchExtendedPayementCode;
	}

	public String getSwitchReceivingCountryCode() {
		return switchReceivingCountryCode;
	}

	public void setSwitchReceivingCountryCode(String switchReceivingCountryCode) {
		this.switchReceivingCountryCode = switchReceivingCountryCode;
	}

	public String getSwitchSettelementCountryCode() {
		return switchSettelementCountryCode;
	}

	public void setSwitchSettelementCountryCode(String switchSettelementCountryCode) {
		this.switchSettelementCountryCode = switchSettelementCountryCode;
	}

	public String getSwitchNetworkManageInfo() {
		return switchNetworkManageInfo;
	}

	public void setSwitchNetworkManageInfo(String switchNetworkManageInfo) {
		this.switchNetworkManageInfo = switchNetworkManageInfo;
	}

	public String getSwitchMessageNumber() {
		return switchMessageNumber;
	}

	public void setSwitchMessageNumber(String switchMessageNumber) {
		this.switchMessageNumber = switchMessageNumber;
	}

	public String getSwitchMessageNumberLast() {
		return switchMessageNumberLast;
	}

	public void setSwitchMessageNumberLast(String switchMessageNumberLast) {
		this.switchMessageNumberLast = switchMessageNumberLast;
	}

	public String getSwitchDateAction() {
		return switchDateAction;
	}

	public void setSwitchDateAction(String switchDateAction) {
		this.switchDateAction = switchDateAction;
	}

	public String getSwitchCreditNumber() {
		return switchCreditNumber;
	}

	public void setSwitchCreditNumber(String switchCreditNumber) {
		this.switchCreditNumber = switchCreditNumber;
	}

	public String getSwitchCreditRevrsalNumber() {
		return switchCreditRevrsalNumber;
	}

	public void setSwitchCreditRevrsalNumber(String switchCreditRevrsalNumber) {
		this.switchCreditRevrsalNumber = switchCreditRevrsalNumber;
	}

	public String getSwitchDebitNumber() {
		return switchDebitNumber;
	}

	public void setSwitchDebitNumber(String switchDebitNumber) {
		this.switchDebitNumber = switchDebitNumber;
	}

	public String getSwitchDebitReversalNumber() {
		return switchDebitReversalNumber;
	}

	public void setSwitchDebitReversalNumber(String switchDebitReversalNumber) {
		this.switchDebitReversalNumber = switchDebitReversalNumber;
	}

	public String getSwitchTransferNumber() {
		return switchTransferNumber;
	}

	public void setSwitchTransferNumber(String switchTransferNumber) {
		this.switchTransferNumber = switchTransferNumber;
	}

	public String getSwitchTransferReversalNumber() {
		return switchTransferReversalNumber;
	}

	public void setSwitchTransferReversalNumber(String switchTransferReversalNumber) {
		this.switchTransferReversalNumber = switchTransferReversalNumber;
	}

	public String getSwitchInsuerersNumber() {
		return switchInsuerersNumber;
	}

	public void setSwitchInsuerersNumber(String switchInsuerersNumber) {
		this.switchInsuerersNumber = switchInsuerersNumber;
	}

	public String getSwitchAuthorizationNumber() {
		return switchAuthorizationNumber;
	}

	public void setSwitchAuthorizationNumber(String switchAuthorizationNumber) {
		this.switchAuthorizationNumber = switchAuthorizationNumber;
	}

	public String getSwitchCreditProcFeesNumber() {
		return switchCreditProcFeesNumber;
	}

	public void setSwitchCreditProcFeesNumber(String switchCreditProcFeesNumber) {
		this.switchCreditProcFeesNumber = switchCreditProcFeesNumber;
	}

	public String getSwitchCreditTransFeesAmount() {
		return switchCreditTransFeesAmount;
	}

	public void setSwitchCreditTransFeesAmount(String switchCreditTransFeesAmount) {
		this.switchCreditTransFeesAmount = switchCreditTransFeesAmount;
	}

	public String getSwitchDebitProcFeesNumber() {
		return switchDebitProcFeesNumber;
	}

	public void setSwitchDebitProcFeesNumber(String switchDebitProcFeesNumber) {
		this.switchDebitProcFeesNumber = switchDebitProcFeesNumber;
	}

	public String getSwitchDebitTransFeesAmount() {
		return switchDebitTransFeesAmount;
	}

	public void setSwitchDebitTransFeesAmount(String switchDebitTransFeesAmount) {
		this.switchDebitTransFeesAmount = switchDebitTransFeesAmount;
	}

	public String getSwitchCreditAmount() {
		return switchCreditAmount;
	}

	public void setSwitchCreditAmount(String switchCreditAmount) {
		this.switchCreditAmount = switchCreditAmount;
	}

	public String getSwitchCreditReversalAmount() {
		return switchCreditReversalAmount;
	}

	public void setSwitchCreditReversalAmount(String switchCreditReversalAmount) {
		this.switchCreditReversalAmount = switchCreditReversalAmount;
	}

	public String getSwitchDebitAmount() {
		return switchDebitAmount;
	}

	public void setSwitchDebitAmount(String switchDebitAmount) {
		this.switchDebitAmount = switchDebitAmount;
	}

	public String getSwitchDebitReversalAmount() {
		return switchDebitReversalAmount;
	}

	public void setSwitchDebitReversalAmount(String switchDebitReversalAmount) {
		this.switchDebitReversalAmount = switchDebitReversalAmount;
	}

	public String getSwitchOriginalDataElement() {
		return switchOriginalDataElement;
	}

	public void setSwitchOriginalDataElement(String switchOriginalDataElement) {
		this.switchOriginalDataElement = switchOriginalDataElement;
	}

	public String getSwitchFileUpdateCode() {
		return switchFileUpdateCode;
	}

	public void setSwitchFileUpdateCode(String switchFileUpdateCode) {
		this.switchFileUpdateCode = switchFileUpdateCode;
	}

	public String getSwitchFileSecurityCode() {
		return switchFileSecurityCode;
	}

	public void setSwitchFileSecurityCode(String switchFileSecurityCode) {
		this.switchFileSecurityCode = switchFileSecurityCode;
	}

	public String getSwitchDE93() {
		return switchDE93;
	}

	public void setSwitchDE93(String switchDE93) {
		this.switchDE93 = switchDE93;
	}

	public String getSwitchServiceIndicator() {
		return switchServiceIndicator;
	}

	public void setSwitchServiceIndicator(String switchServiceIndicator) {
		this.switchServiceIndicator = switchServiceIndicator;
	}

	public String getSwitchReplacementsAmount() {
		return switchReplacementsAmount;
	}

	public void setSwitchReplacementsAmount(String switchReplacementsAmount) {
		this.switchReplacementsAmount = switchReplacementsAmount;
	}

	public String getSwitchMessageSecurityCode() {
		return switchMessageSecurityCode;
	}

	public void setSwitchMessageSecurityCode(String switchMessageSecurityCode) {
		this.switchMessageSecurityCode = switchMessageSecurityCode;
	}

	public String getSwitchAmountNetSettelement() {
		return switchAmountNetSettelement;
	}

	public void setSwitchAmountNetSettelement(String switchAmountNetSettelement) {
		this.switchAmountNetSettelement = switchAmountNetSettelement;
	}

	public String getSwitchPayee() {
		return switchPayee;
	}

	public void setSwitchPayee(String switchPayee) {
		this.switchPayee = switchPayee;
	}

	public String getSwitchSettelementIdenCode() {
		return switchSettelementIdenCode;
	}

	public void setSwitchSettelementIdenCode(String switchSettelementIdenCode) {
		this.switchSettelementIdenCode = switchSettelementIdenCode;
	}

	public String getSwitchReceibIdenCode() {
		return switchReceibIdenCode;
	}

	public void setSwitchReceibIdenCode(String switchReceibIdenCode) {
		this.switchReceibIdenCode = switchReceibIdenCode;
	}

	public String getSwitchFileName() {
		return switchFileName;
	}

	public void setSwitchFileName(String switchFileName) {
		this.switchFileName = switchFileName;
	}

	public String getSwitchAccountId1() {
		return switchAccountId1;
	}

	public void setSwitchAccountId1(String switchAccountId1) {
		this.switchAccountId1 = switchAccountId1;
	}

	public String getSwitchAccountId2() {
		return switchAccountId2;
	}

	public void setSwitchAccountId2(String switchAccountId2) {
		this.switchAccountId2 = switchAccountId2;
	}

	public String getSwitchTransactionDescription() {
		return switchTransactionDescription;
	}

	public void setSwitchTransactionDescription(String switchTransactionDescription) {
		this.switchTransactionDescription = switchTransactionDescription;
	}

	public String getSwitchDesKey() {
		return switchDesKey;
	}

	public void setSwitchDesKey(String switchDesKey) {
		this.switchDesKey = switchDesKey;
	}

	public String getSwitchDE106() {
		return switchDE106;
	}

	public void setSwitchDE106(String switchDE106) {
		this.switchDE106 = switchDE106;
	}

	public String getSwitchDE107() {
		return switchDE107;
	}

	public void setSwitchDE107(String switchDE107) {
		this.switchDE107 = switchDE107;
	}

	public String getSwitchDE108() {
		return switchDE108;
	}

	public void setSwitchDE108(String switchDE108) {
		this.switchDE108 = switchDE108;
	}

	public String getSwitchDE109() {
		return switchDE109;
	}

	public void setSwitchDE109(String switchDE109) {
		this.switchDE109 = switchDE109;
	}

	public String getSwitchDE110() {
		return switchDE110;
	}

	public void setSwitchDE110(String switchDE110) {
		this.switchDE110 = switchDE110;
	}

	public String getSwitchDE111() {
		return switchDE111;
	}

	public void setSwitchDE111(String switchDE111) {
		this.switchDE111 = switchDE111;
	}

	public String getSwitchDE112() {
		return switchDE112;
	}

	public void setSwitchDE112(String switchDE112) {
		this.switchDE112 = switchDE112;
	}

	public String getSwitchDE113() {
		return switchDE113;
	}

	public void setSwitchDE113(String switchDE113) {
		this.switchDE113 = switchDE113;
	}

	public String getSwitchDE114() {
		return switchDE114;
	}

	public void setSwitchDE114(String switchDE114) {
		this.switchDE114 = switchDE114;
	}

	public String getSwitchAdditioanlTraceData() {
		return switchAdditioanlTraceData;
	}

	public void setSwitchAdditioanlTraceData(String switchAdditioanlTraceData) {
		this.switchAdditioanlTraceData = switchAdditioanlTraceData;
	}

	public String getSwitchCardIssuerRefData() {
		return switchCardIssuerRefData;
	}

	public void setSwitchCardIssuerRefData(String switchCardIssuerRefData) {
		this.switchCardIssuerRefData = switchCardIssuerRefData;
	}

	public String getSwitchNationalUse() {
		return switchNationalUse;
	}

	public void setSwitchNationalUse(String switchNationalUse) {
		this.switchNationalUse = switchNationalUse;
	}

	public String getSwitchIntraCounrtyData() {
		return switchIntraCounrtyData;
	}

	public void setSwitchIntraCounrtyData(String switchIntraCounrtyData) {
		this.switchIntraCounrtyData = switchIntraCounrtyData;
	}

	public String getSwitchSettelementServiceData() {
		return switchSettelementServiceData;
	}

	public void setSwitchSettelementServiceData(String switchSettelementServiceData) {
		this.switchSettelementServiceData = switchSettelementServiceData;
	}

	public String getSwitchDE120() {
		return switchDE120;
	}

	public void setSwitchDE120(String switchDE120) {
		this.switchDE120 = switchDE120;
	}

	public String getSwitchIssuerIdenCode() {
		return switchIssuerIdenCode;
	}

	public void setSwitchIssuerIdenCode(String switchIssuerIdenCode) {
		this.switchIssuerIdenCode = switchIssuerIdenCode;
	}

	public String getSwitchDE122() {
		return switchDE122;
	}

	public void setSwitchDE122(String switchDE122) {
		this.switchDE122 = switchDE122;
	}

	public String getSwitchVerificationData() {
		return switchVerificationData;
	}

	public void setSwitchVerificationData(String switchVerificationData) {
		this.switchVerificationData = switchVerificationData;
	}

	public String getSwitchDE124() {
		return switchDE124;
	}

	public void setSwitchDE124(String switchDE124) {
		this.switchDE124 = switchDE124;
	}

	public String getSwitchSupportingInformation() {
		return switchSupportingInformation;
	}

	public void setSwitchSupportingInformation(String switchSupportingInformation) {
		this.switchSupportingInformation = switchSupportingInformation;
	}

	public String getSwitchVisaPrivateUse() {
		return switchVisaPrivateUse;
	}

	public void setSwitchVisaPrivateUse(String switchVisaPrivateUse) {
		this.switchVisaPrivateUse = switchVisaPrivateUse;
	}

	public String getSwitchDE127() {
		return switchDE127;
	}

	public void setSwitchDE127(String switchDE127) {
		this.switchDE127 = switchDE127;
	}

	public String getSwitchDE128() {
		return switchDE128;
	}

	public void setSwitchDE128(String switchDE128) {
		this.switchDE128 = switchDE128;
	}

	public String getSwitchDE129() {
		return switchDE129;
	}

	public void setSwitchDE129(String switchDE129) {
		this.switchDE129 = switchDE129;
	}

	public String getSwitchTerminalCapaProf() {
		return switchTerminalCapaProf;
	}

	public void setSwitchTerminalCapaProf(String switchTerminalCapaProf) {
		this.switchTerminalCapaProf = switchTerminalCapaProf;
	}

	public String getSwitchTerminamVerifResult() {
		return switchTerminamVerifResult;
	}

	public void setSwitchTerminamVerifResult(String switchTerminamVerifResult) {
		this.switchTerminamVerifResult = switchTerminamVerifResult;
	}

	public String getSwitchUnpredictibleNumber() {
		return switchUnpredictibleNumber;
	}

	public void setSwitchUnpredictibleNumber(String switchUnpredictibleNumber) {
		this.switchUnpredictibleNumber = switchUnpredictibleNumber;
	}

	public String getSwitchTerminalSerialNumber() {
		return switchTerminalSerialNumber;
	}

	public void setSwitchTerminalSerialNumber(String switchTerminalSerialNumber) {
		this.switchTerminalSerialNumber = switchTerminalSerialNumber;
	}

	public String getSwitchVisaDiscretData() {
		return switchVisaDiscretData;
	}

	public void setSwitchVisaDiscretData(String switchVisaDiscretData) {
		this.switchVisaDiscretData = switchVisaDiscretData;
	}

	public String getSwitchIssuerDiscretData() {
		return switchIssuerDiscretData;
	}

	public void setSwitchIssuerDiscretData(String switchIssuerDiscretData) {
		this.switchIssuerDiscretData = switchIssuerDiscretData;
	}

	public String getSwitchCrytpogram() {
		return switchCrytpogram;
	}

	public void setSwitchCrytpogram(String switchCrytpogram) {
		this.switchCrytpogram = switchCrytpogram;
	}

	public String getSwitchAppTransCounter() {
		return switchAppTransCounter;
	}

	public void setSwitchAppTransCounter(String switchAppTransCounter) {
		this.switchAppTransCounter = switchAppTransCounter;
	}

	public String getSwitchAppInterchangeProfile() {
		return switchAppInterchangeProfile;
	}

	public void setSwitchAppInterchangeProfile(String switchAppInterchangeProfile) {
		this.switchAppInterchangeProfile = switchAppInterchangeProfile;
	}

	public String getSwitchARPC() {
		return switchARPC;
	}

	public void setSwitchARPC(String switchARPC) {
		this.switchARPC = switchARPC;
	}

	public String getSwitchIssuerAuthData() {
		return switchIssuerAuthData;
	}

	public void setSwitchIssuerAuthData(String switchIssuerAuthData) {
		this.switchIssuerAuthData = switchIssuerAuthData;
	}

	public String getSwitchDE141() {
		return switchDE141;
	}

	public void setSwitchDE141(String switchDE141) {
		this.switchDE141 = switchDE141;
	}

	public String getSwitchIssuerScript() {
		return switchIssuerScript;
	}

	public void setSwitchIssuerScript(String switchIssuerScript) {
		this.switchIssuerScript = switchIssuerScript;
	}

	public String getSwitchIssuerScriptResult() {
		return switchIssuerScriptResult;
	}

	public void setSwitchIssuerScriptResult(String switchIssuerScriptResult) {
		this.switchIssuerScriptResult = switchIssuerScriptResult;
	}

	public String getSwitchCryptTransType() {
		return switchCryptTransType;
	}

	public void setSwitchCryptTransType(String switchCryptTransType) {
		this.switchCryptTransType = switchCryptTransType;
	}

	public String getSwitchTerminalCountryCode() {
		return switchTerminalCountryCode;
	}

	public void setSwitchTerminalCountryCode(String switchTerminalCountryCode) {
		this.switchTerminalCountryCode = switchTerminalCountryCode;
	}

	public String getSwitchTerminalCountryCodeTransData() {
		return switchTerminalCountryCodeTransData;
	}

	public void setSwitchTerminalCountryCodeTransData(String switchTerminalCountryCodeTransData) {
		this.switchTerminalCountryCodeTransData = switchTerminalCountryCodeTransData;
	}

	public String getSwitchCryptogramAmount() {
		return switchCryptogramAmount;
	}

	public void setSwitchCryptogramAmount(String switchCryptogramAmount) {
		this.switchCryptogramAmount = switchCryptogramAmount;
	}

	public String getSwitchCryptogramCurrencyCode() {
		return switchCryptogramCurrencyCode;
	}

	public void setSwitchCryptogramCurrencyCode(String switchCryptogramCurrencyCode) {
		this.switchCryptogramCurrencyCode = switchCryptogramCurrencyCode;
	}

	public String getSwitchCryptogramCashBackAmount() {
		return switchCryptogramCashBackAmount;
	}

	public void setSwitchCryptogramCashBackAmount(String switchCryptogramCashBackAmount) {
		this.switchCryptogramCashBackAmount = switchCryptogramCashBackAmount;
	}

	public String getSwitchDE150() {
		return switchDE150;
	}

	public void setSwitchDE150(String switchDE150) {
		this.switchDE150 = switchDE150;
	}

	public String getSwitchDE151() {
		return switchDE151;
	}

	public void setSwitchDE151(String switchDE151) {
		this.switchDE151 = switchDE151;
	}

	public String getSwitchSecondaryPinBlock() {
		return switchSecondaryPinBlock;
	}

	public void setSwitchSecondaryPinBlock(String switchSecondaryPinBlock) {
		this.switchSecondaryPinBlock = switchSecondaryPinBlock;
	}

	public String getSwitchDE153() {
		return switchDE153;
	}

	public void setSwitchDE153(String switchDE153) {
		this.switchDE153 = switchDE153;
	}

	public String getSwitchDE154() {
		return switchDE154;
	}

	public void setSwitchDE154(String switchDE154) {
		this.switchDE154 = switchDE154;
	}

	public String getSwitchDE155() {
		return switchDE155;
	}

	public void setSwitchDE155(String switchDE155) {
		this.switchDE155 = switchDE155;
	}

	public String getSwitchDE156() {
		return switchDE156;
	}

	public void setSwitchDE156(String switchDE156) {
		this.switchDE156 = switchDE156;
	}

	public String getSwitchDE157() {
		return switchDE157;
	}

	public void setSwitchDE157(String switchDE157) {
		this.switchDE157 = switchDE157;
	}

	public String getSwitchDE158() {
		return switchDE158;
	}

	public void setSwitchDE158(String switchDE158) {
		this.switchDE158 = switchDE158;
	}

	public String getSwitchDE159() {
		return switchDE159;
	}

	public void setSwitchDE159(String switchDE159) {
		this.switchDE159 = switchDE159;
	}

	public String getSwitchDE160() {
		return switchDE160;
	}

	public void setSwitchDE160(String switchDE160) {
		this.switchDE160 = switchDE160;
	}

	public String getSwitchDE161() {
		return switchDE161;
	}

	public void setSwitchDE161(String switchDE161) {
		this.switchDE161 = switchDE161;
	}

	public String getSwitchDE162() {
		return switchDE162;
	}

	public void setSwitchDE162(String switchDE162) {
		this.switchDE162 = switchDE162;
	}

	public String getSwitchDE163() {
		return switchDE163;
	}

	public void setSwitchDE163(String switchDE163) {
		this.switchDE163 = switchDE163;
	}

	public String getSwitchDE164() {
		return switchDE164;
	}

	public void setSwitchDE164(String switchDE164) {
		this.switchDE164 = switchDE164;
	}

	public String getSwitchDE165() {
		return switchDE165;
	}

	public void setSwitchDE165(String switchDE165) {
		this.switchDE165 = switchDE165;
	}

	public String getSwitchDE166() {
		return switchDE166;
	}

	public void setSwitchDE166(String switchDE166) {
		this.switchDE166 = switchDE166;
	}

	public String getSwitchDE167() {
		return switchDE167;
	}

	public void setSwitchDE167(String switchDE167) {
		this.switchDE167 = switchDE167;
	}

	public String getSwitchDE168() {
		return switchDE168;
	}

	public void setSwitchDE168(String switchDE168) {
		this.switchDE168 = switchDE168;
	}

	public String getSwitchDE169() {
		return switchDE169;
	}

	public void setSwitchDE169(String switchDE169) {
		this.switchDE169 = switchDE169;
	}

	public String getSwitchDE170() {
		return switchDE170;
	}

	public void setSwitchDE170(String switchDE170) {
		this.switchDE170 = switchDE170;
	}

	public String getSwitchDE171() {
		return switchDE171;
	}

	public void setSwitchDE171(String switchDE171) {
		this.switchDE171 = switchDE171;
	}

	public String getSwitchDE172() {
		return switchDE172;
	}

	public void setSwitchDE172(String switchDE172) {
		this.switchDE172 = switchDE172;
	}

	public String getSwitchDE173() {
		return switchDE173;
	}

	public void setSwitchDE173(String switchDE173) {
		this.switchDE173 = switchDE173;
	}

	public String getSwitchDE174() {
		return switchDE174;
	}

	public void setSwitchDE174(String switchDE174) {
		this.switchDE174 = switchDE174;
	}

	public String getSwitchDE175() {
		return switchDE175;
	}

	public void setSwitchDE175(String switchDE175) {
		this.switchDE175 = switchDE175;
	}

	public String getSwitchDE176() {
		return switchDE176;
	}

	public void setSwitchDE176(String switchDE176) {
		this.switchDE176 = switchDE176;
	}

	public String getSwitchDE177() {
		return switchDE177;
	}

	public void setSwitchDE177(String switchDE177) {
		this.switchDE177 = switchDE177;
	}

	public String getSwitchDE178() {
		return switchDE178;
	}

	public void setSwitchDE178(String switchDE178) {
		this.switchDE178 = switchDE178;
	}

	public String getSwitchDE179() {
		return switchDE179;
	}

	public void setSwitchDE179(String switchDE179) {
		this.switchDE179 = switchDE179;
	}

	public String getSwitchDE180() {
		return switchDE180;
	}

	public void setSwitchDE180(String switchDE180) {
		this.switchDE180 = switchDE180;
	}

	public String getSwitchDE181() {
		return switchDE181;
	}

	public void setSwitchDE181(String switchDE181) {
		this.switchDE181 = switchDE181;
	}

	public String getSwitchDE182() {
		return switchDE182;
	}

	public void setSwitchDE182(String switchDE182) {
		this.switchDE182 = switchDE182;
	}

	public String getSwitchDE183() {
		return switchDE183;
	}

	public void setSwitchDE183(String switchDE183) {
		this.switchDE183 = switchDE183;
	}

	public String getSwitchDE184() {
		return switchDE184;
	}

	public void setSwitchDE184(String switchDE184) {
		this.switchDE184 = switchDE184;
	}

	public String getSwitchDE185() {
		return switchDE185;
	}

	public void setSwitchDE185(String switchDE185) {
		this.switchDE185 = switchDE185;
	}

	public String getSwitchDE186() {
		return switchDE186;
	}

	public void setSwitchDE186(String switchDE186) {
		this.switchDE186 = switchDE186;
	}

	public String getSwitchDE187() {
		return switchDE187;
	}

	public void setSwitchDE187(String switchDE187) {
		this.switchDE187 = switchDE187;
	}

	public String getSwitchDE188() {
		return switchDE188;
	}

	public void setSwitchDE188(String switchDE188) {
		this.switchDE188 = switchDE188;
	}

	public String getSwitchDE189() {
		return switchDE189;
	}

	public void setSwitchDE189(String switchDE189) {
		this.switchDE189 = switchDE189;
	}

	public String getSwitchDE190() {
		return switchDE190;
	}

	public void setSwitchDE190(String switchDE190) {
		this.switchDE190 = switchDE190;
	}

	public String getSwitchDE191() {
		return switchDE191;
	}

	public void setSwitchDE191(String switchDE191) {
		this.switchDE191 = switchDE191;
	}

	public String getSwitchMessageAuthentiBloc() {
		return switchMessageAuthentiBloc;
	}

	public void setSwitchMessageAuthentiBloc(String switchMessageAuthentiBloc) {
		this.switchMessageAuthentiBloc = switchMessageAuthentiBloc;
	}

	public String getSwitchStatTransaction() {
		return switchStatTransaction;
	}

	public void setSwitchStatTransaction(String switchStatTransaction) {
		this.switchStatTransaction = switchStatTransaction;
	}

	public String getTag9F36() {
		return tag9F36;
	}

	public void setTag9F36(String tag9f36) {
		tag9F36 = tag9f36;
	}

	public String getTag9F37() {
		return tag9F37;
	}

	public void setTag9F37(String tag9f37) {
		tag9F37 = tag9f37;
	}

	public String getTag9F02() {
		return tag9F02;
	}

	public void setTag9F02(String tag9f02) {
		tag9F02 = tag9f02;
	}

	public String getTag9F03() {
		return tag9F03;
	}

	public void setTag9F03(String tag9f03) {
		tag9F03 = tag9f03;
	}

	public String getTag9F1A() {
		return tag9F1A;
	}

	public void setTag9F1A(String tag9f1a) {
		tag9F1A = tag9f1a;
	}

	public String getTag95() {
		return tag95;
	}

	public void setTag95(String tag95) {
		this.tag95 = tag95;
	}

	public String getTag5F2A() {
		return tag5F2A;
	}

	public void setTag5F2A(String tag5f2a) {
		tag5F2A = tag5f2a;
	}

	public String getTag9A() {
		return tag9A;
	}

	public void setTag9A(String tag9a) {
		tag9A = tag9a;
	}

	public String getTag9C() {
		return tag9C;
	}

	public void setTag9C(String tag9c) {
		tag9C = tag9c;
	}

	public String getTag82() {
		return tag82;
	}

	public void setTag82(String tag82) {
		this.tag82 = tag82;
	}

	public String getTag9F10() {
		return tag9F10;
	}

	public void setTag9F10(String tag9f10) {
		tag9F10 = tag9f10;
	}

	public String getTag9F26() {
		return tag9F26;
	}

	public void setTag9F26(String tag9f26) {
		tag9F26 = tag9f26;
	}

	public String getTag9F33() {
		return tag9F33;
	}

	public void setTag9F33(String tag9f33) {
		tag9F33 = tag9f33;
	}

	public String getTag9F34() {
		return tag9F34;
	}

	public void setTag9F34(String tag9f34) {
		tag9F34 = tag9f34;
	}

	public String getTag91() {
		return tag91;
	}

	public void setTag91(String tag91) {
		this.tag91 = tag91;
	}

	public String getTag71() {
		return tag71;
	}

	public void setTag71(String tag71) {
		this.tag71 = tag71;
	}

	public String getTag72() {
		return tag72;
	}

	public void setTag72(String tag72) {
		this.tag72 = tag72;
	}

	public String getTag57() {
		return tag57;
	}

	public void setTag57(String tag57) {
		this.tag57 = tag57;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	

	@Override
	public String toString() {
		return "SwitchTransaction [switchCode=" + switchCode + ", switchRequestDate=" + switchRequestDate
				+ ", switchResponseDate=" + switchResponseDate + ", switchMtiMessage=" + switchMtiMessage
				+ ", switchBitmaps=" + switchBitmaps + ", switchPan=" + switchPan + ", switchProcessingCode="
				+ switchProcessingCode + ", switchAmountTransaction=" + switchAmountTransaction
				+ ", switchAmountSettelement=" + switchAmountSettelement + ", switchAmountCardBelling="
				+ switchAmountCardBelling + ", switchTransmissionDate=" + switchTransmissionDate
				+ ", switchFeesCardHolderBelling=" + switchFeesCardHolderBelling + ", switchConversionRateSettelement="
				+ switchConversionRateSettelement + ", switchConversionRateBelling=" + switchConversionRateBelling
				+ ", switchStan=" + switchStan + ", switchTimeLocalTransaction=" + switchTimeLocalTransaction
				+ ", switchDateLocalTransaction=" + switchDateLocalTransaction + ", switchExpirationDate="
				+ switchExpirationDate + ", switchSettelementDate=" + switchSettelementDate + ", switchConversionDate="
				+ switchConversionDate + ", switchCaptureDate=" + switchCaptureDate + ", switchMerchantType="
				+ switchMerchantType + ", switchAcquirerCountryCode=" + switchAcquirerCountryCode
				+ ", switchIssuerCountryCode=" + switchIssuerCountryCode + ", switchForwCountryCode="
				+ switchForwCountryCode + ", switchPosEntryMode=" + switchPosEntryMode + ", switchSequanceNumber="
				+ switchSequanceNumber + ", switchNetworkIdientifier=" + switchNetworkIdientifier
				+ ", switchPosConditionCode=" + switchPosConditionCode + ", switchPosPinCaptureCode="
				+ switchPosPinCaptureCode + ", switchAuthIdenLength=" + switchAuthIdenLength
				+ ", switchTransactionAmountFees=" + switchTransactionAmountFees + ", switchSettelementAmountFees="
				+ switchSettelementAmountFees + ", switchTransAmountProcFees=" + switchTransAmountProcFees
				+ ", switchSettAmountProcFees=" + switchSettAmountProcFees + ", switchAcquirerIdenCode="
				+ switchAcquirerIdenCode + ", switchForwardIdentCode=" + switchForwardIdentCode + ", switchExtendedPan="
				+ switchExtendedPan + ", switchTrack2Data=" + switchTrack2Data + ", switchTrack3Data="
				+ switchTrack3Data + ", switchRRN=" + switchRRN + ", switchAuthNumber=" + switchAuthNumber
				+ ", switchResponseCode=" + switchResponseCode + ", switchServiceRestrictionCode="
				+ switchServiceRestrictionCode + ", switchAcceptorTerminalId=" + switchAcceptorTerminalId
				+ ", switchAcceptorMerchantCode=" + switchAcceptorMerchantCode + ", switchAcceptorAcceptorName="
				+ switchAcceptorAcceptorName + ", switchAdditionalRespData=" + switchAdditionalRespData
				+ ", switchTrack1Data=" + switchTrack1Data + ", switchAmountFees=" + switchAmountFees
				+ ", switchNationalAdditionalData=" + switchNationalAdditionalData + ", switchAdditionalData="
				+ switchAdditionalData + ", switchTransactionCurrencyCode=" + switchTransactionCurrencyCode
				+ ", switchSettelementCurrencyCode=" + switchSettelementCurrencyCode + ", switchBillingCurrencyCode="
				+ switchBillingCurrencyCode + ", switchPinBlock=" + switchPinBlock + ", switchSecurRelaInfo="
				+ switchSecurRelaInfo + ", switchAdditionalAmount=" + switchAdditionalAmount + ", switchEmvData="
				+ switchEmvData + ", switchReservedIso=" + switchReservedIso + ", switchDE57=" + switchDE57
				+ ", switchDE58=" + switchDE58 + ", switchNationalPosGeoData=" + switchNationalPosGeoData
				+ ", switchAdditonalPosData=" + switchAdditonalPosData + ", switchOtherAmount=" + switchOtherAmount
				+ ", switchServiceFieldsBitmaps=" + switchServiceFieldsBitmaps + ", switchSmsPrivateUse="
				+ switchSmsPrivateUse + ", switchDE64=" + switchDE64 + ", switchDE65=" + switchDE65
				+ ", switchSettelemeentCode=" + switchSettelemeentCode + ", switchExtendedPayementCode="
				+ switchExtendedPayementCode + ", switchReceivingCountryCode=" + switchReceivingCountryCode
				+ ", switchSettelementCountryCode=" + switchSettelementCountryCode + ", switchNetworkManageInfo="
				+ switchNetworkManageInfo + ", switchMessageNumber=" + switchMessageNumber
				+ ", switchMessageNumberLast=" + switchMessageNumberLast + ", switchDateAction=" + switchDateAction
				+ ", switchCreditNumber=" + switchCreditNumber + ", switchCreditRevrsalNumber="
				+ switchCreditRevrsalNumber + ", switchDebitNumber=" + switchDebitNumber
				+ ", switchDebitReversalNumber=" + switchDebitReversalNumber + ", switchTransferNumber="
				+ switchTransferNumber + ", switchTransferReversalNumber=" + switchTransferReversalNumber
				+ ", switchInsuerersNumber=" + switchInsuerersNumber + ", switchAuthorizationNumber="
				+ switchAuthorizationNumber + ", switchCreditProcFeesNumber=" + switchCreditProcFeesNumber
				+ ", switchCreditTransFeesAmount=" + switchCreditTransFeesAmount + ", switchDebitProcFeesNumber="
				+ switchDebitProcFeesNumber + ", switchDebitTransFeesAmount=" + switchDebitTransFeesAmount
				+ ", switchCreditAmount=" + switchCreditAmount + ", switchCreditReversalAmount="
				+ switchCreditReversalAmount + ", switchDebitAmount=" + switchDebitAmount
				+ ", switchDebitReversalAmount=" + switchDebitReversalAmount + ", switchOriginalDataElement="
				+ switchOriginalDataElement + ", switchFileUpdateCode=" + switchFileUpdateCode
				+ ", switchFileSecurityCode=" + switchFileSecurityCode + ", switchDE93=" + switchDE93
				+ ", switchServiceIndicator=" + switchServiceIndicator + ", switchReplacementsAmount="
				+ switchReplacementsAmount + ", switchMessageSecurityCode=" + switchMessageSecurityCode
				+ ", switchAmountNetSettelement=" + switchAmountNetSettelement + ", switchPayee=" + switchPayee
				+ ", switchSettelementIdenCode=" + switchSettelementIdenCode + ", switchReceibIdenCode="
				+ switchReceibIdenCode + ", switchFileName=" + switchFileName + ", switchAccountId1=" + switchAccountId1
				+ ", switchAccountId2=" + switchAccountId2 + ", switchTransactionDescription="
				+ switchTransactionDescription + ", switchDesKey=" + switchDesKey + ", switchDE106=" + switchDE106
				+ ", switchDE107=" + switchDE107 + ", switchDE108=" + switchDE108 + ", switchDE109=" + switchDE109
				+ ", switchDE110=" + switchDE110 + ", switchDE111=" + switchDE111 + ", switchDE112=" + switchDE112
				+ ", switchDE113=" + switchDE113 + ", switchDE114=" + switchDE114 + ", switchAdditioanlTraceData="
				+ switchAdditioanlTraceData + ", switchCardIssuerRefData=" + switchCardIssuerRefData
				+ ", switchNationalUse=" + switchNationalUse + ", switchIntraCounrtyData=" + switchIntraCounrtyData
				+ ", switchSettelementServiceData=" + switchSettelementServiceData + ", switchDE120=" + switchDE120
				+ ", switchIssuerIdenCode=" + switchIssuerIdenCode + ", switchDE122=" + switchDE122
				+ ", switchVerificationData=" + switchVerificationData + ", switchDE124=" + switchDE124
				+ ", switchSupportingInformation=" + switchSupportingInformation + ", switchVisaPrivateUse="
				+ switchVisaPrivateUse + ", switchDE127=" + switchDE127 + ", switchDE128=" + switchDE128
				+ ", switchDE129=" + switchDE129 + ", switchTerminalCapaProf=" + switchTerminalCapaProf
				+ ", switchTerminamVerifResult=" + switchTerminamVerifResult + ", switchUnpredictibleNumber="
				+ switchUnpredictibleNumber + ", switchTerminalSerialNumber=" + switchTerminalSerialNumber
				+ ", switchVisaDiscretData=" + switchVisaDiscretData + ", switchIssuerDiscretData="
				+ switchIssuerDiscretData + ", switchCrytpogram=" + switchCrytpogram + ", switchAppTransCounter="
				+ switchAppTransCounter + ", switchAppInterchangeProfile=" + switchAppInterchangeProfile
				+ ", switchARPC=" + switchARPC + ", switchIssuerAuthData=" + switchIssuerAuthData + ", switchDE141="
				+ switchDE141 + ", switchIssuerScript=" + switchIssuerScript + ", switchIssuerScriptResult="
				+ switchIssuerScriptResult + ", switchCryptTransType=" + switchCryptTransType
				+ ", switchTerminalCountryCode=" + switchTerminalCountryCode + ", switchTerminalCountryCodeTransData="
				+ switchTerminalCountryCodeTransData + ", switchCryptogramAmount=" + switchCryptogramAmount
				+ ", switchCryptogramCurrencyCode=" + switchCryptogramCurrencyCode + ", switchCryptogramCashBackAmount="
				+ switchCryptogramCashBackAmount + ", switchDE150=" + switchDE150 + ", switchDE151=" + switchDE151
				+ ", switchSecondaryPinBlock=" + switchSecondaryPinBlock + ", switchDE153=" + switchDE153
				+ ", switchDE154=" + switchDE154 + ", switchDE155=" + switchDE155 + ", switchDE156=" + switchDE156
				+ ", switchDE157=" + switchDE157 + ", switchDE158=" + switchDE158 + ", switchDE159=" + switchDE159
				+ ", switchDE160=" + switchDE160 + ", switchDE161=" + switchDE161 + ", switchDE162=" + switchDE162
				+ ", switchDE163=" + switchDE163 + ", switchDE164=" + switchDE164 + ", switchDE165=" + switchDE165
				+ ", switchDE166=" + switchDE166 + ", switchDE167=" + switchDE167 + ", switchDE168=" + switchDE168
				+ ", switchDE169=" + switchDE169 + ", switchDE170=" + switchDE170 + ", switchDE171=" + switchDE171
				+ ", switchDE172=" + switchDE172 + ", switchDE173=" + switchDE173 + ", switchDE174=" + switchDE174
				+ ", switchDE175=" + switchDE175 + ", switchDE176=" + switchDE176 + ", switchDE177=" + switchDE177
				+ ", switchDE178=" + switchDE178 + ", switchDE179=" + switchDE179 + ", switchDE180=" + switchDE180
				+ ", switchDE181=" + switchDE181 + ", switchDE182=" + switchDE182 + ", switchDE183=" + switchDE183
				+ ", switchDE184=" + switchDE184 + ", switchDE185=" + switchDE185 + ", switchDE186=" + switchDE186
				+ ", switchDE187=" + switchDE187 + ", switchDE188=" + switchDE188 + ", switchDE189=" + switchDE189
				+ ", switchDE190=" + switchDE190 + ", switchDE191=" + switchDE191 + ", switchMessageAuthentiBloc="
				+ switchMessageAuthentiBloc + ", switchStatTransaction=" + switchStatTransaction + ", tag9F36="
				+ tag9F36 + ", tag9F37=" + tag9F37 + ", tag9F02=" + tag9F02 + ", tag9F03=" + tag9F03 + ", tag9F1A="
				+ tag9F1A + ", tag95=" + tag95 + ", tag5F2A=" + tag5F2A + ", tag9A=" + tag9A + ", tag9C=" + tag9C
				+ ", tag82=" + tag82 + ", tag9F10=" + tag9F10 + ", tag9F26=" + tag9F26 + ", tag9F33=" + tag9F33
				+ ", tag9F34=" + tag9F34 + ", tag91=" + tag91 + ", tag71=" + tag71 + ", tag72=" + tag72 + ", tag57="
				+ tag57 + ", source=" + source + ", tag5F34=" + tag5F34 + ", tag84=" + tag84 + "]";
	}

	public SwitchTransactionArchive(SwitchTransaction switchTransaction) {
	    super();
	    this.switchCode = switchTransaction.getSwitchCode();
	    this.switchRequestDate = switchTransaction.getSwitchRequestDate();
	    this.switchResponseDate = switchTransaction.getSwitchResponseDate();
	    this.switchMtiMessage = switchTransaction.getSwitchMtiMessage();
	    this.switchBitmaps = switchTransaction.getSwitchBitmaps();
	    this.switchPan = switchTransaction.getSwitchPan();
	    this.switchProcessingCode = switchTransaction.getSwitchProcessingCode();
	    this.switchAmountTransaction = switchTransaction.getSwitchAmountTransaction();
	    this.switchAmountSettelement = switchTransaction.getSwitchAmountSettelement();
	    this.switchAmountCardBelling = switchTransaction.getSwitchAmountCardBelling();
	    this.switchTransmissionDate = switchTransaction.getSwitchTransmissionDate();
	    this.switchFeesCardHolderBelling = switchTransaction.getSwitchFeesCardHolderBelling();
	    this.switchConversionRateSettelement = switchTransaction.getSwitchConversionRateSettelement();
	    this.switchConversionRateBelling = switchTransaction.getSwitchConversionRateBelling();
	    this.switchStan = switchTransaction.getSwitchStan();
	    this.switchTimeLocalTransaction = switchTransaction.getSwitchTimeLocalTransaction();
	    this.switchDateLocalTransaction = switchTransaction.getSwitchDateLocalTransaction();
	    this.switchExpirationDate = switchTransaction.getSwitchExpirationDate();
	    this.switchSettelementDate = switchTransaction.getSwitchSettelementDate();
	    this.switchConversionDate = switchTransaction.getSwitchConversionDate();
	    this.switchCaptureDate = switchTransaction.getSwitchCaptureDate();
	    this.switchMerchantType = switchTransaction.getSwitchMerchantType();
	    this.switchAcquirerCountryCode = switchTransaction.getSwitchAcquirerCountryCode();
	    this.switchIssuerCountryCode = switchTransaction.getSwitchIssuerCountryCode();
	    this.switchForwCountryCode = switchTransaction.getSwitchForwCountryCode();
	    this.switchPosEntryMode = switchTransaction.getSwitchPosEntryMode();
	    this.switchSequanceNumber = switchTransaction.getSwitchSequanceNumber();
	    this.switchNetworkIdientifier = switchTransaction.getSwitchNetworkIdientifier();
	    this.switchPosConditionCode = switchTransaction.getSwitchPosConditionCode();
	    this.switchPosPinCaptureCode = switchTransaction.getSwitchPosPinCaptureCode();
	    this.switchAuthIdenLength = switchTransaction.getSwitchAuthIdenLength();
	    this.switchTransactionAmountFees = switchTransaction.getSwitchTransactionAmountFees();
	    this.switchSettelementAmountFees = switchTransaction.getSwitchSettelementAmountFees();
	    this.switchTransAmountProcFees = switchTransaction.getSwitchTransAmountProcFees();
	    this.switchSettAmountProcFees = switchTransaction.getSwitchSettAmountProcFees();
	    this.switchAcquirerIdenCode = switchTransaction.getSwitchAcquirerIdenCode();
	    this.switchForwardIdentCode = switchTransaction.getSwitchForwardIdentCode();
	    this.switchExtendedPan = switchTransaction.getSwitchExtendedPan();
	    this.switchTrack2Data = switchTransaction.getSwitchTrack2Data();
	    this.switchTrack3Data = switchTransaction.getSwitchTrack3Data();
	    this.switchRRN = switchTransaction.getSwitchRRN();
	    this.switchAuthNumber = switchTransaction.getSwitchAuthNumber();
	    this.switchResponseCode = switchTransaction.getSwitchResponseCode();
	    this.switchServiceRestrictionCode = switchTransaction.getSwitchServiceRestrictionCode();
	    this.switchAcceptorTerminalId = switchTransaction.getSwitchAcceptorTerminalId();
	    this.switchAcceptorMerchantCode = switchTransaction.getSwitchAcceptorMerchantCode();
	    this.switchAcceptorAcceptorName = switchTransaction.getSwitchAcceptorAcceptorName();
	    this.switchAdditionalRespData = switchTransaction.getSwitchAdditionalRespData();
	    this.switchTrack1Data = switchTransaction.getSwitchTrack1Data();
	    this.switchAmountFees = switchTransaction.getSwitchAmountFees();
	    this.switchNationalAdditionalData = switchTransaction.getSwitchNationalAdditionalData();
	    this.switchAdditionalData = switchTransaction.getSwitchAdditionalData();
	    this.switchTransactionCurrencyCode = switchTransaction.getSwitchTransactionCurrencyCode();
	    this.switchSettelementCurrencyCode = switchTransaction.getSwitchSettelementCurrencyCode();
	    this.switchBillingCurrencyCode = switchTransaction.getSwitchBillingCurrencyCode();
	    this.switchPinBlock = switchTransaction.getSwitchPinBlock();
	    this.switchSecurRelaInfo = switchTransaction.getSwitchSecurRelaInfo();
	    this.switchAdditionalAmount = switchTransaction.getSwitchAdditionalAmount();
	    this.switchEmvData = switchTransaction.getSwitchEmvData();
	    this.switchReservedIso = switchTransaction.getSwitchReservedIso();
	    this.switchDE57 = switchTransaction.getSwitchDE57();
	    this.switchDE58 = switchTransaction.getSwitchDE58();
	    this.switchNationalPosGeoData = switchTransaction.getSwitchNationalPosGeoData();
	    this.switchAdditonalPosData = switchTransaction.getSwitchAdditonalPosData();
	    this.switchOtherAmount = switchTransaction.getSwitchOtherAmount();
	    this.switchServiceFieldsBitmaps = switchTransaction.getSwitchServiceFieldsBitmaps();
	    this.switchSmsPrivateUse = switchTransaction.getSwitchSmsPrivateUse();
	    this.switchDE64 = switchTransaction.getSwitchDE64();
	    this.switchDE65 = switchTransaction.getSwitchDE65();
	    this.switchSettelemeentCode = switchTransaction.getSwitchSettelemeentCode();
	    this.switchExtendedPayementCode = switchTransaction.getSwitchExtendedPayementCode();
	    this.switchReceivingCountryCode = switchTransaction.getSwitchReceivingCountryCode();
	    this.switchSettelementCountryCode = switchTransaction.getSwitchSettelementCountryCode();
	    this.switchNetworkManageInfo = switchTransaction.getSwitchNetworkManageInfo();
	    this.switchMessageNumber = switchTransaction.getSwitchMessageNumber();
	    this.switchMessageNumberLast = switchTransaction.getSwitchMessageNumberLast();
	    this.switchDateAction = switchTransaction.getSwitchDateAction();
	    this.switchCreditNumber = switchTransaction.getSwitchCreditNumber();
	    this.switchCreditRevrsalNumber = switchTransaction.getSwitchCreditRevrsalNumber();
	    this.switchDebitNumber = switchTransaction.getSwitchDebitNumber();
	    this.switchDebitReversalNumber = switchTransaction.getSwitchDebitReversalNumber();
	    this.switchTransferNumber = switchTransaction.getSwitchTransferNumber();
	    this.switchTransferReversalNumber = switchTransaction.getSwitchTransferReversalNumber();
	    this.switchInsuerersNumber = switchTransaction.getSwitchInsuerersNumber();
	    this.switchAuthorizationNumber = switchTransaction.getSwitchAuthorizationNumber();
	    this.switchCreditProcFeesNumber = switchTransaction.getSwitchCreditProcFeesNumber();
	    this.switchCreditTransFeesAmount = switchTransaction.getSwitchCreditTransFeesAmount();
	    this.switchDebitProcFeesNumber = switchTransaction.getSwitchDebitProcFeesNumber();
	    this.switchDebitTransFeesAmount = switchTransaction.getSwitchDebitTransFeesAmount();
	    this.switchCreditAmount = switchTransaction.getSwitchCreditAmount();
	    this.switchCreditReversalAmount = switchTransaction.getSwitchCreditReversalAmount();
	    this.switchDebitAmount = switchTransaction.getSwitchDebitAmount();
	    this.switchDebitReversalAmount = switchTransaction.getSwitchDebitReversalAmount();
	    this.switchOriginalDataElement = switchTransaction.getSwitchOriginalDataElement();
	    this.switchFileUpdateCode = switchTransaction.getSwitchFileUpdateCode();
	    this.switchFileSecurityCode = switchTransaction.getSwitchFileSecurityCode();
	    this.switchDE93 = switchTransaction.getSwitchDE93();
	    this.switchServiceIndicator = switchTransaction.getSwitchServiceIndicator();
	    this.switchReplacementsAmount = switchTransaction.getSwitchReplacementsAmount();
	    this.switchMessageSecurityCode = switchTransaction.getSwitchMessageSecurityCode();
	    this.switchAmountNetSettelement = switchTransaction.getSwitchAmountNetSettelement();
	    this.switchPayee = switchTransaction.getSwitchPayee();
	    this.switchSettelementIdenCode = switchTransaction.getSwitchSettelementIdenCode();
	    this.switchReceibIdenCode = switchTransaction.getSwitchReceibIdenCode();
	    this.switchFileName = switchTransaction.getSwitchFileName();
	    this.switchAccountId1 = switchTransaction.getSwitchAccountId1();
	    this.switchAccountId2 = switchTransaction.getSwitchAccountId2();
	    this.switchTransactionDescription = switchTransaction.getSwitchTransactionDescription();
	    this.switchDesKey = switchTransaction.getSwitchDesKey();
	    this.switchDE106 = switchTransaction.getSwitchDE106();
	    this.switchDE107 = switchTransaction.getSwitchDE107();
	    this.switchDE108 = switchTransaction.getSwitchDE108();
	    this.switchDE109 = switchTransaction.getSwitchDE109();
	    this.switchDE110 = switchTransaction.getSwitchDE110();
	    this.switchDE111 = switchTransaction.getSwitchDE111();
	    this.switchDE112 = switchTransaction.getSwitchDE112();
	    this.switchDE113 = switchTransaction.getSwitchDE113();
	    this.switchDE114 = switchTransaction.getSwitchDE114();
	    this.switchAdditioanlTraceData = switchTransaction.getSwitchAdditioanlTraceData();
	    this.switchCardIssuerRefData = switchTransaction.getSwitchCardIssuerRefData();
	    this.switchNationalUse = switchTransaction.getSwitchNationalUse();
	    this.switchIntraCounrtyData = switchTransaction.getSwitchIntraCounrtyData();
	    this.switchSettelementServiceData = switchTransaction.getSwitchSettelementServiceData();
	    this.switchDE120 = switchTransaction.getSwitchDE120();
	    this.switchIssuerIdenCode = switchTransaction.getSwitchIssuerIdenCode();
	    this.switchDE122 = switchTransaction.getSwitchDE122();
	    this.switchVerificationData = switchTransaction.getSwitchVerificationData();
	    this.switchDE124 = switchTransaction.getSwitchDE124();
	    this.switchSupportingInformation = switchTransaction.getSwitchSupportingInformation();
	    this.switchVisaPrivateUse = switchTransaction.getSwitchVisaPrivateUse();
	    this.switchDE127 = switchTransaction.getSwitchDE127();
	    this.switchDE128 = switchTransaction.getSwitchDE128();
	    this.switchDE129 = switchTransaction.getSwitchDE129();
	    this.switchTerminalCapaProf = switchTransaction.getSwitchTerminalCapaProf();
	    this.switchTerminamVerifResult = switchTransaction.getSwitchTerminamVerifResult();
	    this.switchUnpredictibleNumber = switchTransaction.getSwitchUnpredictibleNumber();
	    this.switchTerminalSerialNumber = switchTransaction.getSwitchTerminalSerialNumber();
	    this.switchVisaDiscretData = switchTransaction.getSwitchVisaDiscretData();
	    this.switchIssuerDiscretData = switchTransaction.getSwitchIssuerDiscretData();
	    this.switchCrytpogram = switchTransaction.getSwitchCrytpogram();
	    this.switchAppTransCounter = switchTransaction.getSwitchAppTransCounter();
	    this.switchAppInterchangeProfile = switchTransaction.getSwitchAppInterchangeProfile();
	    this.switchARPC = switchTransaction.getSwitchARPC();
	    this.switchIssuerAuthData = switchTransaction.getSwitchIssuerAuthData();
	    this.switchDE141 = switchTransaction.getSwitchDE141();
	    this.switchIssuerScript = switchTransaction.getSwitchIssuerScript();
	    this.switchIssuerScriptResult = switchTransaction.getSwitchIssuerScriptResult();
	    this.switchCryptTransType = switchTransaction.getSwitchCryptTransType();
	    this.switchTerminalCountryCode = switchTransaction.getSwitchTerminalCountryCode();
	    this.switchTerminalCountryCodeTransData = switchTransaction.getSwitchTerminalCountryCodeTransData();
	    this.switchCryptogramAmount = switchTransaction.getSwitchCryptogramAmount();
	    this.switchCryptogramCurrencyCode = switchTransaction.getSwitchCryptogramCurrencyCode();
	    this.switchCryptogramCashBackAmount = switchTransaction.getSwitchCryptogramCashBackAmount();
	    this.switchDE150 = switchTransaction.getSwitchDE150();
	    this.switchDE151 = switchTransaction.getSwitchDE151();
	    this.switchSecondaryPinBlock = switchTransaction.getSwitchSecondaryPinBlock();
	    this.switchDE153 = switchTransaction.getSwitchDE153();
	    this.switchDE154 = switchTransaction.getSwitchDE154();
	    this.switchDE155 = switchTransaction.getSwitchDE155();
	    this.switchDE156 = switchTransaction.getSwitchDE156();
	    this.switchDE157 = switchTransaction.getSwitchDE157();
	    this.switchDE158 = switchTransaction.getSwitchDE158();
	    this.switchDE159 = switchTransaction.getSwitchDE159();
	    this.switchDE160 = switchTransaction.getSwitchDE160();
	    this.switchDE161 = switchTransaction.getSwitchDE161();
	    this.switchDE162 = switchTransaction.getSwitchDE162();
	    this.switchDE163 = switchTransaction.getSwitchDE163();
	    this.switchDE164 = switchTransaction.getSwitchDE164();
	    this.switchDE165 = switchTransaction.getSwitchDE165();
	    this.switchDE166 = switchTransaction.getSwitchDE166();
	    this.switchDE167 = switchTransaction.getSwitchDE167();
	    this.switchDE168 = switchTransaction.getSwitchDE168();
	    this.switchDE169 = switchTransaction.getSwitchDE169();
	    this.switchDE170 = switchTransaction.getSwitchDE170();
	    this.switchDE171 = switchTransaction.getSwitchDE171();
	    this.switchDE172 = switchTransaction.getSwitchDE172();
	    this.switchDE173 = switchTransaction.getSwitchDE173();
	    this.switchDE174 = switchTransaction.getSwitchDE174();
	    this.switchDE175 = switchTransaction.getSwitchDE175();
	    this.switchDE176 = switchTransaction.getSwitchDE176();
	    this.switchDE177 = switchTransaction.getSwitchDE177();
	    this.switchDE178 = switchTransaction.getSwitchDE178();
	    this.switchDE179 = switchTransaction.getSwitchDE179();
	    this.switchDE180 = switchTransaction.getSwitchDE180();
	    this.switchDE181 = switchTransaction.getSwitchDE181();
	    this.switchDE182 = switchTransaction.getSwitchDE182();
	    this.switchDE183 = switchTransaction.getSwitchDE183();
	    this.switchDE184 = switchTransaction.getSwitchDE184();
	    this.switchDE185 = switchTransaction.getSwitchDE185();
	    this.switchDE186 = switchTransaction.getSwitchDE186();
	    this.switchDE187 = switchTransaction.getSwitchDE187();
	    this.switchDE188 = switchTransaction.getSwitchDE188();
	    this.switchDE189 = switchTransaction.getSwitchDE189();
	    this.switchDE190 = switchTransaction.getSwitchDE190();
	    this.switchDE191 = switchTransaction.getSwitchDE191();
	    this.switchMessageAuthentiBloc = switchTransaction.getSwitchMessageAuthentiBloc();
	    this.switchStatTransaction = switchTransaction.getSwitchStatTransaction();
	    this.tag9F36 = switchTransaction.getTag9F36();
	    this.tag9F37 = switchTransaction.getTag9F37();
	    this.tag9F02 = switchTransaction.getTag9F02();
	    this.tag9F03 = switchTransaction.getTag9F03();
	    this.tag9F1A = switchTransaction.getTag9F1A();
	    this.tag95 = switchTransaction.getTag95();
	    this.tag5F2A = switchTransaction.getTag5F2A();
	    this.tag9A = switchTransaction.getTag9A();
	    this.tag9C = switchTransaction.getTag9C();
	    this.tag82 = switchTransaction.getTag82();
	    this.tag9F10 = switchTransaction.getTag9F10();
	    this.tag9F26 = switchTransaction.getTag9F26();
	    this.tag9F33 = switchTransaction.getTag9F33();
	    this.tag9F34 = switchTransaction.getTag9F34();
	    this.tag91 = switchTransaction.getTag91();
	    this.tag71 = switchTransaction.getTag71();
	    this.tag72 = switchTransaction.getTag72();
	    this.tag57 = switchTransaction.getTag57();
	    this.source = switchTransaction.getSource();
	    this.tag5F34 = switchTransaction.getTag5F34();
	    this.tag84 = switchTransaction.getTag84();
	}

	public SwitchTransactionArchive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDateArchive() {
		return dateArchive;
	}

	public void setDateArchive(String dateArchive) {
		this.dateArchive = dateArchive;
	}




}
