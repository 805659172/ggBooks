package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author GG
 * 2020年6月21日14点15分
 * 用户映射接口
 * User Mapper
 */
@Mapper
@Component
public interface UserMapper {
    public List<User> findAll();

    public void add(User user);

    public User findByID(Integer ID);

    public User findByAccountNO(String sAccountNO);

}
