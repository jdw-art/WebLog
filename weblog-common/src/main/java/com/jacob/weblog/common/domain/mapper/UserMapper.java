package com.jacob.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacob.weblog.common.domain.dos.UserDO;

/**
 * @Author: Jacob
 * @Description: 用户信息接口
 * @Date: 2024/4/16 19:12
 * @Version: 1.0
 */
public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}
