package com.lykke.tests.api.service.partnersintegration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ReferralInformationRequestModel {

    private String customerId;
    private String partnerId;
    private String locationId;
}
