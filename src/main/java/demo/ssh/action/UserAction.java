package demo.ssh.action;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import demo.ssh.dao.UserDao;
import demo.ssh.entity.User;
import demo.ssh.service.UserService;
//所有的action都已经托管给Spring，所以才能在里面自动装配
public class UserAction extends BaseAction{
	
	@Autowired UserService userService;
	
	private User user;
	
	/**
	 * 注册用户
	 * 参数：user.username  ,  user.password
	 */
	public String save(String str) throws Exception {
		//接收参数
		userService.register(user);
		
		return null;
	}

	
	/*---------------------------------*/
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
