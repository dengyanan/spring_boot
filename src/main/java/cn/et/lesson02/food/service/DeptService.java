package cn.et.lesson02.food.service;

import java.util.List;

import cn.et.lesson02.food.entity.Emp;
import cn.et.lesson02.food.entity.TreeNode;

public interface DeptService {

	/* (non-Javadoc)
	 * @see cn.et.lesson02.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	public abstract List<TreeNode> queryTreeNode(Integer pid);
	public List<Emp> queryEmp(Integer id);

}