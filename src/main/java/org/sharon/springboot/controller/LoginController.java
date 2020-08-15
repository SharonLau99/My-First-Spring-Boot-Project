package org.sharon.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author sharon
 * @create 2020-08-12-15:36
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登陆成功，为了防止表单重复提交，使用重定向
            session.setAttribute("loginUser", username);
            return "redirect:/dashboard.html";
        } else {
            //登陆失败 返回错误信息
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
