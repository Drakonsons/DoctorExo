package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String getDoctor() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getDoctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getDoctor13() {
        return "Jodie Whittaker";
    }
    
}
