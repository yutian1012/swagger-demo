package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ExceptionMsg;
import com.example.demo.entity.Response;
import com.example.demo.entity.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {

	private Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/add",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="提交用户信息",notes="用户注册时提交注册信息")
	//@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
	public Response add(@RequestBody User user) {
		
		logger.info("接收客户端传递的用户数据...");
		//保存数据到数据库中
		logger.info(user.toString());
		
		return new Response(ExceptionMsg.SUCCESS);
	}
}
