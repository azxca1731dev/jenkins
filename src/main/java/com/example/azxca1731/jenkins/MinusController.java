package com.example.azxca1731.jenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController("/")
@AllArgsConstructor
public class MinusController {
    private MinusService minusService;

    @GetMapping
    public String minus(@RequestParam int a, @RequestParam int b) {
        return minusService.minus(a, b)+"";
    }
}
