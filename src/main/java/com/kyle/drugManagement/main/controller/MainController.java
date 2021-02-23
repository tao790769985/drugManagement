//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyle.drugManagement.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    public MainController() {
    }

    @GetMapping({"/index"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping({"/views/about"})
    public String about(Model model) {
        return "views/about";
    }

    @GetMapping({"/views/services"})
    public String services(Model model) {
        return "views/services";
    }

    @GetMapping({"/views/class"})
    public String classView(Model model) {
        return "views/class";
    }

    @GetMapping({"/views/events"})
    public String events(Model model) {
        return "views/events";
    }

    @GetMapping({"/views/blogs"})
    public String blogs(Model model) {
        return "views/blogs";
    }

    @GetMapping({"/views/gallery"})
    public String gallery(Model model) {
        return "views/gallery";
    }

    @GetMapping({"/views/our-teacher"})
    public String ourTeacher(Model model) {
        return "views/our-teacher";
    }

    @GetMapping({"/views/testimonial"})
    public String testimonial(Model model) {
        return "views/testimonial";
    }

    @GetMapping({"/views/errorView"})
    public String errorView(Model model) {
        return "views/error";
    }

    @GetMapping({"/views/contact"})
    public String contact(Model model) {
        return "views/contact";
    }
}
