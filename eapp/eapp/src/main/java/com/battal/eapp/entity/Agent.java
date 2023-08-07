package com.battal.eapp.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data

public class Agent {

        private String userName;
        private String profileName;
        private String branchCode;
        private String agencyCode;
        private String agentType;
        private String joinDate;
        private String managerAgentCode;
        private String licenseNo;
        private String licenseNoRenewalDate;
        private boolean isDashboardRefresh;
        private String systemKey;
        private String managerName;
        private String status;
        private String sMUniqueId;
        private String costum1;
        private String costum2;
        private String costum3;
        private String costum4;
        private String language;
        private String mobileNo;
        private String email;
        private String firstName;
        private String lastName;
        private String fullName;
        private boolean isPowerLessThan10;
        private boolean isPowerLessThan5;
        private boolean connectWiFi;
        private boolean safeWiFi;
        private String timeExceed;
        private boolean isLoggedIn = true;
        private String agentCode;



    }


