package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis;
import org.bian.dto.BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel   {
  private String operationalandProductionProceduresandGuidelinesPreconditions = null;

  private String operationalandProductionProceduresandGuidelinesSpecificationSchedule = null;

  private String operationalandProductionProceduresandGuidelinesVersionNumber = null;

  private String operationalandProductionProceduresandGuidelines = null;

  private String operationalandProductionProceduresandGuidelinesServiceType = null;

  private String operationalandProductionProceduresandGuidelinesServiceDescription = null;

  private String operationalandProductionProceduresandGuidelinesServiceInputsandOuputs = null;

  private String operationalandProductionProceduresandGuidelinesServiceWorkProduct = null;

  private String operationalandProductionProceduresandGuidelinesServiceName = null;

  private String operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference = null;

  private Object operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord = null;

  private String operationalandProductionProceduresandGuidelinesRetrieveActionResponse = null;

  private BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport operationalandProductionProceduresandGuidelinesInstanceReport = null;

  private BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis operationalandProductionProceduresandGuidelinesInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational and Production Procedures and Guidelines instance retrieve service call 
   * @return operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference
  **/

  public String getOperationalandProductionProceduresandGuidelinesRetrieveActionTaskReference() {
    return operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference;
  }

  public void setOperationalandProductionProceduresandGuidelinesRetrieveActionTaskReference(String operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference) {
    this.operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference = operationalandProductionProceduresandGuidelinesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getOperationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord() {
    return operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord;
  }

  public void setOperationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord(Object operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord) {
    this.operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord = operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return operationalandProductionProceduresandGuidelinesRetrieveActionResponse
  **/

  public String getOperationalandProductionProceduresandGuidelinesRetrieveActionResponse() {
    return operationalandProductionProceduresandGuidelinesRetrieveActionResponse;
  }

  public void setOperationalandProductionProceduresandGuidelinesRetrieveActionResponse(String operationalandProductionProceduresandGuidelinesRetrieveActionResponse) {
    this.operationalandProductionProceduresandGuidelinesRetrieveActionResponse = operationalandProductionProceduresandGuidelinesRetrieveActionResponse;
  }


  /**
   * Get operationalandProductionProceduresandGuidelinesInstanceReport
   * @return operationalandProductionProceduresandGuidelinesInstanceReport
  **/

  public BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport getOperationalandProductionProceduresandGuidelinesInstanceReport() {
    return operationalandProductionProceduresandGuidelinesInstanceReport;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReport(BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport operationalandProductionProceduresandGuidelinesInstanceReport) {
    this.operationalandProductionProceduresandGuidelinesInstanceReport = operationalandProductionProceduresandGuidelinesInstanceReport;
  }


  /**
   * Get operationalandProductionProceduresandGuidelinesInstanceAnalysis
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysis
  **/

  public BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis getOperationalandProductionProceduresandGuidelinesInstanceAnalysis() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysis;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysis(BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis operationalandProductionProceduresandGuidelinesInstanceAnalysis) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysis = operationalandProductionProceduresandGuidelinesInstanceAnalysis;
  }


}

