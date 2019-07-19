package com.bjs.session.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author BianJiashuai
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    int port;

    @GetMapping("set")
    public String set(HttpSession session) {
        session.setAttribute("user", "javaBoy");
        return String.valueOf(port);
    }

    @GetMapping("get")
    public String get(HttpSession session) {
        return session.getAttribute("user") + ":" + port;
    }
}
