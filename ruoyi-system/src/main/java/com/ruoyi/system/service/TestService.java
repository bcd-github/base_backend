package com.ruoyi.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.Test;

import java.util.List;


/**
* @author bianchengdong
* @description 针对表【test】的数据库操作Service
* @createDate 2023-06-26 16:35:14
*/
public interface TestService extends IService<Test> {


    List<Test> selectListByParams(Test test);
}
