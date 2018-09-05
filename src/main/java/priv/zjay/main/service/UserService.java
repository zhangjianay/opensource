package priv.zjay.main.service;

public interface UserService {

	String verifyUser(String userName, String password) throws Exception;
	
	Long[] insertUser(String userName, String password) throws Exception;
	
	String getUserNameById(String userId) throws Exception;
}
