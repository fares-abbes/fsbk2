package com.mss.unified.repositories;

import com.mss.unified.entities.EmvTerminalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmvTerminalDataRepository extends JpaRepository<EmvTerminalData,Integer> {
	 EmvTerminalData findByEmvTerminalDataId(Integer code);
}
