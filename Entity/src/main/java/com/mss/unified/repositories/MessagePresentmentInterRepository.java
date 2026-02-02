package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.MessagePresentmentInter;
@Repository
public interface MessagePresentmentInterRepository extends JpaRepository <MessagePresentmentInter, Integer >{

}
