package priv.zjay.all.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * 类hibernate 自动更新表结构或者创建表
 * 用户所有信息
 * @author Administrator
 *
 */
@Table(name="userinfos")
public class Users {

	@Column(name = "id",type = MySqlTypeConstant.BIGINT,length=30,isKey = true)//isunique属性不要使用 切记！！
	private String id;
	
	@Column(name = "user_name",type = MySqlTypeConstant.VARCHAR,length = 100,isNull=false)
	private String userName;
	
	@Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 40,isNull=false)
	private String password;
	
	@Column(name = "age",type = MySqlTypeConstant.INT)
	private int age;
	
	@Column(name = "email",type = MySqlTypeConstant.VARCHAR,length = 40)
	private String email;
	
	@Column(name = "phone_num",type = MySqlTypeConstant.VARCHAR,length = 40)
	private String phoneNum;
	
	@Column(name = "role_id",type = MySqlTypeConstant.VARCHAR,length = 30)
	private String roleId;

	@Column(name = "create_time",type = MySqlTypeConstant.VARCHAR,length = 50)
	private String createTime;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
	
}

