package com.ruoyi.web.controller.system;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Test;
import com.ruoyi.system.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("test")
public class Test2Controller extends BaseController {

    @Autowired
    private TestServiceImpl testService;

    @GetMapping("/list")
    public TableDataInfo getList() {
        startPage();
        return getDataTable(testService.list());
    }

    @PostMapping("/add")
    public AjaxResult add(@RequestBody Test test) {
        if (test.getName() != null && test.getAge() != null && test.getWeight() != null && test.getHeight() != null) {
            return AjaxResult.success(testService.save(test));
        }
        return AjaxResult.error("未填写信息，添加失败");
    }

    @PostMapping("/delete")
    public AjaxResult delete(@RequestBody List<Integer> ids) {
        return AjaxResult.success(testService.removeByIds(ids));
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody Test test) {
        return AjaxResult.success(testService.updateById(test));
    }


}
