package com.lykke.tests.api.service.notificationsystem.templates.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemplateResponce {

    private TemplateByLanguageDetailsResponse template;
}
