package com.ruoyi.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ruoyi.system.domain.Test;
import com.ruoyi.system.mapper.TestMapper;
import com.ruoyi.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author bianchengdong
* &#064;description  针对表【test】的数据库操作Service实现
* &#064;createDate  2023-06-26 16:35:14
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> selectListByParams(Test test) {
      return  testMapper.selectListByParams(test);
    }


}




