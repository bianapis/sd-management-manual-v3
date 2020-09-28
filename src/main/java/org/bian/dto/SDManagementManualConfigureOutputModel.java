package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureOutputModel
 */
public class SDManagementManualConfigureOutputModel   {
  private String managementManualConfigurationActionTaskReference = null;

  private Object managementManualConfigurationActionTaskRecord = null;

  private SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord = null;

  private String managementManualServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return managementManualConfigurationActionTaskReference
  **/

  public String getManagementManualConfigurationActionTaskReference() {
    return managementManualConfigurationActionTaskReference;
  }

  public void setManagementManualConfigurationActionTaskReference(String managementManualConfigurationActionTaskReference) {
    this.managementManualConfigurationActionTaskReference = managementManualConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return managementManualConfigurationActionTaskRecord
  **/

  public Object getManagementManualConfigurationActionTaskRecord() {
    return managementManualConfigurationActionTaskRecord;
  }

  public void setManagementManualConfigurationActionTaskRecord(Object managementManualConfigurationActionTaskRecord) {
    this.managementManualConfigurationActionTaskRecord = managementManualConfigurationActionTaskRecord;
  }


  /**
   * Get managementManualServiceConfigurationRecord
   * @return managementManualServiceConfigurationRecord
  **/

  public SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord getManagementManualServiceConfigurationRecord() {
    return managementManualServiceConfigurationRecord;
  }

  public void setManagementManualServiceConfigurationRecord(SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord) {
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

