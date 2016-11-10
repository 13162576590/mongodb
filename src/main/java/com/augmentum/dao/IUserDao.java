package com.augmentum.dao;

import java.util.List;

import com.augmentum.model.User;
import com.augmentum.model.UserModel;

public interface IUserDao {

//	boolean saveUser(User user);
//	
//	boolean updateUser(User user);
//	
//	User findById(String id);
//	
//	List<User> findAll();
//	
//	boolean removeUser(String id);
	
	 /** 
     * ��ѯ���� 
     *  
     * @author��tuzongxun 
     * @Title: findAll 
     * @param @return 
     * @return List<UserModel> 
     * @date May 13, 2016 3:07:39 PM 
     * @throws 
     */  
    public List<UserModel> findAll();  
  
    /** 
     * �������� 
     *  
     * @author��tuzongxun 
     * @Title: insertUser 
     * @param @param user 
     * @return void 
     * @date May 13, 2016 3:09:45 PM 
     * @throws 
     */  
    public void insertUser(UserModel user);  
  
    /** 
     * ɾ������ 
     *  
     * @author��tuzongxun 
     * @Title: removeUser 
     * @param @param userName 
     * @return void 
     * @date May 13, 2016 3:09:55 PM 
     * @throws 
     */  
    public void removeUser(String userName);  
  
    /** 
     * �޸����� 
     *  
     * @author��tuzongxun 
     * @Title: updateUser 
     * @param @param user 
     * @return void 
     * @date May 13, 2016 3:10:06 PM 
     * @throws 
     */  
    public void updateUser(UserModel user);  
  
    /** 
     * ��������ѯ 
     *  
     * @author��tuzongxun 
     * @Title: findForRequery 
     * @param 
     * @return void 
     * @date May 13, 2016 3:23:37 PM 
     * @throws 
     */  
    public List<UserModel> findForRequery(String userName);  
	
}
