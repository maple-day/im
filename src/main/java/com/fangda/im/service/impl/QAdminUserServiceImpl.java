package com.fangda.im.service.impl;

import com.fangda.im.entity.QAdminUser;
import com.fangda.im.mapper.QAdminUserMapper;
import com.fangda.im.service.IQAdminUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author davis
 * @since 2017-12-14
 */
@Service
public class QAdminUserServiceImpl extends ServiceImpl<QAdminUserMapper, QAdminUser> implements IQAdminUserService {

    @Autowired
    private QAdminUserMapper adminUserMapper;
    @Override
    public QAdminUser selectByUsername(String username) {
//        EntityWrapper<QAdminUser> wrapper = new EntityWrapper<>();
//        wrapper.eq("username",username);
        QAdminUser user = new QAdminUser();
        user.setUsername(username);
        QAdminUser adminUser = adminUserMapper.selectOne(user);
        return adminUser;
    }
}
