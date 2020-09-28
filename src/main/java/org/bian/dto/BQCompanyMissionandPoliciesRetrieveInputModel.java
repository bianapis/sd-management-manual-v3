package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis;
import org.bian.dto.BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCompanyMissionandPoliciesRetrieveInputModel
 */
public class BQCompanyMissionandPoliciesRetrieveInputModel   {
  private Object companyMissionandPoliciesRetrieveActionTaskRecord = null;

  private String companyMissionandPoliciesRetrieveActionRequest = null;

  private BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceReport companyMissionandPoliciesInstanceReport = null;

  private BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis companyMissionandPoliciesInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return companyMissionandPoliciesRetrieveActionRequest
  **/

  public String getCompanyMissionandPoliciesRetrieveActionRequest() {
    return companyMissionandPoliciesRetrieveActionRequest;
  }

  public void setCompanyMissionandPoliciesRetrieveActionRequest(String companyMissionandPoliciesRetrieveActionRequest) {
    this.companyMissionandPoliciesRetrieveActionRequest = companyMissionandPoliciesRetrieveActionRequest;
  }


  /**
   * Get companyMissionandPoliciesInstanceReport
   * @return companyMissionandPoliciesInstanceReport
  **/

  public BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceReport getCompanyMissionandPoliciesInstanceReport() {
    return companyMissionandPoliciesInstanceReport;
  }

  public void setCompanyMissionandPoliciesInstanceReport(BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceReport companyMissionandPoliciesInstanceReport) {
    this.companyMissionandPoliciesInstanceReport = companyMissionandPoliciesInstanceReport;
  }


  /**
   * Get companyMissionandPoliciesInstanceAnalysis
   * @return companyMissionandPoliciesInstanceAnalysis
  **/

  public BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis getCompanyMissionandPoliciesInstanceAnalysis() {
    return companyMissionandPoliciesInstanceAnalysis;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysis(BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis companyMissionandPoliciesInstanceAnalysis) {
    this.companyMissionandPoliciesInstanceAnalysis = companyMissionandPoliciesInstanceAnalysis;
  }


}

