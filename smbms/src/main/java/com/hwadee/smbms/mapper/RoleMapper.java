package com.hwadee.smbms.mapper;

import java.sql.Connection;
import java.util.List;

import com.hwadee.smbms.model.Role;

public interface RoleMapper {
	
	public List<Role> getRoleList(Connection connection)throws Exception;

}
