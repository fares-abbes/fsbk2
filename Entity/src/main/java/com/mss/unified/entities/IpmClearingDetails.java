package com.mss.unified.entities;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.HashMap;

@Entity
@Table(name = "ipm_clearing_details", schema = "FRANSABANK")

public class IpmClearingDetails  {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

  @Column(name = "IPM_CODE", nullable = false)
  public Integer impCode;
  public String treat;
  @Column(name = "DE01")
  public String de01;
  @Column(name = "MTI")
  public String mti;
  @Column(name = "DE02")
  public String de02;
  @Column(name = "DE03_1")
  public String de03S1;
  @Column(name = "DE03_2")
  public String de03S2;
  @Column(name = "DE03_3")
  public String de03S3;
  @Column(name = "DE03")
  public String de03;
  @Column(name = "DE04")
  public double de04;
  @Column(name = "DE05")
  public double de05;
  @Column(name = "DE06")
  public double de06;
  @Column(name = "DE07")
  public String de07;
  @Column(name = "DE08")
  public String de08;
  @Column(name = "DE09")
  public Double de09;

  @Column(name = "DE10")
  public String de10;
  @Column(name = "DE11")
  public String de11;
  @Column(name = "DE12")
  public String de12;
  @Column(name = "DE13")
  public String de13;
  @Column(name = "DE14")
  public String de14;
  @Column(name = "DE15")
  public String de15;
  @Column(name = "DE16")
  public String de16;
  @Column(name = "DE17")
  public String de17;
  @Column(name = "DE18")
  public String de18;


  @Column(name = "DE19")
  public String de19;
  @Column(name = "DE20")
  public String de20;
  @Column(name = "DE21")
  public String de21;
  @Column(name = "DE22")
  public String de22;
  @Column(name = "DE23")
  public String de23;
  @Column(name = "DE24")
  public String de24;
  @Column(name = "DE25")
  public String de25;
  @Column(name = "DE26")
  public String de26;
  @Column(name = "DE27")
  public String de27;

  @Column(name = "DE28")
  public String de28;
  @Column(name = "DE29")
  public String de29;
  @Column(name = "DE30")
  public String de30;
  @Column(name = "DE31")
  public String de31;
  @Column(name = "DE32")
  public String de32;
  @Column(name = "DE33")
  public String de33;
  @Column(name = "DE34")
  public String de34;
  @Column(name = "DE35")
  public String de35;
  @Column(name = "DE36")
  public String de36;

  @Column(name = "DE12_1_DATE")
  public String de12_1Date;
  @Column(name = "DE12_2_TIME")
  public String de12_2Time;

  @Column(name = "DE22_1")
  public String de22_1;
  @Column(name = "DE22_2")
  public String de22_2;
  @Column(name = "DE22_3")
  public String de22_3;
  @Column(name = "DE22_4")
  public String de22_4;

  @Column(name = "DE22_5")
  public String de22_5;
  @Column(name = "DE22_6")
  public String de22_6;
  @Column(name = "DE22_7")
  public String de22_7;
  @Column(name = "DE22_8")
  public String de22_8;

  @Column(name = "DE22_9")
  public String de22_9;
  @Column(name = "DE22_10")
  public String de22_10;
  @Column(name = "DE22_11")
  public String de22_11;
  @Column(name = "DE22_12")
  public String de22_12;

  @Column(name = "DE30_1")
  public String de30_1;
  @Column(name = "DE30_2")
  public String de30_2;


  @Column(name = "DE31_1")
  public String de31_1;
  @Column(name = "DE31_2")
  public String de31_2;
  @Column(name = "DE31_3")
  public String de31_3;
  @Column(name = "DE31_4")
  public String de31_4;
  @Column(name = "DE31_5")
  public String de31_5;

  @Column(name = "DE43_123")
  public String de43_1;

  @Column(name = "DE43_4")
  public String de43_4;
  @Column(name = "DE43_5")
  public String de43_5;
  @Column(name = "DE43_6")
  public String de43_6;

  @Column(name = "DE54_1")
  public String de54_1;
  @Column(name = "DE54_2")
  public String de54_2;
  @Column(name = "DE54_3")
  public String de54_3;
  @Column(name = "DE54_4")
  public String de54_4;
  @Column(name = "DE54_5")
  public String de54_5;

  @Column(name = "DE63_1")
  public String de63_1;
  @Column(name = "DE63_2_TRACE_ID")
  public String de63_2;

  @Column(name = "DE37")
  public String de37;
  @Column(name = "DE38")
  public String de38;
  @Column(name = "DE39")
  public String de39;
  @Column(name = "DE40")
  public String de40;
  @Column(name = "DE41")
  public String de41;
  @Column(name = "DE42")
  public String de42;
  @Column(name = "DE43")
  public String de43;
  @Column(name = "DE44")
  public String de44;
  @Column(name = "DE45")
  public String de45;

  @Column(name = "DE46")
  public String de46;
  @Column(name = "DE47")
  public String de47;
  @Column(name = "DE48", length = 1024)
  public String de48;
  @Column(name = "DE49")
  public String de49;
  @Column(name = "DE50")
  public String de50;
  @Column(name = "DE51")
  public String de51;
  @Column(name = "DE52")
  public String de52;
  @Column(name = "DE53")
  public String de53;
  @Column(name = "DE54")
  public String de54;

  @Column(name = "DE55", length = 1024)
  public String de55;
  @Column(name = "DE56")
  public String de56;
  @Column(name = "DE57")
  public String de57;
  @Column(name = "DE58")
  public String de58;
  @Column(name = "DE59")
  public String de59;
  @Column(name = "DE60")
  public String de60;
  @Column(name = "DE61")
  public String de61;
  @Column(name = "DE62")
  public String de62;
  @Column(name = "DE63")
  public String de63;

  @Column(name = "DE64")
  public String de64;
  @Column(name = "DE65")
  public String de65;
  @Column(name = "DE66")
  public String de66;
  @Column(name = "DE67")
  public String de67;
  @Column(name = "DE68")
  public String de68;
  @Column(name = "DE69")
  public String de69;
  @Column(name = "DE70")
  public String de70;
  @Column(name = "DE71")
  public String de71;
  @Column(name = "DE72")
  public String de72;
  @Column(name = "DE73")
  public String de73;
  @JsonProperty("rejected")
  @Column(name = "REJECTED")
  public  Boolean rejected;
  @Column(name = "DE74")
  public String de74;
  @Column(name = "DE75")
  public String de75;
  @Column(name = "DE76")
  public String de76;
  @Column(name = "DE77")
  public String de77;
  @Column(name = "DE78")
  public String de78;
  @Column(name = "DE79")
  public String de79;
  @Column(name = "DE80")
  public String de80;
  @Column(name = "DE81")
  public String de81;

  @Column(name = "DE82")
  public String de82;
  @Column(name = "DE83")
  public String de83;


  @Column(name = "DE84")
  public String de84;
  @Column(name = "DE85")
  public String de85;
  @Column(name = "DE86")
  public String de86;
  @Column(name = "DE87")
  public String de87;
  @Column(name = "DE88")
  public String de88;
  @Column(name = "DE89")
  public String de89;
  @Column(name = "DE90")
  public String de90;
  @Column(name = "DE91")
  public String de91;
  @Column(name = "DE92")
  public String de92;

  @Column(name = "DE93")
  public String de93;
  @Column(name = "DE94")
  public String de94;
  @Column(name = "DE95")
  public String de95;
  @Column(name = "DE96")
  public String de96;
  @Column(name = "DE97")
  public String de97;
  @Column(name = "DE98")
  public String de98;
  @Column(name = "DE99")
  public String de99;
  @Column(name = "DE100")
  public String de100;
  @Column(name = "DE101")
  public String de101;


  @Column(name = "DE102")
  public String de102;
  @Column(name = "DE103")
  public String de103;
  @Column(name = "DE104")
  public String de104;
  @Column(name = "DE105")
  public String de105;
  @Column(name = "DE106")
  public String de106;
  @Column(name = "DE107")
  public String de107;
  @Column(name = "DE108")
  public String de108;
  @Column(name = "DE109")
  public String de109;
  @Column(name = "DE110")
  public String de110;

  @Column(name = "DE111")
  public String de111;
  @Column(name = "DE112")
  public String de112;
  @Column(name = "DE113")
  public String de113;
  @Column(name = "DE114")
  public String de114;
  @Column(name = "DE115")
  public String de115;
  @Column(name = "DE116")
  public String de116;
  @Column(name = "DE117")
  public String de117;
  @Column(name = "DE118")
  public String de118;
  @Column(name = "DE119")
  public String de119;

  @Column(name = "DE120")
  public String de120;
  @Column(name = "DE121")
  public String de121;
  @Column(name = "DE122")
  public String de122;
  @Column(name = "DE123")
  public String de123;
  @Column(name = "DE124")
  public String de124;
  @Column(name = "DE125")
  public String de125;
  @Column(name = "DE126")
  public String de126;
  @Column(name = "DE127")
  public String de127;
  @Column(name = "DE128")
  public String de128;
  @Column(name = "MATCHING")
  public String matching;
  private String matchingSwitch;
  private String matched;
  private String de37Switch;
  private String de11Switch;
  
  public String getMatching() {
    return matching;
  }

  public void setMatching(String matching) {
    this.matching = matching;
  }

  public HashMap<String, Field> getFields() {
    return fields;
  }

