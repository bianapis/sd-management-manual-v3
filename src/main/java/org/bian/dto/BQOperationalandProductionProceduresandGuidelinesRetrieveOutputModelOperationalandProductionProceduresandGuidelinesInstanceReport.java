package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModelOperationalandProductionProceduresandGuidelinesInstanceReport   {
  private Object operationalandProductionProceduresandGuidelinesInstanceReportRecord = null;

  private String operationalandProductionProceduresandGuidelinesInstanceReportType = null;

  private String operationalandProductionProceduresandGuidelinesInstanceReportParameters = null;

  private Object operationalandProductionProceduresandGuidelinesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return operationalandProductionProceduresandGuidelinesInstanceReportRecord
  **/

  public Object getOperationalandProductionProceduresandGuidelinesInstanceReportRecord() {
    return operationalandProductionProceduresandGuidelinesInstanceReportRecord;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReportRecord(Object operationalandProductionProceduresandGuidelinesInstanceReportRecord) {
    this.operationalandProductionProceduresandGuidelinesInstanceReportRecord = operationalandProductionProceduresandGuidelinesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return operationalandProductionProceduresandGuidelinesInstanceReportType
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceReportType() {
    return operationalandProductionProceduresandGuidelinesInstanceReportType;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReportType(String operationalandProductionProceduresandGuidelinesInstanceReportType) {
    this.operationalandProductionProceduresandGuidelinesInstanceReportType = operationalandProductionProceduresandGuidelinesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return operationalandProductionProceduresandGuidelinesInstanceReportParameters
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceReportParameters() {
    return operationalandProductionProceduresandGuidelinesInstanceReportParameters;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReportParameters(String operationalandProductionProceduresandGuidelinesInstanceReportParameters) {
    this.operationalandProductionProceduresandGuidelinesInstanceReportParameters = operationalandProductionProceduresandGuidelinesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return operationalandProductionProceduresandGuidelinesInstanceReport
  **/

  public Object getOperationalandProductionProceduresandGuidelinesInstanceReport() {
    return operationalandProductionProceduresandGuidelinesInstanceReport;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReport(Object operationalandProductionProceduresandGuidelinesInstanceReport) {
    this.operationalandProductionProceduresandGuidelinesInstanceReport = operationalandProductionProceduresandGuidelinesInstanceReport;
  }


}

