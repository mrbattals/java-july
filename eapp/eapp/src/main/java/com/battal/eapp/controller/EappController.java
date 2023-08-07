package com.battal.eapp.controller;


import com.battal.eapp.entity.EappSubmission;
import com.battal.eapp.service.EappSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EappController {
    @Autowired
    EappSubmissionService eappSubmissionService;
   @GetMapping("/")
   public EappSubmission eapp(){

       return eappSubmissionService.getEappSubmissionService();
   }
 /*   @GetMapping("/agent")
    public Agent agent(){
        return agentService.getAgent();
    }
    @GetMapping("/application")
    public Application application(){
        return applicationService.getApplication();
    }*/


}
