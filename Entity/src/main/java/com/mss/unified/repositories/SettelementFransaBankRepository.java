package com.mss.unified.repositories;

import com.mss.unified.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettelementFransaBankRepository extends JpaRepository<SettelementFransaBank,Integer> {
    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG025(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG029_G030_G031_G033_G034(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.idHeder=:file")
    List<FileContent> getG035_G036_G037_G038(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG001_G002_G003_G004_G005_G006(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG007_G008_G009_G010_G011_G012_G013(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG014_G015_G016_G017_G018_G019_G020_G021_G022_G23(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.idHeder=:file")
    List<FileContent> getG039_G040_G041_G042_G043(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction='050' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG044_G045_G046_G047_G048_G049(String file, String bank);

    SettelementFransaBank findByIdentificationbh(String identification);
    @Query("select A.identificationbh,A.debitAccount from SettelementFransaBank A")
    List<String[]> getListDebit();
    @Query("select A.identificationbh,A.creditAccount from SettelementFransaBank A")
    List<String[]> getListCredit();

///////new operation code //////////
@Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
List<FileContent> getG001_G002_G003(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence")
    List<FileContent> getG004_G005_G006_G007(String file, String bank);
    @Query("select A from FileContent A where   A.CodeBankAcquereur= A.codeBank  and A.typeTransaction='080' and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence")
    List<FileContent> chargebackOnUsMA(  String file);
    @Query("select A from FileContent A where   A.CodeBankAcquereur= A.codeBank  and A.typeTransaction='080' and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence")
    List<FileContent> chargebackOnUsAA(  String file);
    @Query("select A from FileContent A where   A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.typeTransaction='080' and A.idHeder=:file ")
    List<FileContent> chargebackIssuer(  String file, String bank);
    @Query("select A from FileContent A where   A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.typeTransaction='080' and A.idHeder=:file ")
    List<FileContent> chargebackAcq(  String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.codeBank NOT IN (:banks)  and A.idHeder=:file")
    List<FileContent> getG008_G009_G010_G011_G012_G013(String file, String bank, List<String> banks);

    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur!=:bank and A.CodeBankAcquereur NOT IN (:banks)    and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG014_G015_G016_G018_G019_G020_G021_G022_G23_G024(String file, String bank, List<String> banks);
///////////ACHAT/////////////////////
@Query("select A from FileContent A where A.typeTransaction in ('050','005','059') and A.CodeBankAcquereur=:bank and A.codeBank !=:bank and A.idHeder=:file")
List<FileContent> getG026_G027_G028_G029_G030_G031_G032_G033(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in ('050','005','059') and A.CodeBankAcquereur !=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG034_G035_G036_G037_G038_G039_G040(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('050','005','059') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
    List<FileContent> getG041_G042_G043(String file, String bank);
    @Query("select A from FileContent A where A.typeTransaction in ('050','005','059') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence")
    List<FileContent> getG044_G045_G046_G047(String file, String bank);

    /////////////// REMBOURSSEMENT TPE/////////////////////
    @Query("select A from FileContent A where A.typeTransaction in('051','054') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
    List<FileContent> getG103_G104_G105_G106_G107(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('051','054') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence ")
    List<FileContent> getG108_G109_G110_G111_G112_G113(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in ('051','054') and A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG097_G098_G099_G100_G101_G102(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in ('051','054') and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.idHeder=:file")
    List<FileContent> getG048_G049_G050_G051_G052_G094_G095_G096(String file, String bank);

    ///////////////// REMBOURSSEMNT INTERNET ////////////////////////////////////
    @Query("select A from FileContent A where A.typeTransaction in ('055','056') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
    List<FileContent> getG148_G149_G150_G151_G152(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('055','056') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence ")
    List<FileContent> getG153_G154_G155_G156_G157_G158(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('055','056') and A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG142_G143_G144_G145_G146_G147(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('055','056') and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.idHeder=:file")
    List<FileContent> getG134_G135_G136_G137_G138_G139_G140_G141(String file, String bank);

    ////////////////***** CONSULTATION SOLDE ****** ////////////////////////////////////////

    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
    List<FileContent> getG114_G115_G116_G117(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence ")
    List<FileContent> getG118_G119_G120_G121(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur!=:bank and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG127_G128_G129_G130_G131_G132_G133(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction='014' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.idHeder=:file")
    List<FileContent> getG122_G123_G124_G125_G126(String file, String bank);


    /////////////// ALGERIE POSTE //////////////////////////////////////

    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur  IN (:banks)   and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG159_G160_G161_G162_G163_G164_G165_G166_G167_G168_G169(String file, String bank, List<String> banks);

    @Query("select A from FileContent A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank  and A.codeBank  IN (:banks)  and A.idHeder=:file")
    List<FileContent> getG170_G171_G172_G173_G174_G175(String file, String bank, List<String> banks);

    ////////////// ACHAT INTERNET ///////////////////////////////////////////////////////

    @Query("select A from FileContent A where A.typeTransaction in('052','053','062') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file  and SUBSTRING(A.numRIBEmetteur,4,5)=A.CodeAgence ")
    List<FileContent> getG081_G082_G083_G084_G085_G086(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('052','053','062') and A.CodeBankAcquereur=:bank and A.codeBank=:bank and A.idHeder=:file and SUBSTRING(A.numRIBEmetteur,4,5)!=A.CodeAgence")
    List<FileContent> getG087_G088_G089_G090_G091_G092_G093(String file, String bank);

    @Query("select A from FileContent A where A.typeTransaction in('052','053','062') and A.CodeBankAcquereur=:bank and A.codeBank !=:bank and A.codeBank NOT IN (:banks)  and A.idHeder=:file")
    List<FileContent> getG066_G067_G068_G069_G070_G071_G072_G073(String file, String bank, List<String> banks);

    @Query("select A from FileContent A where A.typeTransaction in ('052','053','062') and A.CodeBankAcquereur !=:bank and A.CodeBankAcquereur NOT IN (:banks) and A.codeBank=:bank and A.idHeder=:file and A.idCommercant NOT IN(select e.merchantId FROM MerchantException e)")
    List<FileContent> getG074_G075_G076_G077_G078_G079_G080(String file, String bank, List<String> banks);



    @Query("select A from FileContent A where A.typeTransaction in('052','053','062') and A.CodeBankAcquereur=:bank  and A.codeBank   IN (:banks)   and A.idHeder=:file")
    List<FileContent> getG178_G179_G180_G181_G182_G183_G184_G185(String file, String bank, List<String> banks);

    @Query("select A from FileContent A where A.typeTransaction in ('052','053','062') and A.CodeBankAcquereur   IN (:banks)  and A.codeBank=:bank and A.idHeder=:file")
    List<FileContent> getG186_G187_G188_G189_G190_G191_G192(String file, String bank, List<String> banks);

    ////////////////////****** code bank ******************//////////////////////////////////////////
  
    
    
    @Query("select DISTINCT (A.typeAcqIssuer)  from CommissionFransaBank A where A.typeAcqIssuer is not null")
    List<String> getAutreCodeBank();
    
    //////////////*********** achat internet exceptionnel merchant *****************///////////////////////
    @Query("select A from FileContent A where A.typeTransaction in ('052', '053', '062') and A.CodeBankAcquereur != :bank and A.CodeBankAcquereur NOT IN (:banks) and A.codeBank = :bank and A.idHeder = :file and A.idCommercant IN (select e.merchantId from MerchantException e)")
    List<FileContent> getG193_G194_G195_G196_G197_G198_G199(String file, String bank, List<String> banks);

    
    





}
