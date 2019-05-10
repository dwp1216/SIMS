package com.wq.mapper;

import com.wq.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("studentMapper")
public interface StudentMapper {

    int deleteByPrimaryKey(String pkid);

    /**
     * 添加学生
     *
     * @param student
     * @return
     */
    int insert(Student student);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String pkid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 查询学生列表
     *
     * @param map
     * @return
     */
    List<Student> findStudent(Map<String, Object> map);

    /**
     * @param map
     * @return
     */
    Long getTotalStudent(Map<String, Object> map);

    List<Map<String,Object>> getDepartmentList();

    List<Map<String,Object>> getMajorList(String departmentKey);

    List<Map<String,Object>> getClassList(String majorKey);
}