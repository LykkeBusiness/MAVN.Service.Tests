package com.lykke.tests.api.service.admin.model.burnrules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.lykke.tests.api.common.enums.Localization;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileContentEditRequest extends MobileContentCreateRequest {

    private String titleId;
    private String descriptionId;
    private String imageId;

    @Builder(builderMethodName = "mobileContentEditRequestBuilder")
    public MobileContentEditRequest(Localization mobileLanguage, String title, String description, String imageBlobUrl,
            String titleId,
            String descriptionId, String imageId) {
        super(mobileLanguage, title, description, imageBlobUrl);
        this.titleId = titleId;
        this.descriptionId = descriptionId;
        this.imageId = imageId;
    }
}
