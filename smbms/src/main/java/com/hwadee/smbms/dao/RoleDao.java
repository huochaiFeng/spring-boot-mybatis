package com.hwadee.smbms.dao;

import java.sql.Connection;
import java.util.List;

import com.hwadee.smbms.model.Role;

public interface RoleDao {
	
	public List<Role> getRoleList(Connection connection)throws Exception;

}
