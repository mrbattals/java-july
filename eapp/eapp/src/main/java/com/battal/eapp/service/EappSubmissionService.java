package com.battal.eapp.service;

import com.battal.eapp.entity.Agent;
import com.battal.eapp.entity.EappSubmission;
import com.battal.eapp.entity.FetchedProspect;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EappSubmissionService {
    @Autowired
    AgentService agentService;
    @Autowired
    ApplicationService applicationService;

    public EappSubmission getEappSubmissionService(){
        EappSubmission eappSubmission = new EappSubmission();
        eappSubmission.setAgent(agentService.getAgent());
        eappSubmission.setApplication(applicationService.getApplication());
        return eappSubmission;

    }
}
