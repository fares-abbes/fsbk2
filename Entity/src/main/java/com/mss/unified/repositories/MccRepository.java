package com.mss.unified.repositories;

import com.mss.unified.entities.MccList;
import com.mss.unified.entities.PosService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MccRepository  extends JpaRepository <MccList, String> {
    boolean existsByMccCode(String code);
    MccList findByMccCode(Integer code);
    MccList findByMccListLibelle(String libelle);
    MccList findByMccListId(String libelle);

    
    @Query("SELECT r from MccList r where r.mccListLibelle like %:mccListLibelle%")	
	List<MccList> findAllmccListLibellee(String mccListLibelle);
}
