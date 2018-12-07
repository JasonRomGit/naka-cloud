package com.naka.nakaweb.controller.settle;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason.Rom
 * @date 2018/11/19
 */
@Api(tags = "测试用例-结算模块",description = "返佣结算管理")
@RestController
@RequestMapping(value="/settle")
public class SettleController {

    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="获取返佣数据列表", notes="")
    @RequestMapping(value={"getSettleList"}, method= RequestMethod.GET)
    public List<User> getSettleList(@RequestParam("id") int id) {
        return new ArrayList<>();
    }

}
