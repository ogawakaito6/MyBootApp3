package jp.te4a.spring.boot.mybootapp3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
    @RequestMapping("/taro")
    public String index() {
        return "Taro desu!";
    }
}