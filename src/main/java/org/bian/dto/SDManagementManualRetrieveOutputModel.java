package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualOfferedService;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveOutputModel
 */
public class SDManagementManualRetrieveOutputModel   {
  private String managementManualRetrieveActionTaskReference = null;

  private Object managementManualRetrieveActionTaskRecord = null;

  private String managementManualRetrieveActionResponse = null;

  private SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord managementManualRetrieveActionRecord = null;

  private SDManagementManualRetrieveOutputModelManagementManualOfferedService managementManualOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return managementManualRetrieveActionTaskReference
  **/

  public String getManagementManualRetrieveActionTaskReference() {
    return managementManualRetrieveActionTaskReference;
  }

  public void setManagementManualRetrieveActionTaskReference(String managementManualRetrieveActionTaskReference) {
    this.managementManualRetrieveActionTaskReference = managementManualRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return managementManualRetrieveActionResponse
  **/

  public String getManagementManualRetrieveActionResponse() {
    return managementManualRetrieveActionResponse;
  }

  public void setManagementManualRetrieveActionResponse(String managementManualRetrieveActionResponse) {
    this.managementManualRetrieveActionResponse = managementManualRetrieveActionResponse;
  }


  /**
   * Get managementManualRetrieveActionRecord
   * @return managementManualRetrieveActionRecord
  **/

  public SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord getManagementManualRetrieveActionRecord() {
    return managementManualRetrieveActionRecord;
  }

  public void setManagementManualRetrieveActionRecord(SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord managementManualRetrieveActionRecord) {
    this.managementManualRetrieveActionRecord = managementManualRetrieveActionRecord;
  }


  /**
   * Get managementManualOfferedService
   * @return managementManualOfferedService
  **/

  public SDManagementManualRetrieveOutputModelManagementManualOfferedService getManagementManualOfferedService() {
    return managementManualOfferedService;
  }

  public void setManagementManualOfferedService(SDManagementManualRetrieveOutputModelManagementManualOfferedService managementManualOfferedService) {
    this.managementManualOfferedService = managementManualOfferedService;
  }


}

