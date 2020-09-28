package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup;
import org.bian.dto.SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement;
import org.bian.dto.SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord
 */
public class SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecord   {
  private String managementManualServiceConfigurationSettingReference = null;

  private String managementManualServiceConfigurationSettingDescription = null;

  private SDManagementManualActivateInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup = null;

  private SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription managementManualServiceSubscription = null;

  private SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement managementManualServiceAgreement = null;

  private String managementManualServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return managementManualServiceConfigurationSettingDescription
  **/

  public String getManagementManualServiceConfigurationSettingDescription() {
    return managementManualServiceConfigurationSettingDescription;
  }

  public void setManagementManualServiceConfigurationSettingDescription(String managementManualServiceConfigurationSettingDescription) {
    this.managementManualServiceConfigurationSettingDescription = managementManualServiceConfigurationSettingDescription;
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


  /**
   * Get managementManualServiceSubscription
   * @return managementManualServiceSubscription
  **/

  public SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription getManagementManualServiceSubscription() {
    return managementManualServiceSubscription;
  }

  public void setManagementManualServiceSubscription(SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription managementManualServiceSubscription) {
    this.managementManualServiceSubscription = managementManualServiceSubscription;
  }


  /**
   * Get managementManualServiceAgreement
   * @return managementManualServiceAgreement
  **/

  public SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement getManagementManualServiceAgreement() {
    return managementManualServiceAgreement;
  }

  public void setManagementManualServiceAgreement(SDManagementManualActivateOutputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement managementManualServiceAgreement) {
    this.managementManualServiceAgreement = managementManualServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return managementManualServiceStatus
  **/

  public String getManagementManualServiceStatus() {
    return managementManualServiceStatus;
  }

  public void setManagementManualServiceStatus(String managementManualServiceStatus) {
    this.managementManualServiceStatus = managementManualServiceStatus;
  }


}

