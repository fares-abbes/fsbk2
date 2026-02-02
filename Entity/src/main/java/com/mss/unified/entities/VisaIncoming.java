package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.HashMap;

import javax.persistence.*;

import org.jline.utils.Log;

@Entity
@Table(name = "VISA_INCOMING", schema = "FRANSABANK")
public class VisaIncoming {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer incomingCode;

	@Column(name = "TRANSACTION_CODE")
	private String transactionCode;
	@Column(name = "treat")
	private String treat;

	@Column(name = "DESTINATION_BIN")
	private String destinationBin;

	@Column(name = "SOURCE_BIN")
	private String sourceBin;

	@Column(name = "FORMAT_CODE")
	private String formatCode;

	@Column(name = "CONSTANT_IDENTIFIER")
	private String constantIdentifier;

	@Column(name = "RESERVED26")
	private String reserved26;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "MATCHING_CODE")
	private String matchingCode;

	@Column(name = "RESERVED4348")
	private String reserved4348;
	private String reserved816;
	private String agentUniqueId;
	@Column(name = "moneyTransfExchangeFee")
	private String moneyTransferForeignExchangeFee;
	private String paymentAccountReference;
	private String tokenRequestorId;
	private String spendQualifierIndicator;
	private String panToken;
	private String transactionIdentifier;
	private String numberOfPaymentForms;
	private Integer summaryCode;
	private String reserved158;

	@Column(name = "RESERVED4950")
	private String reserved4950;
	private String tokenAssuranceLevel;
	@Column(name = "RESONSE_CODE")
	private String responseCode;

	@Column(name = "RESERVED5354")
	private String RESERVED5354;

	@Column(name = "TRANSACTION_DATE")
	private String transactionDate;

	@Column(name = "RESERVED5960")
	private String reserved5960;

	@Column(name = "TRANSACTION_TIME")
	private String transactionTime;

	@Column(name = "RESERVED6566")
	private String reserved6566;
	@Column(name = "TRANSACTION_AMOUNT")
	private String transactionAmount;
	@Column(name = "RESERVED7576")
	private String reserved7576;
	@Column(name = "INQURING_CENTER")
	private String inquiringCenter;
	@Column(name = "RESERVED8182")
	private String reserved8182;
	@Column(name = "RESERVED8889")
	private String reserved8889;
	@Column(name = "BASE_TRANSACTION_MERCHANT")
	private String baseTransactionCodeMerchantTerminalIndicator;
	@Column(name = "RESERVED9394")
	private String reserved9394;
	@Column(name = "STANDIN_REASON_CODE")
	private String standInReasonCode;
	@Column(name = "RESERVED96100")
	private String reserved96100;
	@Column(name = "CRIS_ALERT_TYPE")
	private String crisAlertType;
	@Column(name = "CRIS_ACCOUNT_SCORE")
	private String crisAlertScore;
	@Column(name = "NETWORK_ID_CODE")
	private String networkIdentificationCode;
	@Column(name = "RESERVED11167")
	private String reserved111167;
	@Column(name = "REIMBURSEMENT_ATTRIBUTE")
	private String reimbursementAttribute;
	@Column(name = "PROCESSING_BIN")
	private String processingBin;
	@Column(name = "PROCESSING_DATE")
	private String processingDate;
	@Column(name = "SETTLEMENT_DATE")
	private String settlementDate;
	@Column(name = "RELEASE_NUMBER")
	private String releaseNumber;

	@Column(name = "RESERVED1429")
	private String reserved1429;
	@Column(name = "TEST_OPTIONAL")
	private String testOptional;
	@Column(name = "RESERVED3462")
	private String reserved3462;
	@Column(name = "SECURITY_CODE")
	private String securityCode;
	@Column(name = "RESERVED7176")
	private String reserved7176;
	@Column(name = "OUTGOING_FILE_ID")
	private String outgoingFileId;
	@Column(name = "RESERVED80168")
	private String reserved80168;
	@Column(name = "ACCOUNT_NUMBER_EXTENSION")
	private String accountNumberExtension;
	@Column(name = "FLOOR_LIMIT_INDICATOR")
	private String floorLimitIndicator;
	@Column(name = "CRB_EXCEP_FILE_INDICATOR")
	private String crbExceptionFileIndicator;
	@Column(name = "POSITIVE_CARDHOLDER_AUTH")
	private String positiveCardholderAuthorisationServiceIndicator;
	@Column(name = "ACQUIRER_REFERENCE_NUMBER")
	private String acquirerReferenceNumber;
	@Column(name = "ACQUIRER_BUSINESS_ID")
	private String acquirerBuisnessId;
	@Column(name = "PURCHASE_DATE")
	private String purchaseDate;
	@Column(name = "DESTINATION_AMOUNT")
	private double destinationAmount;
	@Column(name = "DESTINATION_CURRENCY_CODE")
	private String destinationCurrencyCode;
	@Column(name = "SOURCE_AMOUNT")
	private double sourceAmount;
	@Column(name = "SOURCE_CURRENCY_CODE")
	private String sourceCurrencyCode;
	@Column(name = "MERCHANT_NAME")
	private String merchantName;
	private String merchantCity;
	@Column(name = "MERCHANT_COUNTRY_CODE")
	private String merchantCountryCode;
	@Column(name = "MERCHANT_CATEGORY_CODE")
	private String merchantCategoryCode;
	@Column(name = "MERCHANT_ZIP_CODE")
	private String merchantZipCode;
	@Column(name = "MERCHANT_STATE_CODE")
	private String merchantStateCode;
	@Column(name = "REQUESTED_PAYMENT_SERVICE")
	private String requestedPaymentService;
	@Column(name = "RESERVED146")
	private String reserved146;
	@Column(name = "USAGE_CODE")
	private String usageCode;
	@Column(name = "REASON_CODE")
	private String reasonCode;
	@Column(name = "SETTLEMENT_FLAG")
	private String settlementFlag;
	@Column(name = "AUTHORISATION_CHARACTERISICS")
	private String authorisationCaracteristicsIndicator;
	@Column(name = "AUTHORISATION_CODE")
	private String authorisationCode;
	@Column(name = "POS_TERMINAL_CAPABILITY")
	private String posTerminalCapability;
	@Column(name = "INTERNATIONAL_FEE_INDICATOR")
	private String internationalFeeIndicator;

	@Column(name = "CARDHOLDER_ID")
	private String cardholderId;
	@Column(name = "COLLECTION_ONLY_FLAG")
	private String collectionOnlyFlag;
	@Column(name = "POS_ENTRY_MODE")
	private String posEntryMode;
	@Column(name = "CENTRAL_PROCESSING_DATE")
	private String centralProcessingDate;
	@Column(name = "BUSINESS_FORMAT_CODE")
	private String businessFormatCode;
	@Column(name = "DATA_CONTENT")
	private String dataContent;
	@Column(name = "RESERVED516")
	private String reserved516;

	@Column(name = "DEBIT_PRODUCT_CODE")
	private String debitProductCode;
	@Column(name = "CONTACT_FOR_INFO")
	private String contactForInfo;
	@Column(name = "ADJUSTMENT_PROCESSING")
	private String adjustmentProcessingIndicator;
	@Column(name = "MESSAGE_REASON_CODE")
	private String messageReasonCode;
	@Column(name = "SURCHARGE_AMOUNT")
	private String surchargeAmount;
	@Column(name = "SURCHARGE_DEBIT_OR_CREDIT")
	private String surchargeCreditOrDebitIndicator;
	@Column(name = "VISA_INTERNAL_USE_ONLY")
	private String visaInternalUseOnly;
	private String BUSINESS_FORMAT_CODE_03;
	private String BUSINESS_FORMAT_CODE_04;
	@Column(name = "RESERVED77103")
	private String reserved77103;
	@Column(name = "surchrg_Amnt_CH_BillingCurr")
	private String surchargeAmountCardholderBillingCurrency;
	@Column(name = "RESERVED112168")
	private String reserved112168;
	@Column(name = "AUTHORIZED_AMOUNT")
	private String authorizedAmount;

	@Column(name = "AUTHORIZATION_CURRENCY_CODE")
	private String authorizationCurrencyCode;
	@Column(name = "AUTHORIZATION_RESPONSE_CODE")
	private String authorizationResponseCode;
	@Column(name = "VALIDATION_CODE")
	private String validationCode;
	@Column(name = "EXCLUDED_TRANSACTION_ID")
	private String excludedTransactionIdentifier;
	@Column(name = "CRS_PROCESSING_CODE")
	private String crsProcessingCode;
	@Column(name = "CHARGEBACK_RIGHTS_INDICATOR")
	private String chargeBackRightsIndicator;
	@Column(name = "MULTI_CLEARING_SEQUENCE_NUM")
	private String multipleClearingSequenceNumber;
	@Column(name = "MULTI_CLEARING_SEQUENCE_COUNT")
	private String multipleClearingSequenceCount;
	private String cardHolderIdMethod;
	@Column(name = "MARKET_SPECIFIC_AUTH")
	private String marketSpecificAuthorizationDataIndicator;
	@Column(name = "TOTAL_AUTHORIZED_AMOUNT")
	private String totalAuthorizedAmount;
	@Column(name = "INFORMATION_INDICATOR")
	private String informationIndicator;
	@Column(name = "MERCHANT_TELEPHONE_NUMBER")
	private String merchantTelephoneNumber;
	@Column(name = "ADDITIONAL_DATA_INDICATOR")
	private String additionalDataIndicator;
	@Column(name = "MERCHANT_VOLUME_INDICATOR")
	private String merchantVolumeIndicator;
	@Column(name = "ELECTRONIC_COMMERCE_GOODS")
	private String electronicCommerceGoodsIndicator;
	@Column(name = "MERCHANT_VERIFICATION_VALUE")
	private String merchantVerificationValue;
	@Column(name = "acceptanceTerminal")
	private String acceptanceTerminalIndicator;

	@Column(name = "INTERCHANGE_FEE_AMOUNT")
	private double interchangeFeeAmount;
	@Column(name = "INTERCHANGE_FEE_SIGN")
	private String interchangeFeeSign;
	@Column(name = "SOURCE_TO_BASE_CURR_EXCHRATE")
	private double sourceCurrencyToBaseCurrencyExchangeRate;
	@Column(name = "BASE_TO_DEST_CURR_EXCHRATE")
	private double baseCurrencyToDestinationCurrencyExchangeRate;
	@Column(name = "OPTIONAL_ISSUER_ISA_AMOUNT")
	private String optionalIsaAmount;
	@Column(name = "PRODUCT_ID")
	private String productId;
	@Column(name = "PROGRAM_ID")
	private String programID;
	@Column(name = "DYNAMIC_CURRENCY_CONVERSION")
	private String dynamicCurrencyConversionIndicator;
	@Column(name = "ACCOUNT_TYPE_IDENTIFICATION")
	private String accountTypeIdentification;
	@Column(name = "RESERVED149167")
	private String reserved149167;
	@Column(name = "CVV2_RESULT_CODE")
	private String cvv2ResultCode;
	@Column(name = "LOCAL_TAX")
	private String localTax;
	@Column(name = "LOCAL_TAX_INCLUDED")
	private String localTaxIncluded;
	@Column(name = "NATIONAL_TAX")
	private String nationalTax;
	@Column(name = "NATIONAL_TAX_INCLUDED")
	private String nationalTaxIncluded;
	@Column(name = "MERCHANT_VAT_REGISTR_REF_NUM")
	private String merchantVatRegistrationBusinessReferenceNumber;
	@Column(name = "CUSTOMER_VAT_REGISTR_NUM")
	private String customerVatRegistrationNumber;
	@Column(name = "RESERVED6475")
	private String reserved6475;
	@Column(name = "SUMMARY_COMMODITY_CODE")
	private String summaryCommodityCode;
	@Column(name = "OTHER_TAX")
	private String otherTax;
	@Column(name = "MESSAGE_INDENTIFIER")
	private String messageIdentifier;
	@Column(name = "TIME_OF_PURCHASE")
	private String timeOfPurchase;
	@Column(name = "CRI")
	private String cri;
	@Column(name = "NON_FUEL_PRODUCT_CODE1")
	private String nonFuelProductCode1;
	@Column(name = "NON_FUEL_PRODUCT_CODE2")
	private String nonFuelProductCode2;
	@Column(name = "NON_FUEL_PRODUCT_CODE3")
	private String nonFuelProductCode3;
	@Column(name = "NON_FUEL_PRODUCT_CODE4")
	private String nonFuelProductCode4;
	@Column(name = "NON_FUEL_PRODUCT_CODE5")
	private String nonFuelProductCode5;
	@Column(name = "NON_FUEL_PRODUCT_CODE6")
	private String nonFuelProductCode6;
	@Column(name = "NON_FUEL_PRODUCT_CODE7")
	private String nonFuelProductCode7;
	@Column(name = "NON_FUEL_PRODUCT_CODE8")
	private String nonFuelProductCode8;
	@Column(name = "MERCHANT_POSTAL_CODE")
	private String merchantPostalCode;
	@Column(name = "RESERVED155168")
	private String reserved155168;

	@Column(name = "CARD_SEQUENCE_NUMBER")
	private String cardSequenceNumber;
	@Column(name = "TERMINAL_TRANSACTION_DATE")
	private String terminalTransactionDate;
	@Column(name = "TERMINAL_CAPABILITY_PROFILE")
	private String terminalCapability;
	@Column(name = "TERMINAL_COUNTRY_CODE")
	private String terminalCountryCode;
	@Column(name = "TERMINAL_SERIAL_NUMBER")
	private String terminalSerialNumber;
	@Column(name = "UNPREDICTABLE_NUMBER")
	private String unpredictableNumber;
	@Column(name = "APP_TRANSACTION_COUNTER")
	private String applicationTransactionCounter;
	@Column(name = "APP_INTERCHANGE_PROFILE")
	private String applicationInterchangeProfile;
	@Column(name = "CRYPTOGRAM")
	private String cryptogram;
	@Column(name = "ISSUER_APP_DATA_BYTE2")
	private String issuerApplicationDataByte2;
	@Column(name = "ISSUER_APP_DATA_BYTE3")
	private String issuerApplicationDataByte3;
	@Column(name = "TERMINAL_VERIF_RESULTS")
	private String terminalVerificationResults;
	@Column(name = "ISSUER_APP_DATA_BYTE47")
	private String issuerApplicationDataByte47;
	@Column(name = "CRYPTOGRAM_AMOUNT")
	private String cryptogramAmount;
	@Column(name = "ISSUER_APP_DATA_BYTE8")
	private String issuerApplicationDataByte8;
	@Column(name = "ISSUER_APP_DATA_BYTE916")
	private String issuerApplicationDataByte916;
	@Column(name = "ISSUER_APP_DATA_BYTE1")
	private String issuerApplicationDataByte1;
	@Column(name = "ISSUER_APP_DATA_BYTE17")
	private String issuerApplicationDataByte17;
	@Column(name = "ISSUER_APP_DATA_BYTE1832")
	private String issuerApplicationDataByte1832;
	@Column(name = "FORM_FACTOR_INDICATOR")
	private String formFactorIndicator;
	@Column(name = "ISSUER_SCRIPT_1_RESULTS")
	private String issuerScript1Results;

	@Column(name = "ISSUER_WORSTATION_BIN")
	private String issuerWorkstationBin;
	@Column(name = "ACQUIRER_WORKSTATION_BIN")
	private String acquirerWorkstationBin;
	@Column(name = "CHARGEBACK_REF_NUMBER")
	private String chargeBacKNumber;
	@Column(name = "DOCUMENTATION_INDICATOR")
	private String documentationIndicator;
	@Column(name = "ISSUER_CHARGE")
	private String issuerCharge;
	@Column(name = "RESERVED80")
	private String reserved80;
	@Column(name = "CARD_ACCEPTOR_ID")
	private String cardAcceptorId;
	@Column(name = "TERMINAL_ID")
	private String terminalId;
	@Column(name = "NATIONAL_REIMBURSEMENT_FEE")
	private String nationalReimbursementFee;
	@Column(name = "MPECP_INDICATOR")
	private String mailPhoneElectronicCommerceAndPaymentIndicator;
	@Column(name = "SPECIAL_CHARGEBACK_INDICATOR")
	private String specialChargeBackIndicator;
	@Column(name = "INTERFACE_TRACE_NUMBER")
	private String interfaceTraceNumber;
	@Column(name = "UNATTENTED_TRACE_NUMBER")
	private String unattentedTraceNumber;
	@Column(name = "AUTHORIZATION_SOURCE_CODE")
	private String authorizationSourceCode;
	@Column(name = "PREPAID_CARD_INDICATOR")
	private String prepaidCardIndicator;
	@Column(name = "SERVICE_DEVELOPMENT_FIELD")
	private String serviceDevelopmentField;
	@Column(name = "AVS_RESPONSE_CODE")
	private String avsResponseCode;
	@Column(name = "PURCHASE_IDENTIFIER_FORMAT")
	private String purchaseIdentifierFormat;
	@Column(name = "ACCOUNT_SELECTION")
	private String accountSelection;
	@Column(name = "INSTALLMENT_PAYMENT_COUNT")
	private String installmentPaymentCount;
	@Column(name = "PURCHASE_IDENTIFIER")
	private String purchaseIdentifier;
	@Column(name = "CASHBACK")
	private String cashBack;

	@Column(name = "CHIP_CONDITION_CODE")
	private String chipConditionCode;
	@Column(name = "POS_ENVIRONMENT")
	private String posEnvironment;

	@Column(name = "RESERVED514")
	private String reserved514;

	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;
	@Column(name = "MEMBER_MESSAGE_TEXT")
	private String memberMessageText;
	@Column(name = "SPECIAL_CONDITION_INDICATOR")
	private String specialConditionIndicator;
	@Column(name = "FEE_PROGRAM_INDICATOR")
	private String feeProgramIndicator;
	private String baseCurrency;
	private double baseAmount;

	private Integer cpCode;

	@JsonProperty("rejected")
	@Column(name = "REJECTED")
	private Boolean rejected = false;
	private String de37;
	private String de11;
	private String matchingSwitch;
	private String statusChargeback;
	private String de25;
	// New fields for DF format (BUSINESS_FORMAT_CODE_04 = 'DF')
	@Column(name = "TRANSACTION_CODE_QUALIFIER")
	private String transactionCodeQualifier;

	@Column(name = "TRANSACTION_COMPONENT_SEQUENCE_NUMBER")
	private String transactionComponentSequenceNumber;

	@Column(name = "DISPUTE_CONDITION")
	private String disputeCondition;

	@Column(name = "VRCL_FINANCIAL_ID")
	private String vrclFinancialId;

	@Column(name = "VRCL_CASE_NUMBER")
	private String vrclCaseNumber;

	public String getVrclBundleCaseNumber() {
		return vrclBundleCaseNumber;
	}

	public void setVrclBundleCaseNumber(String vrclBundleCaseNumber) {
		this.vrclBundleCaseNumber = vrclBundleCaseNumber;
	}

	@Column(name = "VRCL_BUNDLE_CASE_NUMBER")
	private String vrclBundleCaseNumber;

	@Column(name = "CLIENT_CASE_NUMBER")
	private String clientCaseNumber;

	@Column(name = "DISPUTE_STATUS")
	private String disputeStatus;

	@Column(name = "RESERVED117168")
	private String reserved117168;
	public String getDe25() {
		return de25;
	}


	public void setDe25(String de25) {
		this.de25 = de25;
	}


	public String getStatusChargeback() {
		return statusChargeback;
	}


	public void setStatusChargeback(String statusChargeback) {
		this.statusChargeback = statusChargeback;
	}


	public VisaIncoming() {}


	public void visaIncomingSetter(String visa, int summary, HashMap<String, Double> mapValueRate) {//, String baseCurrency
		this.summaryCode= summary;
		if(visa.substring(2, 3).equals("0") || visa.substring(2, 3).equals("2") || visa.substring(2, 3).equals("1")) {
			switch(visa.substring(3, 4)) {
				case "0":
					this.transactionCode = visa.substring(0, 2);
					this.accountNumber = visa.substring(4, 20);
					this.numberOfPaymentForms = visa.substring(145, 146);
					this.reserved158 = visa.substring(158, 159);
					this.reimbursementAttribute = visa.substring(167, 168);
					this.accountNumberExtension = visa.substring(20, 23);
					this.floorLimitIndicator = visa.substring(23, 24);
					this.crbExceptionFileIndicator = visa.substring(24, 25);
					this.positiveCardholderAuthorisationServiceIndicator = visa.substring(25, 26);
					this.acquirerReferenceNumber = visa.substring(26, 49);
					this.acquirerBuisnessId = visa.substring(49, 57);
					this.purchaseDate = visa.substring(57, 61);
					this.destinationCurrencyCode = visa.substring(73, 76);
					this.destinationAmount = convertAmount(visa.substring(61, 73));
					this.sourceCurrencyCode = visa.substring(88, 91);
					this.sourceAmount = convertAmount(visa.substring(76, 88));
					this.merchantName = visa.substring(91, 116);
					this.merchantCity = visa.substring(116, 129);
					this.merchantCountryCode = visa.substring(129, 132);
					this.merchantCategoryCode = visa.substring(132, 136);
					this.merchantZipCode = visa.substring(136, 141);
					this.merchantStateCode = visa.substring(141, 144);
					this.requestedPaymentService = visa.substring(144, 145);
					this.usageCode = visa.substring(146, 147);
					this.reasonCode = visa.substring(147, 149);
					this.settlementFlag = visa.substring(149, 150);
					this.authorisationCaracteristicsIndicator = visa.substring(150, 151);
					this.authorisationCode = visa.substring(151, 157);
					this.posTerminalCapability = visa.substring(157, 158);
					this.cardHolderIdMethod = visa.substring(159, 160);
					this.collectionOnlyFlag = visa.substring(160, 161);
					this.posEntryMode = visa.substring(161, 163);
					this.centralProcessingDate = visa.substring(163, 167);
					break;
				case "1":
					this.transactionCode = visa.substring(0, 2);
					this.reserved816 = visa.substring(7, 16);
					this.tokenAssuranceLevel = visa.substring(5, 7);
					this.businessFormatCode = visa.substring(4, 5);
					this.acceptanceTerminalIndicator = visa.substring(123, 124);
					this.chargeBacKNumber = visa.substring(16, 22);
					this.documentationIndicator = visa.substring(22, 23);
					this.issuerCharge = visa.substring(78, 79);
					this.reserved80 = visa.substring(79, 80);
					this.cardAcceptorId = visa.substring(80, 95);
					this.terminalId = visa.substring(95, 103);
					this.nationalReimbursementFee = visa.substring(103, 115);
					this.mailPhoneElectronicCommerceAndPaymentIndicator = visa.substring(115, 116);
					this.specialChargeBackIndicator = visa.substring(116, 117);
					this.interfaceTraceNumber = visa.substring(117, 123);
					this.authorizationSourceCode = visa.substring(127, 128);
					this.prepaidCardIndicator = visa.substring(124, 125);
					this.serviceDevelopmentField = visa.substring(125, 126);
					this.avsResponseCode = visa.substring(126, 127);
					this.purchaseIdentifierFormat = visa.substring(128, 129);
					this.accountSelection = visa.substring(129, 130);
					this.installmentPaymentCount = visa.substring(130, 132);
					this.purchaseIdentifier = visa.substring(132, 157);
					this.cashBack = visa.substring(157, 166);
					this.chipConditionCode = visa.substring(166, 167);
					this.posEnvironment = visa.substring(167, 168);
					this.memberMessageText = visa.substring(23, 73);
					this.specialConditionIndicator = visa.substring(73, 75);
					this.feeProgramIndicator = visa.substring(75, 78);
					break;
				case "3":
					this.transactionCode = visa.substring(0, 2);
					this.reserved516 = visa.substring(4, 16);
					this.BUSINESS_FORMAT_CODE_03 = visa.substring(16, 18);
					this.dataContent = visa.substring(18, 168);
					break;
				case "4":
					this.BUSINESS_FORMAT_CODE_04 = visa.substring(14, 16);
					if ( !"DF".equals(visa.substring(14, 16))){
						this.transactionCode = visa.substring(0, 2);
						this.agentUniqueId = visa.substring(4, 9);
						this.reserved514 = visa.substring(9, 14);
						this.networkIdentificationCode = visa.substring(16, 20);
						this.contactForInfo = visa.substring(20, 45);
						this.adjustmentProcessingIndicator = visa.substring(45, 46);
						this.messageReasonCode = visa.substring(46, 50);
						this.surchargeAmount = convertCurrency(visa.substring(50, 58));
						this.surchargeCreditOrDebitIndicator = visa.substring(58, 60);
						this.visaInternalUseOnly = visa.substring(60, 76);
						this.reserved77103 = visa.substring(76, 103);
						this.surchargeAmountCardholderBillingCurrency = visa.substring(103, 111);
						this.moneyTransferForeignExchangeFee = visa.substring(111, 119);
						this.paymentAccountReference = visa.substring(119, 148);
						this.tokenRequestorId = visa.substring(148, 159);
						this.reserved112168 = visa.substring(159, 168);}
					else{
						// When BUSINESS_FORMAT_CODE_04 = 'DF'
						this.transactionCode = visa.substring(0, 2);
						this.transactionCodeQualifier = visa.substring(2, 3);
						this.transactionComponentSequenceNumber = visa.substring(3, 4);
						this.agentUniqueId = visa.substring(4, 9);
						this.reserved514 = visa.substring(9, 14);
						this.networkIdentificationCode = visa.substring(16, 20);
						this.contactForInfo = visa.substring(20, 45);
						this.adjustmentProcessingIndicator = visa.substring(45, 46);
						this.messageReasonCode = visa.substring(46, 50);
						this.disputeCondition = visa.substring(50, 53);
						this.vrclFinancialId = visa.substring(53, 64);
						this.vrclCaseNumber = visa.substring(64, 74);
						this.vrclBundleCaseNumber = visa.substring(74, 84);
						this.clientCaseNumber = visa.substring(84, 104);
						this.disputeStatus = visa.substring(104, 106);
						this.surchargeAmount = convertCurrency(visa.substring(106, 114));
						this.surchargeCreditOrDebitIndicator = visa.substring(114, 116);
						this.reserved117168 = visa.substring(116, 168);
					}
					break;
				case "5":
					this.transactionCode = visa.substring(0, 2);
					this.transactionIdentifier = visa.substring(4, 19);
					this.authorizedAmount = visa.substring(19, 31);
					this.authorizationCurrencyCode = visa.substring(31, 34);
					this.authorizationResponseCode = visa.substring(34, 36);
					this.validationCode = visa.substring(36, 40);
					this.excludedTransactionIdentifier = visa.substring(40, 41);
					this.crsProcessingCode = visa.substring(41, 42);
					this.chargeBackRightsIndicator = visa.substring(42, 44);
					this.multipleClearingSequenceNumber = visa.substring(44, 46);
					this.multipleClearingSequenceCount = visa.substring(46, 48);
					this.marketSpecificAuthorizationDataIndicator = visa.substring(48, 49);
					this.totalAuthorizedAmount = visa.substring(49, 61);
					this.informationIndicator = visa.substring(61, 62);
					this.merchantTelephoneNumber = visa.substring(62, 76);
					this.additionalDataIndicator = visa.substring(76, 77);
					this.merchantVolumeIndicator = visa.substring(77, 79);
					this.electronicCommerceGoodsIndicator = visa.substring(79, 81);
					this.merchantVerificationValue = visa.substring(81, 91);
					this.interchangeFeeAmount = convertInterchange(visa.substring(91, 106));
					this.interchangeFeeSign = visa.substring(106, 107);
					this.sourceCurrencyToBaseCurrencyExchangeRate = changeRate(visa.substring(107, 115))==0?1:changeRate(visa.substring(107, 115));

					if ("05".equals(this.transactionCode)) {
						this.baseCurrencyToDestinationCurrencyExchangeRate = mapValueRate.get("Purchase");
					} else if ("07".equals(this.transactionCode)) {
						this.baseCurrencyToDestinationCurrencyExchangeRate = mapValueRate.get("Withdraw");
					} else {
						this.baseCurrencyToDestinationCurrencyExchangeRate = changeRate(visa.substring(115, 123)) == 0 ? mapValueRate.get("All") : changeRate(visa.substring(115, 123));
					}
//			this.baseCurrencyToDestinationCurrencyExchangeRate = changeRate(visa.substring(115, 123))==0?baseCurrencyToDestinationCurrencyExchangeRate:changeRate(visa.substring(115, 123));
					this.optionalIsaAmount = convertCurrency(visa.substring(123, 135));
					this.productId = visa.substring(135, 137);
					this.programID = visa.substring(137, 143);
					this.dynamicCurrencyConversionIndicator = visa.substring(143, 144);
					this.accountTypeIdentification = visa.substring(144, 148);
					this.spendQualifierIndicator = visa.substring(148, 149);
					this.panToken = visa.substring(149, 165);
					this.reserved149167 = visa.substring(165, 167);
					this.cvv2ResultCode = visa.substring(167, 168);
					break;
				case "6":
					this.transactionCode = visa.substring(0, 2);
					this.localTax = visa.substring(4, 16);
					this.localTaxIncluded = visa.substring(16, 17);
					this.nationalTax = visa.substring(17, 29);
					this.nationalTaxIncluded = visa.substring(29, 30);
					this.merchantVatRegistrationBusinessReferenceNumber = visa.substring(30, 50);
					this.customerVatRegistrationNumber = visa.substring(50, 63);
					this.reserved6475 = visa.substring(63, 75);
					this.summaryCommodityCode = convertCurrency(visa.substring(75, 79));
					this.otherTax = visa.substring(79, 91);
					this.messageIdentifier = visa.substring(91, 106);
					this.timeOfPurchase = visa.substring(106, 110);
					this.cri = visa.substring(110, 127);
					this.nonFuelProductCode1 = visa.substring(127, 129);
					this.nonFuelProductCode2 = visa.substring(129, 131);
					this.nonFuelProductCode3 = visa.substring(131, 133);
					this.nonFuelProductCode4 = visa.substring(133, 135);
					this.nonFuelProductCode5 = visa.substring(135, 137);
					this.nonFuelProductCode6 = visa.substring(137, 139);
					this.nonFuelProductCode7 = visa.substring(139, 141);
					this.nonFuelProductCode8 = visa.substring(141, 143);
					this.merchantPostalCode = visa.substring(143, 154);
					this.reserved155168 = visa.substring(154, 168);
					break;
				case "7":
					this.transactionCode = visa.substring(0, 2);
					this.transactionType = visa.substring(4, 6);
					this.cardSequenceNumber = visa.substring(6, 9);
					this.terminalTransactionDate = visa.substring(9, 15);
					this.terminalCapability = visa.substring(15, 21);
					this.terminalCountryCode = visa.substring(21, 24);
					this.terminalSerialNumber = visa.substring(24, 32);
					this.unpredictableNumber = visa.substring(32, 40);
					this.applicationTransactionCounter = visa.substring(40, 44);
					this.applicationInterchangeProfile = visa.substring(44, 48);
					this.cryptogram = visa.substring(48, 64);
					this.issuerApplicationDataByte2 = visa.substring(64, 66);
					this.issuerApplicationDataByte3 = visa.substring(66, 68);
					this.terminalVerificationResults = visa.substring(68, 78);
					this.issuerApplicationDataByte47 = visa.substring(78, 86);
					this.cryptogramAmount = convertCurrency(visa.substring(86, 98));
					this.issuerApplicationDataByte8 = visa.substring(98, 100);
					this.issuerApplicationDataByte916 = visa.substring(100, 116);
					this.issuerApplicationDataByte1 = visa.substring(116, 118);
					this.issuerApplicationDataByte17 = visa.substring(118, 120);
					this.issuerApplicationDataByte1832 = visa.substring(120, 150);
					this.formFactorIndicator = visa.substring(150, 158);
					this.issuerScript1Results = visa.substring(158, 168);
					break;
				default:
				{
					Log.info("visa sub not found=>{}",visa.substring(0, 4));
				}
			}

		}

		if(this.sourceCurrencyCode!=null && Arrays.asList("978").contains(this.sourceCurrencyCode)) {//,"840"
			baseCurrency=this.sourceCurrencyCode;//978
			this.baseAmount= Math.round(sourceAmount * 100.0) / 100.0;
			this.interchangeFeeAmount= Math.round(interchangeFeeAmount*Math.pow(10, 6))/Math.pow(10, 6);

			this.baseCurrencyToDestinationCurrencyExchangeRate= Math.round(sourceAmount/destinationAmount*Math.pow(10, 6))/Math.pow(10, 6);
			this.sourceCurrencyToBaseCurrencyExchangeRate=1.0;

		}else {
			baseCurrency="840";
			double baseAmountfromsource = 0;
			double baseAmountfromdestination = 0;
			baseAmountfromdestination= Math.round(destinationAmount*this.baseCurrencyToDestinationCurrencyExchangeRate * 100.0) / 100.0;

			if (this.sourceCurrencyCode.equals("840")) {
				baseAmountfromsource= Math.round(sourceAmount*100)/100.0;
			}else {
				baseAmountfromsource= Math.round(sourceAmount*this.sourceCurrencyToBaseCurrencyExchangeRate * 100.0) / 100.0;
			}
			if ("05".equals(this.transactionCode)) {
				this.baseAmount=baseAmountfromdestination;
			} else if ("07".equals(this.transactionCode)) {
				this.baseAmount=baseAmountfromdestination;
			} else {
				this.baseAmount = Math.abs(baseAmountfromsource - baseAmountfromdestination) > 10 ? baseAmountfromdestination : baseAmountfromsource;
			}



		}
		this.baseCurrencyToDestinationCurrencyExchangeRate=Math.abs(this.baseCurrencyToDestinationCurrencyExchangeRate);
		this.sourceCurrencyToBaseCurrencyExchangeRate=Math.abs(this.sourceCurrencyToBaseCurrencyExchangeRate);
		this.baseAmount=Math.abs(this.baseAmount);

	}

	private double convertAmount(String amount) {		//, String currency
		double number = Double.parseDouble(amount);
//		if (currency!= null && currency.equals("788")) {
//			number = number/Math.pow(10, 3);
//		} else {
		number = number/Math.pow(10, 2);
//		}
		return number;
	}

	private double convertInterchange(String interchange) {
		double number = Double.parseDouble(interchange);
		number = number/Math.pow(10, 6);
		return number;
	}

	private double changeRate(String change) {
		int number = Integer.parseInt(change.substring(0, 2));
		if (number == 0) return 0;

		String changeRate = change.substring(2);
		double res = Double.parseDouble(changeRate)/Math.pow(10, number);
		return res;
	}


	public String convertCurrency(String s) {
		if (s.contains("{") || s.contains("P")) {
			s = s.replace("{", "00").replace("P", "0");
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

	public String getBaseCurrency() {
		return baseCurrency;
	}


	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}


	public double getBaseAmount() {
		return baseAmount;
	}


	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}


	public String getBUSINESS_FORMAT_CODE_03() {
		return BUSINESS_FORMAT_CODE_03;
	}

	public void setBUSINESS_FORMAT_CODE_03(String BUSINESS_FORMAT_CODE_03) {
		this.BUSINESS_FORMAT_CODE_03 = BUSINESS_FORMAT_CODE_03;
	}

	public String getBUSINESS_FORMAT_CODE_04() {
		return BUSINESS_FORMAT_CODE_04;
	}

	public void setBUSINESS_FORMAT_CODE_04(String BUSINESS_FORMAT_CODE_04) {
		this.BUSINESS_FORMAT_CODE_04 = BUSINESS_FORMAT_CODE_04;
	}

	public String getTreat() {
		return treat;
	}

	public void setTreat(String treat) {
		this.treat = treat;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getReserved514() {
		return reserved514;
	}

	public void setReserved514(String reserved514) {
		this.reserved514 = reserved514;
	}

	public String getMemberMessageText() {
		return memberMessageText;
	}

	public void setMemberMessageText(String memberMessageText) {
		this.memberMessageText = memberMessageText;
	}

	public String getSpecialConditionIndicator() {
		return specialConditionIndicator;
	}

	public void setSpecialConditionIndicator(String specialConditionIndicator) {
		this.specialConditionIndicator = specialConditionIndicator;
	}

	public String getFeeProgramIndicator() {
		return feeProgramIndicator;
	}

	public void setFeeProgramIndicator(String feeProgramIndicator) {
		this.feeProgramIndicator = feeProgramIndicator;
	}

	public String getIssuerWorkstationBin() {
		return issuerWorkstationBin;
	}

	public String getAuthorizationSourceCode() {
		return authorizationSourceCode;
	}

	public void setAuthorizationSourceCode(String authorizationSourceCode) {
		this.authorizationSourceCode = authorizationSourceCode;
	}

	public void setIssuerWorkstationBin(String issuerWorkstationBin) {
		this.issuerWorkstationBin = issuerWorkstationBin;
	}

	public String getAcquirerWorkstationBin() {
		return acquirerWorkstationBin;
	}

	public void setAcquirerWorkstationBin(String acquirerWorkstationBin) {
		this.acquirerWorkstationBin = acquirerWorkstationBin;
	}

	public String getChargeBacKNumber() {
		return chargeBacKNumber;
	}

	public void setChargeBacKNumber(String chargeBacKNumber) {
		this.chargeBacKNumber = chargeBacKNumber;
	}

	public String getDocumentationIndicator() {
		return documentationIndicator;
	}

	public void setDocumentationIndicator(String documentationIndicator) {
		this.documentationIndicator = documentationIndicator;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getIssuerCharge() {
		return issuerCharge;
	}

	public void setIssuerCharge(String issuerCharge) {
		this.issuerCharge = issuerCharge;
	}

	public String getReserved80() {
		return reserved80;
	}

	public void setReserved80(String reserved80) {
		this.reserved80 = reserved80;
	}

	public String getCardAcceptorId() {
		return cardAcceptorId;
	}

	public void setCardAcceptorId(String cardAcceptorId) {
		this.cardAcceptorId = cardAcceptorId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getNationalReimbursementFee() {
		return nationalReimbursementFee;
	}

	public void setNationalReimbursementFee(String nationalReimbursementFee) {
		this.nationalReimbursementFee = nationalReimbursementFee;
	}

	public String getMailPhoneElectronicCommerceAndPaymentIndicator() {
		return mailPhoneElectronicCommerceAndPaymentIndicator;
	}

	public void setMailPhoneElectronicCommerceAndPaymentIndicator(
			String mailPhoneElectronicCommerceAndPaymentIndicator) {
		this.mailPhoneElectronicCommerceAndPaymentIndicator = mailPhoneElectronicCommerceAndPaymentIndicator;
	}

	public String getSpecialChargeBackIndicator() {
		return specialChargeBackIndicator;
	}

	public void setSpecialChargeBackIndicator(String specialChargeBackIndicator) {
		this.specialChargeBackIndicator = specialChargeBackIndicator;
	}

	public String getInterfaceTraceNumber() {
		return interfaceTraceNumber;
	}

	public void setInterfaceTraceNumber(String interfaceTraceNumber) {
		this.interfaceTraceNumber = interfaceTraceNumber;
	}

	public String getUnattentedTraceNumber() {
		return unattentedTraceNumber;
	}

	public void setUnattentedTraceNumber(String unattentedTraceNumber) {
		this.unattentedTraceNumber = unattentedTraceNumber;
	}

	public String getPrepaidCardIndicator() {
		return prepaidCardIndicator;
	}

	public void setPrepaidCardIndicator(String prepaidCardIndicator) {
		this.prepaidCardIndicator = prepaidCardIndicator;
	}

	public String getServiceDevelopmentField() {
		return serviceDevelopmentField;
	}

	public void setServiceDevelopmentField(String serviceDevelopmentField) {
		this.serviceDevelopmentField = serviceDevelopmentField;
	}

	public String getAvsResponseCode() {
		return avsResponseCode;
	}

	public void setAvsResponseCode(String avsResponseCode) {
		this.avsResponseCode = avsResponseCode;
	}

	public String getPurchaseIdentifierFormat() {
		return purchaseIdentifierFormat;
	}

	public void setPurchaseIdentifierFormat(String purchaseIdentifierFormat) {
		this.purchaseIdentifierFormat = purchaseIdentifierFormat;
	}

	public String getAccountSelection() {
		return accountSelection;
	}

	public void setAccountSelection(String accountSelection) {
		this.accountSelection = accountSelection;
	}

	public String getInstallmentPaymentCount() {
		return installmentPaymentCount;
	}

	public void setInstallmentPaymentCount(String installmentPaymentCount) {
		this.installmentPaymentCount = installmentPaymentCount;
	}

	public String getPurchaseIdentifier() {
		return purchaseIdentifier;
	}

	public void setPurchaseIdentifier(String purchaseIdentifier) {
		this.purchaseIdentifier = purchaseIdentifier;
	}

	public String getCashBack() {
		return cashBack;
	}

	public void setCashBack(String cashBack) {
		this.cashBack = cashBack;
	}

	public String getChipConditionCode() {
		return chipConditionCode;
	}

	public void setChipConditionCode(String chipConditionCode) {
		this.chipConditionCode = chipConditionCode;
	}

	public String getPosEnvironment() {
		return posEnvironment;
	}

	public void setPosEnvironment(String posEnvironment) {
		this.posEnvironment = posEnvironment;
	}

	public String getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(String accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

	public String getFloorLimitIndicator() {
		return floorLimitIndicator;
	}

	public void setFloorLimitIndicator(String floorLimitIndicator) {
		this.floorLimitIndicator = floorLimitIndicator;
	}

	public String getCrbExceptionFileIndicator() {
		return crbExceptionFileIndicator;
	}

	public void setCrbExceptionFileIndicator(String crbExceptionFileIndicator) {
		this.crbExceptionFileIndicator = crbExceptionFileIndicator;
	}

	public String getPositiveCardholderAuthorisationServiceIndicator() {
		return positiveCardholderAuthorisationServiceIndicator;
	}

	public void setPositiveCardholderAuthorisationServiceIndicator(
			String positiveCardholderAuthorisationServiceIndicator) {
		this.positiveCardholderAuthorisationServiceIndicator = positiveCardholderAuthorisationServiceIndicator;
	}

	public String getAcquirerReferenceNumber() {
		return acquirerReferenceNumber;
	}

	public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
		this.acquirerReferenceNumber = acquirerReferenceNumber;
	}

	public String getAcquirerBuisnessId() {
		return acquirerBuisnessId;
	}

	public void setAcquirerBuisnessId(String acquirerBuisnessId) {
		this.acquirerBuisnessId = acquirerBuisnessId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getDestinationAmount() {
		return destinationAmount;
	}

	public void setDestinationAmount(double destinationAmount) {
		this.destinationAmount = destinationAmount;
	}

	public String getDestinationCurrencyCode() {
		return destinationCurrencyCode;
	}

	public void setDestinationCurrencyCode(String destinationCurrencyCode) {
		this.destinationCurrencyCode = destinationCurrencyCode;
	}

	public double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}

	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getMerchantZipCode() {
		return merchantZipCode;
	}

	public void setMerchantZipCode(String merchantZipCode) {
		this.merchantZipCode = merchantZipCode;
	}

	public String getMerchantStateCode() {
		return merchantStateCode;
	}

	public void setMerchantStateCode(String merchantStateCode) {
		this.merchantStateCode = merchantStateCode;
	}

	public String getRequestedPaymentService() {
		return requestedPaymentService;
	}

	public void setRequestedPaymentService(String requestedPaymentService) {
		this.requestedPaymentService = requestedPaymentService;
	}

	public String getReserved146() {
		return reserved146;
	}

	public void setReserved146(String reserved146) {
		this.reserved146 = reserved146;
	}

	public String getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getSettlementFlag() {
		return settlementFlag;
	}

	public void setSettlementFlag(String settlementFlag) {
		this.settlementFlag = settlementFlag;
	}

	public String getAuthorisationCaracteristicsIndicator() {
		return authorisationCaracteristicsIndicator;
	}

	public void setAuthorisationCaracteristicsIndicator(String authorisationCaracteristicsIndicator) {
		this.authorisationCaracteristicsIndicator = authorisationCaracteristicsIndicator;
	}

	public String getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(String authorisationCode) {
		this.authorisationCode = authorisationCode;
	}

	public String getPosTerminalCapability() {
		return posTerminalCapability;
	}

	public void setPosTerminalCapability(String posTerminalCapability) {
		this.posTerminalCapability = posTerminalCapability;
	}

	public String getInternationalFeeIndicator() {
		return internationalFeeIndicator;
	}

	public void setInternationalFeeIndicator(String internationalFeeIndicator) {
		this.internationalFeeIndicator = internationalFeeIndicator;
	}

	public String getCardholderId() {
		return cardholderId;
	}

	public void setCardholderId(String cardholderId) {
		this.cardholderId = cardholderId;
	}

	public String getCollectionOnlyFlag() {
		return collectionOnlyFlag;
	}

	public void setCollectionOnlyFlag(String collectionOnlyFlag) {
		this.collectionOnlyFlag = collectionOnlyFlag;
	}

	public String getPosEntryMode() {
		return posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getCentralProcessingDate() {
		return centralProcessingDate;
	}

	public void setCentralProcessingDate(String centralProcessingDate) {
		this.centralProcessingDate = centralProcessingDate;
	}

	public String getBusinessFormatCode() {
		return businessFormatCode;
	}

	public void setBusinessFormatCode(String businessFormatCode) {
		this.businessFormatCode = businessFormatCode;
	}

	public String getDataContent() {
		return dataContent;
	}

	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getReserved516() {
		return reserved516;
	}

	public void setReserved516(String reserved516) {
		this.reserved516 = reserved516;
	}

	public String getDebitProductCode() {
		return debitProductCode;
	}

	public void setDebitProductCode(String debitProductCode) {
		this.debitProductCode = debitProductCode;
	}

	public String getContactForInfo() {
		return contactForInfo;
	}

	public void setContactForInfo(String contactForInfo) {
		this.contactForInfo = contactForInfo;
	}

	public String getAdjustmentProcessingIndicator() {
		return adjustmentProcessingIndicator;
	}

	public void setAdjustmentProcessingIndicator(String adjustmentProcessingIndicator) {
		this.adjustmentProcessingIndicator = adjustmentProcessingIndicator;
	}

	public String getMessageReasonCode() {
		return messageReasonCode;
	}

	public void setMessageReasonCode(String messageReasonCode) {
		this.messageReasonCode = messageReasonCode;
	}

	public String getSurchargeAmount() {
		return surchargeAmount;
	}

	public void setSurchargeAmount(String surchargeAmount) {
		this.surchargeAmount = surchargeAmount;
	}

	public String getSurchargeCreditOrDebitIndicator() {
		return surchargeCreditOrDebitIndicator;
	}

	public void setSurchargeCreditOrDebitIndicator(String surchargeCreditOrDebitIndicator) {
		this.surchargeCreditOrDebitIndicator = surchargeCreditOrDebitIndicator;
	}

	public String getVisaInternalUseOnly() {
		return visaInternalUseOnly;
	}

	public void setVisaInternalUseOnly(String visaInternalUseOnly) {
		this.visaInternalUseOnly = visaInternalUseOnly;
	}

	public String getReserved77103() {
		return reserved77103;
	}

	public void setReserved77103(String reserved77103) {
		this.reserved77103 = reserved77103;
	}

	public String getSurchargeAmountCardholderBillingCurrency() {
		return surchargeAmountCardholderBillingCurrency;
	}

	public void setSurchargeAmountCardholderBillingCurrency(String surchargeAmountCardholderBillingCurrency) {
		this.surchargeAmountCardholderBillingCurrency = surchargeAmountCardholderBillingCurrency;
	}

	public String getReserved112168() {
		return reserved112168;
	}

	public void setReserved112168(String reserved112168) {
		this.reserved112168 = reserved112168;
	}

	public String getAuthorizedAmount() {
		return authorizedAmount;
	}

	public void setAuthorizedAmount(String authorizedAmount) {
		this.authorizedAmount = authorizedAmount;
	}

	public String getAuthorizationCurrencyCode() {
		return authorizationCurrencyCode;
	}

	public void setAuthorizationCurrencyCode(String authorizationCurrencyCode) {
		this.authorizationCurrencyCode = authorizationCurrencyCode;
	}

	public String getAuthorizationResponseCode() {
		return authorizationResponseCode;
	}

	public void setAuthorizationResponseCode(String authorizationResponseCode) {
		this.authorizationResponseCode = authorizationResponseCode;
	}

	public String getValidationCode() {
		return validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

	public String getExcludedTransactionIdentifier() {
		return excludedTransactionIdentifier;
	}

	public void setExcludedTransactionIdentifier(String excludedTransactionIdentifier) {
		this.excludedTransactionIdentifier = excludedTransactionIdentifier;
	}

	public String getCrsProcessingCode() {
		return crsProcessingCode;
	}

	public void setCrsProcessingCode(String crsProcessingCode) {
		this.crsProcessingCode = crsProcessingCode;
	}

	public String getChargeBackRightsIndicator() {
		return chargeBackRightsIndicator;
	}

	public void setChargeBackRightsIndicator(String chargeBackRightsIndicator) {
		this.chargeBackRightsIndicator = chargeBackRightsIndicator;
	}

	public String getMultipleClearingSequenceNumber() {
		return multipleClearingSequenceNumber;
	}

	public void setMultipleClearingSequenceNumber(String multipleClearingSequenceNumber) {
		this.multipleClearingSequenceNumber = multipleClearingSequenceNumber;
	}

	public String getMultipleClearingSequenceCount() {
		return multipleClearingSequenceCount;
	}

	public void setMultipleClearingSequenceCount(String multipleClearingSequenceCount) {
		this.multipleClearingSequenceCount = multipleClearingSequenceCount;
	}

	public String getMarketSpecificAuthorizationDataIndicator() {
		return marketSpecificAuthorizationDataIndicator;
	}

	public void setMarketSpecificAuthorizationDataIndicator(String marketSpecificAuthorizationDataIndicator) {
		this.marketSpecificAuthorizationDataIndicator = marketSpecificAuthorizationDataIndicator;
	}

	public String getTotalAuthorizedAmount() {
		return totalAuthorizedAmount;
	}

	public void setTotalAuthorizedAmount(String totalAuthorizedAmount) {
		this.totalAuthorizedAmount = totalAuthorizedAmount;
	}

	public String getInformationIndicator() {
		return informationIndicator;
	}

	public void setInformationIndicator(String informationIndicator) {
		this.informationIndicator = informationIndicator;
	}

	public String getMerchantTelephoneNumber() {
		return merchantTelephoneNumber;
	}

	public void setMerchantTelephoneNumber(String merchantTelephoneNumber) {
		this.merchantTelephoneNumber = merchantTelephoneNumber;
	}

	public String getAdditionalDataIndicator() {
		return additionalDataIndicator;
	}

	public void setAdditionalDataIndicator(String additionalDataIndicator) {
		this.additionalDataIndicator = additionalDataIndicator;
	}

	public String getMerchantVolumeIndicator() {
		return merchantVolumeIndicator;
	}

	public void setMerchantVolumeIndicator(String merchantVolumeIndicator) {
		this.merchantVolumeIndicator = merchantVolumeIndicator;
	}

	public String getElectronicCommerceGoodsIndicator() {
		return electronicCommerceGoodsIndicator;
	}

	public void setElectronicCommerceGoodsIndicator(String electronicCommerceGoodsIndicator) {
		this.electronicCommerceGoodsIndicator = electronicCommerceGoodsIndicator;
	}

	public String getMerchantVerificationValue() {
		return merchantVerificationValue;
	}

	public void setMerchantVerificationValue(String merchantVerificationValue) {
		this.merchantVerificationValue = merchantVerificationValue;
	}

	public double getInterchangeFeeAmount() {
		return interchangeFeeAmount;
	}

	public void setInterchangeFeeAmount(double interchangeFeeAmount) {
		this.interchangeFeeAmount = interchangeFeeAmount;
	}

	public String getInterchangeFeeSign() {
		return interchangeFeeSign;
	}

	public void setInterchangeFeeSign(String interchangeFeeSign) {
		this.interchangeFeeSign = interchangeFeeSign;
	}

	public double getSourceCurrencyToBaseCurrencyExchangeRate() {
		return sourceCurrencyToBaseCurrencyExchangeRate;
	}

	public void setSourceCurrencyToBaseCurrencyExchangeRate(double sourceCurrencyToBaseCurrencyExchangeRate) {
		this.sourceCurrencyToBaseCurrencyExchangeRate = sourceCurrencyToBaseCurrencyExchangeRate;
	}

	public double getBaseCurrencyToDestinationCurrencyExchangeRate() {
		return baseCurrencyToDestinationCurrencyExchangeRate;
	}

	public void setBaseCurrencyToDestinationCurrencyExchangeRate(double baseCurrencyToDestinationCurrencyExchangeRate) {
		this.baseCurrencyToDestinationCurrencyExchangeRate = baseCurrencyToDestinationCurrencyExchangeRate;
	}

	public String getOptionalIsaAmount() {
		return optionalIsaAmount;
	}

	public void setOptionalIsaAmount(String optionalIsaAmount) {
		this.optionalIsaAmount = optionalIsaAmount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProgramID() {
		return programID;
	}

	public void setProgramID(String programID) {
		this.programID = programID;
	}

	public String getDynamicCurrencyConversionIndicator() {
		return dynamicCurrencyConversionIndicator;
	}

	public void setDynamicCurrencyConversionIndicator(String dynamicCurrencyConversionIndicator) {
		this.dynamicCurrencyConversionIndicator = dynamicCurrencyConversionIndicator;
	}

	public String getAccountTypeIdentification() {
		return accountTypeIdentification;
	}

	public void setAccountTypeIdentification(String accountTypeIdentification) {
		this.accountTypeIdentification = accountTypeIdentification;
	}

	public String getReserved149167() {
		return reserved149167;
	}

	public void setReserved149167(String reserved149167) {
		this.reserved149167 = reserved149167;
	}

	public String getCvv2ResultCode() {
		return cvv2ResultCode;
	}

	public void setCvv2ResultCode(String cvv2ResultCode) {
		this.cvv2ResultCode = cvv2ResultCode;
	}

	public String getLocalTax() {
		return localTax;
	}

	public void setLocalTax(String localTax) {
		this.localTax = localTax;
	}

	public String getLocalTaxIncluded() {
		return localTaxIncluded;
	}

	public void setLocalTaxIncluded(String localTaxIncluded) {
		this.localTaxIncluded = localTaxIncluded;
	}

	public String getNationalTax() {
		return nationalTax;
	}

	public void setNationalTax(String nationalTax) {
		this.nationalTax = nationalTax;
	}

	public String getNationalTaxIncluded() {
		return nationalTaxIncluded;
	}

	public void setNationalTaxIncluded(String nationalTaxIncluded) {
		this.nationalTaxIncluded = nationalTaxIncluded;
	}

	public String getMerchantVatRegistrationBusinessReferenceNumber() {
		return merchantVatRegistrationBusinessReferenceNumber;
	}

	public void setMerchantVatRegistrationBusinessReferenceNumber(
			String merchantVatRegistrationBusinessReferenceNumber) {
		this.merchantVatRegistrationBusinessReferenceNumber = merchantVatRegistrationBusinessReferenceNumber;
	}

	public String getCustomerVatRegistrationNumber() {
		return customerVatRegistrationNumber;
	}

	public void setCustomerVatRegistrationNumber(String customerVatRegistrationNumber) {
		this.customerVatRegistrationNumber = customerVatRegistrationNumber;
	}

	public String getReserved6475() {
		return reserved6475;
	}

	public void setReserved6475(String reserved6475) {
		this.reserved6475 = reserved6475;
	}

	public String getSummaryCommodityCode() {
		return summaryCommodityCode;
	}

	public void setSummaryCommodityCode(String summaryCommodityCode) {
		this.summaryCommodityCode = summaryCommodityCode;
	}

	public String getOtherTax() {
		return otherTax;
	}

	public void setOtherTax(String otherTax) {
		this.otherTax = otherTax;
	}

	public String getMessageIdentifier() {
		return messageIdentifier;
	}

	public void setMessageIdentifier(String messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}

	public String getTimeOfPurchase() {
		return timeOfPurchase;
	}

	public void setTimeOfPurchase(String timeOfPurchase) {
		this.timeOfPurchase = timeOfPurchase;
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}

	public String getNonFuelProductCode1() {
		return nonFuelProductCode1;
	}

	public void setNonFuelProductCode1(String nonFuelProductCode1) {
		this.nonFuelProductCode1 = nonFuelProductCode1;
	}

	public String getNonFuelProductCode2() {
		return nonFuelProductCode2;
	}

	public void setNonFuelProductCode2(String nonFuelProductCode2) {
		this.nonFuelProductCode2 = nonFuelProductCode2;
	}

	public String getNonFuelProductCode3() {
		return nonFuelProductCode3;
	}

	public void setNonFuelProductCode3(String nonFuelProductCode3) {
		this.nonFuelProductCode3 = nonFuelProductCode3;
	}

	public String getNonFuelProductCode4() {
		return nonFuelProductCode4;
	}

	public void setNonFuelProductCode4(String nonFuelProductCode4) {
		this.nonFuelProductCode4 = nonFuelProductCode4;
	}

	public String getNonFuelProductCode5() {
		return nonFuelProductCode5;
	}

	public void setNonFuelProductCode5(String nonFuelProductCode5) {
		this.nonFuelProductCode5 = nonFuelProductCode5;
	}

	public String getNonFuelProductCode6() {
		return nonFuelProductCode6;
	}

	public void setNonFuelProductCode6(String nonFuelProductCode6) {
		this.nonFuelProductCode6 = nonFuelProductCode6;
	}

	public String getNonFuelProductCode7() {
		return nonFuelProductCode7;
	}

	public void setNonFuelProductCode7(String nonFuelProductCode7) {
		this.nonFuelProductCode7 = nonFuelProductCode7;
	}

	public String getNonFuelProductCode8() {
		return nonFuelProductCode8;
	}

	public void setNonFuelProductCode8(String nonFuelProductCode8) {
		this.nonFuelProductCode8 = nonFuelProductCode8;
	}

	public String getMerchantPostalCode() {
		return merchantPostalCode;
	}

	public void setMerchantPostalCode(String merchantPostalCode) {
		this.merchantPostalCode = merchantPostalCode;
	}

	public String getReserved155168() {
		return reserved155168;
	}

	public void setReserved155168(String reserved155168) {
		this.reserved155168 = reserved155168;
	}

	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public String getTerminalTransactionDate() {
		return terminalTransactionDate;
	}

	public void setTerminalTransactionDate(String terminalTransactionDate) {
		this.terminalTransactionDate = terminalTransactionDate;
	}

	public String getTerminalCapability() {
		return terminalCapability;
	}

	public void setTerminalCapability(String terminalCapability) {
		this.terminalCapability = terminalCapability;
	}

	public String getTerminalCountryCode() {
		return terminalCountryCode;
	}

	public void setTerminalCountryCode(String terminalCountryCode) {
		this.terminalCountryCode = terminalCountryCode;
	}

	public String getTerminalSerialNumber() {
		return terminalSerialNumber;
	}

	public void setTerminalSerialNumber(String terminalSerialNumber) {
		this.terminalSerialNumber = terminalSerialNumber;
	}

	public String getUnpredictableNumber() {
		return unpredictableNumber;
	}

	public void setUnpredictableNumber(String unpredictableNumber) {
		this.unpredictableNumber = unpredictableNumber;
	}

	public String getApplicationTransactionCounter() {
		return applicationTransactionCounter;
	}

	public void setApplicationTransactionCounter(String applicationTransactionCounter) {
		this.applicationTransactionCounter = applicationTransactionCounter;
	}

	public String getApplicationInterchangeProfile() {
		return applicationInterchangeProfile;
	}

	public void setApplicationInterchangeProfile(String applicationInterchangeProfile) {
		this.applicationInterchangeProfile = applicationInterchangeProfile;
	}

	public String getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(String cryptogram) {
		this.cryptogram = cryptogram;
	}

	public String getIssuerApplicationDataByte2() {
		return issuerApplicationDataByte2;
	}

	public void setIssuerApplicationDataByte2(String issuerApplicationDataByte2) {
		this.issuerApplicationDataByte2 = issuerApplicationDataByte2;
	}

	public String getIssuerApplicationDataByte3() {
		return issuerApplicationDataByte3;
	}

	public void setIssuerApplicationDataByte3(String issuerApplicationDataByte3) {
		this.issuerApplicationDataByte3 = issuerApplicationDataByte3;
	}

	public String getTerminalVerificationResults() {
		return terminalVerificationResults;
	}

	public void setTerminalVerificationResults(String terminalVerificationResults) {
		this.terminalVerificationResults = terminalVerificationResults;
	}

	public String getIssuerApplicationDataByte47() {
		return issuerApplicationDataByte47;
	}

	public void setIssuerApplicationDataByte47(String issuerApplicationDataByte47) {
		this.issuerApplicationDataByte47 = issuerApplicationDataByte47;
	}

	public String getCryptogramAmount() {
		return cryptogramAmount;
	}

	public void setCryptogramAmount(String cryptogramAmount) {
		this.cryptogramAmount = cryptogramAmount;
	}

	public String getIssuerApplicationDataByte8() {
		return issuerApplicationDataByte8;
	}

	public void setIssuerApplicationDataByte8(String issuerApplicationDataByte8) {
		this.issuerApplicationDataByte8 = issuerApplicationDataByte8;
	}

	public String getIssuerApplicationDataByte916() {
		return issuerApplicationDataByte916;
	}

	public void setIssuerApplicationDataByte916(String issuerApplicationDataByte916) {
		this.issuerApplicationDataByte916 = issuerApplicationDataByte916;
	}

	public String getIssuerApplicationDataByte1() {
		return issuerApplicationDataByte1;
	}

	public void setIssuerApplicationDataByte1(String issuerApplicationDataByte1) {
		this.issuerApplicationDataByte1 = issuerApplicationDataByte1;
	}

	public String getIssuerApplicationDataByte17() {
		return issuerApplicationDataByte17;
	}

	public void setIssuerApplicationDataByte17(String issuerApplicationDataByte17) {
		this.issuerApplicationDataByte17 = issuerApplicationDataByte17;
	}

	public String getIssuerApplicationDataByte1832() {
		return issuerApplicationDataByte1832;
	}

	public void setIssuerApplicationDataByte1832(String issuerApplicationDataByte1832) {
		this.issuerApplicationDataByte1832 = issuerApplicationDataByte1832;
	}

	public String getFormFactorIndicator() {
		return formFactorIndicator;
	}

	public void setFormFactorIndicator(String formFactorIndicator) {
		this.formFactorIndicator = formFactorIndicator;
	}

	public String getIssuerScript1Results() {
		return issuerScript1Results;
	}

	public void setIssuerScript1Results(String issuerScript1Results) {
		this.issuerScript1Results = issuerScript1Results;
	}

	public String getReserved1429() {
		return reserved1429;
	}

	public void setReserved1429(String reserved1429) {
		this.reserved1429 = reserved1429;
	}

	public String getTestOptional() {
		return testOptional;
	}

	public void setTestOptional(String testOptional) {
		this.testOptional = testOptional;
	}

	public String getReserved3462() {
		return reserved3462;
	}

	public void setReserved3462(String reserved3462) {
		this.reserved3462 = reserved3462;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getReserved7176() {
		return reserved7176;
	}

	public void setReserved7176(String reserved7176) {
		this.reserved7176 = reserved7176;
	}

	public String getOutgoingFileId() {
		return outgoingFileId;
	}

	public void setOutgoingFileId(String outgoingFileId) {
		this.outgoingFileId = outgoingFileId;
	}

	public String getReserved80168() {
		return reserved80168;
	}

	public void setReserved80168(String reserved80168) {
		this.reserved80168 = reserved80168;
	}

	public String getProcessingBin() {
		return processingBin;
	}

	public void setProcessingBin(String processingBin) {
		this.processingBin = processingBin;
	}

	public String getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getReleaseNumber() {
		return releaseNumber;
	}

	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

	public Integer getIncomingCode() {
		return incomingCode;
	}

	public void setIncomingCode(Integer incomingCode) {
		this.incomingCode = incomingCode;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getDestinationBin() {
		return destinationBin;
	}

	public void setDestinationBin(String destinationBin) {
		this.destinationBin = destinationBin;
	}

	public String getSourceBin() {
		return sourceBin;
	}

	public void setSourceBin(String sourceBin) {
		this.sourceBin = sourceBin;
	}

	public String getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(String formatCode) {
		this.formatCode = formatCode;
	}

	public String getConstantIdentifier() {
		return constantIdentifier;
	}

	public void setConstantIdentifier(String constantIdentifier) {
		this.constantIdentifier = constantIdentifier;
	}

	public String getReserved26() {
		return reserved26;
	}

	public void setReserved26(String reserved26) {
		this.reserved26 = reserved26;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getReserved4348() {
		return reserved4348;
	}

	public void setReserved4348(String reserved4348) {
		this.reserved4348 = reserved4348;
	}

	public String getReserved4950() {
		return reserved4950;
	}

	public void setReserved4950(String reserved4950) {
		this.reserved4950 = reserved4950;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getRESERVED5354() {
		return RESERVED5354;
	}

	public void setRESERVED5354(String RESERVED5354) {
		this.RESERVED5354 = RESERVED5354;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getReserved5960() {
		return reserved5960;
	}

	public void setReserved5960(String reserved5960) {
		this.reserved5960 = reserved5960;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getReserved6566() {
		return reserved6566;
	}

	public void setReserved6566(String reserved6566) {
		this.reserved6566 = reserved6566;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getReserved7576() {
		return reserved7576;
	}

	public void setReserved7576(String reserved7576) {
		this.reserved7576 = reserved7576;
	}

	public String getInquiringCenter() {
		return inquiringCenter;
	}

	public void setInquiringCenter(String inquiringCenter) {
		this.inquiringCenter = inquiringCenter;
	}

	public String getReserved8182() {
		return reserved8182;
	}

	public void setReserved8182(String reserved8182) {
		this.reserved8182 = reserved8182;
	}



	public String getReserved8889() {
		return reserved8889;
	}

	public void setReserved8889(String reserved8889) {
		this.reserved8889 = reserved8889;
	}

	public String getBaseTransactionCodeMerchantTerminalIndicator() {
		return baseTransactionCodeMerchantTerminalIndicator;
	}

	public void setBaseTransactionCodeMerchantTerminalIndicator(String baseTransactionCodeMerchantTerminalIndicator) {
		this.baseTransactionCodeMerchantTerminalIndicator = baseTransactionCodeMerchantTerminalIndicator;
	}

	public String getReserved9394() {
		return reserved9394;
	}

	public void setReserved9394(String reserved9394) {
		this.reserved9394 = reserved9394;
	}

	public String getStandInReasonCode() {
		return standInReasonCode;
	}

	public void setStandInReasonCode(String standInReasonCode) {
		this.standInReasonCode = standInReasonCode;
	}

	public String getReserved96100() {
		return reserved96100;
	}

	public void setReserved96100(String reserved96100) {
		this.reserved96100 = reserved96100;
	}

	public String getCrisAlertType() {
		return crisAlertType;
	}

	public void setCrisAlertType(String crisAlertType) {
		this.crisAlertType = crisAlertType;
	}

	public String getCrisAlertScore() {
		return crisAlertScore;
	}

	public void setCrisAlertScore(String crisAlertScore) {
		this.crisAlertScore = crisAlertScore;
	}

	public String getNetworkIdentificationCode() {
		return networkIdentificationCode;
	}

	public void setNetworkIdentificationCode(String networkIdentificationCode) {
		this.networkIdentificationCode = networkIdentificationCode;
	}

	public String getReserved111167() {
		return reserved111167;
	}

	public void setReserved111167(String reserved111167) {
		this.reserved111167 = reserved111167;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}

	public String getMatchingCode() {
		return matchingCode;
	}

	public void setMatchingCode(String matchingCode) {
		this.matchingCode = matchingCode;
	}

	public String getReserved158() {
		return reserved158;
	}

	public void setReserved158(String reserved158) {
		this.reserved158 = reserved158;
	}

	public String getNumberOfPaymentForms() {
		return numberOfPaymentForms;
	}

	public void setNumberOfPaymentForms(String numberOfPaymentForms) {
		this.numberOfPaymentForms = numberOfPaymentForms;
	}

	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getPanToken() {
		return panToken;
	}

	public void setPanToken(String panToken) {
		this.panToken = panToken;
	}

	public String getSpendQualifierIndicator() {
		return spendQualifierIndicator;
	}

	public void setSpendQualifierIndicator(String spendQualifierIndicator) {
		this.spendQualifierIndicator = spendQualifierIndicator;
	}

	public String getTokenRequestorId() {
		return tokenRequestorId;
	}

	public void setTokenRequestorId(String tokenRequestorId) {
		this.tokenRequestorId = tokenRequestorId;
	}

	public String getMoneyTransferForeignExchangeFee() {
		return moneyTransferForeignExchangeFee;
	}

	public String getPaymentAccountReference() {
		return paymentAccountReference;
	}

	public void setPaymentAccountReference(String paymentAccountReference) {
		this.paymentAccountReference = paymentAccountReference;
	}

	public void setMoneyTransferForeignExchangeFee(String moneyTransferForeignExchangeFee) {
		this.moneyTransferForeignExchangeFee = moneyTransferForeignExchangeFee;
	}

	public String getAgentUniqueId() {
		return agentUniqueId;
	}

	public void setAgentUniqueId(String agentUniqueId) {
		this.agentUniqueId = agentUniqueId;
	}

	public String getReserved816() {
		return reserved816;
	}

	public void setReserved816(String reserved816) {
		this.reserved816 = reserved816;
	}

	public String getAcceptanceTerminalIndicator() {
		return acceptanceTerminalIndicator;
	}

	public void setAcceptanceTerminalIndicator(String acceptanceTerminalIndicator) {
		this.acceptanceTerminalIndicator = acceptanceTerminalIndicator;
	}

	public String getCardHolderIdMethod() {
		return cardHolderIdMethod;
	}

	public void setCardHolderIdMethod(String cardHolderIdMethod) {
		this.cardHolderIdMethod = cardHolderIdMethod;
	}
	public String getTokenAssuranceLevel() {
		return tokenAssuranceLevel;
	}

	public void setTokenAssuranceLevel(String tokenAssuranceLevel) {
		this.tokenAssuranceLevel = tokenAssuranceLevel;
	}


	public Integer getCpCode() {
		return cpCode;
	}


	public void setCpCode(Integer cpCode) {
		this.cpCode = cpCode;
	}


	public Boolean getRejected() {
		return rejected;
	}

	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}


	public String getDe37() {
		return de37;
	}


	public void setDe37(String de37) {
		this.de37 = de37;
	}


	public String getDe11() {
		return de11;
	}


	public void setDe11(String de11) {
		this.de11 = de11;
	}


	public String getMatchingSwitch() {
		return matchingSwitch;
	}


	public void setMatchingSwitch(String matchingSwitch) {
		this.matchingSwitch = matchingSwitch;
	}




}
