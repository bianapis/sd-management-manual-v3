package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDManagementManualActivateInputModel
 */
public class SDManagementManualActivateInputModel   {
  private Object managementManualActivationActionTaskRecord = null;

  private String managementManualCenterReference = null;

  private String managementManualServiceReference = null;

  private SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return managementManualCenterReference
  **/

  public String getManagementManualCenterReference() {
    return managementManualCenterReference;
  }

  public void setManagementManualCenterReference(String managementManualCenterReference) {
    this.managementManualCenterReference = managementManualCenterReference;
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

  public SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord getManagementManualServiceConfigurationRecord() {
    return managementManualServiceConfigurationRecord;
  }

  public void setManagementManualServiceConfigurationRecord(SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord managementManualServiceConfigurationRecord) {
    this.managementManualServiceConfigurationRecord = managementManualServiceConfigurationRecord;
  }


}