  public void setFields(HashMap<String, Field> fields) {
    this.fields = fields;
  }
  @Column(name = "P0001")
  public String P0001_MAPPING_SERVICE_ACCOUNT_NUMBER;
  @Column(name = "P0002")
  public String P0002_GCMS_PRODUCT_IDENTIFIER;
  @Column(name = "P0003")
  public String P0003_LICENSED_PRODUCT_IDENTIFIER;
  @Column(name = "P0005")
  public String P0005_MESSAGE_ERROR_INDICATOR;
  @Column(name = "P0006")
  public String P0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT;
  @Column(name = "P0023")
  public String P0023_TERMINAL_TYPE;
  @Column(name = "P0025")
  public String P0025_MESSAGE_REVERSAL_INDICATOR;
  @Column(name = "P0026")
  public String P0026_FILE_REVERSAL_INDICATOR;
  @Column(name = "P0043")
  public String P0043_PROGRAM_REGISTRATION_ID;
  @Column(name = "P0052")
  public String P0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR;
  @Column(name = "P0056")
  public String P0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR;
  @Column(name = "P0057")
  public String P0057_TRANSACTION_CATEGORY_INDICATOR;
  @Column(name = "P0105")
  public String P0105_FILE_ID;
  @Column(name = "P0110")
  public String P0110_TRANSMISSION_ID;
  @Column(name = "P0122")
  public String P0122_PROCESSING_MODE;
  @Column(name = "P0137")
  public String P0137_FEE_COLLECTION_CONTROL_NUMBER;
  @Column(name = "P0138")
  public String P0138_SOURCE_MESSAGE_NUMBERID;
  @Column(name = "P0146")
  public String P0146_AMOUNTS_TRANSACTION_FEE;
  @Column(name = "P0148")
  public String P0148_CURRENCY_EXPONENTS;
  @Column(name = "P0149")
  public String P0149_CURRENCY_CODES_AMOUNTS_ORIGINAL;
  @Column(name = "P0158")
  public String P0158_AMOUNTS_TRANSACTION_FEE;
  @Column(name = "P0159")
  public String P0159_SETTELMENT_DATA;
  @Column(name = "P0160")
  public String P0160_SETTELMENT_DATA_MULTIPLE;
  @Column(name = "P0164")
  public String P0164_CURRENCY_CROSS_RATES;
  @Column(name = "P0165")
  public String P0165_SETTELMENT_INDICATOR;
  @Column(name = "P0170")
  public String P0170_CARD_ACCEPTOR_INQUIRY_INFO;
  @Column(name = "P0171")
  public String P0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA;
  @Column(name = "P0172")
  public String P0172_SOLE_PROPRIETOR_NAME;
  @Column(name = "P0173")
  public String P0173_LEGAL_CORPORATE_NAME;
  @Column(name = "P0174")
  public String P0174_DUN_BRADSTREET_NUMBER;
  @Column(name = "P0175")
  public String P0175_CARD_ACCEPTOR_URL;
  @Column(name = "P0176")
  public String P0176_MASTERCARD_ASSIGNED_ID;
  @Column(name = "P0177")
  public String P0177_CROSS_BORDER;
  @Column(name = "P0178")
  public String P0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2;
  @Column(name = "P0189")
  public String P0189_POI_PHONE_DATA;
  @Column(name = "P0190")
  public String P0190_PARTNER_ID_CODE;
  @Column(name = "P0191")
  public String P0191_ORIGINATING_MESSFORMAT;
  @Column(name = "P0192")
  public String P0192_PAYMENT_TRANSACTION_INITIATOR;
  @Column(name = "P0195")
  public String P0195_INSTALLMENT_DATA;
  @Column(name = "P0196")
  public String P0196_MOBILE_PHONE_RELOAD_DATA;
  @Column(name = "P0197")
  public String P0197_NATIONAL_USE_TAX_DATA;
  @Column(name = "P0228")
  public String P0228_RETRIEVAL_DOCUMENT_CODE;
  @Column(name = "P0230")
  public String P0230_FULFILLEMENT_DOCUMENT_CODE;
  @Column(name = "P0241")
  public String P0241_MASTERCOM_CONTROL_NUMBER;
  @Column(name = "P0243")
  public String P0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  @Column(name = "P0244")
  public String P0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES;
  @Column(name = "P0245")
  public String P0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE;
  @Column(name = "P0246")
  public String P0246_MASTERCOM_SENDER_MEMO;
  @Column(name = "P0247")
  public String P0247_MASTERCOM_RECEIVER_MEMO;
  @Column(name = "P0248")
  public String P0248_MASTERCOM_IMAGE_REVIEW_MEMO;
  @Column(name = "P0249")
  public String P0249_MASTERCOM_RECORD_ID;
  @Column(name = "P0250")
  public String P0250_MASTERCOM_ENDPOINTS;
  @Column(name = "P0251")
  public String P0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE;
  @Column(name = "P0252")
  public String P0252_MASTERCOM_IMAGE_METADATA;
  @Column(name = "P0253")
  public String P0253_MASTERCOM_SYSTEM_ENHANCED_DATA;
  @Column(name = "P0254")
  public String P0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  @Column(name = "P0255")
  public String P0255_MASTERCOM_MESSAGE_TYPE;
  @Column(name = "P0260")
  public String P0260_EDIT_EXCLUSION_INDICATOR;
  @Column(name = "P0261")
  public String P0261_RISK_MANAGEMENT_APPROVAL_CODE;
  @Column(name = "P0262")
  public String P0262_DOCUMENTATION_INDICATOR;
  @Column(name = "P0264")
  public String P0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST;
  @Column(name = "P0265")
  public String P0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA;
  @Column(name = "P0266")
  public String P0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  @Column(name = "P0267")
  public String P0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  @Column(name = "P0268")
  public String P0268_AMOUNT_PARTIAL_TRANSACTION;
  @Column(name = "P0280")
  public String P0280_SOURCE_FILE_ID;
  @Column(name = "P0300")
  public String P0300_RECONCILED_FILE;
  @Column(name = "P0301")
  public String P0301_FILE_AMOUNT_CHECKSUM;
  @Column(name = "P0302")
  public String P0302_RECONCILED_MEMBER_ACTIVITY;
  @Column(name = "P0306")
  public String P0306_FILE_MESSAGE_COUNTS;
  @Column(name = "P0358")
  public String P0358_RECONCILED_BUSINESS_ACTIVITY;
  @Column(name = "P0359")
  public String P0359_RECONCILED_SETTLEMENT_ACTIVITY;
  @Column(name = "P0367")
  public String P0367_RECONCILED_CARD_PROGRAM_IDENTIFIER;
  @Column(name = "P0368")
  public String P0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE;
  @Column(name = "P0369")
  public String P0369_RECONCILED_ACQUIRER_BIN;
  @Column(name = "P0370")
  public String P0370_RECONCILED_ACCOUNT_RANGE;
  @Column(name = "P0372")
  public String P0372_RECONCILED_TRANSACTION_FUNCTION;
  @Column(name = "P0374")
  public String P0374_RECONCILED_PROCESSING_CODE;
  @Column(name = "P0375")
  public String P0375_MEMBER_RECONCILIATION_INDICATOR1;
  @Column(name = "P0378")
  public String P0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR;
  @Column(name = "P0380")
  public String P0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  @Column(name = "P0381")
  public String P0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  @Column(name = "P0384")
  public String P0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY;
  @Column(name = "P0390")
  public String P0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  @Column(name = "P0391")
  public String P0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  @Column(name = "P0392")
  public String P0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  @Column(name = "P0393")
  public String P0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  @Column(name = "P0394")
  public String P0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY;
  @Column(name = "P0395")
  public String P0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY;
  @Column(name = "P0396")
  public String P0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY;
  @Column(name = "P0400")
  public String P0400_DEBIT_TRANSACTION_NUMBER;
  @Column(name = "P0401")
  public String P0401_CREDIT_TRANSACTION_NUMBER;
  @Column(name = "P0402")
  public String P0402_TOTAL_TRANSACTION_NUMBER;
  @Column(name = "P0501")
  public String P0501_TRANSACTION_DESCRIPTION;
  @Column(name = "P0502")
  public String P0502_CUSTOMER_IDENTIFIER;
  @Column(name = "P0503")
  public String P0503_TRAVEL_AGENCY_SEQUENCE_NUMBER;
  @Column(name = "P0504")
  public String P0504_TRAVEL_AGENCY_FEE;
  @Column(name = "P0505")
  public String P0505_PASSENGER_NAME;
  @Column(name = "P0506")
  public String P0506_TICKET_NUMBER;
  @Column(name = "P0507")
  public String P0507_ISSUING_CARRIER;
  @Column(name = "P0508")
  public String P0508_CUSTOMER_CODE;
  @Column(name = "P0509")
  public String P0509_ISSUE_DATE;
  @Column(name = "P0510")
  public String P0510_TRAVEL_AGENCY_CODE;
  @Column(name = "P0511")
  public String P0511_TRAVEL_AGENCY_NAME;
  @Column(name = "P0512")
  public String P0512_TOTAL_FARE;
  @Column(name = "P0513")
  public String P0513_TOTAL_FEES;
  @Column(name = "P0514")
  public String P0514_TOTAL_TAXES;
  @Column(name = "P0515")
  public String P0515_ADDITIONAL_CARD_ACCEPTOR_INFO;
  @Column(name = "P0516")
  public String P0516_AUSTIN_TETRA_NUMBER;
  @Column(name = "P0517")
  public String P0517_NAICS_CODE;
  @Column(name = "P0518")
  public String P0518_LIEN_ITEM_DATE;
  @Column(name = "P0519")
  public String P0519_ADDITIONAL_FUEL_LOCATION_INFORMATION;
  @Column(name = "P0520")
  public String P0520_TRAVEL_DATE;
  @Column(name = "P0521")
  public String P0521_CARRIER_CODE;
  @Column(name = "P0522")
  public String P0522_SERVICE_CLASS_CODE;
  @Column(name = "P0523")
  public String P0523_CITY_ORIGIN_AIRPORT_CODE;
  @Column(name = "P0524")
  public String P0524_CITY_DESTINATION_AIRPORT_CODE;
  @Column(name = "P0525")
  public String P0525_STOP_OVER_CODE;
  @Column(name = "P0526")
  public String P0526_CONJUNCTION_TICKET;
  @Column(name = "P0527")
  public String P0527_EXCHANGE_TICKET;
  @Column(name = "P0528")
  public String P0528_COUPON_NUMBER;
  @Column(name = "P0529")
  public String P0529_FARE_BASIS_CODE;
  @Column(name = "P0530")
  public String P0530_FLIGHT_NUMBER;
  @Column(name = "P0531")
  public String P0531_DEPARTURE_TIME;
  @Column(name = "P0532")
  public String P0532_TOTAL_CHARGES;
  @Column(name = "P0533")
  public String P0533_ARRIVAL_TIME;
  @Column(name = "P0534")
  public String P0534_TOTAL_NON_ROOM_CHARGES;
  @Column(name = "P0535")
  public String P0535_FARE;
  @Column(name = "P0536")
  public String P0536_FEE;
  @Column(name = "P0537")
  public String P0537_TAXES;
  @Column(name = "P0538")
  public String P0538_ENDORSEMENT_RESTRICTIONS;
  @Column(name = "P0539")
  public String P0539_TOTAL_AMOUNT_CHARGED_ON_CARD;
  @Column(name = "P0540")
  public String P0540_ROOM_SERVICE_CHARGES;
  @Column(name = "P0541")
  public String P0541_LOUNGE_BAR_CHARGES;
  @Column(name = "P0543")
  public String P0543_TRANSAPORTATION_CHARGES;
  @Column(name = "P0544")
  public String P0544_RENTAL_AGREEMENT_NUMBER;
  @Column(name = "P0545")
  public String P0545_RENTER_NAME;
  @Column(name = "P0546")
  public String P0546_RENTAL_RETURN_CITY;
  @Column(name = "P0547")
  public String P0547_RENTAL_RETURN_STATE_PROVINCE;
  @Column(name = "P0548")
  public String P0548_RENTAL_RETURN_LOCALTION_COUNTRY;
  @Column(name = "P0550")
  public String P0550_RENTAL_RETURN_DATE;
  @Column(name = "P0551")
  public String P0551_RENTAL_CHECKOUT_DATE;
  @Column(name = "P0552")
  public String P0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER;
  @Column(name = "P0553")
  public String P0553_RENTAL_RATE;
  @Column(name = "P0554")
  public String P0554_CONFERENCE_ROOM_CHARGES;
  @Column(name = "P0555")
  public String P0555_RATE_PER_MILE_OR_KM;
  @Column(name = "P0556")
  public String P0556_TOTAL_MILES_OR_KM;
  @Column(name = "P0557")
  public String P0557_MAXIMUM_FREE_MILES_OR_KM;
  @Column(name = "P0558")
  public String P0558_MILES_KM_INDICATOR;
  @Column(name = "P0559")
  public String P0559_VEHICULE_INSURANCE;
  @Column(name = "P0560")
  public String P0560_AUDIO_VISUAL_CHARGES;
  @Column(name = "P0561")
  public String P0561_ADJUSTED_AMOUNT;
  @Column(name = "P0562")
  public String P0562_BANQUET_CHARGES;
  @Column(name = "P0563")
  public String P0563_PROGRAM_CODE;
  @Column(name = "P0564")
  public String P0564_RENTAL_LOCATION_CITY;
  @Column(name = "P0565")
  public String P0565_RENTAL_LOCATION_STATE;
  @Column(name = "P0566")
  public String P0566_RENTAL_LOCATION_COUNTRY;
  @Column(name = "P0567")
  public String P0567_RENTAL_LOCATION_ID;
  @Column(name = "P0568")
  public String P0568_RENTAL_CLASS_ID;
  @Column(name = "P0569")
  public String P0569_INTERNET_ACCESS_CHARGES;
  @Column(name = "P0570")
  public String P0570_EARLY_DEPARTURE_CHARGES;
  @Column(name = "P0571")
  public String P0571_GUEST_NAME;
  @Column(name = "P0572")
  public String P0572_GUEST_NUMBER;
  @Column(name = "P0573")
  public String P0573_INVOICE_NUMBER;
  @Column(name = "P0574")
  public String P0574_ARRIVAL_DATE;
  @Column(name = "P0575")
  public String P0575_DEPARTURE_DATE;
  @Column(name = "P0576")
  public String P0576_FOLIO_NUMBER;
  @Column(name = "P0577")
  public String P0577_PROPERTY_PHONE_NUMBER;
  @Column(name = "P0578")
  public String P0578_BILLING_ADJUSTMENT;
  @Column(name = "P0579")
  public String P0579_INVOICE_DATE;
  @Column(name = "P0580")
  public String P0580_ROOM_RATE;
  @Column(name = "P0581")
  public String P0581_TOTAL_ROOM_TAX;
  @Column(name = "P0582")
  public String P0582_PROGRAM_CODE;
  @Column(name = "P0583")
  public String P0583_PHONE_CHARGES;
  @Column(name = "P0584")
  public String P0584_RESTAURANT_CHARGES;
  @Column(name = "P0585")
  public String P0585_MINI_BAR_CHARGES;
  @Column(name = "P0586")
  public String P0586_GIFT_SHOP_CHARGES;
  @Column(name = "P0587")
  public String P0587_LAUNDRY_DRY_CLEANING_CHARGES;
  @Column(name = "P0588")
  public String P0588_OTHER_SERVICES;
  @Column(name = "P0589")
  public String P0589_INVOICE_CREATION_DATE_TIME;
  @Column(name = "P0590")
  public String P0590_PARTY_IDENTIFICATION;
  @Column(name = "P0591")
  public String P0591_PARTY_NAME;
  @Column(name = "P0592")
  public String P0592_PARTY_ADDRESS;
  @Column(name = "P0593")
  public String P0593_PARTY_POSTAL_INFO;
  @Column(name = "P0594")
  public String P0594_PARTY_CONTACT;
  @Column(name = "P0595")
  public String P0595_CARD_ACCEPTOR_TYPE;
  @Column(name = "P0596")
  public String P0596_CARD_ACCEPTOR_TAX_ID;
  @Column(name = "P0597")
  public String P0597_TOTAL_TAX_AMOUNT;
  @Column(name = "P0598")
  public String P0598_TOTAL_TAX_COLLECTED_INDICATOR;
  @Column(name = "P0599")
  public String P0599_CORPORATION_VAT_NUMBER;
  @Column(name = "P0600")
  public String P0600_CARD_ACCEPTOR_REFERENCE_NUMBER;
  @Column(name = "P0601")
  public String P0601_PARTY_NATURE_FILING;
  @Column(name = "P0602")
  public String P0602_PARTY_SUPPLEMENTAL_DATA1;
  @Column(name = "P0603")
  public String P0603_PARTY_SUPPLEMENTAL_DATA2;
  @Column(name = "P0604")
  public String P0604_TRANSATION_SUPPLIMENTAL_DATA1;
  @Column(name = "P0605")
  public String P0605_TRANSACTION_SUPPLIMENTAL_DATA2;
  @Column(name = "P0606")
  public String P0606_FREIGHT_AMOUNT;
  @Column(name = "P0607")
  public String P0607_DUTY_AMOUNT;
  @Column(name = "P0608")
  public String P0608_DESTINATION_POSTAL_CODE;
  @Column(name = "P0609")
  public String P0609_DESTINATION_STATE_CODE;
  @Column(name = "P0610")
  public String P0610_DESTINATION_COUNTRY_CODE;
  @Column(name = "P0611")
  public String P0611_SEQUENCE_NUMBER;
  @Column(name = "P0612")
  public String P0612_SHIP_DATE;
  @Column(name = "P0613")
  public String P0613_SHIP_FROM_POSTAL_CODE;
  @Column(name = "P0614")
  public String P0614_ORDER_DATE;
  @Column(name = "P0615")
  public String P0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER;
  @Column(name = "P0616")
  public String P0616_CONTRACT_NUMBER;
  @Column(name = "P0617")
  public String P0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER;
  @Column(name = "P0619")
  public String P0619_USER_NAME;
  @Column(name = "P0620")
  public String P0620_OIL_COMPANY_BRAND_NAME;
  @Column(name = "P0621")
  public String P0621_PURCHASE_TIME;
  @Column(name = "P0622")
  public String P0622_MOTOR_FUEL_SERVICE_TYPE;
  @Column(name = "P0623")
  public String P0623_MOTOR_FUEL_INFO;
  @Column(name = "P0624")
  public String P0624_USER_ACCOUNT_NUMBER;
  @Column(name = "P0625")
  public String P0625_USER_TELEPHONE_NUMBER;
  @Column(name = "P0626")
  public String P0626_BILLING_STATEMENT_PERIOD;
  @Column(name = "P0627")
  public String P0627_BILLING_EVENT1;
  @Column(name = "P0628")
  public String P0628_BILLING_EVENT2;
  @Column(name = "P0629")
  public String P0629_ODOMETER_READING;
  @Column(name = "P0630")
  public String P0630_VEHICLE_NUMBER;
  @Column(name = "P0631")
  public String P0631_DRIVER_NUMBERID_NUMBER;
  @Column(name = "P0632")
  public String P0632_PRODUCT_TYPE_CODE;
  @Column(name = "P0633")
  public String P0633_COUPON_DISCOUNT_AMOUNT;
  @Column(name = "P0634")
  public String P0634_TAX_AMOUNT1;
  @Column(name = "P0635")
  public String P0635_TAX_AMOUNT2;
  @Column(name = "P0636")
  public String P0636_CALL_DATE;
  @Column(name = "P0637")
  public String P0637_CALL_TIME;
  @Column(name = "P0638")
  public String P0638_CALL_TO_INFO;
  @Column(name = "P0639")
  public String P0639_CALL_DURATION;
  @Column(name = "P0640")
  public String P0640_CALL_TIME_PERIOD;
  @Column(name = "P0641")
  public String P0641_PRODUCT_CODE;
  @Column(name = "P0642")
  public String P0642_ITEM_DESCRIPTION;
  @Column(name = "P0643")
  public String P0643_ITEM_QUANTITY;
  @Column(name = "P0644")
  public String P0644_CALL_FROM_INFO;
  @Column(name = "P0645")
  public String P0645_ITEM_UNIT_OF_MEASURE;
  @Column(name = "P0646")
  public String P0646_UNTI_PRICE;
  @Column(name = "P0647")
  public String P0647_EXTENDED_ITEM_AMOUNT;
  @Column(name = "P0648")
  public String P0648_ITEM_DISCOUNT;
  @Column(name = "P0649")
  public String P0649_CALL_USAGE_AMOUNT;
  @Column(name = "P0650")
  public String P0650_ZERO_COST_TO_CUSTOMER_INDICATOR;
  @Column(name = "P0651")
  public String P0651_PROCEDURE_ID;
  @Column(name = "P0652")
  public String P0652_SERVICE_TYPE;
  @Column(name = "P0653")
  public String P0653_SERVICE_AMOUNT;
  @Column(name = "P0654")
  public String P0654_DEBIT_OR_CREDIT_INDICATOR;
  @Column(name = "P0655")
  public String P0655_CALL_LONG_DISTANCE_AMOUNT;
  @Column(name = "P0656")
  public String P0656_FULL_VAT_AMOUNTS;
  @Column(name = "P0657")
  public String P0657_HALF_VAT_AMOUNTS;
  @Column(name = "P0658")
  public String P0658_CALL_CONNECT_AMOUNT;
  @Column(name = "P0659")
  public String P0659_OTHER_DESCRIPTION;
  @Column(name = "P0660")
  public String P0660_CUSTOMER_REFERENCE;
  @Column(name = "P0661")
  public String P0661_TRAFFIC_CODE;
  @Column(name = "P0662")
  public String P0662_SAMPLE_NUMBER;
  @Column(name = "P0663")
  public String P0663_FREE_FROM_DESCRIPTION;
  @Column(name = "P0664")
  public String P0664_START_STATION;
  @Column(name = "P0665")
  public String P0665_DESTINATION_STATION;
  @Column(name = "P0667")
  public String P0667_GENERIC_DATA;
  @Column(name = "P0668")
  public String P0668_REDUCTION_DATA;
  @Column(name = "P0669")
  public String P0669_TRANSPORTATION_OTHER_CODE;
  @Column(name = "P0670")
  public String P0670_PAYER_USER_NAME;
  @Column(name = "P0671")
  public String P0671_DATE_OF_FUNDS_REQUESTED;
  @Column(name = "P0672")
  public String P0672_RECIPIENT_NAME;
  @Column(name = "P0673")
  public String P0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS;
  @Column(name = "P0674")
  public String P0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR;
  @Column(name = "P0675")
  public String P0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA;
  @Column(name = "P0676")
  public String P0676_CARD_ACCEPTOR_VAT_NUMBER;
  @Column(name = "P0677")
  public String P0677_CUSTOMER_VAT_NUMBER;
  @Column(name = "P0678")
  public String P0678_UNIQUE_INVOICE_NUMBER;
  @Column(name = "P0679")
  public String P0679_COMMODITY_CODE;
  @Column(name = "P0680")
  public String P0680_AUTHORIZED_CONTACT_NAME;
  @Column(name = "P0681")
  public String P0681_AUTHORIZED_CONTACT_PHONE;
  @Column(name = "P0682")
  public String P0682_DETAIL_TAX_AMOUNT1;
  @Column(name = "P0683")
  public String P0683_DETAIL_TAX_AMOUNT2;
  @Column(name = "P0684")
  public String P0684_DETAIL_TAX_AMOUNT3;
  @Column(name = "P0685")
  public String P0685_TYPE_OF_SUPPLY;
  @Column(name = "P0686")
  public String P0686_TAX_EXEMPT_INDICATOR;
  @Column(name = "P0687")
  public String P0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER;
  @Column(name = "P0690")
  public String P0690_NO_SHOW_INDICATOR;
  @Column(name = "P0691") 
  public String P0691_DAYS_RENTED;
  @Column(name = "P0692")
  public String P0692_WEEKLY_RENTAL_AMOUNT;
  @Column(name = "P0693")
  public String P0693_TOTAL_AUTHORIZED_AMOUNT;
  @Column(name = "P0694")
  public String P0694_ONE_WAY_DROPOFF_CHARGE;
  @Column(name = "P0695")
  public String P0695_REGULAR_MILEAGE_CHARGE;
  @Column(name = "P0696")
  public String P0696_EXTRA_MILEAGE_CHARGE;
  @Column(name = "P0697")
  public String P0697_LATE_CHARGE;
  @Column(name = "P0698")
  public String P0698_FUEL_CHARGE;
  @Column(name = "P0699")
  public String P0699_LODGING_TOTAL_TAX_AMOUNT;
  @Column(name = "P0700")
  public String P0700_TOWING_CHARGES;
  @Column(name = "P0701")
  public String P0701_EXTRA_CHARGES;
  @Column(name = "P0702")
  public String P0702_OTHER_CHARGES;
  @Column(name = "P0703")
  public String P0703_TOTAL_ROOM_NIGHTS;
  @Column(name = "P0704")
  public String P0704_PREPAID_EXPENSES;
  @Column(name = "P0705")
  public String P0705_TOTAL_NONROOM_TAX_AMOUNT;
  @Column(name = "P0706")
  public String P0706_CASH_ADVANCES;
  @Column(name = "P0707")
  public String P0707_VALET_CHARGES;
  @Column(name = "P0708")
  public String P0708_MOVIE_CHARGES;
  @Column(name = "P0709")
  public String P0709_BUSINESS_CENTER_CHARGE;
  @Column(name = "P0710")
  public String P0710_HEALTH_CLUB_CHARGES;
  @Column(name = "P0711")
  public String P0711_FIRE_SAFETY_ACT_INDICATOR;
  @Column(name = "P0712")
  public String P0712_NET_FUEL_PRICE;
  @Column(name = "P0713")
  public String P0713_RESTRICTED_TICKET_INDICATOR;
  @Column(name = "P0714")
  public String P0714_EXCHANGE_TICKET_AMOUNT;
  @Column(name = "P0715")
  public String P0715_EXCHANGE_FEE_AMOUNT;
  @Column(name = "P0716")
  public String P0716_TRAVEL_AUTHORIZATION_CODE;
  @Column(name = "P0717")
  public String P0717_IATA_CLIENT_CODE;
  @Column(name = "P0718")
  public String P0718_EMPLOYEE_TEMP_NAME_ID;
  @Column(name = "P0719")
  public String P0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID;
  @Column(name = "P0720")
  public String P0720_JOB_DESCRIPTION;
  @Column(name = "P0721")
  public String P0721_JOB_CODE;
  @Column(name = "P0722")
  public String P0722_FLAT_RATE_INDICATOR;
  @Column(name = "P0723")
  public String P0723_REGULAR_HOURS_WORKED;
  @Column(name = "P0724")
  public String P0724_REGULAR_HOURS_RATE;
  @Column(name = "P0725")
  public String P0725_OVERTIME_HOURS_WORKED;
  @Column(name = "P0726")
  public String P0726_OVERTIME_HOURS_RATE;
  @Column(name = "P0727")
  public String P0727_TEMP_START_DATE;
  @Column(name = "P0728")
  public String P0728_TEMP_WEEK_ENDING;
  @Column(name = "P0729")
  public String P0729_REQUESTOR_NAMEID;
  @Column(name = "P0730")
  public String P0730_SUPERVISOR_REPORTS;
  @Column(name = "P0731")
  public String P0731_TIME_SHEET_NUMBER;
  @Column(name = "P0732")
  public String P0732_DISCOUNT_AMOUNT;
  @Column(name = "P0733")
  public String P0733_SUBTOTAL_AMOUNT;
  @Column(name = "P0734")
  public String P0734_MISCELLANEOUS_EXPENSES;
  @Column(name = "P0735")
  public String P0735_SERVICE_DESCRIPTOR_CODE;
  @Column(name = "P0736")
  public String P0736_TRACKING_NUMBER_PICKUP_NUMBER;
  @Column(name = "P0737")
  public String P0737_SHIPPING_NET_AMOUNTS;
  @Column(name = "P0738")
  public String P0738_INCENTIVE_AMOUNT;
  @Column(name = "P0739")
  public String P0739_PICKUP_DATE;
  @Column(name = "P0740")
  public String P0740_DELIVERY_DATE;
  @Column(name = "P0741")
  public String P0741_NUMBER_PACKAGES;
  @Column(name = "P0742")
  public String P0742_PACKAGE_WEIGHT;
  @Column(name = "P0743")
  public String P0743_UNTI_OF_MEASURE;
  @Column(name = "P0744")
  public String P0744_SHIPPING_PARTY_INFO;
  @Column(name = "P0745")
  public String P0745_SHIPPING_PARTY_ADDRESS;
  @Column(name = "P0746")
  public String P0746_SHIPPING_PARTY_POSTAL_INFO;
  @Column(name = "P0747")
  public String P0747_SHIPPING_PARTY_CONTACT;
  @Column(name = "P0748")
  public String P0748_DELIVERY_PARTY_INFO;
  @Column(name = "P0749")
  public String P0749_DELIVERY_PARTY_ADDRESS_INFO;
  @Column(name = "P0750")
  public String P0750_DELIVERY_PARTY_POSTAL_INFO;
  @Column(name = "P0751")
  public String P0751_DETAIL_TAX_AMOUNT4;
  @Column(name = "P0752")
  public String P0752_DETAIL_TAX_AMOUNT5;
  @Column(name = "P0753")
  public String P0753_DETAIL_TAX_AMOUNT6;
  @Column(name = "P0754")
  public String P0754_DELIVERY_PARTY_CONTACT;
  @Column(name = "P0755")
  public String P0755_LINE_ITEM_TOTAL_AMOUNT;
  @Column(name = "P0756")
  public String P0756_PASSENGER_DESCRIPTION;
  @Column(name = "P0757")
  public String P0757_TRANSPORTATION_SERVICE_PROVIDER;
  @Column(name = "P0758")
  public String P0758_TRANSPORTATION_SERVICES_OFERED;
  @Column(name = "P0759")
  public String P0759_DELIVERY_ORDER_NUMBER;
  @Column(name = "P0760")
  public String P0760_CREDIT_CARD_SLIP_NUMBER;
  @Column(name = "P0761")
  public String P0761_TRAVEL_AGENCY_ID;
  @Column(name = "P0762")
  public String P0762_DATA_SOURCE;
  @Column(name = "P0763")
  public String P0763_VAT_SUPPRESSION_INDICATOR;
  @Column(name = "P0799")
  public String P0799_TEST_CASE_TRACEABILITY_INDENTIFIERS;
  @Column(name = "P1000")
  public String P1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA;
  public String compensation;
  @Column(name = "statusChargeback")
  public Integer statusChargeback;
  @Column(name = "transaction_code")
  private String transactionCode;
  private String constatation;
  private String dateTraitement;

  @Column(name = "LAST_DATE_ENVOI_MAIL")
  private LocalDateTime lastDateEnvoiMail;

	public String getDateTraitement() {
	return dateTraitement;
}

public void setDateTraitement(String dateTraitement) {
	this.dateTraitement = dateTraitement;
}
	private String messageReject;
  private String compteBeneficiaire;
  private String excedentType;
  private Boolean preauth = false ;
  private Double preauthAmount  ;
  private String cardholderCurrencyCode;
  private String FileDate;
  @Transient
  private String nbrJours;
	  
	  public String getMessageReject() {
		return messageReject;
	}
	
	public void setMessageReject(String messageReject) {
		this.messageReject = messageReject;
	}
	
	private Integer cpCode;
	private LocalDateTime dateSaisieChargeback;
    @Transient
	private String clearingDate;
	  public String getConstatation() {
		return constatation;
	}
	
	public void setConstatation(String constatation) {
		this.constatation = constatation;
	}

public Integer getStatusChargeback() {
	return statusChargeback;
}

public void setStatusChargeback(Integer statusChargeback) {
	this.statusChargeback = statusChargeback;
}

public String getCompensation() {
	return compensation;
}

public void setCompensation(String compensation) {
	this.compensation = compensation;
}
public Integer summaryCode;

  public Integer getSummaryCode() {
    return summaryCode;
  }

  public void setSummaryCode(Integer summaryCode) {
    this.summaryCode = summaryCode;
  }




public String getDe12_1Date() {
    return de12_1Date;
  }

  public void setDe12_1Date(String de12_1Date) {
    this.de12_1Date = de12_1Date;
  }

  public String getDe12_2Time() {
    return de12_2Time;
  }

  public void setDe12_2Time(String de12_2Time) {
    this.de12_2Time = de12_2Time;
  }

  public String getDe22_1() {
    return de22_1;
  }

  public void setDe22_1(String de22_1) {
    this.de22_1 = de22_1;
  }

  public String getDe22_2() {
    return de22_2;
  }

  public void setDe22_2(String de22_2) {
    this.de22_2 = de22_2;
  }

  public String getDe22_3() {
    return de22_3;
  }

  public void setDe22_3(String de22_3) {
    this.de22_3 = de22_3;
  }

  public String getDe22_4() {
    return de22_4;
  }

  public void setDe22_4(String de22_4) {
    this.de22_4 = de22_4;
  }

  public String getDe22_5() {
    return de22_5;
  }

  public void setDe22_5(String de22_5) {
    this.de22_5 = de22_5;
  }

  public String getDe22_6() {
    return de22_6;
  }

  public void setDe22_6(String de22_6) {
    this.de22_6 = de22_6;
  }

  public String getDe22_7() {
    return de22_7;
  }

  public void setDe22_7(String de22_7) {
    this.de22_7 = de22_7;
  }

  public String getDe22_8() {
    return de22_8;
  }

  public void setDe22_8(String de22_8) {
    this.de22_8 = de22_8;
  }

  public String getDe22_9() {
    return de22_9;
  }

  public void setDe22_9(String de22_9) {
    this.de22_9 = de22_9;
  }

  public String getDe22_10() {
    return de22_10;
  }

  public void setDe22_10(String de22_10) {
    this.de22_10 = de22_10;
  }

  public String getDe22_11() {
    return de22_11;
  }

  public void setDe22_11(String de22_11) {
    this.de22_11 = de22_11;
  }

  public String getDe22_12() {
    return de22_12;
  }

  public void setDe22_12(String de22_12) {
    this.de22_12 = de22_12;
  }

  public String getDe30_1() {
    return de30_1;
  }

  public void setDe30_1(String de30_1) {
    this.de30_1 = de30_1;
  }

  public String getDe30_2() {
    return de30_2;
  }

  public void setDe30_2(String de30_2) {
    this.de30_2 = de30_2;
  }

  public String getDe31_1() {
    return de31_1;
  }

  public void setDe31_1(String de31_1) {
    this.de31_1 = de31_1;
  }

  public String getDe31_2() {
    return de31_2;
  }

  public void setDe31_2(String de31_2) {
    this.de31_2 = de31_2;
  }

  public String getDe31_3() {
    return de31_3;
  }

  public void setDe31_3(String de31_3) {
    this.de31_3 = de31_3;
  }

  public String getDe31_4() {
    return de31_4;
  }

  public void setDe31_4(String de31_4) {
    this.de31_4 = de31_4;
  }

  public String getDe31_5() {
    return de31_5;
  }

  public void setDe31_5(String de31_5) {
    this.de31_5 = de31_5;
  }

  public String getDe43_1() {
    return de43_1;
  }

  public void setDe43_1(String de43_1) {
    this.de43_1 = de43_1;
  }

  public String getDe43_4() {
    return de43_4;
  }

  public void setDe43_4(String de43_4) {
    this.de43_4 = de43_4;
  }

  public String getDe43_5() {
    return de43_5;
  }

  public void setDe43_5(String de43_5) {
    this.de43_5 = de43_5;
  }

  public String getDe43_6() {
    return de43_6;
  }

  public void setDe43_6(String de43_6) {
    this.de43_6 = de43_6;
  }

  public String getDe54_1() {
    return de54_1;
  }

  public void setDe54_1(String de54_1) {
    this.de54_1 = de54_1;
  }

  public String getDe54_2() {
    return de54_2;
  }

  public void setDe54_2(String de54_2) {
    this.de54_2 = de54_2;
  }

  public String getDe54_3() {
    return de54_3;
  }

  public void setDe54_3(String de54_3) {
    this.de54_3 = de54_3;
  }

  public String getDe54_4() {
    return de54_4;
  }

  public void setDe54_4(String de54_4) {
    this.de54_4 = de54_4;
  }

  public String getDe54_5() {
    return de54_5;
  }

  public void setDe54_5(String de54_5) {
    this.de54_5 = de54_5;
  }

  public String getDe03S1() {
    return de03S1;
  }

  public void setDe03S1(String de03S1) {
    this.de03S1 = de03S1;
  }

  public String getDe03S2() {
    return de03S2;
  }

  public void setDe03S2(String de03S2) {
    this.de03S2 = de03S2;
  }

  public String getDe03S3() {
    return de03S3;
  }

  public void setDe03S3(String de03S3) {
    this.de03S3 = de03S3;
  }

  public String getDe63_1() {
    return de63_1;
  }

  public void setDe63_1(String de63_1) {
    this.de63_1 = de63_1;
  }

  public String getDe63_2() {
    return de63_2;
  }

  public void setDe63_2(String de63_2) {
    this.de63_2 = de63_2;
  }

  public String getP0529_FARE_BASIS_CODE() {
    return P0529_FARE_BASIS_CODE;
  }

  public void setP0529_FARE_BASIS_CODE(String p0529_FARE_BASIS_CODE) {
    P0529_FARE_BASIS_CODE = p0529_FARE_BASIS_CODE;
  }

  public String getP0530_FLIGHT_NUMBER() {
    return P0530_FLIGHT_NUMBER;
  }

  public void setP0530_FLIGHT_NUMBER(String p0530_FLIGHT_NUMBER) {
    P0530_FLIGHT_NUMBER = p0530_FLIGHT_NUMBER;
  }

  public String getP0531_DEPARTURE_TIME() {
    return P0531_DEPARTURE_TIME;
  }

  public void setP0531_DEPARTURE_TIME(String p0531_DEPARTURE_TIME) {
    P0531_DEPARTURE_TIME = p0531_DEPARTURE_TIME;
  }

