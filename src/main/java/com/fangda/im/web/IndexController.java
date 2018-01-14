package com.fangda.im.web;

import com.fangda.im.entity.QAdminUser;
import com.fangda.im.service.IQAdminUserService;
import com.fangda.im.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author davis
 * @since 2017-12-14
 */
@Controller
@RequestMapping("/im/admin")
public class IndexController {

    @Autowired
    private IQAdminUserService adminUserService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 管理者登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/mylogin")
    public String myLogin(String username, String password, Map<String,String> map){
        QAdminUser user = adminUserService.selectByUsername(username);
        if(user!=null){
            String userPassword = user.getPassword();
            if(userPassword.equals(MD5Utils.md5(password))){
                return "/admin/index";
            }
        }
        map.put("msg","密码不对");
        return "/im/admin/login";
    }


}
