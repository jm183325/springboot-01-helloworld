package cn.gov.customs.h2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication //来标注一个主程序，说明这是一个springboot应用
//@ImportResource(locations= {"classpath:bean.xml"})
public class Application {
	public static void main(String[] args) {
		//spring应该启动起来
		SpringApplication.run(Application.class, args);
	}
}