  public String getP0532_TOTAL_CHARGES() {
    return P0532_TOTAL_CHARGES;
  }

  public void setP0532_TOTAL_CHARGES(String p0532_TOTAL_CHARGES) {
    P0532_TOTAL_CHARGES = p0532_TOTAL_CHARGES;
  }

  public String getP0533_ARRIVAL_TIME() {
    return P0533_ARRIVAL_TIME;
  }

  public void setP0533_ARRIVAL_TIME(String p0533_ARRIVAL_TIME) {
    P0533_ARRIVAL_TIME = p0533_ARRIVAL_TIME;
  }

  public String getP0534_TOTAL_NON_ROOM_CHARGES() {
    return P0534_TOTAL_NON_ROOM_CHARGES;
  }

  public void setP0534_TOTAL_NON_ROOM_CHARGES(String p0534_TOTAL_NON_ROOM_CHARGES) {
    P0534_TOTAL_NON_ROOM_CHARGES = p0534_TOTAL_NON_ROOM_CHARGES;
  }

  public String getP0535_FARE() {
    return P0535_FARE;
  }

  public void setP0535_FARE(String p0535_FARE) {
    P0535_FARE = p0535_FARE;
  }

  public String getP0536_FEE() {
    return P0536_FEE;
  }

  public void setP0536_FEE(String p0536_FEE) {
    P0536_FEE = p0536_FEE;
  }

  public String getP0537_TAXES() {
    return P0537_TAXES;
  }

  public void setP0537_TAXES(String p0537_TAXES) {
    P0537_TAXES = p0537_TAXES;
  }

  public String getP0538_ENDORSEMENT_RESTRICTIONS() {
    return P0538_ENDORSEMENT_RESTRICTIONS;
  }

  public void setP0538_ENDORSEMENT_RESTRICTIONS(String p0538_ENDORSEMENT_RESTRICTIONS) {
    P0538_ENDORSEMENT_RESTRICTIONS = p0538_ENDORSEMENT_RESTRICTIONS;
  }

  public String getP0539_TOTAL_AMOUNT_CHARGED_ON_CARD() {
    return P0539_TOTAL_AMOUNT_CHARGED_ON_CARD;
  }

  public void setP0539_TOTAL_AMOUNT_CHARGED_ON_CARD(String p0539_TOTAL_AMOUNT_CHARGED_ON_CARD) {
    P0539_TOTAL_AMOUNT_CHARGED_ON_CARD = p0539_TOTAL_AMOUNT_CHARGED_ON_CARD;
  }

  public String getP0540_ROOM_SERVICE_CHARGES() {
    return P0540_ROOM_SERVICE_CHARGES;
  }

  public void setP0540_ROOM_SERVICE_CHARGES(String p0540_ROOM_SERVICE_CHARGES) {
    P0540_ROOM_SERVICE_CHARGES = p0540_ROOM_SERVICE_CHARGES;
  }

  public String getP0541_LOUNGE_BAR_CHARGES() {
    return P0541_LOUNGE_BAR_CHARGES;
  }

  public void setP0541_LOUNGE_BAR_CHARGES(String p0541_LOUNGE_BAR_CHARGES) {
    P0541_LOUNGE_BAR_CHARGES = p0541_LOUNGE_BAR_CHARGES;
  }

  public String getP0543_TRANSAPORTATION_CHARGES() {
    return P0543_TRANSAPORTATION_CHARGES;
  }

  public void setP0543_TRANSAPORTATION_CHARGES(String p0543_TRANSAPORTATION_CHARGES) {
    P0543_TRANSAPORTATION_CHARGES = p0543_TRANSAPORTATION_CHARGES;
  }

  public String getP0544_RENTAL_AGREEMENT_NUMBER() {
    return P0544_RENTAL_AGREEMENT_NUMBER;
  }

  public void setP0544_RENTAL_AGREEMENT_NUMBER(String p0544_RENTAL_AGREEMENT_NUMBER) {
    P0544_RENTAL_AGREEMENT_NUMBER = p0544_RENTAL_AGREEMENT_NUMBER;
  }

  public String getP0545_RENTER_NAME() {
    return P0545_RENTER_NAME;
  }

  public void setP0545_RENTER_NAME(String p0545_RENTER_NAME) {
    P0545_RENTER_NAME = p0545_RENTER_NAME;
  }

  public String getP0546_RENTAL_RETURN_CITY() {
    return P0546_RENTAL_RETURN_CITY;
  }

  public void setP0546_RENTAL_RETURN_CITY(String p0546_RENTAL_RETURN_CITY) {
    P0546_RENTAL_RETURN_CITY = p0546_RENTAL_RETURN_CITY;
  }

  public String getP0547_RENTAL_RETURN_STATE_PROVINCE() {
    return P0547_RENTAL_RETURN_STATE_PROVINCE;
  }

  public void setP0547_RENTAL_RETURN_STATE_PROVINCE(String p0547_RENTAL_RETURN_STATE_PROVINCE) {
    P0547_RENTAL_RETURN_STATE_PROVINCE = p0547_RENTAL_RETURN_STATE_PROVINCE;
  }

  public String getP0548_RENTAL_RETURN_LOCALTION_COUNTRY() {
    return P0548_RENTAL_RETURN_LOCALTION_COUNTRY;
  }

  public void setP0548_RENTAL_RETURN_LOCALTION_COUNTRY(
      String p0548_RENTAL_RETURN_LOCALTION_COUNTRY) {
    P0548_RENTAL_RETURN_LOCALTION_COUNTRY = p0548_RENTAL_RETURN_LOCALTION_COUNTRY;
  }

  public String getP0550_RENTAL_RETURN_DATE() {
    return P0550_RENTAL_RETURN_DATE;
  }

  public void setP0550_RENTAL_RETURN_DATE(String p0550_RENTAL_RETURN_DATE) {
    P0550_RENTAL_RETURN_DATE = p0550_RENTAL_RETURN_DATE;
  }

  public String getP0551_RENTAL_CHECKOUT_DATE() {
    return P0551_RENTAL_CHECKOUT_DATE;
  }

  public void setP0551_RENTAL_CHECKOUT_DATE(String p0551_RENTAL_CHECKOUT_DATE) {
    P0551_RENTAL_CHECKOUT_DATE = p0551_RENTAL_CHECKOUT_DATE;
  }

  public String getP0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER() {
    return P0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER;
  }

  public void setP0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER(
      String p0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER) {
    P0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER = p0552_CUSTOMER_SERVICE_TOLLFREE_NUMBER;
  }

  public String getP0553_RENTAL_RATE() {
    return P0553_RENTAL_RATE;
  }

  public void setP0553_RENTAL_RATE(String p0553_RENTAL_RATE) {
    P0553_RENTAL_RATE = p0553_RENTAL_RATE;
  }

  public String getP0554_CONFERENCE_ROOM_CHARGES() {
    return P0554_CONFERENCE_ROOM_CHARGES;
  }

  public void setP0554_CONFERENCE_ROOM_CHARGES(String p0554_CONFERENCE_ROOM_CHARGES) {
    P0554_CONFERENCE_ROOM_CHARGES = p0554_CONFERENCE_ROOM_CHARGES;
  }

  public String getP0555_RATE_PER_MILE_OR_KM() {
    return P0555_RATE_PER_MILE_OR_KM;
  }

  public void setP0555_RATE_PER_MILE_OR_KM(String p0555_RATE_PER_MILE_OR_KM) {
    P0555_RATE_PER_MILE_OR_KM = p0555_RATE_PER_MILE_OR_KM;
  }

  public String getP0556_TOTAL_MILES_OR_KM() {
    return P0556_TOTAL_MILES_OR_KM;
  }

  public void setP0556_TOTAL_MILES_OR_KM(String p0556_TOTAL_MILES_OR_KM) {
    P0556_TOTAL_MILES_OR_KM = p0556_TOTAL_MILES_OR_KM;
  }

  public String getP0557_MAXIMUM_FREE_MILES_OR_KM() {
    return P0557_MAXIMUM_FREE_MILES_OR_KM;
  }

  public void setP0557_MAXIMUM_FREE_MILES_OR_KM(String p0557_MAXIMUM_FREE_MILES_OR_KM) {
    P0557_MAXIMUM_FREE_MILES_OR_KM = p0557_MAXIMUM_FREE_MILES_OR_KM;
  }

  public String getP0558_MILES_KM_INDICATOR() {
    return P0558_MILES_KM_INDICATOR;
  }

  public void setP0558_MILES_KM_INDICATOR(String p0558_MILES_KM_INDICATOR) {
    P0558_MILES_KM_INDICATOR = p0558_MILES_KM_INDICATOR;
  }

  public String getP0559_VEHICULE_INSURANCE() {
    return P0559_VEHICULE_INSURANCE;
  }

  public void setP0559_VEHICULE_INSURANCE(String p0559_VEHICULE_INSURANCE) {
    P0559_VEHICULE_INSURANCE = p0559_VEHICULE_INSURANCE;
  }

  public String getP0560_AUDIO_VISUAL_CHARGES() {
    return P0560_AUDIO_VISUAL_CHARGES;
  }

  public void setP0560_AUDIO_VISUAL_CHARGES(String p0560_AUDIO_VISUAL_CHARGES) {
    P0560_AUDIO_VISUAL_CHARGES = p0560_AUDIO_VISUAL_CHARGES;
  }

  public String getP0561_ADJUSTED_AMOUNT() {
    return P0561_ADJUSTED_AMOUNT;
  }

  public void setP0561_ADJUSTED_AMOUNT(String p0561_ADJUSTED_AMOUNT) {
    P0561_ADJUSTED_AMOUNT = p0561_ADJUSTED_AMOUNT;
  }

  public String getP0562_BANQUET_CHARGES() {
    return P0562_BANQUET_CHARGES;
  }

  public void setP0562_BANQUET_CHARGES(String p0562_BANQUET_CHARGES) {
    P0562_BANQUET_CHARGES = p0562_BANQUET_CHARGES;
  }

  public String getP0563_PROGRAM_CODE() {
    return P0563_PROGRAM_CODE;
  }

  public void setP0563_PROGRAM_CODE(String p0563_PROGRAM_CODE) {
    P0563_PROGRAM_CODE = p0563_PROGRAM_CODE;
  }

  public String getP0564_RENTAL_LOCATION_CITY() {
    return P0564_RENTAL_LOCATION_CITY;
  }

  public void setP0564_RENTAL_LOCATION_CITY(String p0564_RENTAL_LOCATION_CITY) {
    P0564_RENTAL_LOCATION_CITY = p0564_RENTAL_LOCATION_CITY;
  }

  public String getP0565_RENTAL_LOCATION_STATE() {
    return P0565_RENTAL_LOCATION_STATE;
  }

  public void setP0565_RENTAL_LOCATION_STATE(String p0565_RENTAL_LOCATION_STATE) {
    P0565_RENTAL_LOCATION_STATE = p0565_RENTAL_LOCATION_STATE;
  }

  public String getP0566_RENTAL_LOCATION_COUNTRY() {
    return P0566_RENTAL_LOCATION_COUNTRY;
  }

  public void setP0566_RENTAL_LOCATION_COUNTRY(String p0566_RENTAL_LOCATION_COUNTRY) {
    P0566_RENTAL_LOCATION_COUNTRY = p0566_RENTAL_LOCATION_COUNTRY;
  }

  public String getP0567_RENTAL_LOCATION_ID() {
    return P0567_RENTAL_LOCATION_ID;
  }

  public void setP0567_RENTAL_LOCATION_ID(String p0567_RENTAL_LOCATION_ID) {
    P0567_RENTAL_LOCATION_ID = p0567_RENTAL_LOCATION_ID;
  }

  public String getP0568_RENTAL_CLASS_ID() {
    return P0568_RENTAL_CLASS_ID;
  }

  public void setP0568_RENTAL_CLASS_ID(String p0568_RENTAL_CLASS_ID) {
    P0568_RENTAL_CLASS_ID = p0568_RENTAL_CLASS_ID;
  }

  public String getP0569_INTERNET_ACCESS_CHARGES() {
    return P0569_INTERNET_ACCESS_CHARGES;
  }

  public void setP0569_INTERNET_ACCESS_CHARGES(String p0569_INTERNET_ACCESS_CHARGES) {
    P0569_INTERNET_ACCESS_CHARGES = p0569_INTERNET_ACCESS_CHARGES;
  }

  public String getP0570_EARLY_DEPARTURE_CHARGES() {
    return P0570_EARLY_DEPARTURE_CHARGES;
  }

  public void setP0570_EARLY_DEPARTURE_CHARGES(String p0570_EARLY_DEPARTURE_CHARGES) {
    P0570_EARLY_DEPARTURE_CHARGES = p0570_EARLY_DEPARTURE_CHARGES;
  }

  public String getP0571_GUEST_NAME() {
    return P0571_GUEST_NAME;
  }

  public void setP0571_GUEST_NAME(String p0571_GUEST_NAME) {
    P0571_GUEST_NAME = p0571_GUEST_NAME;
  }

  public String getP0572_GUEST_NUMBER() {
    return P0572_GUEST_NUMBER;
  }

  public void setP0572_GUEST_NUMBER(String p0572_GUEST_NUMBER) {
    P0572_GUEST_NUMBER = p0572_GUEST_NUMBER;
  }

  public String getP0573_INVOICE_NUMBER() {
    return P0573_INVOICE_NUMBER;
  }

  public void setP0573_INVOICE_NUMBER(String p0573_INVOICE_NUMBER) {
    P0573_INVOICE_NUMBER = p0573_INVOICE_NUMBER;
  }

  public String getP0574_ARRIVAL_DATE() {
    return P0574_ARRIVAL_DATE;
  }

  public void setP0574_ARRIVAL_DATE(String p0574_ARRIVAL_DATE) {
    P0574_ARRIVAL_DATE = p0574_ARRIVAL_DATE;
  }

  public String getP0575_DEPARTURE_DATE() {
    return P0575_DEPARTURE_DATE;
  }

  public void setP0575_DEPARTURE_DATE(String p0575_DEPARTURE_DATE) {
    P0575_DEPARTURE_DATE = p0575_DEPARTURE_DATE;
  }

  public String getP0576_FOLIO_NUMBER() {
    return P0576_FOLIO_NUMBER;
  }

  public void setP0576_FOLIO_NUMBER(String p0576_FOLIO_NUMBER) {
    P0576_FOLIO_NUMBER = p0576_FOLIO_NUMBER;
  }

  public String getP0577_PROPERTY_PHONE_NUMBER() {
    return P0577_PROPERTY_PHONE_NUMBER;
  }

  public void setP0577_PROPERTY_PHONE_NUMBER(String p0577_PROPERTY_PHONE_NUMBER) {
    P0577_PROPERTY_PHONE_NUMBER = p0577_PROPERTY_PHONE_NUMBER;
  }

  public String getP0578_BILLING_ADJUSTMENT() {
    return P0578_BILLING_ADJUSTMENT;
  }

  public void setP0578_BILLING_ADJUSTMENT(String p0578_BILLING_ADJUSTMENT) {
    P0578_BILLING_ADJUSTMENT = p0578_BILLING_ADJUSTMENT;
  }

  public String getP0579_INVOICE_DATE() {
    return P0579_INVOICE_DATE;
  }

  public void setP0579_INVOICE_DATE(String p0579_INVOICE_DATE) {
    P0579_INVOICE_DATE = p0579_INVOICE_DATE;
  }

  public String getP0580_ROOM_RATE() {
    return P0580_ROOM_RATE;
  }

  public void setP0580_ROOM_RATE(String p0580_ROOM_RATE) {
    P0580_ROOM_RATE = p0580_ROOM_RATE;
  }

  public String getP0581_TOTAL_ROOM_TAX() {
    return P0581_TOTAL_ROOM_TAX;
  }

  public void setP0581_TOTAL_ROOM_TAX(String p0581_TOTAL_ROOM_TAX) {
    P0581_TOTAL_ROOM_TAX = p0581_TOTAL_ROOM_TAX;
  }

  public String getP0582_PROGRAM_CODE() {
    return P0582_PROGRAM_CODE;
  }

  public void setP0582_PROGRAM_CODE(String p0582_PROGRAM_CODE) {
    P0582_PROGRAM_CODE = p0582_PROGRAM_CODE;
  }

  public String getP0583_PHONE_CHARGES() {
    return P0583_PHONE_CHARGES;
  }

  public void setP0583_PHONE_CHARGES(String p0583_PHONE_CHARGES) {
    P0583_PHONE_CHARGES = p0583_PHONE_CHARGES;
  }

  public String getP0584_RESTAURANT_CHARGES() {
    return P0584_RESTAURANT_CHARGES;
  }

  public void setP0584_RESTAURANT_CHARGES(String p0584_RESTAURANT_CHARGES) {
    P0584_RESTAURANT_CHARGES = p0584_RESTAURANT_CHARGES;
  }

  public String getP0585_MINI_BAR_CHARGES() {
    return P0585_MINI_BAR_CHARGES;
  }

  public void setP0585_MINI_BAR_CHARGES(String p0585_MINI_BAR_CHARGES) {
    P0585_MINI_BAR_CHARGES = p0585_MINI_BAR_CHARGES;
  }

  public String getP0586_GIFT_SHOP_CHARGES() {
    return P0586_GIFT_SHOP_CHARGES;
  }

  public void setP0586_GIFT_SHOP_CHARGES(String p0586_GIFT_SHOP_CHARGES) {
    P0586_GIFT_SHOP_CHARGES = p0586_GIFT_SHOP_CHARGES;
  }

  public String getP0587_LAUNDRY_DRY_CLEANING_CHARGES() {
    return P0587_LAUNDRY_DRY_CLEANING_CHARGES;
  }

  public void setP0587_LAUNDRY_DRY_CLEANING_CHARGES(String p0587_LAUNDRY_DRY_CLEANING_CHARGES) {
    P0587_LAUNDRY_DRY_CLEANING_CHARGES = p0587_LAUNDRY_DRY_CLEANING_CHARGES;
  }

  public String getP0588_OTHER_SERVICES() {
    return P0588_OTHER_SERVICES;
  }

  public void setP0588_OTHER_SERVICES(String p0588_OTHER_SERVICES) {
    P0588_OTHER_SERVICES = p0588_OTHER_SERVICES;
  }

  public String getP0589_INVOICE_CREATION_DATE_TIME() {
    return P0589_INVOICE_CREATION_DATE_TIME;
  }

  public void setP0589_INVOICE_CREATION_DATE_TIME(String p0589_INVOICE_CREATION_DATE_TIME) {
    P0589_INVOICE_CREATION_DATE_TIME = p0589_INVOICE_CREATION_DATE_TIME;
  }

  public String getP0590_PARTY_IDENTIFICATION() {
    return P0590_PARTY_IDENTIFICATION;
  }

  public void setP0590_PARTY_IDENTIFICATION(String p0590_PARTY_IDENTIFICATION) {
    P0590_PARTY_IDENTIFICATION = p0590_PARTY_IDENTIFICATION;
  }

  public String getP0591_PARTY_NAME() {
    return P0591_PARTY_NAME;
  }

  public void setP0591_PARTY_NAME(String p0591_PARTY_NAME) {
    P0591_PARTY_NAME = p0591_PARTY_NAME;
  }

  public String getP0592_PARTY_ADDRESS() {
    return P0592_PARTY_ADDRESS;
  }

  public void setP0592_PARTY_ADDRESS(String p0592_PARTY_ADDRESS) {
    P0592_PARTY_ADDRESS = p0592_PARTY_ADDRESS;
  }

  public String getP0593_PARTY_POSTAL_INFO() {
    return P0593_PARTY_POSTAL_INFO;
  }

  public void setP0593_PARTY_POSTAL_INFO(String p0593_PARTY_POSTAL_INFO) {
    P0593_PARTY_POSTAL_INFO = p0593_PARTY_POSTAL_INFO;
  }

  public String getP0594_PARTY_CONTACT() {
    return P0594_PARTY_CONTACT;
  }

  public void setP0594_PARTY_CONTACT(String p0594_PARTY_CONTACT) {
    P0594_PARTY_CONTACT = p0594_PARTY_CONTACT;
  }

  public String getP0595_CARD_ACCEPTOR_TYPE() {
    return P0595_CARD_ACCEPTOR_TYPE;
  }
  
  public String getTreat() {
	return treat;
}

public void setTreat(String treat) {
	this.treat = treat;
}

public void setP0595_CARD_ACCEPTOR_TYPE(String p0595_CARD_ACCEPTOR_TYPE) {
    P0595_CARD_ACCEPTOR_TYPE = p0595_CARD_ACCEPTOR_TYPE;
  }

  public String getP0596_CARD_ACCEPTOR_TAX_ID() {
    return P0596_CARD_ACCEPTOR_TAX_ID;
  }

  public void setP0596_CARD_ACCEPTOR_TAX_ID(String p0596_CARD_ACCEPTOR_TAX_ID) {
    P0596_CARD_ACCEPTOR_TAX_ID = p0596_CARD_ACCEPTOR_TAX_ID;
  }

  public String getP0597_TOTAL_TAX_AMOUNT() {
    return P0597_TOTAL_TAX_AMOUNT;
  }

  public void setP0597_TOTAL_TAX_AMOUNT(String p0597_TOTAL_TAX_AMOUNT) {
    P0597_TOTAL_TAX_AMOUNT = p0597_TOTAL_TAX_AMOUNT;
  }

  public String getP0598_TOTAL_TAX_COLLECTED_INDICATOR() {
    return P0598_TOTAL_TAX_COLLECTED_INDICATOR;
  }

  public void setP0598_TOTAL_TAX_COLLECTED_INDICATOR(String p0598_TOTAL_TAX_COLLECTED_INDICATOR) {
    P0598_TOTAL_TAX_COLLECTED_INDICATOR = p0598_TOTAL_TAX_COLLECTED_INDICATOR;
  }

  public String getP0599_CORPORATION_VAT_NUMBER() {
    return P0599_CORPORATION_VAT_NUMBER;
  }

  public void setP0599_CORPORATION_VAT_NUMBER(String p0599_CORPORATION_VAT_NUMBER) {
    P0599_CORPORATION_VAT_NUMBER = p0599_CORPORATION_VAT_NUMBER;
  }

  public String getP0600_CARD_ACCEPTOR_REFERENCE_NUMBER() {
    return P0600_CARD_ACCEPTOR_REFERENCE_NUMBER;
  }

  public void setP0600_CARD_ACCEPTOR_REFERENCE_NUMBER(
      String p0600_CARD_ACCEPTOR_REFERENCE_NUMBER) {
    P0600_CARD_ACCEPTOR_REFERENCE_NUMBER = p0600_CARD_ACCEPTOR_REFERENCE_NUMBER;
  }

  public String getP0601_PARTY_NATURE_FILING() {
    return P0601_PARTY_NATURE_FILING;
  }

  public void setP0601_PARTY_NATURE_FILING(String p0601_PARTY_NATURE_FILING) {
    P0601_PARTY_NATURE_FILING = p0601_PARTY_NATURE_FILING;
  }

  public String getP0602_PARTY_SUPPLEMENTAL_DATA1() {
    return P0602_PARTY_SUPPLEMENTAL_DATA1;
  }

  public void setP0602_PARTY_SUPPLEMENTAL_DATA1(String p0602_PARTY_SUPPLEMENTAL_DATA1) {
    P0602_PARTY_SUPPLEMENTAL_DATA1 = p0602_PARTY_SUPPLEMENTAL_DATA1;
  }

  public String getP0603_PARTY_SUPPLEMENTAL_DATA2() {
    return P0603_PARTY_SUPPLEMENTAL_DATA2;
  }

