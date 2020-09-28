package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalandRegulatoryObligationsandGuidelinesInitiateInputModel
 */
public class BQLegalandRegulatoryObligationsandGuidelinesInitiateInputModel   {
  private String managementManualSpecificationInstanceReference = null;

  private Object legalandRegulatoryObligationsandGuidelinesInitiateActionRecord = null;

  private String legalandRegulatoryObligationsandGuidelinesPreconditions = null;

  private String legalandRegulatoryObligationsandGuidelinesSpecificationSchedule = null;

  private String legalandRegulatoryObligationsandGuidelinesVersionNumber = null;

  private String legalandRegulatoryObligationsandGuidelines = null;

  private String legalandRegulatoryObligationsandGuidelinesServiceType = null;

  private String legalandRegulatoryObligationsandGuidelinesServiceDescription = null;

  private String legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs = null;

  private String legalandRegulatoryObligationsandGuidelinesServiceWorkProduct = null;

  private String legalandRegulatoryObligationsandGuidelinesServiceName = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return legalandRegulatoryObligationsandGuidelinesInitiateActionRecord
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesInitiateActionRecord() {
    return legalandRegulatoryObligationsandGuidelinesInitiateActionRecord;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInitiateActionRecord(Object legalandRegulatoryObligationsandGuidelinesInitiateActionRecord) {
    this.legalandRegulatoryObligationsandGuidelinesInitiateActionRecord = legalandRegulatoryObligationsandGuidelinesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return legalandRegulatoryObligationsandGuidelinesPreconditions
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesPreconditions() {
    return legalandRegulatoryObligationsandGuidelinesPreconditions;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesPreconditions(String legalandRegulatoryObligationsandGuidelinesPreconditions) {
    this.legalandRegulatoryObligationsandGuidelinesPreconditions = legalandRegulatoryObligationsandGuidelinesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return legalandRegulatoryObligationsandGuidelinesSpecificationSchedule
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesSpecificationSchedule() {
    return legalandRegulatoryObligationsandGuidelinesSpecificationSchedule;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesSpecificationSchedule(String legalandRegulatoryObligationsandGuidelinesSpecificationSchedule) {
    this.legalandRegulatoryObligationsandGuidelinesSpecificationSchedule = legalandRegulatoryObligationsandGuidelinesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return legalandRegulatoryObligationsandGuidelinesVersionNumber
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesVersionNumber() {
    return legalandRegulatoryObligationsandGuidelinesVersionNumber;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesVersionNumber(String legalandRegulatoryObligationsandGuidelinesVersionNumber) {
    this.legalandRegulatoryObligationsandGuidelinesVersionNumber = legalandRegulatoryObligationsandGuidelinesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Management Manual Specification specific Business Service 
   * @return legalandRegulatoryObligationsandGuidelines
  **/

  public String getLegalandRegulatoryObligationsandGuidelines() {
    return legalandRegulatoryObligationsandGuidelines;
  }

  public void setLegalandRegulatoryObligationsandGuidelines(String legalandRegulatoryObligationsandGuidelines) {
    this.legalandRegulatoryObligationsandGuidelines = legalandRegulatoryObligationsandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return legalandRegulatoryObligationsandGuidelinesServiceType
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesServiceType() {
    return legalandRegulatoryObligationsandGuidelinesServiceType;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesServiceType(String legalandRegulatoryObligationsandGuidelinesServiceType) {
    this.legalandRegulatoryObligationsandGuidelinesServiceType = legalandRegulatoryObligationsandGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return legalandRegulatoryObligationsandGuidelinesServiceDescription
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesServiceDescription() {
    return legalandRegulatoryObligationsandGuidelinesServiceDescription;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesServiceDescription(String legalandRegulatoryObligationsandGuidelinesServiceDescription) {
    this.legalandRegulatoryObligationsandGuidelinesServiceDescription = legalandRegulatoryObligationsandGuidelinesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs() {
    return legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs(String legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs) {
    this.legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs = legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return legalandRegulatoryObligationsandGuidelinesServiceWorkProduct
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesServiceWorkProduct() {
    return legalandRegulatoryObligationsandGuidelinesServiceWorkProduct;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesServiceWorkProduct(String legalandRegulatoryObligationsandGuidelinesServiceWorkProduct) {
    this.legalandRegulatoryObligationsandGuidelinesServiceWorkProduct = legalandRegulatoryObligationsandGuidelinesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return legalandRegulatoryObligationsandGuidelinesServiceName
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesServiceName() {
    return legalandRegulatoryObligationsandGuidelinesServiceName;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesServiceName(String legalandRegulatoryObligationsandGuidelinesServiceName) {
    this.legalandRegulatoryObligationsandGuidelinesServiceName = legalandRegulatoryObligationsandGuidelinesServiceName;
  }


}

