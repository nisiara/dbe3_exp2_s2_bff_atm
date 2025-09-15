package com.bancoxyz.bff_atm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.bff_atm.model.dto.TransactionResponse;
import com.bancoxyz.bff_atm.restclient.ATMRestClient;


@Service
public class ATMService {

  @Autowired
  private ATMRestClient atmRestClient;

  public ATMService(ATMRestClient atmRestClient){
    this.atmRestClient = atmRestClient;
  }

  public List<TransactionResponse> validTransactions() {
    return atmRestClient.findAllTransactions().stream()
      .filter(transaction -> !transaction.getType().equalsIgnoreCase("invalid"))
      .toList();
  }
  
  
}
