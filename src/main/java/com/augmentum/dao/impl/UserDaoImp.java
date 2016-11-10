package com.augmentum.dao.impl;

import java.util.List;  

import org.springframework.data.mongodb.core.query.Criteria;  
import org.springframework.data.mongodb.core.query.Query;  
import org.springframework.data.mongodb.core.query.Update;  
import org.springframework.stereotype.Component;  
import org.springframework.stereotype.Repository;

import com.augmentum.dao.IUserDao;
import com.augmentum.model.UserModel;
import com.mongodb.BasicDBObject;  
import com.mongodb.DBObject;  

@Repository
public class UserDaoImp extends AbstractBaseMongoTemplete implements IUserDao {
    /** 
     * ��ѯ�������� 
     *  
     * @author��tuzongxun 
     * @Title: findAll 
     * @Description: TODO 
     * @param @return 
     * @date May 13, 2016 3:10:29 PM 
     * @throws 
     */  
    @Override  
    public List<UserModel> findAll() {  
        // ��Ҫ���ü��϶�Ӧ��ʬ�������Ӧ�ļ��������Ӷ���ѯ���ֱ��ӳ��  
        List<UserModel> userList = mongoTemplate.findAll(UserModel.class);  
        return userList;  
    }  
  
    /** 
     * �������� 
     *  
     * @author��tuzongxun 
     * @Title: insertUser 
     * @Description: TODO 
     * @param @param user 
     * @date May 13, 2016 3:10:45 PM 
     * @throws 
     */  
    @Override  
    public void insertUser(UserModel user) {  
        // ������Ҫ���뵽���ݿ���ĵ�����  
//        DBObject object = new BasicDBObject();  
//        object.put("userName", user.getUserName());  
//        object.put("password", user.getPassword());  
//        mongoTemplate.insert(object, "user");  
        mongoTemplate.save(user);
    }  
  
    /** 
     * ������ɾ������ 
     *  
     * @author��tuzongxun 
     * @Title: removeUser 
     * @Description: TODO 
     * @param @param userName 
     * @date May 13, 2016 3:11:01 PM 
     * @throws 
     */  
    @Override  
    public void removeUser(String userName) {  
        // ����ɾ�������������������Ϊ����ɾ������  
        Query query = new Query();  
        Criteria criteria = new Criteria("userName");  
        criteria.is(userName);  
        query.addCriteria(criteria);  
        mongoTemplate.remove(query, "user");  
    }  
  
    /** 
     * �޸����� 
     *  
     * @author��tuzongxun 
     * @Title: updateUser 
     * @Description: TODO 
     * @param @param user 
     * @date May 13, 2016 3:11:12 PM 
     * @throws 
     */  
    @Override  
    public void updateUser(UserModel user) {  
        // �����޸�����  
        Query query = new Query();  
        Criteria criteria = new Criteria("userName");  
        criteria.is(user.getUserName());  
        query.addCriteria(criteria);  
        // �����޸�����  
        Update update = Update.update("password", user.getPassword());  
        // ��������ѯ���������Ľ����������  
        mongoTemplate.updateFirst(query, update, "user");  
    }  
  
    /** 
     * ����������ѯ 
     *  
     * @author��tuzongxun 
     * @Title: findForRequery 
     * @Description: TODO 
     * @param @param userName 
     * @date May 13, 2016 4:08:15 PM 
     * @throws 
     */  
    @Override  
    public List<UserModel> findForRequery(String userName) {  
        Query query = new Query();  
        Criteria criteria = new Criteria("userName");  
        criteria.is(userName);  
        query.addCriteria(criteria);  
        // ��ѯ���������϶�Ӧ��ʵ���࣬������  
        List<UserModel> userList = mongoTemplate.find(query, UserModel.class,  
                "user");  
        return userList;  
    }  
}
