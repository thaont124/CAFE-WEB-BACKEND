package lnt.be.common.api.service.response;

import lnt.be.common.api.service.code.ApiResponseCode;

public class ApiResponseGenerator {

    private ApiResponseGenerator() {
    }

    public static ApiResponse<Void> success() { return new ApiResponse<>(ApiResponseCode.SUCCESS); }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ApiResponseCode.SUCCESS, "success", data);
    }

    public static ApiResponse<Void> fail() { return new ApiResponse<>(ApiResponseCode.UNKNOWN_ERROR); }

    public static ApiResponse<Void> fail(ApiResponseCode code) { return new ApiResponse<>(code); }

    public static <T> ApiResponse<T> fail(ApiResponseCode code, String msg) {
        return new ApiResponse<>(code, msg, null);
    }
}