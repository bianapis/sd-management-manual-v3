package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement;
import org.bian.dto.SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup;
import org.bian.dto.SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord
 */
public class SDManagementManualConfigureOutputModelManagementManualServiceConfigurationRecord   {
  private String managementManualServiceConfigurationSettingDescription = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription managementManualServiceSubscription = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement managementManualServiceAgreement = null;

  private String managementManualServiceStatus = null;


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

  public SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup getManagementManualServiceConfigurationSetup() {
    return managementManualServiceConfigurationSetup;
  }

  public void setManagementManualServiceConfigurationSetup(SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup) {
    this.managementManualServiceConfigurationSetup = managementManualServiceConfigurationSetup;
  }


  /**
   * Get managementManualServiceSubscription
   * @return managementManualServiceSubscription
  **/

  public SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription getManagementManualServiceSubscription() {
    return managementManualServiceSubscription;
  }

  public void setManagementManualServiceSubscription(SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription managementManualServiceSubscription) {
    this.managementManualServiceSubscription = managementManualServiceSubscription;
  }


  /**
   * Get managementManualServiceAgreement
   * @return managementManualServiceAgreement
  **/

  public SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement getManagementManualServiceAgreement() {
    return managementManualServiceAgreement;
  }

  public void setManagementManualServiceAgreement(SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement managementManualServiceAgreement) {
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

