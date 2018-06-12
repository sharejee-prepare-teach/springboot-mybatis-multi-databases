package com.aidijing.user.service.impl;

import com.aidijing.user.domain.User;
import com.aidijing.user.mapper.UserMapper;
import com.aidijing.user.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 披荆斩棘
 * @since 2017-09-08
 */
@Service
public class UserServiceImpl extends ServiceImpl< UserMapper, User > implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List< User > list () {
        return userMapper.selectList( null );
    }

    @Override
    public User save ( User user ) {
        userMapper.insert( user );
        System.err.println("Save");
        return user;
    }
}
