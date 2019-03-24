package com.ssmdemo.service.impl;

import com.ssmdemo.mapper.TestTableMapper;
import com.ssmdemo.pojo.TestTable;
import com.ssmdemo.pojo.TestTableExample;
import com.ssmdemo.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  TestTableServiceImpl implements TestTableService {
    @Autowired
    TestTableMapper testTableMapper;

    @Override
    public TestTable getTestTableById(Integer id) {

        TestTableExample testTableExample = new TestTableExample();
        TestTableExample.Criteria criteria = testTableExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<TestTable> testTableList = testTableMapper.selectByExample(testTableExample);

        if(testTableList!=null){
            return testTableList.get(0);
        }

        return null;

    }
}
