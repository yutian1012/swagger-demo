package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("接口测试")
@RestController
public class HelloController {
	private Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/hello",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="访问接口",notes="传递消息访问接口")
	@ApiImplicitParam(name="message",value="消息信息",dataType="String")
	public String hello(String message) {
		
		logger.info("接收客户端传递的数据..."+message);
		
		return "helloworld!!!";
	}
}
