package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.ConfCategories;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.MvbkConf;
import com.mss.unified.entities.MvbkSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConfCategoriesRepository extends JpaRepository<ConfCategories, Integer> {
	List<ConfCategories> findByTypeAndCode(Integer type,Integer code);

	List<ConfCategories> findByType(Integer type);

}
