package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup
 */
public class SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup   {
  private String managementManualServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return managementManualServiceConfigurationParameter
  **/

  public String getManagementManualServiceConfigurationParameter() {
    return managementManualServiceConfigurationParameter;
  }

  public void setManagementManualServiceConfigurationParameter(String managementManualServiceConfigurationParameter) {
    this.managementManualServiceConfigurationParameter = managementManualServiceConfigurationParameter;
  }


}

