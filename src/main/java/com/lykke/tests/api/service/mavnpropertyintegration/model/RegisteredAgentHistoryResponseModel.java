package com.lykke.tests.api.service.mavnpropertyintegration.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisteredAgentHistoryResponseModel {

    private String customerId;
    private Date sentTimestamp;
    private String responseStatus;
    private String responseErrorCode;
    private String responseAgentStatus;
    private String responseAgentSalesforceId;
    private Date responseRegistrationTimestamp;
    private String responseSalesmanSalesforceId;
    private String mvnReferralId;
}
