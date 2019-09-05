package com.hwadee.smbms.mapper;

import java.util.List;

import com.hwadee.smbms.model.Role;

public interface RoleMapper {
	
	
	/**
	 * 获取角色列表
	 * @return
	 * @throws Exception
	 */
	public List<Role> getRoleList()throws Exception;
}
