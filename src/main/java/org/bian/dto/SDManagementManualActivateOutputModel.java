package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualActivateOutputModel
 */
public class SDManagementManualActivateOutputModel   {
  private String managementManualActivationActionTaskReference = null;

  private Object managementManualActivationActionTaskRecord = null;

  private String managementManualServicingSessionReference = null;

  private Object managementManualServicingSessionRecord = null;

  private SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord = null;

  private String managementManualServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return managementManualActivationActionTaskReference
  **/

  public String getManagementManualActivationActionTaskReference() {
    return managementManualActivationActionTaskReference;
  }

  public void setManagementManualActivationActionTaskReference(String managementManualActivationActionTaskReference) {
    this.managementManualActivationActionTaskReference = managementManualActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return managementManualActivationActionTaskRecord
  **/

  public Object getManagementManualActivationActionTaskRecord() {
    return managementManualActivationActionTaskRecord;
  }

  public void setManagementManualActivationActionTaskRecord(Object managementManualActivationActionTaskRecord) {
    this.managementManualActivationActionTaskRecord = managementManualActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return managementManualServicingSessionReference
  **/

  public String getManagementManualServicingSessionReference() {
    return managementManualServicingSessionReference;
  }

  public void setManagementManualServicingSessionReference(String managementManualServicingSessionReference) {
    this.managementManualServicingSessionReference = managementManualServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return managementManualServicingSessionRecord
  **/

  public Object getManagementManualServicingSessionRecord() {
    return managementManualServicingSessionRecord;
  }

  public void setManagementManualServicingSessionRecord(Object managementManualServicingSessionRecord) {
    this.managementManualServicingSessionRecord = managementManualServicingSessionRecord;
  }


  /**
   * Get managementManualServiceConfigurationRecord
   * @return managementManualServiceConfigurationRecord
  **/

  public SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord getManagementManualServiceConfigurationRecord() {
    return managementManualServiceConfigurationRecord;
  }

  public void setManagementManualServiceConfigurationRecord(SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord) {
    this.managementManualServiceConfigurationRecord = managementManualServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return managementManualServicingSessionStatus
  **/

  public String getManagementManualServicingSessionStatus() {
    return managementManualServicingSessionStatus;
  }

  public void setManagementManualServicingSessionStatus(String managementManualServicingSessionStatus) {
    this.managementManualServicingSessionStatus = managementManualServicingSessionStatus;
  }


}

