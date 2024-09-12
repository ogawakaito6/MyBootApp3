package jp.te4a.spring.boot.mybootapp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "this is a setting message");
        return "index"; // ビュー名
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postForm(@RequestParam("textI") String textI, Model model) {
        model.addAttribute("msg", "you write '" + textI + "'!!!");
        return "index"; // ビュー名
    }
}