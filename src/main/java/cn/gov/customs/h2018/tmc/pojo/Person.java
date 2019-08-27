package cn.gov.customs.h2018.tmc.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix="person")
//@PropertySource(value = {"classpath:person.yml"})不可以加载yml文件
@PropertySource(value = {"classpath:person1.properties"})
public class Person {
	//@Value("${person.name}")
	private String name;
	private Integer age;
	private boolean boss;
	private Date birth;
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;
	
	
}
