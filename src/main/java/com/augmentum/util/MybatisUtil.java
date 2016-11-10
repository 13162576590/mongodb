//package com.augmentum.util;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.sql.Connection;
//
//import javax.annotation.Resource;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import com.augmentum.dao.IUserDao;
//import com.augmentum.dao.impl.UserDao;
//import com.augmentum.model.User;
//
///**
// * ������
// * @author AdminTC
// */
//public class MybatisUtil {
//	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
//	private static SqlSessionFactory sqlSessionFactory;
//	/**
//	 * ����λ��src/mybatis.xml�����ļ�
//	 */
//	static{
//		try {
//			Reader reader = Resources.getResourceAsReader("mybatis.xml");
//			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//		} catch (IOException e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//	}
//	/**
//	 * ��ֹ���ͨ��new�������� 
//	 */
//	private MybatisUtil(){}
//	/**
//	 * ��ȡSqlSession
//	 */
//	public static SqlSession getSqlSession(){
//		//�ӵ�ǰ�߳��л�ȡSqlSession����
//		SqlSession sqlSession = threadLocal.get();
//		//���SqlSession����Ϊ��
//		if(sqlSession == null){
//			//��SqlSessionFactory�ǿյ�����£���ȡSqlSession����
//			System.out.println("sqlSessionFactory:" + sqlSessionFactory);
//			sqlSession = sqlSessionFactory.openSession();
//			System.out.println("sqlSession:" + sqlSession);
//			//��SqlSession�����뵱ǰ�̰߳���һ��
//			threadLocal.set(sqlSession);
//		}
//		//����SqlSession����
//		return sqlSession;
//	}
//	/**
//	 * �ر�SqlSession�뵱ǰ�̷ֿ߳�
//	 */
//	public static void closeSqlSession(){
//		//�ӵ�ǰ�߳��л�ȡSqlSession����
//		SqlSession sqlSession = threadLocal.get();
//		//���SqlSession����ǿ�
//		if(sqlSession != null){
//			//�ر�SqlSession����
//			sqlSession.close();
//			//�ֿ���ǰ�߳���SqlSession����Ĺ�ϵ��Ŀ������GC�������
//			threadLocal.remove();
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	/**
//	 * ����
//	 */
//	public static void main(String[] args) {
//		Connection conn = MybatisUtil.getSqlSession().getConnection();
//		System.out.println(conn!=null?"���ӳɹ�":"����ʧ��");
//	    IUserDao userDao = new UserDao();
////	    User user = new User();
////	    user.setName("1");
////	    user.setAddress("1");
////		userDao.saveUser(user);
//	    User user = userDao.findById("2");
//	    System.out.println(user);
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
