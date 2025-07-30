package lnt.be.common.api.service.exception;

public class IdParameterException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Id는 최소 1개 이상 필요합니다.";

    public IdParameterException() { super(DEFAULT_MESSAGE); }

    public IdParameterException(String message) { super(message); }

    public IdParameterException(String message,
                                Throwable cause) {
        super(message, cause);
    }
}