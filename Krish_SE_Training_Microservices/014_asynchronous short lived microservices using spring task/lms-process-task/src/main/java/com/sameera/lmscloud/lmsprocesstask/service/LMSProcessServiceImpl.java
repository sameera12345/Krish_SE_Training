package com.sameera.lmscloud.lmsprocesstask.service;

import org.springframework.stereotype.Service;

@Service
public class LMSProcessServiceImpl implements LMSProcessService {



    @Override
    public boolean validateReg(String regNumber){
        return regNumber.length() > 5;
    }
}
