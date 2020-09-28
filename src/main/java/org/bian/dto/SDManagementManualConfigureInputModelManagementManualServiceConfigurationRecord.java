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
 * SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord
 */
public class SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecord   {
  private String managementManualServiceConfigurationSettingReference = null;

  private String managementManualServiceConfigurationSettingType = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceConfigurationSetup managementManualServiceConfigurationSetup = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceSubscription managementManualServiceSubscription = null;

  private SDManagementManualConfigureInputModelManagementManualServiceConfigurationRecordManagementManualServiceAgreement managementManualServiceAgreement = null;


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


}

