/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceNetInfoForChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeDBInstanceNetInfoForChannelResponse extends AcsResponse {

    private String requestId;

    private String instanceNetworkType;

    private List<DBInstanceNetInfo> dBInstanceNetInfos;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public void setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
    }

    public List<DBInstanceNetInfo> getDBInstanceNetInfos() {
        return this.dBInstanceNetInfos;
    }

    public void setDBInstanceNetInfos(List<DBInstanceNetInfo> dBInstanceNetInfos) {
        this.dBInstanceNetInfos = dBInstanceNetInfos;
    }

    public static class DBInstanceNetInfo {

        private String connectionString;

        private String iPAddress;

        private String iPType;

        private String port;

        private String vPCId;

        private String vSwitchId;

        private List<SecurityIPGroup> securityIPGroups;

        public String getConnectionString() {
            return this.connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }

        public String getIPAddress() {
            return this.iPAddress;
        }

        public void setIPAddress(String iPAddress) {
            this.iPAddress = iPAddress;
        }

        public String getIPType() {
            return this.iPType;
        }

        public void setIPType(String iPType) {
            this.iPType = iPType;
        }

        public String getPort() {
            return this.port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getVPCId() {
            return this.vPCId;
        }

        public void setVPCId(String vPCId) {
            this.vPCId = vPCId;
        }

        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public void setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
        }

        public List<SecurityIPGroup> getSecurityIPGroups() {
            return this.securityIPGroups;
        }

        public void setSecurityIPGroups(List<SecurityIPGroup> securityIPGroups) {
            this.securityIPGroups = securityIPGroups;
        }

        public static class SecurityIPGroup {

            private String securityIPGroupName;

            private String securityIPs;

            public String getSecurityIPGroupName() {
                return this.securityIPGroupName;
            }

            public void setSecurityIPGroupName(String securityIPGroupName) {
                this.securityIPGroupName = securityIPGroupName;
            }

            public String getSecurityIPs() {
                return this.securityIPs;
            }

            public void setSecurityIPs(String securityIPs) {
                this.securityIPs = securityIPs;
            }
        }
    }

    @Override
    public DescribeDBInstanceNetInfoForChannelResponse getInstance(UnmarshallerContext context) {
        return DescribeDBInstanceNetInfoForChannelResponseUnmarshaller.unmarshall(this, context);
    }
}
