package cn.shiyujun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * d
 *
 * @author syj
 * CreateTime 2019/08/26
 * describe:
 */
@Controller
public class MVCDemoController {

    @RequestMapping(value = "/testMVC",method = RequestMethod.GET )
    public String testMVC(Model model){
        model.addAttribute("name","张三");
        model.addAttribute("age","18");

        return "test";
    }

}
