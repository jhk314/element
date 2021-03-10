package com.sxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/game")
public class GameCtrl {

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public String word() {
        return "word_game";
    }

    @RequestMapping(value = "/run", method = RequestMethod.GET)
    public String run() {
        return "run_game";
    }
}
