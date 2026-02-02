package com.mss.unified.repositories;

//import com.mss.unified.entities.DayOperationCommissionH;
import com.mss.unified.entities.DayOperationInternationalH;
import com.mss.unified.entities.IpmClearingDetails;
import com.mss.unified.entities.Tc45;
import com.mss.unified.entities.TransactionValidAtm;
import com.mss.unified.entities.TransactionValidPos;
import com.mss.unified.entities.VisaIncoming;
import com.mss.unified.entities.VisaOutGoingAtm;
import com.mss.unified.references.DayOperationInternationalHTypeOperationRequest;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOperationInternationalHRepository extends JpaRepository<DayOperationInternationalH, Integer> {

	@Query("select A from VisaOutGoingAtm A where A.atmCode is not null")
	List<VisaOutGoingAtm> getVisa_valid();

	@Query("select A from VisaOutGoingAtm A where atmCode is  null")
	List<VisaOutGoingAtm> getVisa_not_valid();

	@Query("select A from VisaOutGoingAtm A")
	List<VisaOutGoingAtm> getVisaMatching();

	@Query("select A from VisaOutGoingAtm A where A.summaryCode=:summary")
	List<VisaOutGoingAtm> getVisaMatchingBySummary(int summary);



	@Query("select A from VisaOutGoingAtm A where A.responseCode='00' and A.requestMessageType='0200' and A.summaryCode=:file")
	List<VisaOutGoingAtm> RetraitVisaApprouved(int file);

	@Query("select A from VisaOutGoingAtm A where A.responseCode !='00' and A.requestMessageType='0200' and A.summaryCode=:file")
	List<VisaOutGoingAtm> RetraitVisaNotApprouved(int file);

	@Query("select A from VisaOutGoingAtm A where A.requestMessageType='0420' and A.settAmount!=0 and A.summaryCode=:file")
	List<VisaOutGoingAtm> ReversalRetraitVisa(int file);

	@Query("select A from Tc45 A")
	List<Tc45> gettc45();

	@Query("select A from VisaIncoming A where A.transactionCode='07' or A.transactionCode='05'")
	List<VisaIncoming> visaIncoming();


	@Query("select A from VisaIncoming A where A.transactionCode like '07%' and A.summaryCode=:summary")
	List<VisaIncoming> VisaIncomingATM(int summary);

	@Query("select A from VisaIncoming A where A.transactionCode like '05%' and A.summaryCode=:summary")
	List<VisaIncoming> VisaIncomingPOS(int summary);



	@Query("select A from VisaIncoming A where A.transactionCode like '07%'")
	List<VisaIncoming> VisaIncomingATM();

	@Query("select A from VisaIncoming A where A.transactionCode like '05%'")
	List<VisaIncoming> VisaIncomingPOS();

	

	@Query("select A.identification,A.debitAccount from OperationCodeCommision A")
	List<String[]> getListDebit();

	@Query("select A.identification,A.creditAccount from OperationCodeCommision A")
	List<String[]> getListCredit();

	@Query("select A from IpmClearingDetails A where mti='1240' and A.summaryCode = :summary")
	List<IpmClearingDetails> getIpmClearingDetails(int summary);

	@Query("select A from IpmClearingDetails A where mti='1240' and A.de03 like '01%' and A.summaryCode = :summary")
	List<IpmClearingDetails> getIpmClearingDetailsRetrait(int summary);

	@Query("select A from IpmClearingDetails A where mti='1240' and A.de03 like '00%' and A.summaryCode = :summary")
	List<IpmClearingDetails> getIpmClearingDetailsAchat(int summary);

	@Query("select A from IpmClearingDetails A where mti='1240'")
	List<IpmClearingDetails> getIpmClearingDetails();

	@Query("SELECT A,B.tokenB2 FROM TransactionValidAtm A,DetailsClearingAtm B where constatation is null and A.codeDetails=B.detailCode")
	public List<Object[]> transaction_atm_visa();

	@Query("SELECT A FROM TransactionValidAtm A where A.constatation is null")
	public List<TransactionValidAtm> transaction_atm();

	@Query("SELECT A FROM TransactionValidPos A where constatation is null")
	public List<TransactionValidPos> transaction_pos();

	@Query("SELECT A FROM VisaIncoming A")
	public List<VisaIncoming> Visa_Incoming();

	@Query("select A from IpmClearingDetails A where mti='1442' and (de24='450' or de24='453') and A.summaryCode = :summary")
	List<IpmClearingDetails> getImpClearing(int summary);

	@Query("select A from IpmClearingDetails A where mti='1442' and (de24='450' or de24='453')")
	List<IpmClearingDetails> getImpClearing();

	@Query("select A from IpmClearingDetails A where mti='1442' and (de24='451' or de24='454') and A.summaryCode = :summary")
	List<IpmClearingDetails> getImpClearingRep(int summary);

	@Query("select A from IpmClearingDetails A where mti='1442' and (de24='451' or de24='454')")
	List<IpmClearingDetails> getImpClearingRep();

	@Query("select A from IpmClearingDetails A where mti='1740' and A.summaryCode = :summary")
	List<IpmClearingDetails> getImpClearingFees(int summary);

	@Query("select A from IpmClearingDetails A where mti='1740'")
	List<IpmClearingDetails> getImpClearingFees();

	@Query("select A from IpmClearingDetails A where mti='1240' and de26 in('6011','6010')")
	List<IpmClearingDetails> getImpInterchangeAtm();

	@Query("select A from IpmClearingDetails A where mti='1240' and de03 like '00%'")
	List<IpmClearingDetails> getImpInterchangePos();

	@Query("SELECT doi FROM DayOperationInternationalH doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE occ.identification IN :identifications and doi.fileDate=:fileDate")
	List<DayOperationInternationalH> findByIdentifications(List<String> identifications,String fileDate);

	@Query("SELECT doi FROM DayOperationInternationalH doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE occ.identification = :identification and doi.fileDate = :fileDate")
	List<DayOperationInternationalH> findByIdentification(String identification,String fileDate);
	@Query("SELECT doi FROM DayOperationInternationalH doi "
 			+ "WHERE doi.fileDate = :fileDate")
	List<DayOperationInternationalH> findByFileDate(String fileDate);
	@Query("select d from DayOperationInternationalH d,OperationCodeCommision sett where  d.fileDateCp=:fileDate and sett.identification in :identification and d.typeOperation=sett.code ")
	public List<DayOperationInternationalH> findByfileDateCpAndIdentification(String fileDate,List<String>identification);

	@Query("SELECT new com.mss.unified.references.DayOperationInternationalHTypeOperationRequest(doi,occ.identification) FROM DayOperationInternationalH doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE doi.fileDate=:fileDate and occ.identification in :identification and doi.codeFile=:impCode  order by doi.typeOperation")
	List<DayOperationInternationalHTypeOperationRequest> findByIdentificationAndIpmCodeAndFileDate(List<String> identification, String impCode,String fileDate);
	@Query("SELECT doi FROM DayOperationInternationalH doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE doi.fileDateCp=:fileDate and occ.identification in :identification ")
	List<DayOperationInternationalH> findByIdentificationAndFileDate(List<String> identification, String fileDate);
	

//	@Query("select A from DayOperationCommissionH A where typeOperation in ( select code from OperationCodeCommision where identification=:identification) and de38=:de38 and cardNumber=:cardNumber")
//	Optional<DayOperationCommissionH> findCommissionNationalH(String identification, String de38, String cardNumber);
	@Query("select A from DayOperationInternationalH A where typeOperation in ( select code from OperationCodeCommision where identification=:identification) and de38=:de38 and cardNumber=:cardNumber")
	Optional<DayOperationInternationalH> findCommissionInternationalH(String identification, String de38, String cardNumber);
	
	@Transactional
	@Modifying
	@Query("delete from DayOperationInternationalH d where d.fileDateCp=:fileDate")
	public void deleteByfileDate(String fileDate);
	@Query (" SELECT  new com.mss.unified.references.DayOperationInternationalHTypeOperationRequest (doc,operation.identification) from DayOperationInternationalH doc, OperationCodeCommision operation  where   doc.typeOperation =operation.code and operation.identification in :identification and  TO_DATE(doc.fileDate, 'DDMMYY') between TO_DATE(:dateInf, 'DDMMYY') and ( TO_DATE(:dateSup, 'DDMMYY') ) ")
	List<DayOperationInternationalHTypeOperationRequest> findByIdentification(List<String> identification,String dateInf,String dateSup);


	@Modifying
	@org.springframework.transaction.annotation.Transactional
	@Query("DELETE FROM DayOperationInternationalH s WHERE s.fileDateMDSholidayMatched= :fileDateMDSholidayMatched")
	void deleteByFileDateMDSholidayMatched(@Param("fileDateMDSholidayMatched") String fileDateMDSholidayMatched);
	



}
