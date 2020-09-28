package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription
 */
public class SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription   {
  private String managementManualServiceSubscriberReference = null;

  private String managementManualServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return managementManualServiceSubscriberReference
  **/

  public String getManagementManualServiceSubscriberReference() {
    return managementManualServiceSubscriberReference;
  }

  public void setManagementManualServiceSubscriberReference(String managementManualServiceSubscriberReference) {
    this.managementManualServiceSubscriberReference = managementManualServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return managementManualServiceSubscriberAccessProfile
  **/

  public String getManagementManualServiceSubscriberAccessProfile() {
    return managementManualServiceSubscriberAccessProfile;
  }

  public void setManagementManualServiceSubscriberAccessProfile(String managementManualServiceSubscriberAccessProfile) {
    this.managementManualServiceSubscriberAccessProfile = managementManualServiceSubscriberAccessProfile;
  }


}

