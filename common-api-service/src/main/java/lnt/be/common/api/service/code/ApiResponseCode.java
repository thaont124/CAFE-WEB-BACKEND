package lnt.be.common.api.service.code;
import lombok.ToString;

@ToString
public enum ApiResponseCode {

    SUCCESS("200", "Success"),
    SYSTEM_ERROR("101", "System error"),
    SYSTEM_PERMISSION_ERROR("102", "System permission error"),
    SYSTEM_STATUS_ERROR("1003", "Abnormal system status"),
    RESOURCE_NOT_FOUND("404", "Resource not found"),
    BUSINESS_ERROR("4005", "Business logic error"),
    BAD_REQUEST_ERROR("9000", "Bad request"),
    UNAUTHORIZED_ERROR("9001", "Unauthorized access"),
    UNKNOWN_ERROR("9999", "Unknown error");


    private final String code;

    private final String defaultMessage;

    ApiResponseCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getCode() {
        return this.code;
    }

    public String getDefaultMessage() {
        return this.defaultMessage;
    }
}
