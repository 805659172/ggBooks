package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author GG
 * User Mapper
 */
@Mapper
@Component
public interface UserMapper {
    public List<User> getList();
}
