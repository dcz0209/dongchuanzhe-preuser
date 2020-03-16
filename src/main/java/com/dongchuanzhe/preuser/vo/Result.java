package com.dongchuanzhe.preuser.vo;

import lombok.Data;

@Data
public class Result {

    private String message;

    private Integer code;

    private Object result;

    public Result() {
    }

    public Result(String message, Integer code, Object result) {
        this.message = message;
        this.code = code;
        this.result = result;
    }

    public static Result ok(Object result){
        return  new Result("success",1000,result);
    }
    public static Result no(Integer code,Object result){
        return  new Result("error",code,result);
    }
}
