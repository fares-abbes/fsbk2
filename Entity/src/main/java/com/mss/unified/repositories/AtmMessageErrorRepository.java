package com.mss.unified.repositories;

import com.mss.unified.entities.AtmMessageError;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmMessageErrorRepository extends PagingAndSortingRepository<AtmMessageError,String> {

}
