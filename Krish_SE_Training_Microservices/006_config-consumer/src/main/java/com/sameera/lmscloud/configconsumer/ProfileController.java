package com.sameera.lmscloud.configconsumer;

import com.sameera.lmscloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model){

        model.addAttribute("model",memberProfileConfiguration.getSubjectModel());
        model.addAttribute("min",memberProfileConfiguration.getMinNoOfSubjectsRole());
        return "mProfile";
        //return memberProfileConfiguration;
    }
}
