package com.lizhicommen.service;

import com.lizhicommen.entity.Users;

/**
 * @author <a href="https://github.com/lieeew">leikooo</a>
 * @Description
 */
public interface InnerUserService {
    /**
     * 根据 userAccessKey 获取登录用户
     *
     * @param userAccessKey
     * @return
     */
    Users getInvokeUser(String userAccessKey);
}
