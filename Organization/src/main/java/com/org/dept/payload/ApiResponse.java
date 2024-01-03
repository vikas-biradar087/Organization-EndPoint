package com.org.dept.payload;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private boolean success;


    public ApiResponse(String message, boolean success) {
        super();
        this.message = message;
        this.success = success;
    }

    public String getMessage() {

        return message;
    }
    public void setMessage(String message) {

        this.message = message;
    }
    public Boolean getSuccess() {

        return success;
    }
    public void setSuccess(Boolean success) {

        this.success = success;
    }
}
