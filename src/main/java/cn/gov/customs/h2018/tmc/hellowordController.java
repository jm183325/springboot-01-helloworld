package cn.gov.customs.h2018.tmc;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gov.customs.h2018.tmc.pojo.Person;

@Controller//处理请求   RestController=Controller+ResponseBody
public class hellowordController {
	//@Autowired
	//private Person person;
	//@ResponseBody//响应给浏览器
	//@RequestMapping("/hellword")//接收来自浏览器hellword请求
	//private Person hellword() {
		
		//return person;
	//}
	@Autowired
	private ApplicationContext ioc;
	@ResponseBody//响应给浏览器
	@RequestMapping("/hellword")//接收来自浏览器hellword请求
	private Boolean hellword() {
		
		System.out.println("123");
		return ioc.containsBean("open");
	}
	
	@RequestMapping("/success")
	public String success(Map<String,Object> map) {
		map.put("hello","你好");
		return "success";
	}
}
