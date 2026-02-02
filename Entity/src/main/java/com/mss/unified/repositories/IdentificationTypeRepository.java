package com.mss.unified.repositories;

import com.mss.unified.entities.IdentificationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface IdentificationTypeRepository extends JpaRepository<IdentificationType, Integer > {
    IdentificationType findByIdentificationTypeCode(Integer identificationTypeCode);

    IdentificationType findByFsbkCode(String fsbkCode);
}
