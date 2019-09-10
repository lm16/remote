package com.lm16.controller;

import com.lm16.bean.ClaimVoucher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("claimVoucher")
public class ClaimVoucherController {

    @GetMapping("create")
    public String create(ClaimVoucher item, HttpSession session){

        return "haha";

    }

}
