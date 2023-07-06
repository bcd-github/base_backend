package com.ruoyi.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.ruoyi.system.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author bianchengdong
* @description 针对表【test】的数据库操作Mapper
* @createDate 2023-06-26 16:35:14
* @Entity generator.domain.Test
*/
@Mapper
public interface TestMapper extends BaseMapper<Test> {

    List<Test> selectListByParams(Test test);
}




