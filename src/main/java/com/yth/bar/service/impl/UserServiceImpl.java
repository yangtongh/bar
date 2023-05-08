package com.yth.bar.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yth.bar.mapper.UserMapper;
import com.yth.bar.pojo.User;
import com.yth.bar.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public String login(String username, String password) {
        String s = redisTemplate.opsForValue().get(username);
        if(StringUtils.isNotBlank(s)){
            JSONObject jsonObject = JSONObject.parseObject(s);
            if(StringUtils.equals(jsonObject.getString("username"),username)){
                if(StringUtils.equals(jsonObject.getString("password"),password)){
                    return "登陆成功";
                }else {
                    return "登录失败";
                }
            }
        }
        User user = userMapper.login(username, password);
        if (user.getUsername().equals(username) && user.getPassword().equals(password)){
            redisTemplate.opsForValue().set("user",username);
            String user1 = redisTemplate.opsForValue().get("user");
            System.out.println(user1);
            return "登陆成功";
        }  else{
            return "登录失败";
        }
    }

    @Override
    public String register(User user) {
        String username = user.getUsername();
        String result = userMapper.select(username);
        if (result==null && !result.equals(user.getUsername())){
            userMapper.register(user);
            return "注册成功";
        }else{
            return "注册失败";
        }
    }
}
