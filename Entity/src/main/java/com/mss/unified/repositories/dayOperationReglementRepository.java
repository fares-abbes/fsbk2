package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.dayOperationReglement;;
@Repository
public interface dayOperationReglementRepository extends JpaRepository<dayOperationReglement, Integer> {
	 @Query("select A from dayOperationReglement A where A.numRefTransaction=:numTransaction and A.numAutorisation=:numAutorisation and A.numCartePorteur=:numCartePorteur")
	    List<dayOperationReglement> getListOnUsMemeAgenceByNumTransaction(String numTransaction,String numAutorisation,String numCartePorteur );
	    @Query("select A from dayOperationReglement A where A.dateReglement=:fileIntegration")
	    List<dayOperationReglement>findByDoneReglementAndDate(String fileIntegration);
}
