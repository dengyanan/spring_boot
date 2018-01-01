package lesson.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lesson.mapper.StudeMapper;



@RestController

public class StudeController {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	StudeMapper mapper;
	
	@RequestMapping("/sysoSource")
	public String hello(){
		return dataSource.toString();
	}
	
	@RequestMapping("/queryAll")
	public List<lesson.entity.Stude> queryAll(){
		return mapper.queryStude();
	}

	@RequestMapping("/stude{sid}")
	public lesson.entity.Stude queryById(@PathVariable Integer sid){
		return mapper.queryById(sid);
	}

	


}

