package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualFeedbackInputModelManagementManualFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualFeedbackInputModel
 */
public class SDManagementManualFeedbackInputModel   {
  private Object managementManualFeedbackActionTaskRecord = null;

  private SDManagementManualFeedbackInputModelManagementManualFeedbackActionRecord managementManualFeedbackActionRecord = null;


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

  public SDManagementManualFeedbackInputModelManagementManualFeedbackActionRecord getManagementManualFeedbackActionRecord() {
    return managementManualFeedbackActionRecord;
  }

  public void setManagementManualFeedbackActionRecord(SDManagementManualFeedbackInputModelManagementManualFeedbackActionRecord managementManualFeedbackActionRecord) {
    this.managementManualFeedbackActionRecord = managementManualFeedbackActionRecord;
  }


}

