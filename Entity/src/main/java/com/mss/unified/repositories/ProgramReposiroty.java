package com.mss.unified.repositories;



import com.mss.unified.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public
interface ProgramReposiroty extends JpaRepository <Program,Integer > {
    Optional<Program> findProgramByBinOnUsCode(int bin);
    Optional<Program> findByProgramCode(Integer code);
    @Query("SELECT r from Program r where r.libelle like %:libelle%")
    List<Program> findAllByProgramLibelle(String libelle);

}
