package com.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Api("swagger2 api test controller")
public class SwaggerController {

    @ApiOperation(value = "获取测试数据", notes = "测试结果查询")
    @RequestMapping("/swagger")
    public String getSwagger() {
        return "this is an swagger api";
    }
}
