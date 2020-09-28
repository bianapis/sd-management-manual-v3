package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord
 */
public class SDManagementManualActivateInputModelManagementManualServiceConfigurationRecord   {
  private String managementManualServiceConfigurationSettingReference = null;

  private String managementManualServiceConfigurationSettingType = null;

  private SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return managementManualServiceConfigurationSettingReference
  **/

  public String getManagementManualServiceConfigurationSettingReference() {
    return managementManualServiceConfigurationSettingReference;
  }

  public void setManagementManualServiceConfigurationSettingReference(String managementManualServiceConfigurationSettingReference) {
    this.managementManualServiceConfigurationSettingReference = managementManualServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return managementManualServiceConfigurationSettingType
  **/

  public String getManagementManualServiceConfigurationSettingType() {
    return managementManualServiceConfigurationSettingType;
  }

  public void setManagementManualServiceConfigurationSettingType(String managementManualServiceConfigurationSettingType) {
    this.managementManualServiceConfigurationSettingType = managementManualServiceConfigurationSettingType;
  }


  /**
   * Get managementManualServiceConfigurationSetup
   * @return managementManualServiceConfigurationSetup
  **/

  public SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup getManagementManualServiceConfigurationSetup() {
    return managementManualServiceConfigurationSetup;
  }

  public void setManagementManualServiceConfigurationSetup(SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup) {
    this.managementManualServiceConfigurationSetup = managementManualServiceConfigurationSetup;
  }


}

