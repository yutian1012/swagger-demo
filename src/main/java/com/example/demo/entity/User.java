package com.example.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@ApiModel(value="用户实体类")
public class User {
	@ApiModelProperty(value="用户名",required=true)
	private String username;
	@ApiModelProperty(value="年龄",dataType="integer")
	private int age;
	@ApiModelProperty(value="性别")
	private SexEnum sex;
	@JsonFormat(pattern="yyyy-MM-dd")
	@ApiModelProperty(value="出生日期")
	private Date birthDay;
}