  public void setP0603_PARTY_SUPPLEMENTAL_DATA2(String p0603_PARTY_SUPPLEMENTAL_DATA2) {
    P0603_PARTY_SUPPLEMENTAL_DATA2 = p0603_PARTY_SUPPLEMENTAL_DATA2;
  }

  public String getP0604_TRANSATION_SUPPLIMENTAL_DATA1() {
    return P0604_TRANSATION_SUPPLIMENTAL_DATA1;
  }

  public void setP0604_TRANSATION_SUPPLIMENTAL_DATA1(String p0604_TRANSATION_SUPPLIMENTAL_DATA1) {
    P0604_TRANSATION_SUPPLIMENTAL_DATA1 = p0604_TRANSATION_SUPPLIMENTAL_DATA1;
  }

  public String getP0605_TRANSACTION_SUPPLIMENTAL_DATA2() {
    return P0605_TRANSACTION_SUPPLIMENTAL_DATA2;
  }

  public void setP0605_TRANSACTION_SUPPLIMENTAL_DATA2(
      String p0605_TRANSACTION_SUPPLIMENTAL_DATA2) {
    P0605_TRANSACTION_SUPPLIMENTAL_DATA2 = p0605_TRANSACTION_SUPPLIMENTAL_DATA2;
  }

  public String getP0606_FREIGHT_AMOUNT() {
    return P0606_FREIGHT_AMOUNT;
  }

  public void setP0606_FREIGHT_AMOUNT(String p0606_FREIGHT_AMOUNT) {
    P0606_FREIGHT_AMOUNT = p0606_FREIGHT_AMOUNT;
  }

  public String getP0607_DUTY_AMOUNT() {
    return P0607_DUTY_AMOUNT;
  }

  public void setP0607_DUTY_AMOUNT(String p0607_DUTY_AMOUNT) {
    P0607_DUTY_AMOUNT = p0607_DUTY_AMOUNT;
  }

  public String getP0608_DESTINATION_POSTAL_CODE() {
    return P0608_DESTINATION_POSTAL_CODE;
  }

  public void setP0608_DESTINATION_POSTAL_CODE(String p0608_DESTINATION_POSTAL_CODE) {
    P0608_DESTINATION_POSTAL_CODE = p0608_DESTINATION_POSTAL_CODE;
  }

  public String getP0609_DESTINATION_STATE_CODE() {
    return P0609_DESTINATION_STATE_CODE;
  }

  public void setP0609_DESTINATION_STATE_CODE(String p0609_DESTINATION_STATE_CODE) {
    P0609_DESTINATION_STATE_CODE = p0609_DESTINATION_STATE_CODE;
  }

  public String getP0610_DESTINATION_COUNTRY_CODE() {
    return P0610_DESTINATION_COUNTRY_CODE;
  }

  public void setP0610_DESTINATION_COUNTRY_CODE(String p0610_DESTINATION_COUNTRY_CODE) {
    P0610_DESTINATION_COUNTRY_CODE = p0610_DESTINATION_COUNTRY_CODE;
  }

  public String getP0611_SEQUENCE_NUMBER() {
    return P0611_SEQUENCE_NUMBER;
  }

  public void setP0611_SEQUENCE_NUMBER(String p0611_SEQUENCE_NUMBER) {
    P0611_SEQUENCE_NUMBER = p0611_SEQUENCE_NUMBER;
  }

  public String getP0612_SHIP_DATE() {
    return P0612_SHIP_DATE;
  }

  public void setP0612_SHIP_DATE(String p0612_SHIP_DATE) {
    P0612_SHIP_DATE = p0612_SHIP_DATE;
  }

  public String getP0613_SHIP_FROM_POSTAL_CODE() {
    return P0613_SHIP_FROM_POSTAL_CODE;
  }

  public void setP0613_SHIP_FROM_POSTAL_CODE(String p0613_SHIP_FROM_POSTAL_CODE) {
    P0613_SHIP_FROM_POSTAL_CODE = p0613_SHIP_FROM_POSTAL_CODE;
  }

  public String getP0614_ORDER_DATE() {
    return P0614_ORDER_DATE;
  }

  public void setP0614_ORDER_DATE(String p0614_ORDER_DATE) {
    P0614_ORDER_DATE = p0614_ORDER_DATE;
  }

  public String getP0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER() {
    return P0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER;
  }

  public void setP0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER(
      String p0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER) {
    P0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER = p0615_MEDICAL_SERVICES_SHIP_TO_HEALTH_INDUSTRY_NUMBER;
  }

  public String getP0616_CONTRACT_NUMBER() {
    return P0616_CONTRACT_NUMBER;
  }

  public void setP0616_CONTRACT_NUMBER(String p0616_CONTRACT_NUMBER) {
    P0616_CONTRACT_NUMBER = p0616_CONTRACT_NUMBER;
  }

  public String getP0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER() {
    return P0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER;
  }

  public void setP0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER(
      String p0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER) {
    P0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER = p0617_MEDCIAL_SERVICES_PRODUCT_NUMBER_QUALIFIER;
  }

  public String getP0619_USER_NAME() {
    return P0619_USER_NAME;
  }

  public void setP0619_USER_NAME(String p0619_USER_NAME) {
    P0619_USER_NAME = p0619_USER_NAME;
  }

  public String getP0620_OIL_COMPANY_BRAND_NAME() {
    return P0620_OIL_COMPANY_BRAND_NAME;
  }

  public void setP0620_OIL_COMPANY_BRAND_NAME(String p0620_OIL_COMPANY_BRAND_NAME) {
    P0620_OIL_COMPANY_BRAND_NAME = p0620_OIL_COMPANY_BRAND_NAME;
  }

  public String getP0621_PURCHASE_TIME() {
    return P0621_PURCHASE_TIME;
  }

  public void setP0621_PURCHASE_TIME(String p0621_PURCHASE_TIME) {
    P0621_PURCHASE_TIME = p0621_PURCHASE_TIME;
  }

  public String getP0622_MOTOR_FUEL_SERVICE_TYPE() {
    return P0622_MOTOR_FUEL_SERVICE_TYPE;
  }

  public void setP0622_MOTOR_FUEL_SERVICE_TYPE(String p0622_MOTOR_FUEL_SERVICE_TYPE) {
    P0622_MOTOR_FUEL_SERVICE_TYPE = p0622_MOTOR_FUEL_SERVICE_TYPE;
  }

  public String getP0623_MOTOR_FUEL_INFO() {
    return P0623_MOTOR_FUEL_INFO;
  }

  public void setP0623_MOTOR_FUEL_INFO(String p0623_MOTOR_FUEL_INFO) {
    P0623_MOTOR_FUEL_INFO = p0623_MOTOR_FUEL_INFO;
  }

  public String getP0624_USER_ACCOUNT_NUMBER() {
    return P0624_USER_ACCOUNT_NUMBER;
  }

  public void setP0624_USER_ACCOUNT_NUMBER(String p0624_USER_ACCOUNT_NUMBER) {
    P0624_USER_ACCOUNT_NUMBER = p0624_USER_ACCOUNT_NUMBER;
  }

  public String getP0625_USER_TELEPHONE_NUMBER() {
    return P0625_USER_TELEPHONE_NUMBER;
  }

  public void setP0625_USER_TELEPHONE_NUMBER(String p0625_USER_TELEPHONE_NUMBER) {
    P0625_USER_TELEPHONE_NUMBER = p0625_USER_TELEPHONE_NUMBER;
  }

  public String getP0626_BILLING_STATEMENT_PERIOD() {
    return P0626_BILLING_STATEMENT_PERIOD;
  }

  public void setP0626_BILLING_STATEMENT_PERIOD(String p0626_BILLING_STATEMENT_PERIOD) {
    P0626_BILLING_STATEMENT_PERIOD = p0626_BILLING_STATEMENT_PERIOD;
  }

  public String getP0627_BILLING_EVENT1() {
    return P0627_BILLING_EVENT1;
  }

  public void setP0627_BILLING_EVENT1(String p0627_BILLING_EVENT1) {
    P0627_BILLING_EVENT1 = p0627_BILLING_EVENT1;
  }

  public String getP0628_BILLING_EVENT2() {
    return P0628_BILLING_EVENT2;
  }

  public void setP0628_BILLING_EVENT2(String p0628_BILLING_EVENT2) {
    P0628_BILLING_EVENT2 = p0628_BILLING_EVENT2;
  }

  public String getP0629_ODOMETER_READING() {
    return P0629_ODOMETER_READING;
  }

  public void setP0629_ODOMETER_READING(String p0629_ODOMETER_READING) {
    P0629_ODOMETER_READING = p0629_ODOMETER_READING;
  }

  public String getCompteBeneficiaire() {
    return compteBeneficiaire;
  }

  public void setCompteBeneficiaire(String compteBeneficiaire) {
    this.compteBeneficiaire = compteBeneficiaire;
  }

  public String getP0630_VEHICLE_NUMBER() {
    return P0630_VEHICLE_NUMBER;
  }

  public void setP0630_VEHICLE_NUMBER(String p0630_VEHICLE_NUMBER) {
    P0630_VEHICLE_NUMBER = p0630_VEHICLE_NUMBER;
  }

  public String getP0631_DRIVER_NUMBERID_NUMBER() {
    return P0631_DRIVER_NUMBERID_NUMBER;
  }

  public void setP0631_DRIVER_NUMBERID_NUMBER(String p0631_DRIVER_NUMBERID_NUMBER) {
    P0631_DRIVER_NUMBERID_NUMBER = p0631_DRIVER_NUMBERID_NUMBER;
  }

  public String getP0632_PRODUCT_TYPE_CODE() {
    return P0632_PRODUCT_TYPE_CODE;
  }

  public void setP0632_PRODUCT_TYPE_CODE(String p0632_PRODUCT_TYPE_CODE) {
    P0632_PRODUCT_TYPE_CODE = p0632_PRODUCT_TYPE_CODE;
  }

  public String getP0633_COUPON_DISCOUNT_AMOUNT() {
    return P0633_COUPON_DISCOUNT_AMOUNT;
  }

  public void setP0633_COUPON_DISCOUNT_AMOUNT(String p0633_COUPON_DISCOUNT_AMOUNT) {
    P0633_COUPON_DISCOUNT_AMOUNT = p0633_COUPON_DISCOUNT_AMOUNT;
  }

  public String getP0634_TAX_AMOUNT1() {
    return P0634_TAX_AMOUNT1;
  }

  public void setP0634_TAX_AMOUNT1(String p0634_TAX_AMOUNT1) {
    P0634_TAX_AMOUNT1 = p0634_TAX_AMOUNT1;
  }

  public String getP0635_TAX_AMOUNT2() {
    return P0635_TAX_AMOUNT2;
  }

  public void setP0635_TAX_AMOUNT2(String p0635_TAX_AMOUNT2) {
    P0635_TAX_AMOUNT2 = p0635_TAX_AMOUNT2;
  }

  public String getP0636_CALL_DATE() {
    return P0636_CALL_DATE;
  }

  public void setP0636_CALL_DATE(String p0636_CALL_DATE) {
    P0636_CALL_DATE = p0636_CALL_DATE;
  }

  public String getP0637_CALL_TIME() {
    return P0637_CALL_TIME;
  }

  public void setP0637_CALL_TIME(String p0637_CALL_TIME) {
    P0637_CALL_TIME = p0637_CALL_TIME;
  }

  public String getP0638_CALL_TO_INFO() {
    return P0638_CALL_TO_INFO;
  }

  public void setP0638_CALL_TO_INFO(String p0638_CALL_TO_INFO) {
    P0638_CALL_TO_INFO = p0638_CALL_TO_INFO;
  }

  public String getP0639_CALL_DURATION() {
    return P0639_CALL_DURATION;
  }

  public void setP0639_CALL_DURATION(String p0639_CALL_DURATION) {
    P0639_CALL_DURATION = p0639_CALL_DURATION;
  }

  public String getP0640_CALL_TIME_PERIOD() {
    return P0640_CALL_TIME_PERIOD;
  }

  public void setP0640_CALL_TIME_PERIOD(String p0640_CALL_TIME_PERIOD) {
    P0640_CALL_TIME_PERIOD = p0640_CALL_TIME_PERIOD;
  }

  public String getP0641_PRODUCT_CODE() {
    return P0641_PRODUCT_CODE;
  }

  public void setP0641_PRODUCT_CODE(String p0641_PRODUCT_CODE) {
    P0641_PRODUCT_CODE = p0641_PRODUCT_CODE;
  }

  public String getP0642_ITEM_DESCRIPTION() {
    return P0642_ITEM_DESCRIPTION;
  }

  public void setP0642_ITEM_DESCRIPTION(String p0642_ITEM_DESCRIPTION) {
    P0642_ITEM_DESCRIPTION = p0642_ITEM_DESCRIPTION;
  }

  public String getP0643_ITEM_QUANTITY() {
    return P0643_ITEM_QUANTITY;
  }

  public void setP0643_ITEM_QUANTITY(String p0643_ITEM_QUANTITY) {
    P0643_ITEM_QUANTITY = p0643_ITEM_QUANTITY;
  }

  public String getP0644_CALL_FROM_INFO() {
    return P0644_CALL_FROM_INFO;
  }

  public void setP0644_CALL_FROM_INFO(String p0644_CALL_FROM_INFO) {
    P0644_CALL_FROM_INFO = p0644_CALL_FROM_INFO;
  }

  public String getP0645_ITEM_UNIT_OF_MEASURE() {
    return P0645_ITEM_UNIT_OF_MEASURE;
  }

  public void setP0645_ITEM_UNIT_OF_MEASURE(String p0645_ITEM_UNIT_OF_MEASURE) {
    P0645_ITEM_UNIT_OF_MEASURE = p0645_ITEM_UNIT_OF_MEASURE;
  }

  public String getP0646_UNTI_PRICE() {
    return P0646_UNTI_PRICE;
  }

  public void setP0646_UNTI_PRICE(String p0646_UNTI_PRICE) {
    P0646_UNTI_PRICE = p0646_UNTI_PRICE;
  }

  public String getP0647_EXTENDED_ITEM_AMOUNT() {
    return P0647_EXTENDED_ITEM_AMOUNT;
  }

  public void setP0647_EXTENDED_ITEM_AMOUNT(String p0647_EXTENDED_ITEM_AMOUNT) {
    P0647_EXTENDED_ITEM_AMOUNT = p0647_EXTENDED_ITEM_AMOUNT;
  }

  public String getP0648_ITEM_DISCOUNT() {
    return P0648_ITEM_DISCOUNT;
  }

  public void setP0648_ITEM_DISCOUNT(String p0648_ITEM_DISCOUNT) {
    P0648_ITEM_DISCOUNT = p0648_ITEM_DISCOUNT;
  }

  public String getP0649_CALL_USAGE_AMOUNT() {
    return P0649_CALL_USAGE_AMOUNT;
  }

  public void setP0649_CALL_USAGE_AMOUNT(String p0649_CALL_USAGE_AMOUNT) {
    P0649_CALL_USAGE_AMOUNT = p0649_CALL_USAGE_AMOUNT;
  }

  public String getP0650_ZERO_COST_TO_CUSTOMER_INDICATOR() {
    return P0650_ZERO_COST_TO_CUSTOMER_INDICATOR;
  }

  public void setP0650_ZERO_COST_TO_CUSTOMER_INDICATOR(
      String p0650_ZERO_COST_TO_CUSTOMER_INDICATOR) {
    P0650_ZERO_COST_TO_CUSTOMER_INDICATOR = p0650_ZERO_COST_TO_CUSTOMER_INDICATOR;
  }

  public String getP0651_PROCEDURE_ID() {
    return P0651_PROCEDURE_ID;
  }

  public void setP0651_PROCEDURE_ID(String p0651_PROCEDURE_ID) {
    P0651_PROCEDURE_ID = p0651_PROCEDURE_ID;
  }

  public String getP0652_SERVICE_TYPE() {
    return P0652_SERVICE_TYPE;
  }

  public void setP0652_SERVICE_TYPE(String p0652_SERVICE_TYPE) {
    P0652_SERVICE_TYPE = p0652_SERVICE_TYPE;
  }

  public String getP0653_SERVICE_AMOUNT() {
    return P0653_SERVICE_AMOUNT;
  }

  public void setP0653_SERVICE_AMOUNT(String p0653_SERVICE_AMOUNT) {
    P0653_SERVICE_AMOUNT = p0653_SERVICE_AMOUNT;
  }

  public String getP0654_DEBIT_OR_CREDIT_INDICATOR() {
    return P0654_DEBIT_OR_CREDIT_INDICATOR;
  }

  public void setP0654_DEBIT_OR_CREDIT_INDICATOR(String p0654_DEBIT_OR_CREDIT_INDICATOR) {
    P0654_DEBIT_OR_CREDIT_INDICATOR = p0654_DEBIT_OR_CREDIT_INDICATOR;
  }

  public String getP0655_CALL_LONG_DISTANCE_AMOUNT() {
    return P0655_CALL_LONG_DISTANCE_AMOUNT;
  }

  public void setP0655_CALL_LONG_DISTANCE_AMOUNT(String p0655_CALL_LONG_DISTANCE_AMOUNT) {
    P0655_CALL_LONG_DISTANCE_AMOUNT = p0655_CALL_LONG_DISTANCE_AMOUNT;
  }

  public String getP0656_FULL_VAT_AMOUNTS() {
    return P0656_FULL_VAT_AMOUNTS;
  }

  public void setP0656_FULL_VAT_AMOUNTS(String p0656_FULL_VAT_AMOUNTS) {
    P0656_FULL_VAT_AMOUNTS = p0656_FULL_VAT_AMOUNTS;
  }

  public String getP0657_HALF_VAT_AMOUNTS() {
    return P0657_HALF_VAT_AMOUNTS;
  }

  public void setP0657_HALF_VAT_AMOUNTS(String p0657_HALF_VAT_AMOUNTS) {
    P0657_HALF_VAT_AMOUNTS = p0657_HALF_VAT_AMOUNTS;
  }

  public String getP0658_CALL_CONNECT_AMOUNT() {
    return P0658_CALL_CONNECT_AMOUNT;
  }

  public void setP0658_CALL_CONNECT_AMOUNT(String p0658_CALL_CONNECT_AMOUNT) {
    P0658_CALL_CONNECT_AMOUNT = p0658_CALL_CONNECT_AMOUNT;
  }

  public String getP0659_OTHER_DESCRIPTION() {
    return P0659_OTHER_DESCRIPTION;
  }

  public void setP0659_OTHER_DESCRIPTION(String p0659_OTHER_DESCRIPTION) {
    P0659_OTHER_DESCRIPTION = p0659_OTHER_DESCRIPTION;
  }

  public String getP0660_CUSTOMER_REFERENCE() {
    return P0660_CUSTOMER_REFERENCE;
  }

  public void setP0660_CUSTOMER_REFERENCE(String p0660_CUSTOMER_REFERENCE) {
    P0660_CUSTOMER_REFERENCE = p0660_CUSTOMER_REFERENCE;
  }

  public String getP0661_TRAFFIC_CODE() {
    return P0661_TRAFFIC_CODE;
  }

  public void setP0661_TRAFFIC_CODE(String p0661_TRAFFIC_CODE) {
    P0661_TRAFFIC_CODE = p0661_TRAFFIC_CODE;
  }

  public String getP0662_SAMPLE_NUMBER() {
    return P0662_SAMPLE_NUMBER;
  }

  public void setP0662_SAMPLE_NUMBER(String p0662_SAMPLE_NUMBER) {
    P0662_SAMPLE_NUMBER = p0662_SAMPLE_NUMBER;
  }

  public String getP0663_FREE_FROM_DESCRIPTION() {
    return P0663_FREE_FROM_DESCRIPTION;
  }

  public void setP0663_FREE_FROM_DESCRIPTION(String p0663_FREE_FROM_DESCRIPTION) {
    P0663_FREE_FROM_DESCRIPTION = p0663_FREE_FROM_DESCRIPTION;
  }

  public String getP0664_START_STATION() {
    return P0664_START_STATION;
  }

  public void setP0664_START_STATION(String p0664_START_STATION) {
    P0664_START_STATION = p0664_START_STATION;
  }

  public String getP0665_DESTINATION_STATION() {
    return P0665_DESTINATION_STATION;
  }

  public void setP0665_DESTINATION_STATION(String p0665_DESTINATION_STATION) {
    P0665_DESTINATION_STATION = p0665_DESTINATION_STATION;
  }

  public String getP0667_GENERIC_DATA() {
    return P0667_GENERIC_DATA;
  }

  public void setP0667_GENERIC_DATA(String p0667_GENERIC_DATA) {
    P0667_GENERIC_DATA = p0667_GENERIC_DATA;
  }

  public String getP0668_REDUCTION_DATA() {
    return P0668_REDUCTION_DATA;
  }

  public void setP0668_REDUCTION_DATA(String p0668_REDUCTION_DATA) {
    P0668_REDUCTION_DATA = p0668_REDUCTION_DATA;
  }

  public String getP0669_TRANSPORTATION_OTHER_CODE() {
    return P0669_TRANSPORTATION_OTHER_CODE;
  }

  public void setP0669_TRANSPORTATION_OTHER_CODE(String p0669_TRANSPORTATION_OTHER_CODE) {
    P0669_TRANSPORTATION_OTHER_CODE = p0669_TRANSPORTATION_OTHER_CODE;
  }

  public String getP0670_PAYER_USER_NAME() {
    return P0670_PAYER_USER_NAME;
  }

  public void setP0670_PAYER_USER_NAME(String p0670_PAYER_USER_NAME) {
    P0670_PAYER_USER_NAME = p0670_PAYER_USER_NAME;
  }

  public String getP0671_DATE_OF_FUNDS_REQUESTED() {
    return P0671_DATE_OF_FUNDS_REQUESTED;
  }

  public void setP0671_DATE_OF_FUNDS_REQUESTED(String p0671_DATE_OF_FUNDS_REQUESTED) {
    P0671_DATE_OF_FUNDS_REQUESTED = p0671_DATE_OF_FUNDS_REQUESTED;
  }

  public String getP0672_RECIPIENT_NAME() {
    return P0672_RECIPIENT_NAME;
  }

  public void setP0672_RECIPIENT_NAME(String p0672_RECIPIENT_NAME) {
    P0672_RECIPIENT_NAME = p0672_RECIPIENT_NAME;
  }

  public String getP0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS() {
    return P0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS;
  }

  public void setP0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS(
      String p0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS) {
    P0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS = p0673_DATE_OF_ANTICIPATED_RECEIPT_OF_FUNDS;
  }

  public String getP0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR() {
    return P0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR;
  }

  public void setP0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR(
      String p0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR) {
    P0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR = p0674_ADDITIONAL_TRACE_REFERENCE_NUMBER_CARD_ACCEPTOR;
  }

  public String getP0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA() {
    return P0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA;
  }

  public void setP0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA(
      String p0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA) {
    P0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA = p0675_ADDITIONAL_TRANSACTION_DESCRIPTION_DATA;
  }

  public String getP0676_CARD_ACCEPTOR_VAT_NUMBER() {
    return P0676_CARD_ACCEPTOR_VAT_NUMBER;
  }

  public void setP0676_CARD_ACCEPTOR_VAT_NUMBER(String p0676_CARD_ACCEPTOR_VAT_NUMBER) {
    P0676_CARD_ACCEPTOR_VAT_NUMBER = p0676_CARD_ACCEPTOR_VAT_NUMBER;
  }

  public String getP0677_CUSTOMER_VAT_NUMBER() {
    return P0677_CUSTOMER_VAT_NUMBER;
  }

  public void setP0677_CUSTOMER_VAT_NUMBER(String p0677_CUSTOMER_VAT_NUMBER) {
    P0677_CUSTOMER_VAT_NUMBER = p0677_CUSTOMER_VAT_NUMBER;
  }

