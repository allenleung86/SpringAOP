package com.zhangguo.Spring052.aop05;

import org.springframework.stereotype.Service;

@Service("getUser")
public class User {
	public void show(){
		System.out.println("一个用户对象");
	}
}
