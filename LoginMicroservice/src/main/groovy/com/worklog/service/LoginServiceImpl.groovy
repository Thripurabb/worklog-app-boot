package com.worklog.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.worklog.dao.LoginRepository
import com.worklog.model.User

@Service
class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
	@Override
	@Transactional
	public String login(User user) {
		Optional<User> ob=loginRepository.findById(user.getUname())
		if(ob.get().getUserId().equals(user.getUname()) && ob.get().getUpassword().equals(user.getUpassword()))
			return "success"
		else
			return "fail"
		
	}
}
