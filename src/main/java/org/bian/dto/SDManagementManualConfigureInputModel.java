package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureInputModel
 */
public class SDManagementManualConfigureInputModel   {
  private Object managementManualConfigurationActionTaskRecord = null;

  private String managementManualServicingSessionReference = null;

  private String managementManualServiceReference = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord = null;


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
   * Get managementManualServiceConfigurationRecord
   * @return managementManualServiceConfigurationRecord
  **/

  public SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord getManagementManualServiceConfigurationRecord() {
    return managementManualServiceConfigurationRecord;
  }

  public void setManagementManualServiceConfigurationRecord(SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord) {
    this.managementManualServiceConfigurationRecord = managementManualServiceConfigurationRecord;
  }


}

