package com.project.account.dto;

import com.project.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {

    private ErrorCode errorCode;
    private String errorMessage;

}
