package com.example.springboot2.ws;

public class WebServiceResponse {
  private String personName;

  public WebServiceResponse() {
  }

  public WebServiceResponse(String personName) {
    this.personName = personName;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }
}
