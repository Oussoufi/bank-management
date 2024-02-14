package com.mayatech.sebocabank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransferRequest {
    @Schema(
            name = "Source Account Number"
    )
    private String sourceAccountNumber;

    @Schema(
            name = "Destination Account Number"
    )
    private String destinationAccountNumber;

    @Schema(
            name = "Amount"
    )
    private BigDecimal amount;
}
