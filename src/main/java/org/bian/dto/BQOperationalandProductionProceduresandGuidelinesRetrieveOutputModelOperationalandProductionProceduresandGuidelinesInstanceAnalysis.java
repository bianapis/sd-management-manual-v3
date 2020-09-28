package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis   {
  private Object operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord = null;

  private String operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType = null;

  private String operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters = null;

  private Object operationalandProductionProceduresandGuidelinesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord
  **/

  public Object getOperationalandProductionProceduresandGuidelinesInstanceAnalysisRecord() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysisRecord(Object operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord = operationalandProductionProceduresandGuidelinesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceAnalysisReportType() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysisReportType(String operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType = operationalandProductionProceduresandGuidelinesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceAnalysisParameters() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysisParameters(String operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters = operationalandProductionProceduresandGuidelinesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysisReport
  **/

  public Object getOperationalandProductionProceduresandGuidelinesInstanceAnalysisReport() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysisReport;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysisReport(Object operationalandProductionProceduresandGuidelinesInstanceAnalysisReport) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysisReport = operationalandProductionProceduresandGuidelinesInstanceAnalysisReport;
  }


}

