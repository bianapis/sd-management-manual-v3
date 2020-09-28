package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesUpdateInputModel
 */
public class BQOperationalandProductionProceduresandGuidelinesUpdateInputModel   {
  private String managementManualSpecificationInstanceReference = null;

  private String operationalandProductionProceduresandGuidelinesInstanceReference = null;

  private String operationalandProductionProceduresandGuidelinesPreconditions = null;

  private String operationalandProductionProceduresandGuidelinesSpecificationSchedule = null;

  private String operationalandProductionProceduresandGuidelinesVersionNumber = null;

  private String operationalandProductionProceduresandGuidelines = null;

  private String operationalandProductionProceduresandGuidelinesServiceType = null;

  private String operationalandProductionProceduresandGuidelinesServiceDescription = null;

  private String operationalandProductionProceduresandGuidelinesServiceInputsandOuputs = null;

  private String operationalandProductionProceduresandGuidelinesServiceWorkProduct = null;

  private String operationalandProductionProceduresandGuidelinesServiceName = null;

  private Object operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord = null;

  private String operationalandProductionProceduresandGuidelinesUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Management Manual Specification instance 
   * @return managementManualSpecificationInstanceReference
  **/

  public String getManagementManualSpecificationInstanceReference() {
    return managementManualSpecificationInstanceReference;
  }

  public void setManagementManualSpecificationInstanceReference(String managementManualSpecificationInstanceReference) {
    this.managementManualSpecificationInstanceReference = managementManualSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Operational and Production Procedures and Guidelines instance 
   * @return operationalandProductionProceduresandGuidelinesInstanceReference
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceReference() {
    return operationalandProductionProceduresandGuidelinesInstanceReference;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReference(String operationalandProductionProceduresandGuidelinesInstanceReference) {
    this.operationalandProductionProceduresandGuidelinesInstanceReference = operationalandProductionProceduresandGuidelinesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return operationalandProductionProceduresandGuidelinesPreconditions
  **/

  public String getOperationalandProductionProceduresandGuidelinesPreconditions() {
    return operationalandProductionProceduresandGuidelinesPreconditions;
  }

  public void setOperationalandProductionProceduresandGuidelinesPreconditions(String operationalandProductionProceduresandGuidelinesPreconditions) {
    this.operationalandProductionProceduresandGuidelinesPreconditions = operationalandProductionProceduresandGuidelinesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return operationalandProductionProceduresandGuidelinesSpecificationSchedule
  **/

  public String getOperationalandProductionProceduresandGuidelinesSpecificationSchedule() {
    return operationalandProductionProceduresandGuidelinesSpecificationSchedule;
  }

  public void setOperationalandProductionProceduresandGuidelinesSpecificationSchedule(String operationalandProductionProceduresandGuidelinesSpecificationSchedule) {
    this.operationalandProductionProceduresandGuidelinesSpecificationSchedule = operationalandProductionProceduresandGuidelinesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return operationalandProductionProceduresandGuidelinesVersionNumber
  **/

  public String getOperationalandProductionProceduresandGuidelinesVersionNumber() {
    return operationalandProductionProceduresandGuidelinesVersionNumber;
  }

  public void setOperationalandProductionProceduresandGuidelinesVersionNumber(String operationalandProductionProceduresandGuidelinesVersionNumber) {
    this.operationalandProductionProceduresandGuidelinesVersionNumber = operationalandProductionProceduresandGuidelinesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Management Manual Specification specific Business Service 
   * @return operationalandProductionProceduresandGuidelines
  **/

  public String getOperationalandProductionProceduresandGuidelines() {
    return operationalandProductionProceduresandGuidelines;
  }

  public void setOperationalandProductionProceduresandGuidelines(String operationalandProductionProceduresandGuidelines) {
    this.operationalandProductionProceduresandGuidelines = operationalandProductionProceduresandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return operationalandProductionProceduresandGuidelinesServiceType
  **/

  public String getOperationalandProductionProceduresandGuidelinesServiceType() {
    return operationalandProductionProceduresandGuidelinesServiceType;
  }

  public void setOperationalandProductionProceduresandGuidelinesServiceType(String operationalandProductionProceduresandGuidelinesServiceType) {
    this.operationalandProductionProceduresandGuidelinesServiceType = operationalandProductionProceduresandGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return operationalandProductionProceduresandGuidelinesServiceDescription
  **/

  public String getOperationalandProductionProceduresandGuidelinesServiceDescription() {
    return operationalandProductionProceduresandGuidelinesServiceDescription;
  }

  public void setOperationalandProductionProceduresandGuidelinesServiceDescription(String operationalandProductionProceduresandGuidelinesServiceDescription) {
    this.operationalandProductionProceduresandGuidelinesServiceDescription = operationalandProductionProceduresandGuidelinesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return operationalandProductionProceduresandGuidelinesServiceInputsandOuputs
  **/

  public String getOperationalandProductionProceduresandGuidelinesServiceInputsandOuputs() {
    return operationalandProductionProceduresandGuidelinesServiceInputsandOuputs;
  }

  public void setOperationalandProductionProceduresandGuidelinesServiceInputsandOuputs(String operationalandProductionProceduresandGuidelinesServiceInputsandOuputs) {
    this.operationalandProductionProceduresandGuidelinesServiceInputsandOuputs = operationalandProductionProceduresandGuidelinesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return operationalandProductionProceduresandGuidelinesServiceWorkProduct
  **/

  public String getOperationalandProductionProceduresandGuidelinesServiceWorkProduct() {
    return operationalandProductionProceduresandGuidelinesServiceWorkProduct;
  }

  public void setOperationalandProductionProceduresandGuidelinesServiceWorkProduct(String operationalandProductionProceduresandGuidelinesServiceWorkProduct) {
    this.operationalandProductionProceduresandGuidelinesServiceWorkProduct = operationalandProductionProceduresandGuidelinesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return operationalandProductionProceduresandGuidelinesServiceName
  **/

  public String getOperationalandProductionProceduresandGuidelinesServiceName() {
    return operationalandProductionProceduresandGuidelinesServiceName;
  }

  public void setOperationalandProductionProceduresandGuidelinesServiceName(String operationalandProductionProceduresandGuidelinesServiceName) {
    this.operationalandProductionProceduresandGuidelinesServiceName = operationalandProductionProceduresandGuidelinesServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord
  **/

  public Object getOperationalandProductionProceduresandGuidelinesUpdateActionTaskRecord() {
    return operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord;
  }

  public void setOperationalandProductionProceduresandGuidelinesUpdateActionTaskRecord(Object operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord) {
    this.operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord = operationalandProductionProceduresandGuidelinesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return operationalandProductionProceduresandGuidelinesUpdateActionRequest
  **/

  public String getOperationalandProductionProceduresandGuidelinesUpdateActionRequest() {
    return operationalandProductionProceduresandGuidelinesUpdateActionRequest;
  }

  public void setOperationalandProductionProceduresandGuidelinesUpdateActionRequest(String operationalandProductionProceduresandGuidelinesUpdateActionRequest) {
    this.operationalandProductionProceduresandGuidelinesUpdateActionRequest = operationalandProductionProceduresandGuidelinesUpdateActionRequest;
  }


}

