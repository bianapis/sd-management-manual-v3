package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis;
import org.bian.dto.BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel   {
  private String employmentRelatedProceduresandGuidelinesPreconditions = null;

  private String employmentRelatedProceduresandGuidelinesSpecificationSchedule = null;

  private String employmentRelatedProceduresandGuidelinesVersionNumber = null;

  private String employmentRelatedProceduresandGuidelines = null;

  private String employmentRelatedProceduresandGuidelinesServiceType = null;

  private String employmentRelatedProceduresandGuidelinesServiceDescription = null;

  private String employmentRelatedProceduresandGuidelinesServiceInputsandOuputs = null;

  private String employmentRelatedProceduresandGuidelinesServiceWorkProduct = null;

  private String employmentRelatedProceduresandGuidelinesServiceName = null;

  private String employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference = null;

  private Object employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord = null;

  private String employmentRelatedProceduresandGuidelinesRetrieveActionResponse = null;

  private BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport employmentRelatedProceduresandGuidelinesInstanceReport = null;

  private BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis employmentRelatedProceduresandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return employmentRelatedProceduresandGuidelinesPreconditions
  **/

  public String getEmploymentRelatedProceduresandGuidelinesPreconditions() {
    return employmentRelatedProceduresandGuidelinesPreconditions;
  }

  public void setEmploymentRelatedProceduresandGuidelinesPreconditions(String employmentRelatedProceduresandGuidelinesPreconditions) {
    this.employmentRelatedProceduresandGuidelinesPreconditions = employmentRelatedProceduresandGuidelinesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return employmentRelatedProceduresandGuidelinesSpecificationSchedule
  **/

  public String getEmploymentRelatedProceduresandGuidelinesSpecificationSchedule() {
    return employmentRelatedProceduresandGuidelinesSpecificationSchedule;
  }

  public void setEmploymentRelatedProceduresandGuidelinesSpecificationSchedule(String employmentRelatedProceduresandGuidelinesSpecificationSchedule) {
    this.employmentRelatedProceduresandGuidelinesSpecificationSchedule = employmentRelatedProceduresandGuidelinesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return employmentRelatedProceduresandGuidelinesVersionNumber
  **/

  public String getEmploymentRelatedProceduresandGuidelinesVersionNumber() {
    return employmentRelatedProceduresandGuidelinesVersionNumber;
  }

  public void setEmploymentRelatedProceduresandGuidelinesVersionNumber(String employmentRelatedProceduresandGuidelinesVersionNumber) {
    this.employmentRelatedProceduresandGuidelinesVersionNumber = employmentRelatedProceduresandGuidelinesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Management Manual Specification specific Business Service 
   * @return employmentRelatedProceduresandGuidelines
  **/

  public String getEmploymentRelatedProceduresandGuidelines() {
    return employmentRelatedProceduresandGuidelines;
  }

  public void setEmploymentRelatedProceduresandGuidelines(String employmentRelatedProceduresandGuidelines) {
    this.employmentRelatedProceduresandGuidelines = employmentRelatedProceduresandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return employmentRelatedProceduresandGuidelinesServiceType
  **/

  public String getEmploymentRelatedProceduresandGuidelinesServiceType() {
    return employmentRelatedProceduresandGuidelinesServiceType;
  }

  public void setEmploymentRelatedProceduresandGuidelinesServiceType(String employmentRelatedProceduresandGuidelinesServiceType) {
    this.employmentRelatedProceduresandGuidelinesServiceType = employmentRelatedProceduresandGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return employmentRelatedProceduresandGuidelinesServiceDescription
  **/

  public String getEmploymentRelatedProceduresandGuidelinesServiceDescription() {
    return employmentRelatedProceduresandGuidelinesServiceDescription;
  }

  public void setEmploymentRelatedProceduresandGuidelinesServiceDescription(String employmentRelatedProceduresandGuidelinesServiceDescription) {
    this.employmentRelatedProceduresandGuidelinesServiceDescription = employmentRelatedProceduresandGuidelinesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return employmentRelatedProceduresandGuidelinesServiceInputsandOuputs
  **/

  public String getEmploymentRelatedProceduresandGuidelinesServiceInputsandOuputs() {
    return employmentRelatedProceduresandGuidelinesServiceInputsandOuputs;
  }

  public void setEmploymentRelatedProceduresandGuidelinesServiceInputsandOuputs(String employmentRelatedProceduresandGuidelinesServiceInputsandOuputs) {
    this.employmentRelatedProceduresandGuidelinesServiceInputsandOuputs = employmentRelatedProceduresandGuidelinesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return employmentRelatedProceduresandGuidelinesServiceWorkProduct
  **/

  public String getEmploymentRelatedProceduresandGuidelinesServiceWorkProduct() {
    return employmentRelatedProceduresandGuidelinesServiceWorkProduct;
  }

  public void setEmploymentRelatedProceduresandGuidelinesServiceWorkProduct(String employmentRelatedProceduresandGuidelinesServiceWorkProduct) {
    this.employmentRelatedProceduresandGuidelinesServiceWorkProduct = employmentRelatedProceduresandGuidelinesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return employmentRelatedProceduresandGuidelinesServiceName
  **/

  public String getEmploymentRelatedProceduresandGuidelinesServiceName() {
    return employmentRelatedProceduresandGuidelinesServiceName;
  }

  public void setEmploymentRelatedProceduresandGuidelinesServiceName(String employmentRelatedProceduresandGuidelinesServiceName) {
    this.employmentRelatedProceduresandGuidelinesServiceName = employmentRelatedProceduresandGuidelinesServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Employment Related Procedures and Guidelines instance retrieve service call 
   * @return employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference
  **/

  public String getEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskReference() {
    return employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference;
  }

  public void setEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskReference(String employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference) {
    this.employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference = employmentRelatedProceduresandGuidelinesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskRecord() {
    return employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord;
  }

  public void setEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskRecord(Object employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord) {
    this.employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord = employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return employmentRelatedProceduresandGuidelinesRetrieveActionResponse
  **/

  public String getEmploymentRelatedProceduresandGuidelinesRetrieveActionResponse() {
    return employmentRelatedProceduresandGuidelinesRetrieveActionResponse;
  }

  public void setEmploymentRelatedProceduresandGuidelinesRetrieveActionResponse(String employmentRelatedProceduresandGuidelinesRetrieveActionResponse) {
    this.employmentRelatedProceduresandGuidelinesRetrieveActionResponse = employmentRelatedProceduresandGuidelinesRetrieveActionResponse;
  }


  /**
   * Get employmentRelatedProceduresandGuidelinesInstanceReport
   * @return employmentRelatedProceduresandGuidelinesInstanceReport
  **/

  public BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport getEmploymentRelatedProceduresandGuidelinesInstanceReport() {
    return employmentRelatedProceduresandGuidelinesInstanceReport;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReport(BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport employmentRelatedProceduresandGuidelinesInstanceReport) {
    this.employmentRelatedProceduresandGuidelinesInstanceReport = employmentRelatedProceduresandGuidelinesInstanceReport;
  }


  /**
   * Get employmentRelatedProceduresandGuidelinesInstanceAnalysis
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysis
  **/

  public BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis getEmploymentRelatedProceduresandGuidelinesInstanceAnalysis() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysis;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysis(BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis employmentRelatedProceduresandGuidelinesInstanceAnalysis) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysis = employmentRelatedProceduresandGuidelinesInstanceAnalysis;
  }


}

