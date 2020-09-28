package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffManagementProceduresandGuidelinesUpdateOutputModel
 */
public class BQStaffManagementProceduresandGuidelinesUpdateOutputModel   {
  private String staffManagementProceduresandGuidelinesPreconditions = null;

  private String staffManagementProceduresandGuidelinesSpecificationSchedule = null;

  private String staffManagementProceduresandGuidelinesVersionNumber = null;

  private String staffManagementProceduresandGuidelines = null;

  private String staffManagementProceduresandGuidelinesServiceType = null;

  private String staffManagementProceduresandGuidelinesServiceDescription = null;

  private String staffManagementProceduresandGuidelinesServiceInputsandOuputs = null;

  private String staffManagementProceduresandGuidelinesServiceWorkProduct = null;

  private String staffManagementProceduresandGuidelinesServiceName = null;

  private String staffManagementProceduresandGuidelinesUpdateActionTaskReference = null;

  private Object staffManagementProceduresandGuidelinesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return staffManagementProceduresandGuidelinesPreconditions
  **/

  public String getStaffManagementProceduresandGuidelinesPreconditions() {
    return staffManagementProceduresandGuidelinesPreconditions;
  }

  public void setStaffManagementProceduresandGuidelinesPreconditions(String staffManagementProceduresandGuidelinesPreconditions) {
    this.staffManagementProceduresandGuidelinesPreconditions = staffManagementProceduresandGuidelinesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return staffManagementProceduresandGuidelinesSpecificationSchedule
  **/

  public String getStaffManagementProceduresandGuidelinesSpecificationSchedule() {
    return staffManagementProceduresandGuidelinesSpecificationSchedule;
  }

  public void setStaffManagementProceduresandGuidelinesSpecificationSchedule(String staffManagementProceduresandGuidelinesSpecificationSchedule) {
    this.staffManagementProceduresandGuidelinesSpecificationSchedule = staffManagementProceduresandGuidelinesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return staffManagementProceduresandGuidelinesVersionNumber
  **/

  public String getStaffManagementProceduresandGuidelinesVersionNumber() {
    return staffManagementProceduresandGuidelinesVersionNumber;
  }

  public void setStaffManagementProceduresandGuidelinesVersionNumber(String staffManagementProceduresandGuidelinesVersionNumber) {
    this.staffManagementProceduresandGuidelinesVersionNumber = staffManagementProceduresandGuidelinesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Management Manual Specification specific Business Service 
   * @return staffManagementProceduresandGuidelines
  **/

  public String getStaffManagementProceduresandGuidelines() {
    return staffManagementProceduresandGuidelines;
  }

  public void setStaffManagementProceduresandGuidelines(String staffManagementProceduresandGuidelines) {
    this.staffManagementProceduresandGuidelines = staffManagementProceduresandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return staffManagementProceduresandGuidelinesServiceType
  **/

  public String getStaffManagementProceduresandGuidelinesServiceType() {
    return staffManagementProceduresandGuidelinesServiceType;
  }

  public void setStaffManagementProceduresandGuidelinesServiceType(String staffManagementProceduresandGuidelinesServiceType) {
    this.staffManagementProceduresandGuidelinesServiceType = staffManagementProceduresandGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return staffManagementProceduresandGuidelinesServiceDescription
  **/

  public String getStaffManagementProceduresandGuidelinesServiceDescription() {
    return staffManagementProceduresandGuidelinesServiceDescription;
  }

  public void setStaffManagementProceduresandGuidelinesServiceDescription(String staffManagementProceduresandGuidelinesServiceDescription) {
    this.staffManagementProceduresandGuidelinesServiceDescription = staffManagementProceduresandGuidelinesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return staffManagementProceduresandGuidelinesServiceInputsandOuputs
  **/

  public String getStaffManagementProceduresandGuidelinesServiceInputsandOuputs() {
    return staffManagementProceduresandGuidelinesServiceInputsandOuputs;
  }

  public void setStaffManagementProceduresandGuidelinesServiceInputsandOuputs(String staffManagementProceduresandGuidelinesServiceInputsandOuputs) {
    this.staffManagementProceduresandGuidelinesServiceInputsandOuputs = staffManagementProceduresandGuidelinesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return staffManagementProceduresandGuidelinesServiceWorkProduct
  **/

  public String getStaffManagementProceduresandGuidelinesServiceWorkProduct() {
    return staffManagementProceduresandGuidelinesServiceWorkProduct;
  }

  public void setStaffManagementProceduresandGuidelinesServiceWorkProduct(String staffManagementProceduresandGuidelinesServiceWorkProduct) {
    this.staffManagementProceduresandGuidelinesServiceWorkProduct = staffManagementProceduresandGuidelinesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return staffManagementProceduresandGuidelinesServiceName
  **/

  public String getStaffManagementProceduresandGuidelinesServiceName() {
    return staffManagementProceduresandGuidelinesServiceName;
  }

  public void setStaffManagementProceduresandGuidelinesServiceName(String staffManagementProceduresandGuidelinesServiceName) {
    this.staffManagementProceduresandGuidelinesServiceName = staffManagementProceduresandGuidelinesServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return staffManagementProceduresandGuidelinesUpdateActionTaskReference
  **/

  public String getStaffManagementProceduresandGuidelinesUpdateActionTaskReference() {
    return staffManagementProceduresandGuidelinesUpdateActionTaskReference;
  }

  public void setStaffManagementProceduresandGuidelinesUpdateActionTaskReference(String staffManagementProceduresandGuidelinesUpdateActionTaskReference) {
    this.staffManagementProceduresandGuidelinesUpdateActionTaskReference = staffManagementProceduresandGuidelinesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return staffManagementProceduresandGuidelinesUpdateActionTaskRecord
  **/

  public Object getStaffManagementProceduresandGuidelinesUpdateActionTaskRecord() {
    return staffManagementProceduresandGuidelinesUpdateActionTaskRecord;
  }

  public void setStaffManagementProceduresandGuidelinesUpdateActionTaskRecord(Object staffManagementProceduresandGuidelinesUpdateActionTaskRecord) {
    this.staffManagementProceduresandGuidelinesUpdateActionTaskRecord = staffManagementProceduresandGuidelinesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

