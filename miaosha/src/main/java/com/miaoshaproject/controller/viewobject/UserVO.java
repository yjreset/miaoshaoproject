package com.miaoshaproject.controller.viewobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: YJ
 * @time: 2021/6/19 17:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telphone;
}
