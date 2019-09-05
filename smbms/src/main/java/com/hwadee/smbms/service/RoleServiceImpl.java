package com.hwadee.smbms.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.hwadee.smbms.mapper.RoleMapper;
import com.hwadee.smbms.model.Role;

@Service
public class RoleServiceImpl implements RoleService{
	@Resource
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> getRoleList() throws Exception{
		// TODO Auto-generated method stub
		return roleMapper.getRoleList();
	}
	
}
