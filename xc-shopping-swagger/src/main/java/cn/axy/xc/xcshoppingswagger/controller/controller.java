package cn.axy.xc.xcshoppingswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/test", tags="测试接口模块")
@RestController
public class controller {

    @ApiOperation(value="展示首页信息", notes = "展示首页信息")
    @GetMapping("/show")
    public Object showInfo(){
        return "hello world";
    }

    /*@ApiOperation(value="添加用户信息", notes = "添加用户信息")
    @ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user){
        return "success";
    }
*/

}
