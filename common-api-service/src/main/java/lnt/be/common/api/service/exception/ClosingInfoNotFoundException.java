package lnt.be.common.api.service.exception;


public class ClosingInfoNotFoundException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "마감 정보를 찾을 수 없습니다.";

    public ClosingInfoNotFoundException() { super(DEFAULT_MESSAGE); }

    public ClosingInfoNotFoundException(String message) { super(message); }

    public ClosingInfoNotFoundException(Long closingInfoId) {
        super(String.format("마감 정보를 찾을 수 없습니다: id %s", closingInfoId));
    }

    public ClosingInfoNotFoundException(String message,
                                        Throwable cause) {
        super(message, cause);
    }
}
