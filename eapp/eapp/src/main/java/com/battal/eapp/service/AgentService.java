package com.battal.eapp.service;

import com.battal.eapp.entity.Agent;
import lombok.Data;
import org.springframework.stereotype.Service;


@Service
public class AgentService {
    Agent agent = new Agent();
       public Agent getAgent(){
           agent.setUserName("06000001");
           agent.setProfileName("SUMAN SITAULA");
           agent.setBranchCode("");
           agent.setAgentCode("");
           agent.setAgentType("FR");
           agent.setJoinDate("");
           agent.setManagerAgentCode("");
           agent.setLicenseNo("16\\/11111");
           agent.setLicenseNoRenewalDate("");
           agent.isDashboardRefresh();
           agent.setSystemKey("MetLife1");
           agent.setManagerName("AM: Agency Manager UM: Unit Manager");
           agent.setStatus("");
           agent.setSMUniqueId("MDYwMDAwMDAxOk1ldGxpZmUxMjM=");
           agent.setCostum1("");
           agent.setCostum2("");
           agent.setCostum3("");
           agent.setCostum4("");
           agent.setLanguage("English");
           agent.setMobileNo("");
           agent.setEmail("");
           agent.setFirstName("");
           agent.setLastName("");
           agent.setFullName("");
           agent.isPowerLessThan5();
           agent.isPowerLessThan10();
           agent.isSafeWiFi();
           agent.setTimeExceed("");
           agent.isLoggedIn();
           agent.setAgentCode("0000000001");
            return agent;
       }

}





