package cn.et.lesson02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//必须添加SpringBootApplication 启用spring的自动配置功能
@SpringBootApplication
@MapperScan("cn.et.lesson02.food.dao")
public class Main {
	
	/*
	 * just run springboot启动的方法
	 */
	public static void main(String[] args){
		
		SpringApplication.run(Main.class,args);
	}

}
