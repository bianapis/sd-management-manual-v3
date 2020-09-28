package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis;
import org.bian.dto.BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCompanyMissionandPoliciesRetrieveOutputModel
 */
public class BQCompanyMissionandPoliciesRetrieveOutputModel   {
  private String companyMissionandPoliciesPreconditions = null;

  private String companyMissionandPoliciesSpecificationSchedule = null;

  private String companyMissionandPoliciesVersionNumber = null;

  private String companyMissionandPolicies = null;

  private String companyMissionandPoliciesServiceType = null;

  private String companyMissionandPoliciesServiceDescription = null;

  private String companyMissionandPoliciesServiceInputsandOuputs = null;

  private String companyMissionandPoliciesServiceWorkProduct = null;

  private String companyMissionandPoliciesServiceName = null;

  private String companyMissionandPoliciesRetrieveActionTaskReference = null;

  private Object companyMissionandPoliciesRetrieveActionTaskRecord = null;

  private String companyMissionandPoliciesRetrieveActionResponse = null;

  private BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport companyMissionandPoliciesInstanceReport = null;

  private BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis companyMissionandPoliciesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return companyMissionandPoliciesPreconditions
  **/

  public String getCompanyMissionandPoliciesPreconditions() {
    return companyMissionandPoliciesPreconditions;
  }

  public void setCompanyMissionandPoliciesPreconditions(String companyMissionandPoliciesPreconditions) {
    this.companyMissionandPoliciesPreconditions = companyMissionandPoliciesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return companyMissionandPoliciesSpecificationSchedule
  **/

  public String getCompanyMissionandPoliciesSpecificationSchedule() {
    return companyMissionandPoliciesSpecificationSchedule;
  }

  public void setCompanyMissionandPoliciesSpecificationSchedule(String companyMissionandPoliciesSpecificationSchedule) {
    this.companyMissionandPoliciesSpecificationSchedule = companyMissionandPoliciesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return companyMissionandPoliciesVersionNumber
  **/

  public String getCompanyMissionandPoliciesVersionNumber() {
    return companyMissionandPoliciesVersionNumber;
  }

  public void setCompanyMissionandPoliciesVersionNumber(String companyMissionandPoliciesVersionNumber) {
    this.companyMissionandPoliciesVersionNumber = companyMissionandPoliciesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Management Manual Specification specific Business Service 
   * @return companyMissionandPolicies
  **/

  public String getCompanyMissionandPolicies() {
    return companyMissionandPolicies;
  }

  public void setCompanyMissionandPolicies(String companyMissionandPolicies) {
    this.companyMissionandPolicies = companyMissionandPolicies;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return companyMissionandPoliciesServiceType
  **/

  public String getCompanyMissionandPoliciesServiceType() {
    return companyMissionandPoliciesServiceType;
  }

  public void setCompanyMissionandPoliciesServiceType(String companyMissionandPoliciesServiceType) {
    this.companyMissionandPoliciesServiceType = companyMissionandPoliciesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return companyMissionandPoliciesServiceDescription
  **/

  public String getCompanyMissionandPoliciesServiceDescription() {
    return companyMissionandPoliciesServiceDescription;
  }

  public void setCompanyMissionandPoliciesServiceDescription(String companyMissionandPoliciesServiceDescription) {
    this.companyMissionandPoliciesServiceDescription = companyMissionandPoliciesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return companyMissionandPoliciesServiceInputsandOuputs
  **/

  public String getCompanyMissionandPoliciesServiceInputsandOuputs() {
    return companyMissionandPoliciesServiceInputsandOuputs;
  }

  public void setCompanyMissionandPoliciesServiceInputsandOuputs(String companyMissionandPoliciesServiceInputsandOuputs) {
    this.companyMissionandPoliciesServiceInputsandOuputs = companyMissionandPoliciesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return companyMissionandPoliciesServiceWorkProduct
  **/

  public String getCompanyMissionandPoliciesServiceWorkProduct() {
    return companyMissionandPoliciesServiceWorkProduct;
  }

  public void setCompanyMissionandPoliciesServiceWorkProduct(String companyMissionandPoliciesServiceWorkProduct) {
    this.companyMissionandPoliciesServiceWorkProduct = companyMissionandPoliciesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return companyMissionandPoliciesServiceName
  **/

  public String getCompanyMissionandPoliciesServiceName() {
    return companyMissionandPoliciesServiceName;
  }

  public void setCompanyMissionandPoliciesServiceName(String companyMissionandPoliciesServiceName) {
    this.companyMissionandPoliciesServiceName = companyMissionandPoliciesServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Company Mission and Policies instance retrieve service call 
   * @return companyMissionandPoliciesRetrieveActionTaskReference
  **/

  public String getCompanyMissionandPoliciesRetrieveActionTaskReference() {
    return companyMissionandPoliciesRetrieveActionTaskReference;
  }

  public void setCompanyMissionandPoliciesRetrieveActionTaskReference(String companyMissionandPoliciesRetrieveActionTaskReference) {
    this.companyMissionandPoliciesRetrieveActionTaskReference = companyMissionandPoliciesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return companyMissionandPoliciesRetrieveActionTaskRecord
  **/

  public Object getCompanyMissionandPoliciesRetrieveActionTaskRecord() {
    return companyMissionandPoliciesRetrieveActionTaskRecord;
  }

  public void setCompanyMissionandPoliciesRetrieveActionTaskRecord(Object companyMissionandPoliciesRetrieveActionTaskRecord) {
    this.companyMissionandPoliciesRetrieveActionTaskRecord = companyMissionandPoliciesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return companyMissionandPoliciesRetrieveActionResponse
  **/

  public String getCompanyMissionandPoliciesRetrieveActionResponse() {
    return companyMissionandPoliciesRetrieveActionResponse;
  }

  public void setCompanyMissionandPoliciesRetrieveActionResponse(String companyMissionandPoliciesRetrieveActionResponse) {
    this.companyMissionandPoliciesRetrieveActionResponse = companyMissionandPoliciesRetrieveActionResponse;
  }


  /**
   * Get companyMissionandPoliciesInstanceReport
   * @return companyMissionandPoliciesInstanceReport
  **/

  public BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport getCompanyMissionandPoliciesInstanceReport() {
    return companyMissionandPoliciesInstanceReport;
  }

  public void setCompanyMissionandPoliciesInstanceReport(BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport companyMissionandPoliciesInstanceReport) {
    this.companyMissionandPoliciesInstanceReport = companyMissionandPoliciesInstanceReport;
  }


  /**
   * Get companyMissionandPoliciesInstanceAnalysis
   * @return companyMissionandPoliciesInstanceAnalysis
  **/

  public BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis getCompanyMissionandPoliciesInstanceAnalysis() {
    return companyMissionandPoliciesInstanceAnalysis;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysis(BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis companyMissionandPoliciesInstanceAnalysis) {
    this.companyMissionandPoliciesInstanceAnalysis = companyMissionandPoliciesInstanceAnalysis;
  }


}

