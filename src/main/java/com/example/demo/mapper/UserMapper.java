package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author GG
 * User Mapper
 */
@Mapper
public interface UserMapper {
    public List<User> getList();
}
