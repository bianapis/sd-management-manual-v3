package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement
 */
public class SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement   {
  private String managementManualServiceAgreementReference = null;

  private String managementManualServiceUserReference = null;

  private String managementManualServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return managementManualServiceAgreementReference
  **/

  public String getManagementManualServiceAgreementReference() {
    return managementManualServiceAgreementReference;
  }

  public void setManagementManualServiceAgreementReference(String managementManualServiceAgreementReference) {
    this.managementManualServiceAgreementReference = managementManualServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return managementManualServiceUserReference
  **/

  public String getManagementManualServiceUserReference() {
    return managementManualServiceUserReference;
  }

  public void setManagementManualServiceUserReference(String managementManualServiceUserReference) {
    this.managementManualServiceUserReference = managementManualServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return managementManualServiceAgreementTermsandConditions
  **/

  public String getManagementManualServiceAgreementTermsandConditions() {
    return managementManualServiceAgreementTermsandConditions;
  }

  public void setManagementManualServiceAgreementTermsandConditions(String managementManualServiceAgreementTermsandConditions) {
    this.managementManualServiceAgreementTermsandConditions = managementManualServiceAgreementTermsandConditions;
  }


}

