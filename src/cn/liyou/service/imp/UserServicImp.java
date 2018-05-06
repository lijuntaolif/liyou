package cn.liyou.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.liyou.dao.UserDao;
import cn.liyou.pojo.User;
import cn.liyou.service.UserService;

@Service
public class UserServicImp implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getAllUser() {
		
		return userDao.selectAll();
	}

}
