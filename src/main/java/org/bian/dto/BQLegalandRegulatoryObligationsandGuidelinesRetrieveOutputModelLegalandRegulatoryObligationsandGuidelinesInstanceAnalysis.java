package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis
 */
public class BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis   {
  private Object legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord = null;

  private String legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType = null;

  private String legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters = null;

  private Object legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord() {
    return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord(Object legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord = legalandRegulatoryObligationsandGuidelinesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType() {
    return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType(String legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType = legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters() {
    return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters(String legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters = legalandRegulatoryObligationsandGuidelinesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport() {
    return legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport(Object legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport = legalandRegulatoryObligationsandGuidelinesInstanceAnalysisReport;
  }


}

