package com.lykke.tests.api.service.eligibilityengine.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ConvertAmountRequest {

    private String fromCurrency;
    private String toCurrency;
    private String customerId;
    private String amount;
}
