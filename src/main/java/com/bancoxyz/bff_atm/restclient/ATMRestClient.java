package com.bancoxyz.bff_atm.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bancoxyz.bff_atm.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_atm.model.dto.InterestResponse;
import com.bancoxyz.bff_atm.model.dto.TransactionResponse;

@FeignClient(name = "backend", url = "http://localhost:8090/backend/api")
public interface ATMRestClient {

  @GetMapping("/transaction")
	List<TransactionResponse> findAllTransactions();

  @GetMapping("/interest")
  List<InterestResponse> findAllInterests();
  
  @GetMapping("/annual-account")
  List<AnnualAccountResponse> findAllAnnualAccounts();

  
  
}
