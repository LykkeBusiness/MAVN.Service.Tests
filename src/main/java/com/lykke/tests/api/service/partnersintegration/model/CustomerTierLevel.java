package com.lykke.tests.api.service.partnersintegration.model;

import static java.util.stream.Collectors.toMap;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(UpperCamelCaseStrategy.class)
public enum CustomerTierLevel {
    BLACK("Black"),
    SILVER("Silver"),
    GOLD("Gold"),
    PLATINUM("Platinum");

    private static Map<String, CustomerTierLevel> FORMAT_MAP =
            Stream.of(CustomerTierLevel.values())
                    .collect(toMap(c -> c.getCode(), Function.identity()));
    @Getter
    private String code;

    @JsonCreator
    public static CustomerTierLevel fromString(String value) {
        return Optional
                .ofNullable(FORMAT_MAP.get(value))
                .orElseThrow(() -> new IllegalArgumentException(value));
    }
}
