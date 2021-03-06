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
package com.aliyuncs.yundun.transform.v20150227;

import com.aliyuncs.yundun.model.v20150227.TodayAegisOnlineRateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TodayAegisOnlineRateResponseUnmarshaller {

	public static TodayAegisOnlineRateResponse unmarshall(TodayAegisOnlineRateResponse todayAegisOnlineRateResponse, UnmarshallerContext context) {
		
		todayAegisOnlineRateResponse.setRequestId(context.stringValue("TodayAegisOnlineRateResponse.RequestId"));
		todayAegisOnlineRateResponse.setRate(context.longValue("TodayAegisOnlineRateResponse.Rate"));
	 
	 	return todayAegisOnlineRateResponse;
	}
}