package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecord
 */
public class SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecord   {
  private String managementManualServiceType = null;

  private String managementManualServiceVersion = null;

  private String managementManualServiceDescription = null;

  private SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines managementManualServicePoliciesandGuidelines = null;

  private String managementManualServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return managementManualServiceType
  **/

  public String getManagementManualServiceType() {
    return managementManualServiceType;
  }

  public void setManagementManualServiceType(String managementManualServiceType) {
    this.managementManualServiceType = managementManualServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return managementManualServiceDescription
  **/

  public String getManagementManualServiceDescription() {
    return managementManualServiceDescription;
  }

  public void setManagementManualServiceDescription(String managementManualServiceDescription) {
    this.managementManualServiceDescription = managementManualServiceDescription;
  }


  /**
   * Get managementManualServicePoliciesandGuidelines
   * @return managementManualServicePoliciesandGuidelines
  **/

  public SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines getManagementManualServicePoliciesandGuidelines() {
    return managementManualServicePoliciesandGuidelines;
  }

  public void setManagementManualServicePoliciesandGuidelines(SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines managementManualServicePoliciesandGuidelines) {
    this.managementManualServicePoliciesandGuidelines = managementManualServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return managementManualServiceSchedule
  **/

  public String getManagementManualServiceSchedule() {
    return managementManualServiceSchedule;
  }

  public void setManagementManualServiceSchedule(String managementManualServiceSchedule) {
    this.managementManualServiceSchedule = managementManualServiceSchedule;
  }


}

