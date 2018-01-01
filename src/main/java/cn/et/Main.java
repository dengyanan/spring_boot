package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cn.et.StudeController;

//必须添加SpringBootApplication 启用spring的自动配置功能
@SpringBootApplication
@ComponentScan("cn.et.lesson")
public class Main {
	
	/*
	 * just run springboot启动的方法
	 */
	public static  void main(String[] args){
		
		SpringApplication.run(StudeController.class,args);
	}

}
