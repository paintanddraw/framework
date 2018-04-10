package com.lh.mapper;

import com.lh.entity.Department;
import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Apr 06 13:02:57 CST 2018
     */
    int deleteByPrimaryKey(Long dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Apr 06 13:02:57 CST 2018
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Apr 06 13:02:57 CST 2018
     */
    Department selectByPrimaryKey(Long dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Apr 06 13:02:57 CST 2018
     */
    List<Department> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Apr 06 13:02:57 CST 2018
     */
    int updateByPrimaryKey(Department record);
}