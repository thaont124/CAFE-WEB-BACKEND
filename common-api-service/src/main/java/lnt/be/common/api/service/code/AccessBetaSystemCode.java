package lnt.be.common.api.service.code;


import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
@Getter
@ToString
public enum AccessBetaSystemCode {

    PRODUCT_API_SERVER(
            "PRODUCT_API_SYSTEM",
            "PRODUCT API 시스템",
            "product-1b6ec267-51ab-4f67",
            "PRODUCT API 서버"
    );

    private final String systemId;
    private final String systemName;
    private final String apiKey;
    private final String description;

    public static Optional<AccessBetaSystemCode> findByApiKey(String apiKey) {
        for (AccessBetaSystemCode accessBetaSystemCode : AccessBetaSystemCode.values()) {
            if (accessBetaSystemCode.getApiKey().equals(apiKey)) {
                return Optional.of(accessBetaSystemCode);
            }
        }
        return Optional.empty();
    }

    AccessBetaSystemCode(String systemId, String systemName, String apiKey, String description) {
        this.systemId = systemId;
        this.systemName = systemName;
        this.apiKey = apiKey;
        this.description = description;
    }
}
