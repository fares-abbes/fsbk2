package com.mss.unified.repositories;

import com.mss.unified.entities.ModelTpe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelTpeRepository extends JpaRepository<ModelTpe,Integer> {

	 ModelTpe findByModelTpe(Integer code);

}
