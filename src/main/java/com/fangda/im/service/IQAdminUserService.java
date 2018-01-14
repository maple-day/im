package com.fangda.im.service;

import com.fangda.im.entity.QAdminUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author davis
 * @since 2017-12-14
 */
public interface IQAdminUserService extends IService<QAdminUser> {

    /**
     * 根据用户名找密码
     * @param username
     * @return
     */
    QAdminUser selectByUsername(String username);
}
