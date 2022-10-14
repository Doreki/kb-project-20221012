package com.kb1.containerMarket.web.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @GetMapping("/member/login")
    public String login(Model model, @RequestParam @Nullable String username) {
        model.addAttribute("username", username == null ? "" : username);
        return "member/login";
    }

    @GetMapping("/member/join")
    public String join(Model model, @RequestParam @Nullable String username) {
        model.addAttribute("username", username == null ? "" : username);
        return "member/join";
    }
}
