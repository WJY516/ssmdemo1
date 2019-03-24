package com.ssmdemo.controller;

import com.ssmdemo.pojo.TestTable;
import com.ssmdemo.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestTableController {

    @Autowired
    TestTableService testTableService;

    @RequestMapping("/testTable/{testTableId}")
    @ResponseBody
    public TestTable getTestTableById(@PathVariable Integer testTableId) {
        TestTable testTable = testTableService.getTestTableById(testTableId);
        return testTable;
    }
}
