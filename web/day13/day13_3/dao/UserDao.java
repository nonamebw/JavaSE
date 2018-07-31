package cn.itcast.dao;

import cn.itcast.domain.User;

public class UserDao {
	/*
	 * 把xml中的数据查询出来之后，封装到user对象中，然后返回
	 */
	public User find() {
		return new User("zhangSan", "123"); 
	}
}
