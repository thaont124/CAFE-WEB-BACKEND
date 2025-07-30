package lnt.be.common.api.service.code;

import lombok.Getter;
import lombok.ToString;

import java.util.Optional;

@Getter
@ToString
public enum AccessSystemCode {

    PRODUCT_API_SERVER(
            "PRODUCT_API_SYSTEM",
            "PRODUCT API 시스템",
            "product-7160e0cb-d7ca-4e4c-9...",
            "PRODUCT API 서버"
    );

    private final String systemId;
    private final String systemName;
    private final String apiKey;
    private final String description;

    public static Optional<AccessSystemCode> findByApiKey(String apiKey) {
        for (AccessSystemCode accessSystemCode : AccessSystemCode.values()) {
            if (accessSystemCode.getApiKey().equals(apiKey)) {
                return Optional.of(accessSystemCode);
            }
        }
        return Optional.empty();
    }

    AccessSystemCode(String systemId, String systemName, String apiKey, String description) {
        this.systemId = systemId;
        this.systemName = systemName;
        this.apiKey = apiKey;
        this.description = description;
    }
}

