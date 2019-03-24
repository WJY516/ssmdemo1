package com.ssmdemo.mapper;

import com.ssmdemo.pojo.TestTable;
import com.ssmdemo.pojo.TestTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestTableMapper {
    int countByExample(TestTableExample example);

    int deleteByExample(TestTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    List<TestTable> selectByExample(TestTableExample example);

    TestTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestTable record, @Param("example") TestTableExample example);

    int updateByExample(@Param("record") TestTable record, @Param("example") TestTableExample example);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);
}