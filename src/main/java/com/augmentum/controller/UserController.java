package com.augmentum.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.augmentum.model.UserModel;
import com.augmentum.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView view = new ModelAndView();

        view.setViewName("list");
 
        return view;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView view = new ModelAndView();

        view.setViewName("add");
 
        return view;
    }
	
	@RequestMapping(value="/save")
	@ResponseBody
	public void saveUser(UserModel user) {
		userService.insertUser(user);
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	public void updateUser(UserModel user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value="/find")
	@ResponseBody
	public Map<String, Object>  findUser(String userName) {
        Map<String, Object> map = new HashMap<String, Object>();

        List<UserModel> user = userService.findForRequery(userName);
		
		map.put("data",user);
		return map;
	}
	
	@RequestMapping(value="/find/all")
	@ResponseBody
	public Map<String, Object> findAllUser() {
        Map<String, Object> map = new HashMap<String, Object>();
		List<UserModel> users = userService.findAll();
		map.put("total",users.size());
		map.put("data",users);
		return map;
	}

	@RequestMapping(value="/delete")
	@ResponseBody
	public void deleteById(String id) {
		userService.removeUser(id);
	}
	
}
