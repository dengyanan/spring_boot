package lesson.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import lesson.entity.Stude;


public interface StudeMapper {
	@Select("select * from stude")
	List<Stude> queryStude();

	@Select("select * from stude where sid=#{0}")
	Stude queryById(int sid);
	
	
}
