//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.services;

import com.example.demo.utils.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/services"})
public class ServicesController {
    public ServicesController() {
    }

    @GetMapping({"/physicalExamination"})
    public String contact(Model model) {
        return "views/services/physicalExamination";
    }

    @PostMapping()
    public ResultInfo submit() {
        ResultInfo result = new ResultInfo();
        return result;
    }
}
