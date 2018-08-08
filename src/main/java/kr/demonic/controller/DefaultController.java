package kr.demonic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DefaultController {
    @GetMapping("/test/dev")
    public Map testDev(){
        Map result = new HashMap();
        result.put("code", "0000");
        result.put("message", "OK");
        return result;
    }
}
