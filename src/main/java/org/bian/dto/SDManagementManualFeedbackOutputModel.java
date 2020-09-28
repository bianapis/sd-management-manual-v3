package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualFeedbackOutputModelManagementManualFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualFeedbackOutputModel
 */
public class SDManagementManualFeedbackOutputModel   {
  private String managementManualFeedbackActionTaskReference = null;

  private Object managementManualFeedbackActionTaskRecord = null;

  private SDManagementManualFeedbackOutputModelManagementManualFeedbackActionRecord managementManualFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return managementManualFeedbackActionTaskReference
  **/

  public String getManagementManualFeedbackActionTaskReference() {
    return managementManualFeedbackActionTaskReference;
  }

  public void setManagementManualFeedbackActionTaskReference(String managementManualFeedbackActionTaskReference) {
    this.managementManualFeedbackActionTaskReference = managementManualFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return managementManualFeedbackActionTaskRecord
  **/

  public Object getManagementManualFeedbackActionTaskRecord() {
    return managementManualFeedbackActionTaskRecord;
  }

  public void setManagementManualFeedbackActionTaskRecord(Object managementManualFeedbackActionTaskRecord) {
    this.managementManualFeedbackActionTaskRecord = managementManualFeedbackActionTaskRecord;
  }


  /**
   * Get managementManualFeedbackActionRecord
   * @return managementManualFeedbackActionRecord
  **/

  public SDManagementManualFeedbackOutputModelManagementManualFeedbackActionRecord getManagementManualFeedbackActionRecord() {
    return managementManualFeedbackActionRecord;
  }

  public void setManagementManualFeedbackActionRecord(SDManagementManualFeedbackOutputModelManagementManualFeedbackActionRecord managementManualFeedbackActionRecord) {
    this.managementManualFeedbackActionRecord = managementManualFeedbackActionRecord;
  }


}

