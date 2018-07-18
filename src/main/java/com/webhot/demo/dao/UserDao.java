package com.webhot.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.webhot.demo.pojo.User;

@Mapper
public interface UserDao {
	public abstract int saveUser() ;
	public abstract List<User> selectAlluser();

}
