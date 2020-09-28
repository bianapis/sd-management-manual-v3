package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis
 */
public class BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceAnalysis   {
  private Object companyMissionandPoliciesInstanceAnalysisRecord = null;

  private String companyMissionandPoliciesInstanceAnalysisReportType = null;

  private String companyMissionandPoliciesInstanceAnalysisParameters = null;

  private Object companyMissionandPoliciesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return companyMissionandPoliciesInstanceAnalysisRecord
  **/

  public Object getCompanyMissionandPoliciesInstanceAnalysisRecord() {
    return companyMissionandPoliciesInstanceAnalysisRecord;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysisRecord(Object companyMissionandPoliciesInstanceAnalysisRecord) {
    this.companyMissionandPoliciesInstanceAnalysisRecord = companyMissionandPoliciesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return companyMissionandPoliciesInstanceAnalysisReportType
  **/

  public String getCompanyMissionandPoliciesInstanceAnalysisReportType() {
    return companyMissionandPoliciesInstanceAnalysisReportType;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysisReportType(String companyMissionandPoliciesInstanceAnalysisReportType) {
    this.companyMissionandPoliciesInstanceAnalysisReportType = companyMissionandPoliciesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return companyMissionandPoliciesInstanceAnalysisParameters
  **/

  public String getCompanyMissionandPoliciesInstanceAnalysisParameters() {
    return companyMissionandPoliciesInstanceAnalysisParameters;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysisParameters(String companyMissionandPoliciesInstanceAnalysisParameters) {
    this.companyMissionandPoliciesInstanceAnalysisParameters = companyMissionandPoliciesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return companyMissionandPoliciesInstanceAnalysisReport
  **/

  public Object getCompanyMissionandPoliciesInstanceAnalysisReport() {
    return companyMissionandPoliciesInstanceAnalysisReport;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysisReport(Object companyMissionandPoliciesInstanceAnalysisReport) {
    this.companyMissionandPoliciesInstanceAnalysisReport = companyMissionandPoliciesInstanceAnalysisReport;
  }


}

