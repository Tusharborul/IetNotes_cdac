package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser validatUser(String unm, String passwd);

}
