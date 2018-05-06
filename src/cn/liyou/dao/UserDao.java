package cn.liyou.dao;

import java.util.List;

import cn.liyou.pojo.User;

public interface UserDao {
	/**
	 * 查询用户列表
	 * @return
	 */
	List<User> selectAll();

}
