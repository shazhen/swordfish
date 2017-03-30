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
package com.baifendian.swordfish.dao.model;

import com.baifendian.swordfish.dao.enums.NodeType;
import com.baifendian.swordfish.dao.utils.json.StringNodeJsonDeserializer;
import com.baifendian.swordfish.dao.utils.json.StringNodeJsonSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

public class FlowNode {

  @JsonIgnore
  private int id;

  private String name;

  private String desc;

  private NodeType type;

  @JsonIgnore
  private int flowId;

  @JsonDeserialize(using = StringNodeJsonDeserializer.class)
  @JsonSerialize(using = StringNodeJsonSerializer.class)
  private String parameter;

  private String dep;

  private String extras;

  @JsonIgnore
  private List<String> depList;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public NodeType getType() {
    return type;
  }

  public void setType(NodeType type) {
    this.type = type;
  }

  public int getFlowId() {
    return flowId;
  }

  public void setFlowId(int flowId) {
    this.flowId = flowId;
  }

  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public String getDep() {
    return dep;
  }

  public void setDep(String dep) {
    this.dep = dep;
  }

  public String getExtras() {
    return extras;
  }

  public void setExtras(String extras) {
    this.extras = extras;
  }

  public List<String> getDepList() {
    return depList;
  }

  public void setDepList(List<String> depList) {
    this.depList = depList;
  }
}
