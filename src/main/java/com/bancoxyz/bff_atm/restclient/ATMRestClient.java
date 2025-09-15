package com.bancoxyz.bff_atm.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bancoxyz.bff_atm.model.dto.TransactionResponse;

@FeignClient(name = "backend", url = "http://localhost:8080/backend/api")
public interface ATMRestClient {

  @GetMapping("/transaction")
	List<TransactionResponse> findAllTransactions();

}