  public String getP0678_UNIQUE_INVOICE_NUMBER() {
    return P0678_UNIQUE_INVOICE_NUMBER;
  }

  public void setP0678_UNIQUE_INVOICE_NUMBER(String p0678_UNIQUE_INVOICE_NUMBER) {
    P0678_UNIQUE_INVOICE_NUMBER = p0678_UNIQUE_INVOICE_NUMBER;
  }

  public String getP0679_COMMODITY_CODE() {
    return P0679_COMMODITY_CODE;
  }

  public void setP0679_COMMODITY_CODE(String p0679_COMMODITY_CODE) {
    P0679_COMMODITY_CODE = p0679_COMMODITY_CODE;
  }

  public String getP0680_AUTHORIZED_CONTACT_NAME() {
    return P0680_AUTHORIZED_CONTACT_NAME;
  }

  public void setP0680_AUTHORIZED_CONTACT_NAME(String p0680_AUTHORIZED_CONTACT_NAME) {
    P0680_AUTHORIZED_CONTACT_NAME = p0680_AUTHORIZED_CONTACT_NAME;
  }

  public String getP0681_AUTHORIZED_CONTACT_PHONE() {
    return P0681_AUTHORIZED_CONTACT_PHONE;
  }

  public void setP0681_AUTHORIZED_CONTACT_PHONE(String p0681_AUTHORIZED_CONTACT_PHONE) {
    P0681_AUTHORIZED_CONTACT_PHONE = p0681_AUTHORIZED_CONTACT_PHONE;
  }

  public String getP0682_DETAIL_TAX_AMOUNT1() {
    return P0682_DETAIL_TAX_AMOUNT1;
  }

  public void setP0682_DETAIL_TAX_AMOUNT1(String p0682_DETAIL_TAX_AMOUNT1) {
    P0682_DETAIL_TAX_AMOUNT1 = p0682_DETAIL_TAX_AMOUNT1;
  }

  public String getP0683_DETAIL_TAX_AMOUNT2() {
    return P0683_DETAIL_TAX_AMOUNT2;
  }

  public void setP0683_DETAIL_TAX_AMOUNT2(String p0683_DETAIL_TAX_AMOUNT2) {
    P0683_DETAIL_TAX_AMOUNT2 = p0683_DETAIL_TAX_AMOUNT2;
  }

  public String getP0684_DETAIL_TAX_AMOUNT3() {
    return P0684_DETAIL_TAX_AMOUNT3;
  }

  public void setP0684_DETAIL_TAX_AMOUNT3(String p0684_DETAIL_TAX_AMOUNT3) {
    P0684_DETAIL_TAX_AMOUNT3 = p0684_DETAIL_TAX_AMOUNT3;
  }

  public String getP0685_TYPE_OF_SUPPLY() {
    return P0685_TYPE_OF_SUPPLY;
  }

  public void setP0685_TYPE_OF_SUPPLY(String p0685_TYPE_OF_SUPPLY) {
    P0685_TYPE_OF_SUPPLY = p0685_TYPE_OF_SUPPLY;
  }

  public String getP0686_TAX_EXEMPT_INDICATOR() {
    return P0686_TAX_EXEMPT_INDICATOR;
  }

  public void setP0686_TAX_EXEMPT_INDICATOR(String p0686_TAX_EXEMPT_INDICATOR) {
    P0686_TAX_EXEMPT_INDICATOR = p0686_TAX_EXEMPT_INDICATOR;
  }

  public String getP0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER() {
    return P0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER;
  }

  public void setP0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER(
      String p0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER) {
    P0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER = p0687_UNIQUE_VAT_INVOICE_REFERENCE_NUMBER;
  }

  public String getP0690_NO_SHOW_INDICATOR() {
    return P0690_NO_SHOW_INDICATOR;
  }

  public void setP0690_NO_SHOW_INDICATOR(String p0690_NO_SHOW_INDICATOR) {
    P0690_NO_SHOW_INDICATOR = p0690_NO_SHOW_INDICATOR;
  }

  public String getP0691_DAYS_RENTED() {
    return P0691_DAYS_RENTED;
  }

  public void setP0691_DAYS_RENTED(String p0691_DAYS_RENTED) {
    P0691_DAYS_RENTED = p0691_DAYS_RENTED;
  }

  public String getP0692_WEEKLY_RENTAL_AMOUNT() {
    return P0692_WEEKLY_RENTAL_AMOUNT;
  }

  public void setP0692_WEEKLY_RENTAL_AMOUNT(String p0692_WEEKLY_RENTAL_AMOUNT) {
    P0692_WEEKLY_RENTAL_AMOUNT = p0692_WEEKLY_RENTAL_AMOUNT;
  }

  public String getP0693_TOTAL_AUTHORIZED_AMOUNT() {
    return P0693_TOTAL_AUTHORIZED_AMOUNT;
  }

  public void setP0693_TOTAL_AUTHORIZED_AMOUNT(String p0693_TOTAL_AUTHORIZED_AMOUNT) {
    P0693_TOTAL_AUTHORIZED_AMOUNT = p0693_TOTAL_AUTHORIZED_AMOUNT;
  }

  public String getP0694_ONE_WAY_DROPOFF_CHARGE() {
    return P0694_ONE_WAY_DROPOFF_CHARGE;
  }

  public void setP0694_ONE_WAY_DROPOFF_CHARGE(String p0694_ONE_WAY_DROPOFF_CHARGE) {
    P0694_ONE_WAY_DROPOFF_CHARGE = p0694_ONE_WAY_DROPOFF_CHARGE;
  }

  public String getP0695_REGULAR_MILEAGE_CHARGE() {
    return P0695_REGULAR_MILEAGE_CHARGE;
  }

  public void setP0695_REGULAR_MILEAGE_CHARGE(String p0695_REGULAR_MILEAGE_CHARGE) {
    P0695_REGULAR_MILEAGE_CHARGE = p0695_REGULAR_MILEAGE_CHARGE;
  }

  public String getP0696_EXTRA_MILEAGE_CHARGE() {
    return P0696_EXTRA_MILEAGE_CHARGE;
  }

  public void setP0696_EXTRA_MILEAGE_CHARGE(String p0696_EXTRA_MILEAGE_CHARGE) {
    P0696_EXTRA_MILEAGE_CHARGE = p0696_EXTRA_MILEAGE_CHARGE;
  }

  public String getP0697_LATE_CHARGE() {
    return P0697_LATE_CHARGE;
  }

  public void setP0697_LATE_CHARGE(String p0697_LATE_CHARGE) {
    P0697_LATE_CHARGE = p0697_LATE_CHARGE;
  }

  public String getP0698_FUEL_CHARGE() {
    return P0698_FUEL_CHARGE;
  }

  public void setP0698_FUEL_CHARGE(String p0698_FUEL_CHARGE) {
    P0698_FUEL_CHARGE = p0698_FUEL_CHARGE;
  }

  public String getP0699_LODGING_TOTAL_TAX_AMOUNT() {
    return P0699_LODGING_TOTAL_TAX_AMOUNT;
  }

  public void setP0699_LODGING_TOTAL_TAX_AMOUNT(String p0699_LODGING_TOTAL_TAX_AMOUNT) {
    P0699_LODGING_TOTAL_TAX_AMOUNT = p0699_LODGING_TOTAL_TAX_AMOUNT;
  }

  public String getP0700_TOWING_CHARGES() {
    return P0700_TOWING_CHARGES;
  }

  public void setP0700_TOWING_CHARGES(String p0700_TOWING_CHARGES) {
    P0700_TOWING_CHARGES = p0700_TOWING_CHARGES;
  }

  public String getP0701_EXTRA_CHARGES() {
    return P0701_EXTRA_CHARGES;
  }

  public void setP0701_EXTRA_CHARGES(String p0701_EXTRA_CHARGES) {
    P0701_EXTRA_CHARGES = p0701_EXTRA_CHARGES;
  }

  public String getP0702_OTHER_CHARGES() {
    return P0702_OTHER_CHARGES;
  }

  public void setP0702_OTHER_CHARGES(String p0702_OTHER_CHARGES) {
    P0702_OTHER_CHARGES = p0702_OTHER_CHARGES;
  }

  public String getP0703_TOTAL_ROOM_NIGHTS() {
    return P0703_TOTAL_ROOM_NIGHTS;
  }

  public void setP0703_TOTAL_ROOM_NIGHTS(String p0703_TOTAL_ROOM_NIGHTS) {
    P0703_TOTAL_ROOM_NIGHTS = p0703_TOTAL_ROOM_NIGHTS;
  }

  public String getP0704_PREPAID_EXPENSES() {
    return P0704_PREPAID_EXPENSES;
  }

  public void setP0704_PREPAID_EXPENSES(String p0704_PREPAID_EXPENSES) {
    P0704_PREPAID_EXPENSES = p0704_PREPAID_EXPENSES;
  }

  public String getP0705_TOTAL_NONROOM_TAX_AMOUNT() {
    return P0705_TOTAL_NONROOM_TAX_AMOUNT;
  }

  public void setP0705_TOTAL_NONROOM_TAX_AMOUNT(String p0705_TOTAL_NONROOM_TAX_AMOUNT) {
    P0705_TOTAL_NONROOM_TAX_AMOUNT = p0705_TOTAL_NONROOM_TAX_AMOUNT;
  }

  public String getP0706_CASH_ADVANCES() {
    return P0706_CASH_ADVANCES;
  }

  public void setP0706_CASH_ADVANCES(String p0706_CASH_ADVANCES) {
    P0706_CASH_ADVANCES = p0706_CASH_ADVANCES;
  }

  public String getP0707_VALET_CHARGES() {
    return P0707_VALET_CHARGES;
  }

  public void setP0707_VALET_CHARGES(String p0707_VALET_CHARGES) {
    P0707_VALET_CHARGES = p0707_VALET_CHARGES;
  }

  public String getP0708_MOVIE_CHARGES() {
    return P0708_MOVIE_CHARGES;
  }

  public void setP0708_MOVIE_CHARGES(String p0708_MOVIE_CHARGES) {
    P0708_MOVIE_CHARGES = p0708_MOVIE_CHARGES;
  }

  public String getP0709_BUSINESS_CENTER_CHARGE() {
    return P0709_BUSINESS_CENTER_CHARGE;
  }

  public void setP0709_BUSINESS_CENTER_CHARGE(String p0709_BUSINESS_CENTER_CHARGE) {
    P0709_BUSINESS_CENTER_CHARGE = p0709_BUSINESS_CENTER_CHARGE;
  }

  public String getP0710_HEALTH_CLUB_CHARGES() {
    return P0710_HEALTH_CLUB_CHARGES;
  }

  public void setP0710_HEALTH_CLUB_CHARGES(String p0710_HEALTH_CLUB_CHARGES) {
    P0710_HEALTH_CLUB_CHARGES = p0710_HEALTH_CLUB_CHARGES;
  }

  public String getP0711_FIRE_SAFETY_ACT_INDICATOR() {
    return P0711_FIRE_SAFETY_ACT_INDICATOR;
  }

  public void setP0711_FIRE_SAFETY_ACT_INDICATOR(String p0711_FIRE_SAFETY_ACT_INDICATOR) {
    P0711_FIRE_SAFETY_ACT_INDICATOR = p0711_FIRE_SAFETY_ACT_INDICATOR;
  }

  public String getP0712_NET_FUEL_PRICE() {
    return P0712_NET_FUEL_PRICE;
  }

  public void setP0712_NET_FUEL_PRICE(String p0712_NET_FUEL_PRICE) {
    P0712_NET_FUEL_PRICE = p0712_NET_FUEL_PRICE;
  }

  public String getP0713_RESTRICTED_TICKET_INDICATOR() {
    return P0713_RESTRICTED_TICKET_INDICATOR;
  }

  public void setP0713_RESTRICTED_TICKET_INDICATOR(String p0713_RESTRICTED_TICKET_INDICATOR) {
    P0713_RESTRICTED_TICKET_INDICATOR = p0713_RESTRICTED_TICKET_INDICATOR;
  }

  public String getP0714_EXCHANGE_TICKET_AMOUNT() {
    return P0714_EXCHANGE_TICKET_AMOUNT;
  }

  public void setP0714_EXCHANGE_TICKET_AMOUNT(String p0714_EXCHANGE_TICKET_AMOUNT) {
    P0714_EXCHANGE_TICKET_AMOUNT = p0714_EXCHANGE_TICKET_AMOUNT;
  }

  public String getP0715_EXCHANGE_FEE_AMOUNT() {
    return P0715_EXCHANGE_FEE_AMOUNT;
  }

  public void setP0715_EXCHANGE_FEE_AMOUNT(String p0715_EXCHANGE_FEE_AMOUNT) {
    P0715_EXCHANGE_FEE_AMOUNT = p0715_EXCHANGE_FEE_AMOUNT;
  }

  public String getP0716_TRAVEL_AUTHORIZATION_CODE() {
    return P0716_TRAVEL_AUTHORIZATION_CODE;
  }

  public void setP0716_TRAVEL_AUTHORIZATION_CODE(String p0716_TRAVEL_AUTHORIZATION_CODE) {
    P0716_TRAVEL_AUTHORIZATION_CODE = p0716_TRAVEL_AUTHORIZATION_CODE;
  }

  public String getP0717_IATA_CLIENT_CODE() {
    return P0717_IATA_CLIENT_CODE;
  }

  public void setP0717_IATA_CLIENT_CODE(String p0717_IATA_CLIENT_CODE) {
    P0717_IATA_CLIENT_CODE = p0717_IATA_CLIENT_CODE;
  }

  public String getP0718_EMPLOYEE_TEMP_NAME_ID() {
    return P0718_EMPLOYEE_TEMP_NAME_ID;
  }

  public void setP0718_EMPLOYEE_TEMP_NAME_ID(String p0718_EMPLOYEE_TEMP_NAME_ID) {
    P0718_EMPLOYEE_TEMP_NAME_ID = p0718_EMPLOYEE_TEMP_NAME_ID;
  }

  public String getP0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID() {
    return P0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID;
  }

  public void setP0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID(
      String p0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID) {
    P0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID = p0719_EMPLOYEE_SOCIAL_SECURITY_NUMBER_ID;
  }

  public String getP0720_JOB_DESCRIPTION() {
    return P0720_JOB_DESCRIPTION;
  }

  public void setP0720_JOB_DESCRIPTION(String p0720_JOB_DESCRIPTION) {
    P0720_JOB_DESCRIPTION = p0720_JOB_DESCRIPTION;
  }

  public String getP0721_JOB_CODE() {
    return P0721_JOB_CODE;
  }

  public void setP0721_JOB_CODE(String p0721_JOB_CODE) {
    P0721_JOB_CODE = p0721_JOB_CODE;
  }

  public String getP0722_FLAT_RATE_INDICATOR() {
    return P0722_FLAT_RATE_INDICATOR;
  }

  public void setP0722_FLAT_RATE_INDICATOR(String p0722_FLAT_RATE_INDICATOR) {
    P0722_FLAT_RATE_INDICATOR = p0722_FLAT_RATE_INDICATOR;
  }

  public String getP0723_REGULAR_HOURS_WORKED() {
    return P0723_REGULAR_HOURS_WORKED;
  }

  public void setP0723_REGULAR_HOURS_WORKED(String p0723_REGULAR_HOURS_WORKED) {
    P0723_REGULAR_HOURS_WORKED = p0723_REGULAR_HOURS_WORKED;
  }

  public String getP0724_REGULAR_HOURS_RATE() {
    return P0724_REGULAR_HOURS_RATE;
  }

  public void setP0724_REGULAR_HOURS_RATE(String p0724_REGULAR_HOURS_RATE) {
    P0724_REGULAR_HOURS_RATE = p0724_REGULAR_HOURS_RATE;
  }

  public String getP0725_OVERTIME_HOURS_WORKED() {
    return P0725_OVERTIME_HOURS_WORKED;
  }

  public void setP0725_OVERTIME_HOURS_WORKED(String p0725_OVERTIME_HOURS_WORKED) {
    P0725_OVERTIME_HOURS_WORKED = p0725_OVERTIME_HOURS_WORKED;
  }

  public String getP0726_OVERTIME_HOURS_RATE() {
    return P0726_OVERTIME_HOURS_RATE;
  }

  public void setP0726_OVERTIME_HOURS_RATE(String p0726_OVERTIME_HOURS_RATE) {
    P0726_OVERTIME_HOURS_RATE = p0726_OVERTIME_HOURS_RATE;
  }

  public String getP0727_TEMP_START_DATE() {
    return P0727_TEMP_START_DATE;
  }

  public void setP0727_TEMP_START_DATE(String p0727_TEMP_START_DATE) {
    P0727_TEMP_START_DATE = p0727_TEMP_START_DATE;
  }

  public String getP0728_TEMP_WEEK_ENDING() {
    return P0728_TEMP_WEEK_ENDING;
  }

  public void setP0728_TEMP_WEEK_ENDING(String p0728_TEMP_WEEK_ENDING) {
    P0728_TEMP_WEEK_ENDING = p0728_TEMP_WEEK_ENDING;
  }

  public String getP0729_REQUESTOR_NAMEID() {
    return P0729_REQUESTOR_NAMEID;
  }

  public void setP0729_REQUESTOR_NAMEID(String p0729_REQUESTOR_NAMEID) {
    P0729_REQUESTOR_NAMEID = p0729_REQUESTOR_NAMEID;
  }

  public String getP0730_SUPERVISOR_REPORTS() {
    return P0730_SUPERVISOR_REPORTS;
  }

  public void setP0730_SUPERVISOR_REPORTS(String p0730_SUPERVISOR_REPORTS) {
    P0730_SUPERVISOR_REPORTS = p0730_SUPERVISOR_REPORTS;
  }

  public String getP0731_TIME_SHEET_NUMBER() {
    return P0731_TIME_SHEET_NUMBER;
  }

  public void setP0731_TIME_SHEET_NUMBER(String p0731_TIME_SHEET_NUMBER) {
    P0731_TIME_SHEET_NUMBER = p0731_TIME_SHEET_NUMBER;
  }

  public String getP0732_DISCOUNT_AMOUNT() {
    return P0732_DISCOUNT_AMOUNT;
  }

  public void setP0732_DISCOUNT_AMOUNT(String p0732_DISCOUNT_AMOUNT) {
    P0732_DISCOUNT_AMOUNT = p0732_DISCOUNT_AMOUNT;
  }

  public String getP0733_SUBTOTAL_AMOUNT() {
    return P0733_SUBTOTAL_AMOUNT;
  }

  public void setP0733_SUBTOTAL_AMOUNT(String p0733_SUBTOTAL_AMOUNT) {
    P0733_SUBTOTAL_AMOUNT = p0733_SUBTOTAL_AMOUNT;
  }

  public String getP0734_MISCELLANEOUS_EXPENSES() {
    return P0734_MISCELLANEOUS_EXPENSES;
  }

  public void setP0734_MISCELLANEOUS_EXPENSES(String p0734_MISCELLANEOUS_EXPENSES) {
    P0734_MISCELLANEOUS_EXPENSES = p0734_MISCELLANEOUS_EXPENSES;
  }

  public String getP0735_SERVICE_DESCRIPTOR_CODE() {
    return P0735_SERVICE_DESCRIPTOR_CODE;
  }

  public void setP0735_SERVICE_DESCRIPTOR_CODE(String p0735_SERVICE_DESCRIPTOR_CODE) {
    P0735_SERVICE_DESCRIPTOR_CODE = p0735_SERVICE_DESCRIPTOR_CODE;
  }

  public String getP0736_TRACKING_NUMBER_PICKUP_NUMBER() {
    return P0736_TRACKING_NUMBER_PICKUP_NUMBER;
  }

  public void setP0736_TRACKING_NUMBER_PICKUP_NUMBER(String p0736_TRACKING_NUMBER_PICKUP_NUMBER) {
    P0736_TRACKING_NUMBER_PICKUP_NUMBER = p0736_TRACKING_NUMBER_PICKUP_NUMBER;
  }

  public String getP0737_SHIPPING_NET_AMOUNTS() {
    return P0737_SHIPPING_NET_AMOUNTS;
  }

  public void setP0737_SHIPPING_NET_AMOUNTS(String p0737_SHIPPING_NET_AMOUNTS) {
    P0737_SHIPPING_NET_AMOUNTS = p0737_SHIPPING_NET_AMOUNTS;
  }

  public String getP0738_INCENTIVE_AMOUNT() {
    return P0738_INCENTIVE_AMOUNT;
  }

  public void setP0738_INCENTIVE_AMOUNT(String p0738_INCENTIVE_AMOUNT) {
    P0738_INCENTIVE_AMOUNT = p0738_INCENTIVE_AMOUNT;
  }

  public String getP0739_PICKUP_DATE() {
    return P0739_PICKUP_DATE;
  }

  public void setP0739_PICKUP_DATE(String p0739_PICKUP_DATE) {
    P0739_PICKUP_DATE = p0739_PICKUP_DATE;
  }

  public String getP0740_DELIVERY_DATE() {
    return P0740_DELIVERY_DATE;
  }

  public void setP0740_DELIVERY_DATE(String p0740_DELIVERY_DATE) {
    P0740_DELIVERY_DATE = p0740_DELIVERY_DATE;
  }

  public String getP0741_NUMBER_PACKAGES() {
    return P0741_NUMBER_PACKAGES;
  }

  public void setP0741_NUMBER_PACKAGES(String p0741_NUMBER_PACKAGES) {
    P0741_NUMBER_PACKAGES = p0741_NUMBER_PACKAGES;
  }

  public String getP0742_PACKAGE_WEIGHT() {
    return P0742_PACKAGE_WEIGHT;
  }

  public void setP0742_PACKAGE_WEIGHT(String p0742_PACKAGE_WEIGHT) {
    P0742_PACKAGE_WEIGHT = p0742_PACKAGE_WEIGHT;
  }

  public String getP0743_UNTI_OF_MEASURE() {
    return P0743_UNTI_OF_MEASURE;
  }

  public void setP0743_UNTI_OF_MEASURE(String p0743_UNTI_OF_MEASURE) {
    P0743_UNTI_OF_MEASURE = p0743_UNTI_OF_MEASURE;
  }

  public String getP0744_SHIPPING_PARTY_INFO() {
    return P0744_SHIPPING_PARTY_INFO;
  }

  public void setP0744_SHIPPING_PARTY_INFO(String p0744_SHIPPING_PARTY_INFO) {
    P0744_SHIPPING_PARTY_INFO = p0744_SHIPPING_PARTY_INFO;
  }

  public String getP0745_SHIPPING_PARTY_ADDRESS() {
    return P0745_SHIPPING_PARTY_ADDRESS;
  }

  public void setP0745_SHIPPING_PARTY_ADDRESS(String p0745_SHIPPING_PARTY_ADDRESS) {
    P0745_SHIPPING_PARTY_ADDRESS = p0745_SHIPPING_PARTY_ADDRESS;
  }

  public String getP0746_SHIPPING_PARTY_POSTAL_INFO() {
    return P0746_SHIPPING_PARTY_POSTAL_INFO;
  }

  public void setP0746_SHIPPING_PARTY_POSTAL_INFO(String p0746_SHIPPING_PARTY_POSTAL_INFO) {
    P0746_SHIPPING_PARTY_POSTAL_INFO = p0746_SHIPPING_PARTY_POSTAL_INFO;
  }

  public String getP0747_SHIPPING_PARTY_CONTACT() {
    return P0747_SHIPPING_PARTY_CONTACT;
  }

  public void setP0747_SHIPPING_PARTY_CONTACT(String p0747_SHIPPING_PARTY_CONTACT) {
    P0747_SHIPPING_PARTY_CONTACT = p0747_SHIPPING_PARTY_CONTACT;
  }

