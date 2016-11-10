//package com.augmentum.dao.impl;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
////import org.apache.ibatis.session.SqlSession;
////import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.stereotype.Repository;
//
//import com.augmentum.dao.IUserDao;
//import com.augmentum.model.User;
//
//@Repository
//public class UserDao implements IUserDao {
//
////	@Resource
////	private SqlSessionFactory sqlSessionFactory;
//	
//	@Override
//	public boolean saveUser(User user) {
////		SqlSession sqlSession = sqlSessionFactory.openSession();
////		sqlSession.insert("com.augmentum.model.User.save",user);
////		sqlSession.close();
//		return false;
//	}
//
//	@Override
//	public boolean updateUser(User user) {
////		SqlSession sqlSession = sqlSessionFactory.openSession();
////		sqlSession.update("com.augmentum.model.User.update",user);
////		sqlSession.close();
//		return false;
//	}
//
//	@Override
//	public User findById(String id) {
////		SqlSession sqlSession = sqlSessionFactory.openSession();
////		User user = sqlSession.selectOne("com.augmentum.model.User.findById",id);
////		sqlSession.close();
////		System.out.println("one:====" + user);
//		return null;
//	}
//
//	@Override
//	public List<User> findAll() {
////		SqlSession sqlSession = sqlSessionFactory.openSession();
////		List<User> users = sqlSession.selectList("com.augmentum.model.User.findAll");
////		sqlSession.close();
////		System.out.println(users);
//		return null;
//	}
//
//	@Override
//	public boolean removeUser(String id) {
////		SqlSession sqlSession = sqlSessionFactory.openSession();
////		sqlSession.delete("com.augmentum.model.User.delete", id);
////		sqlSession.close();
//		return false;
//	}
//
//}
