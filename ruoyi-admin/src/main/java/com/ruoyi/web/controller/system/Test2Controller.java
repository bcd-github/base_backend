package com.ruoyi.web.controller.system;


import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test2Controller {
    @Autowired
    private TestServiceImpl testService;
    @GetMapping("/test")
    public AjaxResult getList(){
        return AjaxResult.success(testService.getById(1)) ;
    }
}
