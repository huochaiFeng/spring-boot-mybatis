package com.hwadee.smbms.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hwadee.smbms.dao.UserMapper;
import com.hwadee.smbms.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User login(String userCode, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		user = userMapper.getLoginUser(userCode);
		//匹配密码
		if(null != user){
			if(!user.getUserPassword().equals(userPassword))
				user = null;
		}
		return user;
	}

}
