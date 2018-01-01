package cn.et;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.dao.StudeRepository;



@RestController
@SpringBootApplication

public class StudeController {
	
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	StudeRepository er;
	
	
	
	@RequestMapping("/hello")
	public Map hello(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "ls");
		return map;
	}
	
	@RequestMapping("/stude/{studeSid}")
	public Map getStude(@PathVariable String studeSid){
		List<Map<String,Object>> queryForList = jdbc.queryForList("select * from stude where sid="+studeSid);
		return queryForList.get(0);
	}
	
	@RequestMapping("/saveStude")
	public String saveStude(){
		Stude stude = new Stude();
		stude.setSname("ww");
		stude.setSage(18);
		stude.setSsex("男");
		er.save(stude);
		return "1";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(StudeController.class,args);

	}

}

