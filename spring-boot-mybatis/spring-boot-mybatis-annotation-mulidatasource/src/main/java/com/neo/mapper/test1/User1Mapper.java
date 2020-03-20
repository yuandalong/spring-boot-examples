package com.neo.mapper.test1;

import com.neo.model.User;
import com.neo.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;
//@Mapper
//数据源配置类里加@MapperScan，此处就不需要另外写@Mapper了
//单数据源的情况下可以在启动类里加@MapperScan
public interface User1Mapper {


	@Select("SELECT * FROM users")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	List<User> getAll();

	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	User getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(User user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(User user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}