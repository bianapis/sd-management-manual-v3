package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationInitiateInputModel
 */
public class CRManagementManualSpecificationInitiateInputModel   {
  private String managementManualServicingSessionReference = null;

  private Object managementManualSpecificationInitiateActionRecord = null;

  private String managementManualSpecificationInstanceStatus = null;

  private String managementManualSpecificationParameterType = null;

  private String managementManualSpecificationSelectedOption = null;

  private String managementManualSpecificationDescription = null;

  private String managementManualSpecificationVersion = null;

  private String managementManualSpecificationStatus = null;

  private String managementManualSpecificationUsageLog = null;

  private String managementManualSpecificationFeedback = null;

  private String managementManualSpecificationServiceProviderReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return managementManualServicingSessionReference
  **/

  public String getManagementManualServicingSessionReference() {
    return managementManualServicingSessionReference;
  }

  public void setManagementManualServicingSessionReference(String managementManualServicingSessionReference) {
    this.managementManualServicingSessionReference = managementManualServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return managementManualSpecificationInitiateActionRecord
  **/

  public Object getManagementManualSpecificationInitiateActionRecord() {
    return managementManualSpecificationInitiateActionRecord;
  }

  public void setManagementManualSpecificationInitiateActionRecord(Object managementManualSpecificationInitiateActionRecord) {
    this.managementManualSpecificationInitiateActionRecord = managementManualSpecificationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Management Manual Specification instance (e.g. initialised, pending, active) 
   * @return managementManualSpecificationInstanceStatus
  **/

  public String getManagementManualSpecificationInstanceStatus() {
    return managementManualSpecificationInstanceStatus;
  }

  public void setManagementManualSpecificationInstanceStatus(String managementManualSpecificationInstanceStatus) {
    this.managementManualSpecificationInstanceStatus = managementManualSpecificationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between designs according to the type of business services and/or aspect within Management Manual Specification . Eg Product Design, Campaign Design, Risk Model Design etc.  
   * @return managementManualSpecificationParameterType
  **/

  public String getManagementManualSpecificationParameterType() {
    return managementManualSpecificationParameterType;
  }

  public void setManagementManualSpecificationParameterType(String managementManualSpecificationParameterType) {
    this.managementManualSpecificationParameterType = managementManualSpecificationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of design 
   * @return managementManualSpecificationSelectedOption
  **/

  public String getManagementManualSpecificationSelectedOption() {
    return managementManualSpecificationSelectedOption;
  }

  public void setManagementManualSpecificationSelectedOption(String managementManualSpecificationSelectedOption) {
    this.managementManualSpecificationSelectedOption = managementManualSpecificationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Management Manual Specification 
   * @return managementManualSpecificationDescription
  **/

  public String getManagementManualSpecificationDescription() {
    return managementManualSpecificationDescription;
  }

  public void setManagementManualSpecificationDescription(String managementManualSpecificationDescription) {
    this.managementManualSpecificationDescription = managementManualSpecificationDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Management Manual Specification 
   * @return managementManualSpecificationVersion
  **/

  public String getManagementManualSpecificationVersion() {
    return managementManualSpecificationVersion;
  }

  public void setManagementManualSpecificationVersion(String managementManualSpecificationVersion) {
    this.managementManualSpecificationVersion = managementManualSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Management Manual Specification 
   * @return managementManualSpecificationStatus
  **/

  public String getManagementManualSpecificationStatus() {
    return managementManualSpecificationStatus;
  }

  public void setManagementManualSpecificationStatus(String managementManualSpecificationStatus) {
    this.managementManualSpecificationStatus = managementManualSpecificationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Management Manual Specification 
   * @return managementManualSpecificationUsageLog
  **/

  public String getManagementManualSpecificationUsageLog() {
    return managementManualSpecificationUsageLog;
  }

  public void setManagementManualSpecificationUsageLog(String managementManualSpecificationUsageLog) {
    this.managementManualSpecificationUsageLog = managementManualSpecificationUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Information about reactions to a design which is used as a basis for improvement for the Management Manual Specification. 
   * @return managementManualSpecificationFeedback
  **/

  public String getManagementManualSpecificationFeedback() {
    return managementManualSpecificationFeedback;
  }

  public void setManagementManualSpecificationFeedback(String managementManualSpecificationFeedback) {
    this.managementManualSpecificationFeedback = managementManualSpecificationFeedback;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Management Manual Specification 
   * @return managementManualSpecificationServiceProviderReference
  **/

  public String getManagementManualSpecificationServiceProviderReference() {
    return managementManualSpecificationServiceProviderReference;
  }

  public void setManagementManualSpecificationServiceProviderReference(String managementManualSpecificationServiceProviderReference) {
    this.managementManualSpecificationServiceProviderReference = managementManualSpecificationServiceProviderReference;
  }


}

