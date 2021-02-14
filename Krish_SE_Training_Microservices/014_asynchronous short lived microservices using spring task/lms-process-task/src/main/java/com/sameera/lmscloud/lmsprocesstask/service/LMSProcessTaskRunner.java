package com.sameera.lmscloud.lmsprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class LMSProcessTaskRunner implements CommandLineRunner {

    @Autowired
    LMSProcessService lmsProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length>0){
            System.out.println("task running with arguments");

            if (lmsProcessService.validateReg(args[0])){
                System.out.println("valid registration");
            }else {
                System.out.println("invalid registration");
            }
        }else {
            System.out.println("task running without argument");
        }

    }
}