  public String getP0748_DELIVERY_PARTY_INFO() {
    return P0748_DELIVERY_PARTY_INFO;
  }

  public void setP0748_DELIVERY_PARTY_INFO(String p0748_DELIVERY_PARTY_INFO) {
    P0748_DELIVERY_PARTY_INFO = p0748_DELIVERY_PARTY_INFO;
  }

  public String getP0749_DELIVERY_PARTY_ADDRESS_INFO() {
    return P0749_DELIVERY_PARTY_ADDRESS_INFO;
  }

  public void setP0749_DELIVERY_PARTY_ADDRESS_INFO(String p0749_DELIVERY_PARTY_ADDRESS_INFO) {
    P0749_DELIVERY_PARTY_ADDRESS_INFO = p0749_DELIVERY_PARTY_ADDRESS_INFO;
  }

  public String getP0750_DELIVERY_PARTY_POSTAL_INFO() {
    return P0750_DELIVERY_PARTY_POSTAL_INFO;
  }

  public void setP0750_DELIVERY_PARTY_POSTAL_INFO(String p0750_DELIVERY_PARTY_POSTAL_INFO) {
    P0750_DELIVERY_PARTY_POSTAL_INFO = p0750_DELIVERY_PARTY_POSTAL_INFO;
  }

  public String getP0751_DETAIL_TAX_AMOUNT4() {
    return P0751_DETAIL_TAX_AMOUNT4;
  }

  public void setP0751_DETAIL_TAX_AMOUNT4(String p0751_DETAIL_TAX_AMOUNT4) {
    P0751_DETAIL_TAX_AMOUNT4 = p0751_DETAIL_TAX_AMOUNT4;
  }

  public String getP0752_DETAIL_TAX_AMOUNT5() {
    return P0752_DETAIL_TAX_AMOUNT5;
  }

  public void setP0752_DETAIL_TAX_AMOUNT5(String p0752_DETAIL_TAX_AMOUNT5) {
    P0752_DETAIL_TAX_AMOUNT5 = p0752_DETAIL_TAX_AMOUNT5;
  }

  public String getP0753_DETAIL_TAX_AMOUNT6() {
    return P0753_DETAIL_TAX_AMOUNT6;
  }

  public void setP0753_DETAIL_TAX_AMOUNT6(String p0753_DETAIL_TAX_AMOUNT6) {
    P0753_DETAIL_TAX_AMOUNT6 = p0753_DETAIL_TAX_AMOUNT6;
  }

  public String getP0754_DELIVERY_PARTY_CONTACT() {
    return P0754_DELIVERY_PARTY_CONTACT;
  }

  public void setP0754_DELIVERY_PARTY_CONTACT(String p0754_DELIVERY_PARTY_CONTACT) {
    P0754_DELIVERY_PARTY_CONTACT = p0754_DELIVERY_PARTY_CONTACT;
  }

  public String getP0755_LINE_ITEM_TOTAL_AMOUNT() {
    return P0755_LINE_ITEM_TOTAL_AMOUNT;
  }

  public void setP0755_LINE_ITEM_TOTAL_AMOUNT(String p0755_LINE_ITEM_TOTAL_AMOUNT) {
    P0755_LINE_ITEM_TOTAL_AMOUNT = p0755_LINE_ITEM_TOTAL_AMOUNT;
  }

  public String getP0756_PASSENGER_DESCRIPTION() {
    return P0756_PASSENGER_DESCRIPTION;
  }

  public void setP0756_PASSENGER_DESCRIPTION(String p0756_PASSENGER_DESCRIPTION) {
    P0756_PASSENGER_DESCRIPTION = p0756_PASSENGER_DESCRIPTION;
  }

  public String getP0757_TRANSPORTATION_SERVICE_PROVIDER() {
    return P0757_TRANSPORTATION_SERVICE_PROVIDER;
  }

  public void setP0757_TRANSPORTATION_SERVICE_PROVIDER(
      String p0757_TRANSPORTATION_SERVICE_PROVIDER) {
    P0757_TRANSPORTATION_SERVICE_PROVIDER = p0757_TRANSPORTATION_SERVICE_PROVIDER;
  }

  public String getP0758_TRANSPORTATION_SERVICES_OFERED() {
    return P0758_TRANSPORTATION_SERVICES_OFERED;
  }

  public void setP0758_TRANSPORTATION_SERVICES_OFERED(
      String p0758_TRANSPORTATION_SERVICES_OFERED) {
    P0758_TRANSPORTATION_SERVICES_OFERED = p0758_TRANSPORTATION_SERVICES_OFERED;
  }

  public String getP0759_DELIVERY_ORDER_NUMBER() {
    return P0759_DELIVERY_ORDER_NUMBER;
  }

  public void setP0759_DELIVERY_ORDER_NUMBER(String p0759_DELIVERY_ORDER_NUMBER) {
    P0759_DELIVERY_ORDER_NUMBER = p0759_DELIVERY_ORDER_NUMBER;
  }

  public String getP0760_CREDIT_CARD_SLIP_NUMBER() {
    return P0760_CREDIT_CARD_SLIP_NUMBER;
  }

  public void setP0760_CREDIT_CARD_SLIP_NUMBER(String p0760_CREDIT_CARD_SLIP_NUMBER) {
    P0760_CREDIT_CARD_SLIP_NUMBER = p0760_CREDIT_CARD_SLIP_NUMBER;
  }

  public String getP0761_TRAVEL_AGENCY_ID() {
    return P0761_TRAVEL_AGENCY_ID;
  }

  public void setP0761_TRAVEL_AGENCY_ID(String p0761_TRAVEL_AGENCY_ID) {
    P0761_TRAVEL_AGENCY_ID = p0761_TRAVEL_AGENCY_ID;
  }

  public String getP0762_DATA_SOURCE() {
    return P0762_DATA_SOURCE;
  }

  public void setP0762_DATA_SOURCE(String p0762_DATA_SOURCE) {
    P0762_DATA_SOURCE = p0762_DATA_SOURCE;
  }

  public String getP0763_VAT_SUPPRESSION_INDICATOR() {
    return P0763_VAT_SUPPRESSION_INDICATOR;
  }

  public void setP0763_VAT_SUPPRESSION_INDICATOR(String p0763_VAT_SUPPRESSION_INDICATOR) {
    P0763_VAT_SUPPRESSION_INDICATOR = p0763_VAT_SUPPRESSION_INDICATOR;
  }

  public String getP0799_TEST_CASE_TRACEABILITY_INDENTIFIERS() {
    return P0799_TEST_CASE_TRACEABILITY_INDENTIFIERS;
  }

  public void setP0799_TEST_CASE_TRACEABILITY_INDENTIFIERS(
      String p0799_TEST_CASE_TRACEABILITY_INDENTIFIERS) {
    P0799_TEST_CASE_TRACEABILITY_INDENTIFIERS = p0799_TEST_CASE_TRACEABILITY_INDENTIFIERS;
  }

  public String getP1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA() {
    return P1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA;
  }

  public void setP1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA(
      String p1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA) {
    P1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA = p1000_MEMBER_TO_MEMBER_PROPRIETARY_DATA;
  }

  public String getP0001_MAPPING_SERVICE_ACCOUNT_NUMBER() {
    return P0001_MAPPING_SERVICE_ACCOUNT_NUMBER;
  }

  public void setP0001_MAPPING_SERVICE_ACCOUNT_NUMBER(
      String p0001_MAPPING_SERVICE_ACCOUNT_NUMBER) {
    P0001_MAPPING_SERVICE_ACCOUNT_NUMBER = p0001_MAPPING_SERVICE_ACCOUNT_NUMBER;
  }

  public String getP0002_GCMS_PRODUCT_IDENTIFIER() {
    return P0002_GCMS_PRODUCT_IDENTIFIER;
  }

  public void setP0002_GCMS_PRODUCT_IDENTIFIER(String p0002_GCMS_PRODUCT_IDENTIFIER) {
    P0002_GCMS_PRODUCT_IDENTIFIER = p0002_GCMS_PRODUCT_IDENTIFIER;
  }

  public String getP0003_LICENSED_PRODUCT_IDENTIFIER() {
    return P0003_LICENSED_PRODUCT_IDENTIFIER;
  }

  public void setP0003_LICENSED_PRODUCT_IDENTIFIER(String p0003_LICENSED_PRODUCT_IDENTIFIER) {
    P0003_LICENSED_PRODUCT_IDENTIFIER = p0003_LICENSED_PRODUCT_IDENTIFIER;
  }

  public String getP0005_MESSAGE_ERROR_INDICATOR() {
    return P0005_MESSAGE_ERROR_INDICATOR;
  }

  public void setP0005_MESSAGE_ERROR_INDICATOR(String p0005_MESSAGE_ERROR_INDICATOR) {
    P0005_MESSAGE_ERROR_INDICATOR = p0005_MESSAGE_ERROR_INDICATOR;
  }

  public String getP0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT() {
    return P0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT;
  }

  public void setP0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT(
      String p0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT) {
    P0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT = p0006_APPLIED_BUSINESS_SERVICE_ARRANGEMENT;
  }

  public String getP0023_TERMINAL_TYPE() {
    return P0023_TERMINAL_TYPE;
  }

  public void setP0023_TERMINAL_TYPE(String p0023_TERMINAL_TYPE) {
    P0023_TERMINAL_TYPE = p0023_TERMINAL_TYPE;
  }

  public String getP0025_MESSAGE_REVERSAL_INDICATOR() {
    return P0025_MESSAGE_REVERSAL_INDICATOR;
  }

  public void setP0025_MESSAGE_REVERSAL_INDICATOR(String p0025_MESSAGE_REVERSAL_INDICATOR) {
    P0025_MESSAGE_REVERSAL_INDICATOR = p0025_MESSAGE_REVERSAL_INDICATOR;
  }

  public String getP0026_FILE_REVERSAL_INDICATOR() {
    return P0026_FILE_REVERSAL_INDICATOR;
  }

  public void setP0026_FILE_REVERSAL_INDICATOR(String p0026_FILE_REVERSAL_INDICATOR) {
    P0026_FILE_REVERSAL_INDICATOR = p0026_FILE_REVERSAL_INDICATOR;
  }

  public String getP0043_PROGRAM_REGISTRATION_ID() {
    return P0043_PROGRAM_REGISTRATION_ID;
  }

  public void setP0043_PROGRAM_REGISTRATION_ID(String p0043_PROGRAM_REGISTRATION_ID) {
    P0043_PROGRAM_REGISTRATION_ID = p0043_PROGRAM_REGISTRATION_ID;
  }

  public String getP0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR() {
    return P0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR;
  }

  public void setP0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR(
      String p0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR) {
    P0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR = p0052_ELECTRONIC_COMMERCE_SECURITY_LEVEL_INDICATOR;
  }

  public String getP0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR() {
    return P0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR;
  }

  public void setP0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR(
      String p0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR) {
    P0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR = p0056_MASTERDCARD_ELECTRONIC_CARD_INDICATOR;
  }

  public String getP0057_TRANSACTION_CATEGORY_INDICATOR() {
    return P0057_TRANSACTION_CATEGORY_INDICATOR;
  }

  public void setP0057_TRANSACTION_CATEGORY_INDICATOR(
      String p0057_TRANSACTION_CATEGORY_INDICATOR) {
    P0057_TRANSACTION_CATEGORY_INDICATOR = p0057_TRANSACTION_CATEGORY_INDICATOR;
  }

  public String getP0105_FILE_ID() {
    return P0105_FILE_ID;
  }

  public void setP0105_FILE_ID(String p0105_FILE_ID) {
    P0105_FILE_ID = p0105_FILE_ID;
  }

  public String getP0110_TRANSMISSION_ID() {
    return P0110_TRANSMISSION_ID;
  }

  public void setP0110_TRANSMISSION_ID(String p0110_TRANSMISSION_ID) {
    P0110_TRANSMISSION_ID = p0110_TRANSMISSION_ID;
  }

  public String getP0122_PROCESSING_MODE() {
    return P0122_PROCESSING_MODE;
  }

  public void setP0122_PROCESSING_MODE(String p0122_PROCESSING_MODE) {
    P0122_PROCESSING_MODE = p0122_PROCESSING_MODE;
  }

  public String getP0137_FEE_COLLECTION_CONTROL_NUMBER() {
    return P0137_FEE_COLLECTION_CONTROL_NUMBER;
  }

  public void setP0137_FEE_COLLECTION_CONTROL_NUMBER(String p0137_FEE_COLLECTION_CONTROL_NUMBER) {
    P0137_FEE_COLLECTION_CONTROL_NUMBER = p0137_FEE_COLLECTION_CONTROL_NUMBER;
  }

  public String getP0138_SOURCE_MESSAGE_NUMBERID() {
    return P0138_SOURCE_MESSAGE_NUMBERID;
  }

  public void setP0138_SOURCE_MESSAGE_NUMBERID(String p0138_SOURCE_MESSAGE_NUMBERID) {
    P0138_SOURCE_MESSAGE_NUMBERID = p0138_SOURCE_MESSAGE_NUMBERID;
  }

  public String getP0146_AMOUNTS_TRANSACTION_FEE() {
    return P0146_AMOUNTS_TRANSACTION_FEE;
  }

  public void setP0146_AMOUNTS_TRANSACTION_FEE(String p0146_AMOUNTS_TRANSACTION_FEE) {
    P0146_AMOUNTS_TRANSACTION_FEE = p0146_AMOUNTS_TRANSACTION_FEE;
  }

  public String getP0148_CURRENCY_EXPONENTS() {
    return P0148_CURRENCY_EXPONENTS;
  }

  public void setP0148_CURRENCY_EXPONENTS(String p0148_CURRENCY_EXPONENTS) {
    P0148_CURRENCY_EXPONENTS = p0148_CURRENCY_EXPONENTS;
  }

  public String getP0149_CURRENCY_CODES_AMOUNTS_ORIGINAL() {
    return P0149_CURRENCY_CODES_AMOUNTS_ORIGINAL;
  }

  public void setP0149_CURRENCY_CODES_AMOUNTS_ORIGINAL(
      String p0149_CURRENCY_CODES_AMOUNTS_ORIGINAL) {
    P0149_CURRENCY_CODES_AMOUNTS_ORIGINAL = p0149_CURRENCY_CODES_AMOUNTS_ORIGINAL;
  }

  public String getP0158_AMOUNTS_TRANSACTION_FEE() {
    return P0158_AMOUNTS_TRANSACTION_FEE;
  }

  public void setP0158_AMOUNTS_TRANSACTION_FEE(String p0158_AMOUNTS_TRANSACTION_FEE) {
    P0158_AMOUNTS_TRANSACTION_FEE = p0158_AMOUNTS_TRANSACTION_FEE;
  }

  public String getP0159_SETTELMENT_DATA() {
    return P0159_SETTELMENT_DATA;
  }

  public void setP0159_SETTELMENT_DATA(String p0159_SETTELMENT_DATA) {
    P0159_SETTELMENT_DATA = p0159_SETTELMENT_DATA;
  }

  public String getP0160_SETTELMENT_DATA_MULTIPLE() {
    return P0160_SETTELMENT_DATA_MULTIPLE;
  }

  public void setP0160_SETTELMENT_DATA_MULTIPLE(String p0160_SETTELMENT_DATA_MULTIPLE) {
    P0160_SETTELMENT_DATA_MULTIPLE = p0160_SETTELMENT_DATA_MULTIPLE;
  }

  public String getP0164_CURRENCY_CROSS_RATES() {
    return P0164_CURRENCY_CROSS_RATES;
  }

  public void setP0164_CURRENCY_CROSS_RATES(String p0164_CURRENCY_CROSS_RATES) {
    P0164_CURRENCY_CROSS_RATES = p0164_CURRENCY_CROSS_RATES;
  }

  public String getP0165_SETTELMENT_INDICATOR() {
    return P0165_SETTELMENT_INDICATOR;
  }

  public void setP0165_SETTELMENT_INDICATOR(String p0165_SETTELMENT_INDICATOR) {
    P0165_SETTELMENT_INDICATOR = p0165_SETTELMENT_INDICATOR;
  }

  public String getP0170_CARD_ACCEPTOR_INQUIRY_INFO() {
    return P0170_CARD_ACCEPTOR_INQUIRY_INFO;
  }

  public void setP0170_CARD_ACCEPTOR_INQUIRY_INFO(String p0170_CARD_ACCEPTOR_INQUIRY_INFO) {
    P0170_CARD_ACCEPTOR_INQUIRY_INFO = p0170_CARD_ACCEPTOR_INQUIRY_INFO;
  }

  public String getP0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA() {
    return P0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA;
  }

  public void setP0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA(
      String p0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA) {
    P0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA = p0171_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA;
  }

  public String getP0172_SOLE_PROPRIETOR_NAME() {
    return P0172_SOLE_PROPRIETOR_NAME;
  }

  public void setP0172_SOLE_PROPRIETOR_NAME(String p0172_SOLE_PROPRIETOR_NAME) {
    P0172_SOLE_PROPRIETOR_NAME = p0172_SOLE_PROPRIETOR_NAME;
  }

  public String getP0173_LEGAL_CORPORATE_NAME() {
    return P0173_LEGAL_CORPORATE_NAME;
  }

  public void setP0173_LEGAL_CORPORATE_NAME(String p0173_LEGAL_CORPORATE_NAME) {
    P0173_LEGAL_CORPORATE_NAME = p0173_LEGAL_CORPORATE_NAME;
  }

  public String getP0174_DUN_BRADSTREET_NUMBER() {
    return P0174_DUN_BRADSTREET_NUMBER;
  }

  public void setP0174_DUN_BRADSTREET_NUMBER(String p0174_DUN_BRADSTREET_NUMBER) {
    P0174_DUN_BRADSTREET_NUMBER = p0174_DUN_BRADSTREET_NUMBER;
  }

  public String getP0175_CARD_ACCEPTOR_URL() {
    return P0175_CARD_ACCEPTOR_URL;
  }

  public void setP0175_CARD_ACCEPTOR_URL(String p0175_CARD_ACCEPTOR_URL) {
    P0175_CARD_ACCEPTOR_URL = p0175_CARD_ACCEPTOR_URL;
  }

  public String getP0176_MASTERCARD_ASSIGNED_ID() {
    return P0176_MASTERCARD_ASSIGNED_ID;
  }

  public void setP0176_MASTERCARD_ASSIGNED_ID(String p0176_MASTERCARD_ASSIGNED_ID) {
    P0176_MASTERCARD_ASSIGNED_ID = p0176_MASTERCARD_ASSIGNED_ID;
  }

  public String getP0177_CROSS_BORDER() {
    return P0177_CROSS_BORDER;
  }

  public void setP0177_CROSS_BORDER(String p0177_CROSS_BORDER) {
    P0177_CROSS_BORDER = p0177_CROSS_BORDER;
  }

  public String getP0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2() {
    return P0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2;
  }

  public void setP0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2(
      String p0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2) {
    P0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2 = p0178_ALTERNATE_CARD_ACCEPTOR_DESCRIPTION_DATA2;
  }

  public String getP0189_POI_PHONE_DATA() {
    return P0189_POI_PHONE_DATA;
  }

  public void setP0189_POI_PHONE_DATA(String p0189_POI_PHONE_DATA) {
    P0189_POI_PHONE_DATA = p0189_POI_PHONE_DATA;
  }

  public String getP0190_PARTNER_ID_CODE() {
    return P0190_PARTNER_ID_CODE;
  }

  public void setP0190_PARTNER_ID_CODE(String p0190_PARTNER_ID_CODE) {
    P0190_PARTNER_ID_CODE = p0190_PARTNER_ID_CODE;
  }

  public String getP0191_ORIGINATING_MESSFORMAT() {
    return P0191_ORIGINATING_MESSFORMAT;
  }

  public void setP0191_ORIGINATING_MESSFORMAT(String p0191_ORIGINATING_MESSFORMAT) {
    P0191_ORIGINATING_MESSFORMAT = p0191_ORIGINATING_MESSFORMAT;
  }

  public String getP0192_PAYMENT_TRANSACTION_INITIATOR() {
    return P0192_PAYMENT_TRANSACTION_INITIATOR;
  }

  public void setP0192_PAYMENT_TRANSACTION_INITIATOR(String p0192_PAYMENT_TRANSACTION_INITIATOR) {
    P0192_PAYMENT_TRANSACTION_INITIATOR = p0192_PAYMENT_TRANSACTION_INITIATOR;
  }

  public String getP0195_INSTALLMENT_DATA() {
    return P0195_INSTALLMENT_DATA;
  }

  public void setP0195_INSTALLMENT_DATA(String p0195_INSTALLMENT_DATA) {
    P0195_INSTALLMENT_DATA = p0195_INSTALLMENT_DATA;
  }

  public String getP0196_MOBILE_PHONE_RELOAD_DATA() {
    return P0196_MOBILE_PHONE_RELOAD_DATA;
  }

  public void setP0196_MOBILE_PHONE_RELOAD_DATA(String p0196_MOBILE_PHONE_RELOAD_DATA) {
    P0196_MOBILE_PHONE_RELOAD_DATA = p0196_MOBILE_PHONE_RELOAD_DATA;
  }

  public String getP0197_NATIONAL_USE_TAX_DATA() {
    return P0197_NATIONAL_USE_TAX_DATA;
  }

  public void setP0197_NATIONAL_USE_TAX_DATA(String p0197_NATIONAL_USE_TAX_DATA) {
    P0197_NATIONAL_USE_TAX_DATA = p0197_NATIONAL_USE_TAX_DATA;
  }

  public String getP0228_RETRIEVAL_DOCUMENT_CODE() {
    return P0228_RETRIEVAL_DOCUMENT_CODE;
  }

  public void setP0228_RETRIEVAL_DOCUMENT_CODE(String p0228_RETRIEVAL_DOCUMENT_CODE) {
    P0228_RETRIEVAL_DOCUMENT_CODE = p0228_RETRIEVAL_DOCUMENT_CODE;
  }

  public String getP0230_FULFILLEMENT_DOCUMENT_CODE() {
    return P0230_FULFILLEMENT_DOCUMENT_CODE;
  }

  public void setP0230_FULFILLEMENT_DOCUMENT_CODE(String p0230_FULFILLEMENT_DOCUMENT_CODE) {
    P0230_FULFILLEMENT_DOCUMENT_CODE = p0230_FULFILLEMENT_DOCUMENT_CODE;
  }

  public String getP0241_MASTERCOM_CONTROL_NUMBER() {
    return P0241_MASTERCOM_CONTROL_NUMBER;
  }

  public void setP0241_MASTERCOM_CONTROL_NUMBER(String p0241_MASTERCOM_CONTROL_NUMBER) {
    P0241_MASTERCOM_CONTROL_NUMBER = p0241_MASTERCOM_CONTROL_NUMBER;
  }

  public String getP0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA() {
    return P0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  }

  public void setP0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA(
      String p0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA) {
    P0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA = p0243_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  }

  public String getP0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES() {
    return P0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES;
  }

  public void setP0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES(
      String p0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES) {
    P0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES = p0244_MASTERCOM_CHARGEBACK_SUPPORT_DOC_DATES;
  }

  public String getP0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE() {
    return P0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE;
  }

  public void setP0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE(
      String p0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE) {
    P0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE = p0245_MASTERCOM_ARBITRATION_CHARGEBACK_SENDER_PROCESS_CODE;
  }

  public String getP0246_MASTERCOM_SENDER_MEMO() {
    return P0246_MASTERCOM_SENDER_MEMO;
  }

  public void setP0246_MASTERCOM_SENDER_MEMO(String p0246_MASTERCOM_SENDER_MEMO) {
    P0246_MASTERCOM_SENDER_MEMO = p0246_MASTERCOM_SENDER_MEMO;
  }

