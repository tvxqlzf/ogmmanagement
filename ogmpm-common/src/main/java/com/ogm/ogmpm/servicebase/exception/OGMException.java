package com.ogm.ogmpm.servicebase.exception;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OGMException extends  RuntimeException{
    @ApiModelProperty(value = "状态码")
    private Integer code;
    private String msg;

    @Override
    public String toString() {
        return "MSRException{" +
                "message=" + this.getMsg() +
                ", code=" + code +
                '}';
    }
}
