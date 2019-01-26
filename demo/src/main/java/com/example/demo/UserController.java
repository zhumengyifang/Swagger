package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ApiOperation(value = "查询所有")
    @RequestMapping(value = "/List", method = RequestMethod.GET)
    public List<User> List() {
        return  new ArrayList<User>();
    }

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/Create", method = RequestMethod.POST)
    public String Create(@ModelAttribute User user) {
        return "Success";
    }

    @ApiOperation(value ="查询单个用户")
    @RequestMapping(value = "/Info/{id}", method = RequestMethod.PUT)
    public String Info(@PathVariable Long id, @ModelAttribute User user) {
        String msg;
        msg = "";
        return "Success";
    }

    @ApiOperation(value = "删除单个用户")
    @RequestMapping(value = "/Remove/{id}", method = RequestMethod.DELETE)
    public String Remove(@PathVariable Long id) {
        return "success";
    }

}
