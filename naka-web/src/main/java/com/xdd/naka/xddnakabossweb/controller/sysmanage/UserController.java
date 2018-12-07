package com.xdd.naka.xddnakabossweb.controller.sysmanage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason.Rom
 * @date 2018/11/19
 */
@Api(tags = "测试用例-系统模块",description = "用户管理",value=""  )
@RestController
@RequestMapping(value="/users")
public class UserController {

    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="获取用户列表", notes="")
        @RequestMapping(value={"getUserList"}, method= RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<>();
    }

    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="/insertUser", method=RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        return "success";
    }

    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return null;
    }

    /**
     * @author Jason.Rom
     * @date 2018/11/19
     */
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required =true, dataType = "Long")
    @RequestMapping(value="/deleteUser", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) { return "success"; }
}
