package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRequestOutputModel
 */
public class CRManagementManualSpecificationRequestOutputModel   {
  private String managementManualSpecificationParameterType = null;

  private String managementManualSpecificationSelectedOption = null;

  private String managementManualSpecificationVersion = null;

  private String managementManualSpecificationStatus = null;

  private String managementManualSpecificationUsageLog = null;

  private String managementManualSpecificationFeedback = null;

  private String managementManualSpecificationRequestActionTaskReference = null;

  private Object managementManualSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Management Manual Specification instance request service call 
   * @return managementManualSpecificationRequestActionTaskReference
  **/

  public String getManagementManualSpecificationRequestActionTaskReference() {
    return managementManualSpecificationRequestActionTaskReference;
  }

  public void setManagementManualSpecificationRequestActionTaskReference(String managementManualSpecificationRequestActionTaskReference) {
    this.managementManualSpecificationRequestActionTaskReference = managementManualSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return managementManualSpecificationRequestActionTaskRecord
  **/

  public Object getManagementManualSpecificationRequestActionTaskRecord() {
    return managementManualSpecificationRequestActionTaskRecord;
  }

  public void setManagementManualSpecificationRequestActionTaskRecord(Object managementManualSpecificationRequestActionTaskRecord) {
    this.managementManualSpecificationRequestActionTaskRecord = managementManualSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

