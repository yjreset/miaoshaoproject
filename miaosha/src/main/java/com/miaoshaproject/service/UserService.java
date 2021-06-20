package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: YJ
 * @time: 2021/6/19 17:27
 */
public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
