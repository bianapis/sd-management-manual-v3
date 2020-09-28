package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord
 */
public class SDManagementManualRetrieveInputModelManagementManualOfferedServiceManagementManualServiceRecord   {
  private String managementManualServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return managementManualServiceVersion
  **/

  public String getManagementManualServiceVersion() {
    return managementManualServiceVersion;
  }

  public void setManagementManualServiceVersion(String managementManualServiceVersion) {
    this.managementManualServiceVersion = managementManualServiceVersion;
  }


}

