package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualOfferedService;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveInputModel
 */
public class SDManagementManualRetrieveInputModel   {
  private Object managementManualRetrieveActionTaskRecord = null;

  private String managementManualRetrieveActionRequest = null;

  private SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord managementManualRetrieveActionRecord = null;

  private SDManagementManualRetrieveInputModelManagementManualOfferedService managementManualOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return managementManualRetrieveActionTaskRecord
  **/

  public Object getManagementManualRetrieveActionTaskRecord() {
    return managementManualRetrieveActionTaskRecord;
  }

  public void setManagementManualRetrieveActionTaskRecord(Object managementManualRetrieveActionTaskRecord) {
    this.managementManualRetrieveActionTaskRecord = managementManualRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return managementManualRetrieveActionRequest
  **/

  public String getManagementManualRetrieveActionRequest() {
    return managementManualRetrieveActionRequest;
  }

  public void setManagementManualRetrieveActionRequest(String managementManualRetrieveActionRequest) {
    this.managementManualRetrieveActionRequest = managementManualRetrieveActionRequest;
  }


  /**
   * Get managementManualRetrieveActionRecord
   * @return managementManualRetrieveActionRecord
  **/

  public SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord getManagementManualRetrieveActionRecord() {
    return managementManualRetrieveActionRecord;
  }

  public void setManagementManualRetrieveActionRecord(SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord managementManualRetrieveActionRecord) {
    this.managementManualRetrieveActionRecord = managementManualRetrieveActionRecord;
  }


  /**
   * Get managementManualOfferedService
   * @return managementManualOfferedService
  **/

  public SDManagementManualRetrieveInputModelManagementManualOfferedService getManagementManualOfferedService() {
    return managementManualOfferedService;
  }

  public void setManagementManualOfferedService(SDManagementManualRetrieveInputModelManagementManualOfferedService managementManualOfferedService) {
    this.managementManualOfferedService = managementManualOfferedService;
  }


}

