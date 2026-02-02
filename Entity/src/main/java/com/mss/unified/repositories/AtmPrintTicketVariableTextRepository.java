package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.AtmPrintTicketVariableText;

@Repository
public interface AtmPrintTicketVariableTextRepository  extends JpaRepository < AtmPrintTicketVariableText, String > {

}
