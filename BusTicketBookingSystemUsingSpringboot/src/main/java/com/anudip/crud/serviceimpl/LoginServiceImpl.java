package com.anudip.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.crud.entity.Login;
import com.anudip.crud.repository.LoginRepository;
import com.anudip.crud.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository lrepo;
	
	@Override
	public Login loginU(String userName, String password) {
		Login user = lrepo.findByUserNameAndPassword(userName, password);
		return user;
	}

}
