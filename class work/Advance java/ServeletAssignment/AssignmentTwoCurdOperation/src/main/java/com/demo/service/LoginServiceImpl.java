package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	LoginDao ldao;
	
	public LoginServiceImpl() {
		super();
		this.ldao = new LoginDaoImpl();
	}
	
	@Override
	public User validateUser(String uname, String passwd) {
		// TODO Auto-generated method stub
		return ldao.validateUser(uname, passwd);
	}

}
