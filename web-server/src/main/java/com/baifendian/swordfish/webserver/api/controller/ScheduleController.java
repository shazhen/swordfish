/*
 * Copyright (C) 2017 Baifendian Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baifendian.swordfish.webserver.api.controller;

import com.baifendian.swordfish.dao.enums.*;
import com.baifendian.swordfish.dao.model.Schedule;
import com.baifendian.swordfish.dao.model.User;
import com.baifendian.swordfish.webserver.api.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PUT;

/**
 * 调度设置和管理入口
 */
@RestController
@RequestMapping(" /projects/{projectName}/workflows")
public class ScheduleController {

  @Autowired
  private ScheduleService scheduleService;

  private static Logger logger = LoggerFactory.getLogger(ScheduleController.class.getName());

  /**
   * 创建一个调度
   * @param operator
   * @param projectName
   * @param workflowName
   * @param schedule
   * @param notifyType
   * @param maxTryTimes
   * @param failurePolicy
   * @param depWorkflows
   * @param depPolicyType
   * @param timeout
   * @param response
   * @return
   */
  @PostMapping("/{workflowName}/schedules")
  public Schedule createSchedule(@RequestAttribute(value = "session.user") User operator,
                                 @PathVariable String projectName,
                                 @PathVariable String workflowName,
                                 @RequestParam(value = "schedule") String schedule,
                                 @RequestParam(value = "notifyType") NotifyType notifyType,
                                 @RequestParam(value = "notifyMails",required=false) String notifyMails,
                                 @RequestParam(value = "maxTryTimes") int maxTryTimes,
                                 @RequestParam(value = "failurePolicy") FailurePolicyType failurePolicy,
                                 @RequestParam(value = "depWorkflows") String  depWorkflows,
                                 @RequestParam(value = "depPolicy") DepPolicyType depPolicyType,
                                 @RequestParam(value = "timeout") int timeout,
                                 HttpServletResponse response){
    return scheduleService.createSchedule(operator,projectName,workflowName,schedule,notifyType,notifyMails,maxTryTimes,failurePolicy,depWorkflows,depPolicyType,timeout,response);
  }

  /**
   * 新增或修改一个调度
   * @param operator
   * @param projectName
   * @param workflowName
   * @param schedule
   * @param notifyType
   * @param maxTryTimes
   * @param failurePolicy
   * @param depWorkflows
   * @param depPolicyType
   * @param timeout
   * @param response
   * @return
   */
  @PutMapping("/{workflowName}/schedules")
  public Schedule createAndModifySchedule(@RequestAttribute(value = "session.user") User operator,
                                 @PathVariable String projectName,
                                 @PathVariable String workflowName,
                                 @RequestParam(value = "schedule") String schedule,
                                 @RequestParam(value = "notifyType") NotifyType notifyType,
                                 @RequestParam(value = "notifyMails",required=false) String notifyMails,
                                 @RequestParam(value = "maxTryTimes") int maxTryTimes,
                                 @RequestParam(value = "failurePolicy") FailurePolicyType failurePolicy,
                                 @RequestParam(value = "depWorkflows") String  depWorkflows,
                                 @RequestParam(value = "depPolicy") DepPolicyType depPolicyType,
                                 @RequestParam(value = "timeout") int timeout,
                                 HttpServletResponse response){
    return scheduleService.putSchedule(operator,projectName,workflowName,schedule,notifyType,notifyMails,maxTryTimes,failurePolicy,depWorkflows,depPolicyType,timeout,response);
  }

  /**
   * 修改一个调度
   * @param operator
   * @param projectName
   * @param workflowName
   * @param schedule
   * @param notifyType
   * @param maxTryTimes
   * @param failurePolicy
   * @param depWorkflows
   * @param depPolicyType
   * @param timeout
   * @param response
   * @return
   */
  @PatchMapping("/{workflowName}/schedules")
  public Schedule patchSchedule(@RequestAttribute(value = "session.user") User operator,
                                 @PathVariable String projectName,
                                 @PathVariable String workflowName,
                                 @RequestParam(value = "schedule") String schedule,
                                 @RequestParam(value = "notifyType") NotifyType notifyType,
                                 @RequestParam(value = "notifyMails",required=false) String notifyMails,
                                 @RequestParam(value = "maxTryTimes") int maxTryTimes,
                                 @RequestParam(value = "failurePolicy") FailurePolicyType failurePolicy,
                                 @RequestParam(value = "depWorkflows") String  depWorkflows,
                                 @RequestParam(value = "depPolicy") DepPolicyType depPolicyType,
                                 @RequestParam(value = "timeout") int timeout,
                                 HttpServletResponse response){
    return scheduleService.patchSchedule(operator,projectName,workflowName,schedule,notifyType,notifyMails,maxTryTimes,failurePolicy,depWorkflows,depPolicyType,timeout,null,response);
  }

  /**
   * 设置一个调度的状态
   * @param operator
   * @param projectName
   * @param workflowName
   * @param response
   */
  @PostMapping("/{workflowName}/schedules/{scheduleStatus}")
  public void postScheduleStatus(@RequestAttribute(value = "session.user") User operator,
                                   @PathVariable String projectName,
                                   @PathVariable String workflowName,
                                   @PathVariable ScheduleStatus scheduleStatus,
                                   HttpServletResponse response){
    scheduleService.patchSchedule(operator,projectName,workflowName,null,null,null,null,null,null,null,null,scheduleStatus,response);
  }

  /**
   * 查询一个工作流的调度
   * @param operator
   * @param projectName
   * @param workflowName
   * @param response
   * @return
   */
  @GetMapping("/{workflowName}/schedules")
  public Schedule querySchedule(@RequestAttribute(value = "session.user") User operator,
                                @PathVariable String projectName,
                                @PathVariable String workflowName,
                                HttpServletResponse response){
    return scheduleService.querySchedule(operator,projectName,workflowName,response);
  }
}
