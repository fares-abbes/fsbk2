package com.mss.unified.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class MessageConnectService {



  RestTemplate restTemplate = new RestTemplate();

  String url = "http://localhost:8081/api/getFields";


  public CryptoModelResponse getKeys(RequestBodyMessage  atmTerminal)
  {

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity<RequestBodyMessage> entity = new HttpEntity<RequestBodyMessage>(atmTerminal,headers);

    return   restTemplate.exchange(
        url , HttpMethod.POST, entity, CryptoModelResponse.class).getBody();



  }

}