package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis   {
  private Object employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord = null;

  private String employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType = null;

  private String employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters = null;

  private Object employmentRelatedProceduresandGuidelinesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesInstanceAnalysisRecord() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysisRecord(Object employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord = employmentRelatedProceduresandGuidelinesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReportType() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReportType(String employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType = employmentRelatedProceduresandGuidelinesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceAnalysisParameters() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysisParameters(String employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters = employmentRelatedProceduresandGuidelinesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysisReport
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReport() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysisReport;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReport(Object employmentRelatedProceduresandGuidelinesInstanceAnalysisReport) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysisReport = employmentRelatedProceduresandGuidelinesInstanceAnalysisReport;
  }


}