  public String getP0247_MASTERCOM_RECEIVER_MEMO() {
    return P0247_MASTERCOM_RECEIVER_MEMO;
  }

  public void setP0247_MASTERCOM_RECEIVER_MEMO(String p0247_MASTERCOM_RECEIVER_MEMO) {
    P0247_MASTERCOM_RECEIVER_MEMO = p0247_MASTERCOM_RECEIVER_MEMO;
  }

  public String getP0248_MASTERCOM_IMAGE_REVIEW_MEMO() {
    return P0248_MASTERCOM_IMAGE_REVIEW_MEMO;
  }

  public void setP0248_MASTERCOM_IMAGE_REVIEW_MEMO(String p0248_MASTERCOM_IMAGE_REVIEW_MEMO) {
    P0248_MASTERCOM_IMAGE_REVIEW_MEMO = p0248_MASTERCOM_IMAGE_REVIEW_MEMO;
  }

  public String getP0249_MASTERCOM_RECORD_ID() {
    return P0249_MASTERCOM_RECORD_ID;
  }

  public void setP0249_MASTERCOM_RECORD_ID(String p0249_MASTERCOM_RECORD_ID) {
    P0249_MASTERCOM_RECORD_ID = p0249_MASTERCOM_RECORD_ID;
  }

  public String getP0250_MASTERCOM_ENDPOINTS() {
    return P0250_MASTERCOM_ENDPOINTS;
  }

  public void setP0250_MASTERCOM_ENDPOINTS(String p0250_MASTERCOM_ENDPOINTS) {
    P0250_MASTERCOM_ENDPOINTS = p0250_MASTERCOM_ENDPOINTS;
  }

  public String getP0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE() {
    return P0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE;
  }

  public void setP0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE(
      String p0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE) {
    P0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE = p0251_MASTERCOM_FULFILLMENT_DOCUMENT_CODE;
  }

  public String getP0252_MASTERCOM_IMAGE_METADATA() {
    return P0252_MASTERCOM_IMAGE_METADATA;
  }

  public void setP0252_MASTERCOM_IMAGE_METADATA(String p0252_MASTERCOM_IMAGE_METADATA) {
    P0252_MASTERCOM_IMAGE_METADATA = p0252_MASTERCOM_IMAGE_METADATA;
  }

  public String getP0253_MASTERCOM_SYSTEM_ENHANCED_DATA() {
    return P0253_MASTERCOM_SYSTEM_ENHANCED_DATA;
  }

  public void setP0253_MASTERCOM_SYSTEM_ENHANCED_DATA(
      String p0253_MASTERCOM_SYSTEM_ENHANCED_DATA) {
    P0253_MASTERCOM_SYSTEM_ENHANCED_DATA = p0253_MASTERCOM_SYSTEM_ENHANCED_DATA;
  }

  public String getP0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA() {
    return P0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  }

  public void setP0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA(
      String p0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA) {
    P0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA = p0254_MASTERCOM_RETRIEVAL_RESPONSE_DATA;
  }

  public String getP0255_MASTERCOM_MESSAGE_TYPE() {
    return P0255_MASTERCOM_MESSAGE_TYPE;
  }

  public void setP0255_MASTERCOM_MESSAGE_TYPE(String p0255_MASTERCOM_MESSAGE_TYPE) {
    P0255_MASTERCOM_MESSAGE_TYPE = p0255_MASTERCOM_MESSAGE_TYPE;
  }

  public String getP0260_EDIT_EXCLUSION_INDICATOR() {
    return P0260_EDIT_EXCLUSION_INDICATOR;
  }

  public void setP0260_EDIT_EXCLUSION_INDICATOR(String p0260_EDIT_EXCLUSION_INDICATOR) {
    P0260_EDIT_EXCLUSION_INDICATOR = p0260_EDIT_EXCLUSION_INDICATOR;
  }

  public String getP0261_RISK_MANAGEMENT_APPROVAL_CODE() {
    return P0261_RISK_MANAGEMENT_APPROVAL_CODE;
  }

  public void setP0261_RISK_MANAGEMENT_APPROVAL_CODE(String p0261_RISK_MANAGEMENT_APPROVAL_CODE) {
    P0261_RISK_MANAGEMENT_APPROVAL_CODE = p0261_RISK_MANAGEMENT_APPROVAL_CODE;
  }

  public String getP0262_DOCUMENTATION_INDICATOR() {
    return P0262_DOCUMENTATION_INDICATOR;
  }

  public void setP0262_DOCUMENTATION_INDICATOR(String p0262_DOCUMENTATION_INDICATOR) {
    P0262_DOCUMENTATION_INDICATOR = p0262_DOCUMENTATION_INDICATOR;
  }

  public String getP0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST() {
    return P0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST;
  }

  public void setP0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST(
      String p0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST) {
    P0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST = p0264_ORIGINAL_RETRIEVAL_REASON_FOR_REQUEST;
  }

  public String getP0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA() {
    return P0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA;
  }

  public void setP0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA(
      String p0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA) {
    P0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA = p0265_INITIAL_PRESENTMENT_FEE_COLLECTION_DATA;
  }

  public String getP0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA() {
    return P0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  }

  public void setP0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA(
      String p0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA) {
    P0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA = p0266_FIRST_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  }

  public String getP0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA() {
    return P0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  }

  public void setP0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA(
      String p0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA) {
    P0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA = p0267_SECOND_CHARGEBACK_FEE_COLLECTION_RETURN_DATA;
  }

  public String getP0268_AMOUNT_PARTIAL_TRANSACTION() {
    return P0268_AMOUNT_PARTIAL_TRANSACTION;
  }

  public void setP0268_AMOUNT_PARTIAL_TRANSACTION(String p0268_AMOUNT_PARTIAL_TRANSACTION) {
    P0268_AMOUNT_PARTIAL_TRANSACTION = p0268_AMOUNT_PARTIAL_TRANSACTION;
  }

  public String getP0280_SOURCE_FILE_ID() {
    return P0280_SOURCE_FILE_ID;
  }

  public void setP0280_SOURCE_FILE_ID(String p0280_SOURCE_FILE_ID) {
    P0280_SOURCE_FILE_ID = p0280_SOURCE_FILE_ID;
  }

  public String getP0300_RECONCILED_FILE() {
    return P0300_RECONCILED_FILE;
  }

  public void setP0300_RECONCILED_FILE(String p0300_RECONCILED_FILE) {
    P0300_RECONCILED_FILE = p0300_RECONCILED_FILE;
  }

  public String getP0301_FILE_AMOUNT_CHECKSUM() {
    return P0301_FILE_AMOUNT_CHECKSUM;
  }

  public void setP0301_FILE_AMOUNT_CHECKSUM(String p0301_FILE_AMOUNT_CHECKSUM) {
    P0301_FILE_AMOUNT_CHECKSUM = p0301_FILE_AMOUNT_CHECKSUM;
  }

  public String getP0302_RECONCILED_MEMBER_ACTIVITY() {
    return P0302_RECONCILED_MEMBER_ACTIVITY;
  }

  public void setP0302_RECONCILED_MEMBER_ACTIVITY(String p0302_RECONCILED_MEMBER_ACTIVITY) {
    P0302_RECONCILED_MEMBER_ACTIVITY = p0302_RECONCILED_MEMBER_ACTIVITY;
  }

  public String getP0306_FILE_MESSAGE_COUNTS() {
    return P0306_FILE_MESSAGE_COUNTS;
  }

  public void setP0306_FILE_MESSAGE_COUNTS(String p0306_FILE_MESSAGE_COUNTS) {
    P0306_FILE_MESSAGE_COUNTS = p0306_FILE_MESSAGE_COUNTS;
  }

  public String getP0358_RECONCILED_BUSINESS_ACTIVITY() {
    return P0358_RECONCILED_BUSINESS_ACTIVITY;
  }

  public void setP0358_RECONCILED_BUSINESS_ACTIVITY(String p0358_RECONCILED_BUSINESS_ACTIVITY) {
    P0358_RECONCILED_BUSINESS_ACTIVITY = p0358_RECONCILED_BUSINESS_ACTIVITY;
  }

  public String getP0359_RECONCILED_SETTLEMENT_ACTIVITY() {
    return P0359_RECONCILED_SETTLEMENT_ACTIVITY;
  }

  public void setP0359_RECONCILED_SETTLEMENT_ACTIVITY(
      String p0359_RECONCILED_SETTLEMENT_ACTIVITY) {
    P0359_RECONCILED_SETTLEMENT_ACTIVITY = p0359_RECONCILED_SETTLEMENT_ACTIVITY;
  }

  public String getP0367_RECONCILED_CARD_PROGRAM_IDENTIFIER() {
    return P0367_RECONCILED_CARD_PROGRAM_IDENTIFIER;
  }

  public void setP0367_RECONCILED_CARD_PROGRAM_IDENTIFIER(
      String p0367_RECONCILED_CARD_PROGRAM_IDENTIFIER) {
    P0367_RECONCILED_CARD_PROGRAM_IDENTIFIER = p0367_RECONCILED_CARD_PROGRAM_IDENTIFIER;
  }

  public String getP0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE() {
    return P0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE;
  }

  public void setP0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE(
      String p0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE) {
    P0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE = p0368_RECONCILED_TRANSACTION_FUNCTION_GROUP_CODE;
  }

  public String getP0369_RECONCILED_ACQUIRER_BIN() {
    return P0369_RECONCILED_ACQUIRER_BIN;
  }

  public void setP0369_RECONCILED_ACQUIRER_BIN(String p0369_RECONCILED_ACQUIRER_BIN) {
    P0369_RECONCILED_ACQUIRER_BIN = p0369_RECONCILED_ACQUIRER_BIN;
  }

  public String getP0370_RECONCILED_ACCOUNT_RANGE() {
    return P0370_RECONCILED_ACCOUNT_RANGE;
  }

  public void setP0370_RECONCILED_ACCOUNT_RANGE(String p0370_RECONCILED_ACCOUNT_RANGE) {
    P0370_RECONCILED_ACCOUNT_RANGE = p0370_RECONCILED_ACCOUNT_RANGE;
  }

  public String getP0372_RECONCILED_TRANSACTION_FUNCTION() {
    return P0372_RECONCILED_TRANSACTION_FUNCTION;
  }

  public void setP0372_RECONCILED_TRANSACTION_FUNCTION(
      String p0372_RECONCILED_TRANSACTION_FUNCTION) {
    P0372_RECONCILED_TRANSACTION_FUNCTION = p0372_RECONCILED_TRANSACTION_FUNCTION;
  }

  public String getP0374_RECONCILED_PROCESSING_CODE() {
    return P0374_RECONCILED_PROCESSING_CODE;
  }

  public void setP0374_RECONCILED_PROCESSING_CODE(String p0374_RECONCILED_PROCESSING_CODE) {
    P0374_RECONCILED_PROCESSING_CODE = p0374_RECONCILED_PROCESSING_CODE;
  }

  public String getP0375_MEMBER_RECONCILIATION_INDICATOR1() {
    return P0375_MEMBER_RECONCILIATION_INDICATOR1;
  }

  public void setP0375_MEMBER_RECONCILIATION_INDICATOR1(
      String p0375_MEMBER_RECONCILIATION_INDICATOR1) {
    P0375_MEMBER_RECONCILIATION_INDICATOR1 = p0375_MEMBER_RECONCILIATION_INDICATOR1;
  }

  public String getP0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR() {
    return P0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR;
  }

  public void setP0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR(
      String p0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR) {
    P0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR = p0378_ORIGINAL_REVERSAL_TOTALS_INDICATOR;
  }

  public String getP0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY() {
    return P0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  }

  public void setP0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY(
      String p0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY) {
    P0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY = p0380_DEBIT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  }

  public String getP0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY() {
    return P0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  }

  public void setP0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY(
      String p0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY) {
    P0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY = p0381_CREDT_TRANSACTION_AMOUNT_TRANSACTION_CURRENCY;
  }

  public String getP0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY() {
    return P0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY;
  }

  public void setP0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY(
      String p0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY) {
    P0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY = p0384_AMOUNT_NET_TRANSACTION_TRANSACTION_CURRENCY;
  }

  public String getP0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY() {
    return P0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  }

  public void setP0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY(
      String p0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY) {
    P0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY = p0390_DEBIT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  }

  public String getP0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY() {
    return P0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  }

  public void setP0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY(
      String p0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY) {
    P0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY = p0391_CREDT_TRANSACTION_AMOUNT_RECONCILIATION_CURRENCY;
  }

  public String getP0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY() {
    return P0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  }

  public void setP0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY(
      String p0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY) {
    P0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY = p0392_DEBIT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  }

  public String getP0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY() {
    return P0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  }

  public void setP0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY(
      String p0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY) {
    P0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY = p0393_CREDT_FEE_AMOUNTS_RECONCILIATION_CURRENCY;
  }

  public String getP0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY() {
    return P0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY;
  }

  public void setP0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY(
      String p0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY) {
    P0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY = p0394_AMOUNT_NET_TRANSACTION_RECONCILIATION_CURRENCY;
  }

  public String getP0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY() {
    return P0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY;
  }

  public void setP0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY(
      String p0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY) {
    P0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY = p0395_AMOUNT_NET_FEE_RECONCILIATION_CURRENCY;
  }

  public String getP0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY() {
    return P0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY;
  }

  public void setP0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY(
      String p0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY) {
    P0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY = p0396_AMOUNT_NET_TOTAL_RECONCILIATION_CURRENCY;
  }

  public String getP0400_DEBIT_TRANSACTION_NUMBER() {
    return P0400_DEBIT_TRANSACTION_NUMBER;
  }

  public void setP0400_DEBIT_TRANSACTION_NUMBER(String p0400_DEBIT_TRANSACTION_NUMBER) {
    P0400_DEBIT_TRANSACTION_NUMBER = p0400_DEBIT_TRANSACTION_NUMBER;
  }

  public String getP0401_CREDIT_TRANSACTION_NUMBER() {
    return P0401_CREDIT_TRANSACTION_NUMBER;
  }

  public void setP0401_CREDIT_TRANSACTION_NUMBER(String p0401_CREDIT_TRANSACTION_NUMBER) {
    P0401_CREDIT_TRANSACTION_NUMBER = p0401_CREDIT_TRANSACTION_NUMBER;
  }

  public String getP0402_TOTAL_TRANSACTION_NUMBER() {
    return P0402_TOTAL_TRANSACTION_NUMBER;
  }

  public void setP0402_TOTAL_TRANSACTION_NUMBER(String p0402_TOTAL_TRANSACTION_NUMBER) {
    P0402_TOTAL_TRANSACTION_NUMBER = p0402_TOTAL_TRANSACTION_NUMBER;
  }

  public String getP0501_TRANSACTION_DESCRIPTION() {
    return P0501_TRANSACTION_DESCRIPTION;
  }

  public void setP0501_TRANSACTION_DESCRIPTION(String p0501_TRANSACTION_DESCRIPTION) {
    P0501_TRANSACTION_DESCRIPTION = p0501_TRANSACTION_DESCRIPTION;
  }

  public String getP0502_CUSTOMER_IDENTIFIER() {
    return P0502_CUSTOMER_IDENTIFIER;
  }

  public void setP0502_CUSTOMER_IDENTIFIER(String p0502_CUSTOMER_IDENTIFIER) {
    P0502_CUSTOMER_IDENTIFIER = p0502_CUSTOMER_IDENTIFIER;
  }

  public String getP0503_TRAVEL_AGENCY_SEQUENCE_NUMBER() {
    return P0503_TRAVEL_AGENCY_SEQUENCE_NUMBER;
  }

  public void setP0503_TRAVEL_AGENCY_SEQUENCE_NUMBER(String p0503_TRAVEL_AGENCY_SEQUENCE_NUMBER) {
    P0503_TRAVEL_AGENCY_SEQUENCE_NUMBER = p0503_TRAVEL_AGENCY_SEQUENCE_NUMBER;
  }

  public String getP0504_TRAVEL_AGENCY_FEE() {
    return P0504_TRAVEL_AGENCY_FEE;
  }

  public void setP0504_TRAVEL_AGENCY_FEE(String p0504_TRAVEL_AGENCY_FEE) {
    P0504_TRAVEL_AGENCY_FEE = p0504_TRAVEL_AGENCY_FEE;
  }

  public String getP0505_PASSENGER_NAME() {
    return P0505_PASSENGER_NAME;
  }

  public void setP0505_PASSENGER_NAME(String p0505_PASSENGER_NAME) {
    P0505_PASSENGER_NAME = p0505_PASSENGER_NAME;
  }

  public String getP0506_TICKET_NUMBER() {
    return P0506_TICKET_NUMBER;
  }

  public void setP0506_TICKET_NUMBER(String p0506_TICKET_NUMBER) {
    P0506_TICKET_NUMBER = p0506_TICKET_NUMBER;
  }

  public String getP0507_ISSUING_CARRIER() {
    return P0507_ISSUING_CARRIER;
  }

  public void setP0507_ISSUING_CARRIER(String p0507_ISSUING_CARRIER) {
    P0507_ISSUING_CARRIER = p0507_ISSUING_CARRIER;
  }

  public String getP0508_CUSTOMER_CODE() {
    return P0508_CUSTOMER_CODE;
  }

  public void setP0508_CUSTOMER_CODE(String p0508_CUSTOMER_CODE) {
    P0508_CUSTOMER_CODE = p0508_CUSTOMER_CODE;
  }

  public String getP0509_ISSUE_DATE() {
    return P0509_ISSUE_DATE;
  }

  public void setP0509_ISSUE_DATE(String p0509_ISSUE_DATE) {
    P0509_ISSUE_DATE = p0509_ISSUE_DATE;
  }

  public String getP0510_TRAVEL_AGENCY_CODE() {
    return P0510_TRAVEL_AGENCY_CODE;
  }

  public void setP0510_TRAVEL_AGENCY_CODE(String p0510_TRAVEL_AGENCY_CODE) {
    P0510_TRAVEL_AGENCY_CODE = p0510_TRAVEL_AGENCY_CODE;
  }

  public String getP0511_TRAVEL_AGENCY_NAME() {
    return P0511_TRAVEL_AGENCY_NAME;
  }

  public void setP0511_TRAVEL_AGENCY_NAME(String p0511_TRAVEL_AGENCY_NAME) {
    P0511_TRAVEL_AGENCY_NAME = p0511_TRAVEL_AGENCY_NAME;
  }

  public String getP0512_TOTAL_FARE() {
    return P0512_TOTAL_FARE;
  }

  public void setP0512_TOTAL_FARE(String p0512_TOTAL_FARE) {
    P0512_TOTAL_FARE = p0512_TOTAL_FARE;
  }

  public String getP0513_TOTAL_FEES() {
    return P0513_TOTAL_FEES;
  }

  public void setP0513_TOTAL_FEES(String p0513_TOTAL_FEES) {
    P0513_TOTAL_FEES = p0513_TOTAL_FEES;
  }

  public String getP0514_TOTAL_TAXES() {
    return P0514_TOTAL_TAXES;
  }

  public void setP0514_TOTAL_TAXES(String p0514_TOTAL_TAXES) {
    P0514_TOTAL_TAXES = p0514_TOTAL_TAXES;
  }

  public String getP0515_ADDITIONAL_CARD_ACCEPTOR_INFO() {
    return P0515_ADDITIONAL_CARD_ACCEPTOR_INFO;
  }

  public void setP0515_ADDITIONAL_CARD_ACCEPTOR_INFO(String p0515_ADDITIONAL_CARD_ACCEPTOR_INFO) {
    P0515_ADDITIONAL_CARD_ACCEPTOR_INFO = p0515_ADDITIONAL_CARD_ACCEPTOR_INFO;
  }

  public String getP0516_AUSTIN_TETRA_NUMBER() {
    return P0516_AUSTIN_TETRA_NUMBER;
  }

  public void setP0516_AUSTIN_TETRA_NUMBER(String p0516_AUSTIN_TETRA_NUMBER) {
    P0516_AUSTIN_TETRA_NUMBER = p0516_AUSTIN_TETRA_NUMBER;
  }

  public String getP0517_NAICS_CODE() {
    return P0517_NAICS_CODE;
  }

  public void setP0517_NAICS_CODE(String p0517_NAICS_CODE) {
    P0517_NAICS_CODE = p0517_NAICS_CODE;
  }

  public String getP0518_LIEN_ITEM_DATE() {
    return P0518_LIEN_ITEM_DATE;
  }

  public void setP0518_LIEN_ITEM_DATE(String p0518_LIEN_ITEM_DATE) {
    P0518_LIEN_ITEM_DATE = p0518_LIEN_ITEM_DATE;
  }

  public String getP0519_ADDITIONAL_FUEL_LOCATION_INFORMATION() {
    return P0519_ADDITIONAL_FUEL_LOCATION_INFORMATION;
  }

  public void setP0519_ADDITIONAL_FUEL_LOCATION_INFORMATION(
      String p0519_ADDITIONAL_FUEL_LOCATION_INFORMATION) {
    P0519_ADDITIONAL_FUEL_LOCATION_INFORMATION = p0519_ADDITIONAL_FUEL_LOCATION_INFORMATION;
  }

  public String getP0520_TRAVEL_DATE() {
    return P0520_TRAVEL_DATE;
  }

  public void setP0520_TRAVEL_DATE(String p0520_TRAVEL_DATE) {
    P0520_TRAVEL_DATE = p0520_TRAVEL_DATE;
  }

  public String getP0521_CARRIER_CODE() {
    return P0521_CARRIER_CODE;
  }

  public void setP0521_CARRIER_CODE(String p0521_CARRIER_CODE) {
    P0521_CARRIER_CODE = p0521_CARRIER_CODE;
  }

  public String getP0522_SERVICE_CLASS_CODE() {
    return P0522_SERVICE_CLASS_CODE;
  }

  public void setP0522_SERVICE_CLASS_CODE(String p0522_SERVICE_CLASS_CODE) {
    P0522_SERVICE_CLASS_CODE = p0522_SERVICE_CLASS_CODE;
  }

  public String getP0523_CITY_ORIGIN_AIRPORT_CODE() {
    return P0523_CITY_ORIGIN_AIRPORT_CODE;
  }

  public void setP0523_CITY_ORIGIN_AIRPORT_CODE(String p0523_CITY_ORIGIN_AIRPORT_CODE) {
    P0523_CITY_ORIGIN_AIRPORT_CODE = p0523_CITY_ORIGIN_AIRPORT_CODE;
  }

  public String getP0524_CITY_DESTINATION_AIRPORT_CODE() {
    return P0524_CITY_DESTINATION_AIRPORT_CODE;
  }

  public void setP0524_CITY_DESTINATION_AIRPORT_CODE(String p0524_CITY_DESTINATION_AIRPORT_CODE) {
    P0524_CITY_DESTINATION_AIRPORT_CODE = p0524_CITY_DESTINATION_AIRPORT_CODE;
  }

  public String getP0525_STOP_OVER_CODE() {
    return P0525_STOP_OVER_CODE;
  }

  public void setP0525_STOP_OVER_CODE(String p0525_STOP_OVER_CODE) {
    P0525_STOP_OVER_CODE = p0525_STOP_OVER_CODE;
  }

  public String getP0526_CONJUNCTION_TICKET() {
    return P0526_CONJUNCTION_TICKET;
  }

  public void setP0526_CONJUNCTION_TICKET(String p0526_CONJUNCTION_TICKET) {
    P0526_CONJUNCTION_TICKET = p0526_CONJUNCTION_TICKET;
  }

  public String getP0527_EXCHANGE_TICKET() {
    return P0527_EXCHANGE_TICKET;
  }

