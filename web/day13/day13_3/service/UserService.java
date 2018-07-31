package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserService {
	// service层依赖dao层
	private UserDao userDao = new UserDao();
	
	/*
	 * service的查询，需要使用dao来完成！
	 */
	public User find() {
		return userDao.find();
	}
}
