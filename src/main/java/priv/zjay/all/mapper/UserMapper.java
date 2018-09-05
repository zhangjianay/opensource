package priv.zjay.all.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

	/**
	 * 根据userName与password去数据库查看是否存在
	 * @param userName
	 * @param password
	 * @return
	 */
	@Select("SELECT id FROM userinfos where user_name=#{userName} and password=#{password}")
    String getUserById(@Param("userName") String userName, @Param("password") String password);
    
	/**
	 * 根据userName去查是否存在
	 * @param userName
	 * @return
	 */
	@Select("SELECT count(id) FROM userinfos where user_name=#{userName}")
    int getUserByUserName(@Param("userName") String userName);
	
	/**
	 * 插入数据
	 * @param userName
	 * @param password
	 */
    @Insert("INSERT INTO userinfos(id,user_name,password,age,email,phone_num,role_id,create_time)"
    		+ " VALUES(#{userId},#{userName}, #{password}, null, '', '','1',#{createTime})")
    void insertUserInfo(@Param("userId") long userId, @Param("userName") String userName, @Param("password") String password, @Param("createTime") String createTime);
	
	/**
	 * 根据userId去查是否存在
	 * @param userId
	 * @return
	 */
	@Select("SELECT user_name FROM userinfos where id=#{userId}")
    String getUserNameById(@Param("userId") String userId);
}
