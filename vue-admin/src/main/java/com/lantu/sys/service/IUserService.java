package com.lantu.sys.service;

import com.lantu.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zc
 * @since 2023-04-01
 */
public interface IUserService extends IService<User> {

    Map<String, Object> login(User user);


    Map<String, Object> getUserInfo(String token);

    void logout(String token);
}
