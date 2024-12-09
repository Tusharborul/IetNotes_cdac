package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao ldao;
	
	public MyUser findUser(String unm, String passwd) {
		try {
		return ldao.validatUser(unm,passwd);
		}catch(EmptyResultDataAccessException e) {
			System.out.println("user not found");
			return null;
		}
	}

}
