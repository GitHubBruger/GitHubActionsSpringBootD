package kea.iabr.githubactionsspringbootd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("")
    public String index() {
        // Added a comment to test the GitHub Actions
        return "welcome";
    }
}
