package com.example.simple;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestTestController {
    @RequestMapping("/restTest")
    public String restTest(@RequestParam String str) {
        return str + " : Rest Test 완료!!!";
    }

    @RequestMapping("/sourcegit")
    @ResponseBody() // JSON
    public Map<String, String> yamlLocation() {
        Map<String, String> data = new HashMap<>();
        data.put("author", "jong");
        data.put("version", "v1");
        data.put("url", "172.19.228.157:8881/files/source_git.yml"); // TODO: file url shall be defined by deployed url

        return data;
    }
}
