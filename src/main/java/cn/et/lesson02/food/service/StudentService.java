package cn.et.lesson02.food.service;

import cn.et.lesson02.food.entity.Student;
import cn.et.lesson02.food.utils.PageTools;

public interface StudentService {

	public abstract PageTools queryStudent(String sname,Integer page,Integer rows);
	public void deleteStudent(Integer sid);
	public void updateStudent(Student stud);
}