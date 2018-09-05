package priv.zjay.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import priv.zjay.all.mapper.UserMapper;
import priv.zjay.main.service.UserService;
import priv.zjay.utils.QString;
import priv.zjay.utils.UUIDUtils;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String verifyUser(String userName, String password) throws Exception {
		String id = userMapper.getUserById(userName, password);
		if(QString.IsNullOrEmpty(id))
			return null;
		else
			return id;
	}

	@Override
	public Long[] insertUser(String userName, String password) throws Exception {
		int count = userMapper.getUserByUserName(userName);
		if(count > 0)
			return new Long[] {1l};
		long uuid = UUIDUtils.generate();
		userMapper.insertUserInfo(uuid, userName, password, System.currentTimeMillis()+"");
		return new Long[] {0l, uuid};
	}

	@Override
	public String getUserNameById(String userId) throws Exception {
		return userMapper.getUserNameById(userId);
	}

}
