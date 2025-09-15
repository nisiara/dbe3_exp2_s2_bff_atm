package com.bancoxyz.bff_atm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class TransactionResponse {
  private Integer amount;
  private String type;
}