  public void setP0527_EXCHANGE_TICKET(String p0527_EXCHANGE_TICKET) {
    P0527_EXCHANGE_TICKET = p0527_EXCHANGE_TICKET;
  }

  public String getP0528_COUPON_NUMBER() {
    return P0528_COUPON_NUMBER;
  }

  public void setP0528_COUPON_NUMBER(String p0528_COUPON_NUMBER) {
    P0528_COUPON_NUMBER = p0528_COUPON_NUMBER;
  }

  public String getMti() {
    return mti;
  }

  public void setMti(String mti) {
    this.mti = mti;
  }
  public  IpmClearingDetails (IpmClearingDetails ipm)
  {	super();
  this.de02=ipm.getDe02();
    this.impCode=ipm.getImpCode();
  	}

  public IpmClearingDetails(String impCode, String de01, String de02, String de03, String de04,
      String de05, String de06, String de07, String de08, String de09, String de10,
      String de11, String de12, String de13, String de14, String de15, String de16,
      String de17, String de18, String de19, String de20, String de21, String de22,
      String de23, String de24, String de25, String de26, String de27, String de28,
      String de29, String de30, String de31, String de32, String de33, String de34,
      String de35, String de36, String de37, String de38, String de39, String de40,
      String de41, String de42, String de43, String de44, String de45, String de46,
      String de47, String de48, String de49, String de50, String de51, String de52,
      String de53, String de55, String de56, String de57, String de58,
      String de59, String de60, String de61, String de62, String de63, String de64,
      String de65, String de66, String de67, String de68, String de69, String de70,
      String de71, String de72, String de73, String de74, String de75, String de76,
      String de77, String de78, String de79, String de80, String de81, String de82,
      String de83, String de84, String de85, String de86, String de87, String de88,
      String de89, String de90, String de91, String de92, String de93, String de94,
      String de95, String de96, String de97, String de98, String de99, String de100,
      String de101, String de102, String de103, String de104, String de105, String de106,
      String de107, String de108, String de109, String de110, String de111, String de112,
      String de113, String de114, String de115, String de116, String de117, String de118,
      String de119, String de120, String de121, String de122, String de123, String de124,
      String de125, String de126, String de127, String de128) {
    this.mti = impCode;
    this.de01 = de01;
    this.de02 = de02;
    this.de03 = de03;
    this.de04 = convertAmt(de04, de49);
    this.de05 = convertAmt(de05, de50);
    this.de06 = convertAmt(de06, de51);
    this.de07 = de07;
    this.de08 = de08;
    this.de09 = rateConversionIPM(de09);
    this.de10 = de10;
    this.de11 = de11==null ? "000000" : de11 ;
    this.de12 = de12;
    this.de13 = de13;
    this.de14 = de14;
    this.de15 = de15;
    this.de16 = de16;
    this.de17 = de17;
    this.de18 = de18;
    this.de19 = de19;
    this.de20 = de20;
    this.de21 = de21;
    this.de22 = de22;
    this.de23 = de23;
    this.de24 = de24;
    this.de25 = de25;
    this.de26 = de26;
    this.de27 = de27;
    this.de28 = de28;
    this.de29 = de29;
    this.de30 = de30;
    this.de31 = de31;
    this.de32 = de32;
    this.de33 = de33;
    this.de34 = de34;
    this.de35 = de35;
    this.de36 = de36;
    this.de37 = de37;
    this.de38 = de38;
    this.de39 = de39;
    this.de40 = de40;
    this.de41 = de41;
    this.de42 = de42;
    this.de43 = de43;
    this.de44 = de44;
    this.de45 = de45;
    this.de46 = de46;
    this.de47 = de47;
    this.de48 = de48;
    this.de49 = de49;
    this.de50 = de50;
    this.de51 = de51;
    this.de52 = de52;
    this.de53 = de53;
    this.de54 = de55;
    this.de56 = de56;
    this.de57 = de57;
    this.de58 = de58;
    this.de59 = de59;
    this.de60 = de60;
    this.de61 = de61;
    this.de62 = de62;
    this.de63 = de63;
    this.de64 = de64;
    this.de65 = de65;
    this.de66 = de66;
    this.de67 = de67;
    this.de68 = de68;
    this.de69 = de69;
    this.de70 = de70;
    this.de71 = de71;
    this.de72 = de72;
    this.de73 = de73;
    this.de74 = de74;
    this.de75 = de75;
    this.de76 = de76;
    this.de77 = de77;
    this.de78 = de78;
    this.de79 = de79;
    this.de80 = de80;
    this.de81 = de81;
    this.de82 = de82;
    this.de83 = de83;
    this.de84 = de84;
    this.de85 = de85;
    this.de86 = de86;
    this.de87 = de87;
    this.de88 = de88;
    this.de89 = de89;
    this.de90 = de90;
    this.de91 = de91;
    this.de92 = de92;
    this.de93 = de93;
    this.de94 = de94;
    this.de95 = de95;
    this.de96 = de96;
    this.de97 = de97;
    this.de98 = de98;
    this.de99 = de99;
    this.de100 = de100;
    this.de101 = de101;
    this.de102 = de102;
    this.de103 = de103;
    this.de104 = de104;
    this.de105 = de105;
    this.de106 = de106;
    this.de107 = de107;
    this.de108 = de108;
    this.de109 = de109;
    this.de110 = de110;
    this.de111 = de111;
    this.de112 = de112;
    this.de113 = de113;
    this.de114 = de114;
    this.de115 = de115;
    this.de116 = de116;
    this.de117 = de117;
    this.de118 = de118;
    this.de119 = de119;
    this.de120 = de120;
    this.de121 = de121;
    this.de122 = de122;
    this.de123 = de123;
    this.de124 = de124;
    this.de125 = de125;
    this.de126 = de126;
    this.de127 = de127;
    this.de128 = de128;
  }

  public Integer getImpCode() {
    return impCode;
  }

  public void setImpCode(Integer impCode) {
    this.impCode = impCode;
  }

  public String getDe01() {
    return de01;
  }

  public void setDe01(String de01) {
    this.de01 = de01;
  }

  public String getDe02() {
    return de02;
  }

  public void setDe02(String de02) {
    this.de02 = de02;
  }

  public String getDe03() {
    return de03;
  }

  public void setDe03(String de03) {
    this.de03 = de03;
  }




  public double getDe04() {
	return de04;
}

public void setDe04(double de04) {
	this.de04 = de04;
}

public double getDe05() {
	return de05;
}

public void setDe05(double de05) {
	this.de05 = de05;
}

public double getDe06() {
	return de06;
}

public void setDe06(double de06) {
	this.de06 = de06;
}

public String getDe07() {
    return de07;
  }

  public void setDe07(String de07) {
    this.de07 = de07;
  }

  public String getDe08() {
    return de08;
  }

  public void setDe08(String de08) {
    this.de08 = de08;
  }


  public String getDe10() {
    return de10;
  }

  public void setDe10(String de10) {
    this.de10 = de10;
  }

  public String getDe11() {
    return de11;
  }

  public void setDe11(String de11) {
    this.de11 = de11;
  }

  public String getDe12() {
    return de12;
  }

  public void setDe12(String de12) {
    this.de12 = de12;
  }

  public String getDe13() {
    return de13;
  }

  public void setDe13(String de13) {
    this.de13 = de13;
  }

  public String getDe14() {
    return de14;
  }

  public void setDe14(String de14) {
    this.de14 = de14;
  }

  public String getDe15() {
    return de15;
  }

  public void setDe15(String de15) {
    this.de15 = de15;
  }

  public String getDe16() {
    return de16;
  }

  public void setDe16(String de16) {
    this.de16 = de16;
  }

  public String getDe17() {
    return de17;
  }

  public void setDe17(String de17) {
    this.de17 = de17;
  }

  public String getDe18() {
    return de18;
  }

  public void setDe18(String de18) {
    this.de18 = de18;
  }

  public String getDe19() {
    return de19;
  }

  public void setDe19(String de19) {
    this.de19 = de19;
  }

  public String getDe20() {
    return de20;
  }

  public void setDe20(String de20) {
    this.de20 = de20;
  }

  public String getDe21() {
    return de21;
  }

  public void setDe21(String de21) {
    this.de21 = de21;
  }

  public String getDe22() {
    return de22;
  }

  public void setDe22(String de22) {
    this.de22 = de22;
  }

  public String getDe23() {
    return de23;
  }

  public void setDe23(String de23) {
    this.de23 = de23;
  }

  public String getDe24() {
    return de24;
  }

  public void setDe24(String de24) {
    this.de24 = de24;
  }

  public String getDe25() {
    return de25;
  }

  public void setDe25(String de25) {
    this.de25 = de25;
  }

  public String getDe26() {
    return de26;
  }

  public void setDe26(String de26) {
    this.de26 = de26;
  }

  public String getDe27() {
    return de27;
  }

  public void setDe27(String de27) {
    this.de27 = de27;
  }

  public String getDe28() {
    return de28;
  }

  public void setDe28(String de28) {
    this.de28 = de28;
  }

  public String getDe29() {
    return de29;
  }

  public void setDe29(String de29) {
    this.de29 = de29;
  }

  public String getDe30() {
    return de30;
  }

  public void setDe30(String de30) {
    this.de30 = de30;
  }

  public String getDe31() {
    return de31;
  }

  public void setDe31(String de31) {
    this.de31 = de31;
  }

  public String getDe32() {
    return de32;
  }

  public void setDe32(String de32) {
    this.de32 = de32;
  }

  public String getDe33() {
    return de33;
  }

  public void setDe33(String de33) {
    this.de33 = de33;
  }

  public String getDe34() {
    return de34;
  }

  public void setDe34(String de34) {
    this.de34 = de34;
  }

  public String getDe35() {
    return de35;
  }

  public void setDe35(String de35) {
    this.de35 = de35;
  }

  public String getDe36() {
    return de36;
  }

  public void setDe36(String de36) {
    this.de36 = de36;
  }

  public String getDe37() {
    return de37;
  }

  public void setDe37(String de37) {
    this.de37 = de37;
  }

  public String getDe38() {
    return de38;
  }

  public void setDe38(String de38) {
    this.de38 = de38;
  }

  public String getDe39() {
    return de39;
  }

  public void setDe39(String de39) {
    this.de39 = de39;
  }

  public String getDe40() {
    return de40;
  }

  public void setDe40(String de40) {
    this.de40 = de40;
  }

  public String getDe41() {
    return de41;
  }

  public void setDe41(String de41) {
    this.de41 = de41;
  }

  public String getDe42() {
    return de42;
  }

  public void setDe42(String de42) {
    this.de42 = de42;
  }

  public String getDe43() {
    return de43;
  }

  public void setDe43(String de43) {
    this.de43 = de43;
  }

  public String getDe44() {
    return de44;
  }

  public void setDe44(String de44) {
    this.de44 = de44;
  }

  public String getDe45() {
    return de45;
  }

  public void setDe45(String de45) {
    this.de45 = de45;
  }

  public String getDe46() {
    return de46;
  }

  public void setDe46(String de46) {
    this.de46 = de46;
  }

  public String getDe47() {
    return de47;
  }

  public void setDe47(String de47) {
    this.de47 = de47;
  }

  public String getDe48() {
    return de48;
  }

  public void setDe48(String de48) {
    this.de48 = de48;
  }

  public String getDe49() {
    return de49;
  }

  public void setDe49(String de49) {
    this.de49 = de49;
  }

  public String getDe50() {
    return de50;
  }

  public void setDe50(String de50) {
    this.de50 = de50;
  }

  public String getDe51() {
    return de51;
  }

  public void setDe51(String de51) {
    this.de51 = de51;
  }

  public String getDe52() {
    return de52;
  }

  public void setDe52(String de52) {
    this.de52 = de52;
  }

  public String getDe53() {
    return de53;
  }

  public void setDe53(String de53) {
    this.de53 = de53;
  }

  public String getDe54() {
    return de54;
  }

  public void setDe54(String de54) {
    this.de54 = de54;
  }

  public String getDe55() {
    return de55;
  }

  public void setDe55(String de55) {
    this.de55 = de55;
  }

  public String getDe56() {
    return de56;
  }

  public void setDe56(String de56) {
    this.de56 = de56;
  }

  public String getDe57() {
    return de57;
  }

  public void setDe57(String de57) {
    this.de57 = de57;
  }

  public String getDe58() {
    return de58;
  }

  public void setDe58(String de58) {
    this.de58 = de58;
  }

  public String getDe59() {
    return de59;
  }

  public void setDe59(String de59) {
    this.de59 = de59;
  }

  public String getDe60() {
    return de60;
  }

  public void setDe60(String de60) {
    this.de60 = de60;
  }

  public String getDe61() {
    return de61;
  }

  public void setDe61(String de61) {
    this.de61 = de61;
  }

  public String getDe62() {
    return de62;
  }

  public void setDe62(String de62) {
    this.de62 = de62;
  }

  public String getDe63() {
    return de63;
  }

  public void setDe63(String de63) {
    this.de63 = de63;
  }

  public String getDe64() {
    return de64;
  }

  public void setDe64(String de64) {
    this.de64 = de64;
  }

  public String getDe65() {
    return de65;
  }

  public void setDe65(String de65) {
    this.de65 = de65;
  }

  public String getDe66() {
    return de66;
  }

  public void setDe66(String de66) {
    this.de66 = de66;
  }

  public String getDe67() {
    return de67;
  }

  public void setDe67(String de67) {
    this.de67 = de67;
  }

  public String getDe68() {
    return de68;
  }

  public void setDe68(String de68) {
    this.de68 = de68;
  }

  public String getDe69() {
    return de69;
  }

  public void setDe69(String de69) {
    this.de69 = de69;
  }

  public String getDe70() {
    return de70;
  }

  public void setDe70(String de70) {
    this.de70 = de70;
  }

  public String getDe71() {
    return de71;
  }

  public void setDe71(String de71) {
    this.de71 = de71;
  }

  public String getDe72() {
    return de72;
  }

  public void setDe72(String de72) {
    this.de72 = de72;
  }

  public String getDe73() {
    return de73;
  }

  public void setDe73(String de73) {
    this.de73 = de73;
  }

  public String getDe74() {
    return de74;
  }

  public void setDe74(String de74) {
    this.de74 = de74;
  }

  public String getDe75() {
    return de75;
  }

  public void setDe75(String de75) {
    this.de75 = de75;
  }

  public String getDe76() {
    return de76;
  }

  public void setDe76(String de76) {
    this.de76 = de76;
  }

  public String getDe77() {
    return de77;
  }

  public void setDe77(String de77) {
    this.de77 = de77;
  }

  public String getDe78() {
    return de78;
  }

  public void setDe78(String de78) {
    this.de78 = de78;
  }

  public String getDe79() {
    return de79;
  }

  public void setDe79(String de79) {
    this.de79 = de79;
  }

  public String getDe80() {
    return de80;
  }

  public void setDe80(String de80) {
    this.de80 = de80;
  }

  public String getDe81() {
    return de81;
  }

  public void setDe81(String de81) {
    this.de81 = de81;
  }

  public String getDe91() {
    return de91;
  }

  public void setDe91(String de91) {
    this.de91 = de91;
  }

  public String getDe92() {
    return de92;
  }

  public void setDe92(String de92) {
    this.de92 = de92;
  }

  public String getDe93() {
    return de93;
  }

  public void setDe93(String de93) {
    this.de93 = de93;
  }

  public String getDe94() {
    return de94;
  }

  public void setDe94(String de94) {
    this.de94 = de94;
  }

  public String getDe95() {
    return de95;
  }

  public void setDe95(String de95) {
    this.de95 = de95;
  }

  public String getDe96() {
    return de96;
  }

  public void setDe96(String de96) {
    this.de96 = de96;
  }

  public String getDe97() {
    return de97;
  }

  public void setDe97(String de97) {
    this.de97 = de97;
  }

  public String getDe98() {
    return de98;
  }

  public void setDe98(String de98) {
    this.de98 = de98;
  }

  public String getDe99() {
    return de99;
  }

  public void setDe99(String de99) {
    this.de99 = de99;
  }

  public String getDe100() {
    return de100;
  }

  public void setDe100(String de100) {
    this.de100 = de100;
  }

  public String getDe101() {
    return de101;
  }

  public void setDe101(String de101) {
    this.de101 = de101;
  }

  public String getDe102() {
    return de102;
  }

  public void setDe102(String de102) {
    this.de102 = de102;
  }

  public String getDe103() {
    return de103;
  }

  public void setDe103(String de103) {
    this.de103 = de103;
  }

  public String getDe104() {
    return de104;
  }

  public void setDe104(String de104) {
    this.de104 = de104;
  }

  public String getDe105() {
    return de105;
  }

  public void setDe105(String de105) {
    this.de105 = de105;
  }

  public String getDe106() {
    return de106;
  }

  public void setDe106(String de106) {
    this.de106 = de106;
  }

  public String getDe107() {
    return de107;
  }

  public void setDe107(String de107) {
    this.de107 = de107;
  }

  public String getDe108() {
    return de108;
  }

  public void setDe108(String de108) {
    this.de108 = de108;
  }

  public String getDe109() {
    return de109;
  }

  public void setDe109(String de109) {
    this.de109 = de109;
  }

  public String getDe110() {
    return de110;
  }

  public void setDe110(String de110) {
    this.de110 = de110;
  }

  public String getDe111() {
    return de111;
  }

  public void setDe111(String de111) {
    this.de111 = de111;
  }

  public String getDe112() {
    return de112;
  }

  public void setDe112(String de112) {
    this.de112 = de112;
  }

  public String getDe113() {
    return de113;
  }

  public void setDe113(String de113) {
    this.de113 = de113;
  }

  public String getDe114() {
    return de114;
  }

  public void setDe114(String de114) {
    this.de114 = de114;
  }

  public String getDe115() {
    return de115;
  }

  public void setDe115(String de115) {
    this.de115 = de115;
  }

  public String getDe116() {
    return de116;
  }

  public void setDe116(String de116) {
    this.de116 = de116;
  }

  public String getDe117() {
    return de117;
  }

  public void setDe117(String de117) {
    this.de117 = de117;
  }

  public String getDe118() {
    return de118;
  }

  public void setDe118(String de118) {
    this.de118 = de118;
  }

  public String getDe119() {
    return de119;
  }

  public void setDe119(String de119) {
    this.de119 = de119;
  }

  public String getDe120() {
    return de120;
  }

  public void setDe120(String de120) {
    this.de120 = de120;
  }

  public String getDe121() {
    return de121;
  }

  public void setDe121(String de121) {
    this.de121 = de121;
  }

  public String getDe122() {
    return de122;
  }

  public void setDe122(String de122) {
    this.de122 = de122;
  }

  public String getDe123() {
    return de123;
  }

  public void setDe123(String de123) {
    this.de123 = de123;
  }

  public String getDe124() {
    return de124;
  }

  public void setDe124(String de124) {
    this.de124 = de124;
  }

  public String getDe125() {
    return de125;
  }

  public void setDe125(String de125) {
    this.de125 = de125;
  }

  public String getDe126() {
    return de126;
  }

  public void setDe126(String de126) {
    this.de126 = de126;
  }

  public String getDe127() {
    return de127;
  }

  public void setDe127(String de127) {
    this.de127 = de127;
  }

  public String getDe128() {
    return de128;
  }

  public void setDe128(String de128) {
    this.de128 = de128;
  }

  public String getDe82() {
    return de82;
  }

  public void setDe82(String de82) {
    this.de82 = de82;
  }

  public String getDe83() {
    return de83;
  }

  public void setDe83(String de83) {
    this.de83 = de83;
  }

  public String getDe84() {
    return de84;
  }

  public void setDe84(String de84) {
    this.de84 = de84;
  }

  public String getDe85() {
    return de85;
  }

  public void setDe85(String de85) {
    this.de85 = de85;
  }

  public String getDe86() {
    return de86;
  }

  public void setDe86(String de86) {
    this.de86 = de86;
  }

  public String getDe87() {
    return de87;
  }

  public void setDe87(String de87) {
    this.de87 = de87;
  }

  public String getDe88() {
    return de88;
  }

  public void setDe88(String de88) {
    this.de88 = de88;
  }

  public String getDe89() {
    return de89;
  }

  public void setDe89(String de89) {
    this.de89 = de89;
  }

  public String getDe90() {
    return de90;
  }

  public void setDe90(String de90) {
    this.de90 = de90;
  }
  
  public Boolean getRejected() {
    return rejected;
  }

  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }
@Transient
    private HashMap<String, Field> fields = new HashMap<String, Field>();

    public void setAttribute(Field field, Object value) throws IllegalAccessException {
        field.set(this, value);
    }


  public IpmClearingDetails() {
  }
  
  public Double getDe09() {
	return de09;
}

public void setDe09(Double de09) {
	this.de09 = de09;
}

	

public String getTransactionCode() {
	return transactionCode;
}

public void setTransactionCode(String transactionCode) {
	this.transactionCode = transactionCode;
}

public Integer getCpCode() {
	return cpCode;
}

public void setCpCode(Integer cpCode) {
	this.cpCode = cpCode;
}

private Double  convertAmt(String amount, String currency) {
	double number=0;
	if(amount!=null) {
	number = Double.parseDouble(amount);					
	if (currency.equals("788")) {
		number = number/Math.pow(10, 3);
	} else {
		number = number/Math.pow(10, 2);
	}		
    }
	return number;
}

Double rateConversionIPM(String de09) {
	double rate=0;
	if(de09 !=null) {

		
		int lengthDe09=de09.length();
		int firstPosition=Integer.parseInt(de09.substring(0,1));
		if(de09.trim()!=null) {
		int lengthde09Test=lengthDe09-1;
		if(lengthde09Test==firstPosition) {
			String rateString="0"+"."+de09.substring(1);
			rate=Double.parseDouble(rateString);
		}
		else if(lengthde09Test<firstPosition) {
			String variable=String.format("%0"+firstPosition+"d", Integer.parseInt(de09.substring(1)));
			String rateString="0"+"."+variable;
			rate=Double.parseDouble(rateString);
		}
		else if(lengthde09Test>firstPosition) {
			int difference=lengthde09Test-firstPosition;
			String rateString=de09.substring(1, difference+1)+"."+de09.substring(difference+1);
			rate=Double.parseDouble(rateString);
		}
		}
		
	}
	return rate;
	}

public String getMatchingSwitch() {
	return matchingSwitch;
}

public void setMatchingSwitch(String matchingSwitch) {
	this.matchingSwitch = matchingSwitch;
}

public String getDe37Switch() {
	return de37Switch;
}

public void setDe37Switch(String de37Switch) {
	this.de37Switch = de37Switch;
}

public String getDe11Switch() {
	return de11Switch;
}

public void setDe11Switch(String de11Switch) {
	this.de11Switch = de11Switch;
}

public LocalDateTime getDateSaisieChargeback() {
	return dateSaisieChargeback;
}

public void setDateSaisieChargeback(LocalDateTime dateSaisieChargeback) {
	this.dateSaisieChargeback = dateSaisieChargeback;
}

public String getClearingDate() {
	return clearingDate;
}

public void setClearingDate(String clearingDate) {
	this.clearingDate = clearingDate;
}

  public LocalDateTime getLastDateEnvoiMail() {
    return lastDateEnvoiMail;
  }

  public void setLastDateEnvoiMail(LocalDateTime lastDateEnvoiMail) {
    this.lastDateEnvoiMail = lastDateEnvoiMail;
  }

  public String getFileDate() {
    return FileDate;
  }

  public void setFileDate(String fileDate) {
    FileDate = fileDate;
  }

  public String getNbrJours() {
    return nbrJours;
  }

  public void setNbrJours(String nbrJours) {
    this.nbrJours = nbrJours;
  }
}
