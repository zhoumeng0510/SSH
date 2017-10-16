package demo.ssh.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.ssh.dao.UserDao;
import demo.ssh.entity.User;
import demo.ssh.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	//引入各种DAO
	@Autowired UserDao dao ;
	@Autowired SessionFactory fac;

	public void register(User user) throws Exception {
		fac.getCurrentSession().getTransaction().begin(); //第一件事
		//检测IP是否北京
		//用户名是否存在
		//名字是否吉利
		//今天是否黄道吉日
		dao.save(user);
		
		fac.getCurrentSession().getTransaction().commit();//最后的事
	}

}
