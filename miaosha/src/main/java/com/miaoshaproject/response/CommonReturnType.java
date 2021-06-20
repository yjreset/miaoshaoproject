package com.miaoshaproject.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:公共返回对象
 * @author: YJ
 * @time: 2021/6/19 18:11
 */
@Data
public class CommonReturnType {
    private String status;
    private Object data;
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }
    public static CommonReturnType create(Object result, String status){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }

}
