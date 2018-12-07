package com.naka.nakaweb.controller.sysmanage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason.Rom
 * @date 2018/11/19
 */
@Api(tags = "测试用例-系统模块",description = "机构管理",value="")
@RestController
@RequestMapping(value="/org")
public class OrgController {
    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="获取机构列表", notes="")
    @RequestMapping(value={"getOrgList"}, method= RequestMethod.GET)
    public List<User> getOrgList() {
        return new ArrayList<>();
    }
}
