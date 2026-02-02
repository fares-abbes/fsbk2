package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "APPLICATION_LOG_PORTAIL",schema = "AUDITMON")
public class ApplicationLog {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ApplicationSequence")
	  @SequenceGenerator(name = "ApplicationSequence", sequenceName = "AUDITMON.ApplicationSequence", allocationSize = 1)
	  @Column(name = "LOG_ID", nullable = false)
	  private Integer logId;
  @Column(name = "METHOD_NAME")
  private String methodName;

  @Column(name = "BODY")
  private String body;

  @Column(name = "RESPONSE")
  private String response;

  @Column(name = "IP")
  private String ip;

  @Column(name = "EXCUTION_DATE")
  private Date excutionDate;
  @Column(name = "USER_EMAIL")
  private String userEmail;

  @Column(name = "RESPONSE_Body")
  private String responseBody;
  
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Integer getLogId() {
    return logId;
  }

  public void setLogId(Integer logId) {
    this.logId = logId;
  }


  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public Date getExcutionDate() {
    return excutionDate;
  }

  public void setExcutionDate(Date excutionDate) {
    this.excutionDate = excutionDate;
  }


  public String getResponseBody() {
	return responseBody;
  }

public void setResponseBody(String responseBody) {
	this.responseBody = responseBody;
}

@Override
  public String toString() {
    return "ApplicationLog{" +
        "logId=" + logId +
        ", methodName='" + methodName + '\'' +
        ", body='" + body + '\'' +
        ", response='" + response + '\'' +
        ", ip='" + ip + '\'' +
        ", excutionDate=" + excutionDate +
        ", userEmail='" + userEmail + '\'' +
        '}';
  }
}
