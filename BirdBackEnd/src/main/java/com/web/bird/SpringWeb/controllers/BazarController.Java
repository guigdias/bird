package com.web.bird.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BazarController
{
    @GetMapping("/bazar")
    public String index()
    {
        return "home/bazar";
    }
}
