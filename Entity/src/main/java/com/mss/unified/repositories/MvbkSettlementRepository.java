// Specify the character encoding
// -*- coding: utf-8 -*-
package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.MvbkSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MvbkSettlementRepository extends JpaRepository<MvbkSettlement, Integer> {

   /* @Query("select A from MvbkSettlement A where  A.codeSettlement=:identification and A.type ='1' ")
    List<MvbkSettlement> findByIdentification(String identification);*/
	List<MvbkSettlement> findByCodeSettlement(String codeSettlement);

    @Query("select A from MvbkSettlement A where  A.codeSettlement=:identification and A.type ='1' ")
    List<MvbkSettlement> findByIdentification(String identification);


    @Query("select A from MvbkSettlement A where   A.type ='1' ")
    List<MvbkSettlement> findByIdentificationMVBK();





    @Query("select A from MvbkSettlement A where   A.categorie ='1' ")
    List<MvbkSettlement> findByIdentificationOnUs();

    @Query("select A from MvbkSettlement A where   A.categorie ='2' ")
    List<MvbkSettlement> findByIdentificationOnUsAutreAgence();

    @Query("select A from MvbkSettlement A where   A.categorie ='3' ")
    List<MvbkSettlement> findByIdentificationOffUsIssuer();

    @Query("select A from MvbkSettlement A where   A.categorie ='4' ")
    List<MvbkSettlement> findByIdentificationOffUsAcq();

    @Query("select A from MvbkSettlement A where   A.categorie ='5' ")
    List<MvbkSettlement> findByIdentificationOnUsAchat();

    @Query("select A from MvbkSettlement A where   A.categorie ='6' ")
    List<MvbkSettlement> findByIdentificationOnUsAutreAgenceAchat();

    @Query("select A from MvbkSettlement A where   A.categorie ='7' ")
    List<MvbkSettlement> findByIdentificationOffUsIssuerAchat();
    @Query("select A from MvbkSettlement A where   A.categorie ='8' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqAchat();

    @Query("select A from MvbkSettlement A where   A.categorie ='14' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqAlgeriePoste();

    @Query("select A from MvbkSettlement A where   A.categorie ='13' ")
    List<MvbkSettlement> findByIdentificationOffUsIssuerAlgeriePoste();
    @Query("select A from MvbkSettlement A where   A.categorie ='9' ")
    List<MvbkSettlement> findByIdentificationOnUsMemeAgenceCSolde();

    @Query("select A from MvbkSettlement A where   A.categorie ='10' ")
    List<MvbkSettlement> findByIdentificationOnUsAutreAgenceCSolde();
    @Query("select A from MvbkSettlement A where   A.categorie ='11' ")
    List<MvbkSettlement> findByIdentificationOffUsIssuerCSolde();

    @Query("select A from MvbkSettlement A where   A.categorie ='12' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqCSolde();

    @Query("select A from MvbkSettlement A where   A.categorie ='15' ")
    List<MvbkSettlement> findByIdentificationOnusRembourssementTpe();

    @Query("select A from MvbkSettlement A where   A.categorie ='16' ")
    List<MvbkSettlement> findByIdentificationOnusAutreAgenceRembourssementTpe();

    @Query("select A from MvbkSettlement A where   A.categorie ='17' ")
    List<MvbkSettlement> findByIdentificationOffUsIssuerRembourssementTpe();

    @Query("select A from MvbkSettlement A where   A.categorie ='18' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpe();
    
    
    @Query("select A from MvbkSettlement A where   A.categorie ='19' ")
    List<MvbkSettlement> findByIdentificationLOTRetrait();
    @Query("select A from MvbkSettlement A where   A.categorie ='20' ")
    List<MvbkSettlement> findByIdentificationLOTPaiement();
    List<MvbkSettlement> findBycategorie(String cat);
    @Query("select A from MvbkSettlement A where   A.categorie ='21' ")
    List<MvbkSettlement> findByIdentificationCRARetrait();
    @Query("select A from MvbkSettlement A where   A.categorie ='22' ")
    List<MvbkSettlement> findByIdentificationCRAConsultationSolde();
    @Query("select A from MvbkSettlement A where   A.categorie ='23' ")
    List<MvbkSettlement> findByIdentificationCRAPaiementTpe();
    @Query("select A from MvbkSettlement A where   A.categorie ='24' ")
    List<MvbkSettlement> findByIdentificationReglementPaiementTpe();
    @Query("select A from MvbkSettlement A where   A.categorie ='30' ")
    List<MvbkSettlement> findByIdentificationReglementRetrait();
    @Query("select A from MvbkSettlement A where   A.categorie ='31' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeLOT();
    @Query("select A from MvbkSettlement A where   A.categorie ='32' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeReglement();
    @Query("select A from MvbkSettlement A where   A.categorie ='33' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeRCRA();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='38' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqPaiementTpeRCROIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='39' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeRCROIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='40' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqACchatInternetTpeRCROIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='37' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRetraitRCROIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='41' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqConsultationSoldeRCROIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='42' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRetraitReglementIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='43' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqCSoldeReglementIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='44' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqPaiementTpeReglementIN();
    
    @Query("select A from MvbkSettlement A where   A.categorie ='46' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqACchatInternetTpeReglementIN();  
    
    @Query("select A from MvbkSettlement A where   A.categorie ='45' ")
    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeReglementIN();
    
	@Query("select A from MvbkSettlement A where   A.categorie ='47' ")
	List<MvbkSettlement> findByIdentificationOffUsIssuerConsultationSoldeLOT();
	
	@Query("select A from MvbkSettlement A where   A.categorie ='48' ")
	List<MvbkSettlement> findByIdentificationOffUsAcqALPLOT();
	
	   @Query("select A from MvbkSettlement A where   A.categorie ='49' ")
	    List<MvbkSettlement> findByIdentificationCRARetraitALP();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='50' ")
	    List<MvbkSettlement> findByIdentificationReglementRetraitALP();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='51' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRetraitALPRCROIN();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='52' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRetraitALPReglementIN();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='53' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqPaiementInternetLOT();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='58' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementInternetLOT();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='55' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqAchatInternetReglement();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='59' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementInternetCRA();
	   
	   
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='60' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementInternetReglement();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='54' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqAchatInternetCRA();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='61' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeCRO();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='62' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeReglementt();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='70' ")
	    List<MvbkSettlement> findByIdentificationConsultationSoldeReglement(); 
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='71' ")
		List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementInternetInReglement();
	   
	   @Query("select A from MvbkSettlement A where   A.categorie ='75' ")
		List<MvbkSettlement> findByIdentificationOffUsRetraitAlPInReglement();
	   
	   
	    @Query("select A from MvbkSettlement A where A.categorie ='80' ")
	    List<MvbkSettlement> findByIdentificationOppositionGold();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='81' ")
	    List<MvbkSettlement> findByIdentificationOppositionClassic();
	    
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='82' ")
	    List<MvbkSettlement> findByIdentificationRefabricationGold();
	    @Query("select A from MvbkSettlement A where A.categorie ='86' ")
	    List<MvbkSettlement> findByIdentificationRefabricationClassic();
	    
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='83' ")
	    List<MvbkSettlement> findByIdentificationReeditionPinGold();
	    @Query("select A from MvbkSettlement A where A.categorie ='87' ")
	    List<MvbkSettlement> findByIdentificationReeditionPinClassic();
	    
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='84' ")
	    List<MvbkSettlement> findByIdentificationAnnulationGold();
	    @Query("select A from MvbkSettlement A where A.categorie ='88' ")
	    List<MvbkSettlement> findByIdentificationAnnulationClassic();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='85' ")
	    List<MvbkSettlement> findByIdentificationFabricationGold();
	    @Query("select A from MvbkSettlement A where A.categorie ='89' ")
	    List<MvbkSettlement> findByIdentificationFabricationClassic();
	    
	    @Query("select A from MvbkSettlement A where   A.categorie ='100' ")
	    List<MvbkSettlement> findByIdentificationOffUsIssuerAchatExceptionnelMerchant();
	    
	    @Query("select A from MvbkSettlement A where   A.categorie ='101' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqACchatInternetTpeExecptionnelMerchantRCROIN();
	    @Query("select A from MvbkSettlement A where   A.categorie ='102' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqACchatInternetExceptionnelMerchantTpeReglementIN();  
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='530' ")
	    List<MvbkSettlement> findConsultationSoldeExtra();
	  
	    @Query("select A from MvbkSettlement A where A.categorie ='531' ")
	    List<MvbkSettlement> findRetraitExtra();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='532' ")
	    List<MvbkSettlement> findRetraitALPExtra();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='533' ")
	    List<MvbkSettlement> findAchatTPEExtra();
	    @Query("select A from MvbkSettlement A where A.categorie ='545' ")
	    List<MvbkSettlement> findAchatInternetExtra();
	    @Query("select A from MvbkSettlement A where A.categorie ='534' ")
	    List<MvbkSettlement> findRetraitExtraReglement();
	    @Query("select A from MvbkSettlement A where A.categorie ='535' ")
	    List<MvbkSettlement> findRetraitALPExtraReglement();
	    @Query("select A from MvbkSettlement A where A.categorie ='536' ")
	    List<MvbkSettlement> findConsultationSoldeExtraReglement();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='537' ")
	    List<MvbkSettlement> findReglementGlobal();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='539' ")
	    List<MvbkSettlement> findByIdentificationRetraitRejet();
	    @Query("select A from MvbkSettlement A where   A.categorie ='540' ")
	    List<MvbkSettlement> findByIdentificationRejetRetraitALP();
	    
	    @Query("select A from MvbkSettlement A where   A.categorie ='541' ")
	    List<MvbkSettlement> findByIdentificationRejetPaiementTpe();

	    @Query("select A from MvbkSettlement A where   A.categorie ='542' ")
	    List<MvbkSettlement> findByIdentificationOffUsRejectAchatInternet();
	    
	    @Query("select A from MvbkSettlement A where   A.categorie ='542' ")
	    List<MvbkSettlement> findByIdentificationOffUsRejectAchatInternetAlp();
        
	    @Query("select A from MvbkSettlement A where   A.categorie ='543' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRejectRembourssement();

	    @Query("select A from MvbkSettlement A where   A.categorie ='544' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRejctRembourssementInternet();
	    @Query("select A from MvbkSettlement A where   A.categorie ='546' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementTpeEXTRA();
	    @Query("select A from MvbkSettlement A where   A.categorie ='547' ")
	    List<MvbkSettlement> findByIdentificationOffUsAcqRembourssementInternetEXTRA();
	   
	    @Query("select A from MvbkSettlement A where   A.categorie ='548' ")
	    List<MvbkSettlement> Reject40inRetraitExtra();
	    @Query("select A from MvbkSettlement A where   A.categorie ='549' ")
	    List<MvbkSettlement> Reject40inRetraitAlpExtra();
	    @Query("select A from MvbkSettlement A where   A.categorie ='550' ")
	    List<MvbkSettlement> Reject40inConsultationExtra();
	    @Query("select A from MvbkSettlement A where   A.categorie ='551' ")
	    List<MvbkSettlement> Reject50inAchatExtra();
	    
	    @Query("select A from MvbkSettlement A where   A.categorie ='552' ")
	    List<MvbkSettlement> Reject50inAchatInternetExtra();
	    @Query("select A from MvbkSettlement A where   A.categorie ='555' ")
	    List<MvbkSettlement> Reject50inAchatInternetExc();
	    @Query("select A from MvbkSettlement A where   A.categorie ='553' ")
	    List<MvbkSettlement> Reject51inRembExtra();
	    @Query("select A from MvbkSettlement A where A.categorie ='554' ")
	    List<MvbkSettlement> Reject51inRembInternetExtra();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='556' ")
	    List<MvbkSettlement> findByIdentificationFabricationVisa();
	   
	    @Query("select A from MvbkSettlement A where A.categorie ='557' ")
	    List<MvbkSettlement> findByIdentificationRefabricationVisa();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='558' ")
	    List<MvbkSettlement> findByIdentificationOppositionVisa();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='559' ")
	    List<MvbkSettlement> findByIdentificationAnnulationVisa();
	    
	    @Query("select A from MvbkSettlement A where A.categorie ='560' ")
	    List<MvbkSettlement> findByIdentificationReeditionPinVisa();
	    
}
