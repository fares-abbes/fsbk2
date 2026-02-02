package com.mss.unified.repositories;
import com.mss.unified.entities.VueActionBkp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VueActionBkpRepo extends JpaRepository<VueActionBkp, Integer> {
    VueActionBkp findByUrl(String url);
    boolean existsByLibelle(String libelle);

}
