package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveInputModelManagementManualOfferedService
 */
public class SDManagementManualRetrieveInputModelManagementManualOfferedService   {
  private String managementManualServiceReference = null;

  private SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord managementManualServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return managementManualServiceReference
  **/

  public String getManagementManualServiceReference() {
    return managementManualServiceReference;
  }

  public void setManagementManualServiceReference(String managementManualServiceReference) {
    this.managementManualServiceReference = managementManualServiceReference;
  }


  /**
   * Get managementManualServiceRecord
   * @return managementManualServiceRecord
  **/

  public SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord getManagementManualServiceRecord() {
    return managementManualServiceRecord;
  }

  public void setManagementManualServiceRecord(SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord managementManualServiceRecord) {
    this.managementManualServiceRecord = managementManualServiceRecord;
  }


}

