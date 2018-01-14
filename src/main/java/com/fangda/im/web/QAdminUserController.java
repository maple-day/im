package com.fangda.im.web;

import com.fangda.im.entity.QAdminUser;
import com.fangda.im.service.IQAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author davis
 * @since 2017-12-14
 */
@Controller
@RequestMapping("/im/qAdminUser")
public class QAdminUserController {

    @Autowired
    private IQAdminUserService adminUserService;

    @ResponseBody
    @RequestMapping("/{id}")
    public QAdminUser findById(@PathVariable String id){
        return adminUserService.selectById(id);
    }
}
