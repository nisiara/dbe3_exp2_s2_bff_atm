package com.bancoxyz.bff_atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.bff_atm.model.dto.TransactionResponse;
import com.bancoxyz.bff_atm.service.ATMService;

@RestController
@CrossOrigin
@RequestMapping("/api/bff-atm")
public class ATMController {

  @Autowired
  private ATMService atmService;

  public ATMController(ATMService atmService){
    this.atmService = atmService;
  }

  @GetMapping("/valid-transaction")
  public ResponseEntity<List<TransactionResponse>> getInvalidTransactions(){
    return ResponseEntity.ok(atmService.validTransactions());
  }    
  
}
