package cn.et.lesson02.food.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson02.food.dao.StudentMapper;
import cn.et.lesson02.food.entity.Student;
import cn.et.lesson02.food.entity.StudentExample;
import cn.et.lesson02.food.service.StudentService;
import cn.et.lesson02.food.utils.PageTools;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper sm;
	/* (non-Javadoc)
	 * @see cn.et.lesson02.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	public PageTools queryStudent(String sname,Integer page,Integer rows){
		if(sname==null){     
			sname="";
		}
		StudentExample se=new StudentExample();
		se.createCriteria().andSnameLike("%"+sname+"%");
		//����sql����ѯ�ܼ�¼��=
		int total=queryStudentCount(se);               
		// limit ��ʼλ��,�ܼ�¼��             
		PageTools pts=new PageTools(page, total, rows);
		RowBounds rb=new RowBounds(pts.getStartIndex()-1, rows);
		List<Student> studentList=sm.selectByExampleWithRowbounds(se, rb);
		pts.setRows(studentList);
		return pts;
	}
	public void deleteStudent(Integer sid){
		sm.deleteByPrimaryKey(sid);
	}
	public void updateStudent(Student stud){
		sm.updateByPrimaryKey(stud);
	}
	public int queryStudentCount(StudentExample se){
		int total=(int)sm.countByExample(se);
		return total;
	}
	
}
