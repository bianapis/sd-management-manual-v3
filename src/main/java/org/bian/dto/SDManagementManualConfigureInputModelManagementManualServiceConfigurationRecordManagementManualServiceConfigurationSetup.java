package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup
 */
public class SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup   {
  private String managementManualServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return managementManualServiceConfigurationParameter
  **/

  public String getManagementManualServiceConfigurationParameter() {
    return managementManualServiceConfigurationParameter;
  }

  public void setManagementManualServiceConfigurationParameter(String managementManualServiceConfigurationParameter) {
    this.managementManualServiceConfigurationParameter = managementManualServiceConfigurationParameter;
  }


}

