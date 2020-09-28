package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines
 */
public class SDManagementManualRetrieveOutputModelManagementManualOfferedServiceManagementManualServiceRecordManagementManualServicePoliciesandGuidelines   {
  private String managementManualServiceEligibility = null;

  private String managementManualServiceIntendedUses = null;

  private String managementManualServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return managementManualServiceEligibility
  **/

  public String getManagementManualServiceEligibility() {
    return managementManualServiceEligibility;
  }

  public void setManagementManualServiceEligibility(String managementManualServiceEligibility) {
    this.managementManualServiceEligibility = managementManualServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return managementManualServiceIntendedUses
  **/

  public String getManagementManualServiceIntendedUses() {
    return managementManualServiceIntendedUses;
  }

  public void setManagementManualServiceIntendedUses(String managementManualServiceIntendedUses) {
    this.managementManualServiceIntendedUses = managementManualServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return managementManualServicePricingandTerms
  **/

  public String getManagementManualServicePricingandTerms() {
    return managementManualServicePricingandTerms;
  }

  public void setManagementManualServicePricingandTerms(String managementManualServicePricingandTerms) {
    this.managementManualServicePricingandTerms = managementManualServicePricingandTerms;
  }


}

