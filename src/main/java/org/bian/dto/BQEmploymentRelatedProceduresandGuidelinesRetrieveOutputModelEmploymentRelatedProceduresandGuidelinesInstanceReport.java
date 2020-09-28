package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModelEmploymentRelatedProceduresandGuidelinesInstanceReport   {
  private Object employmentRelatedProceduresandGuidelinesInstanceReportRecord = null;

  private String employmentRelatedProceduresandGuidelinesInstanceReportType = null;

  private String employmentRelatedProceduresandGuidelinesInstanceReportParameters = null;

  private Object employmentRelatedProceduresandGuidelinesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return employmentRelatedProceduresandGuidelinesInstanceReportRecord
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesInstanceReportRecord() {
    return employmentRelatedProceduresandGuidelinesInstanceReportRecord;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReportRecord(Object employmentRelatedProceduresandGuidelinesInstanceReportRecord) {
    this.employmentRelatedProceduresandGuidelinesInstanceReportRecord = employmentRelatedProceduresandGuidelinesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return employmentRelatedProceduresandGuidelinesInstanceReportType
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceReportType() {
    return employmentRelatedProceduresandGuidelinesInstanceReportType;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReportType(String employmentRelatedProceduresandGuidelinesInstanceReportType) {
    this.employmentRelatedProceduresandGuidelinesInstanceReportType = employmentRelatedProceduresandGuidelinesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return employmentRelatedProceduresandGuidelinesInstanceReportParameters
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceReportParameters() {
    return employmentRelatedProceduresandGuidelinesInstanceReportParameters;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReportParameters(String employmentRelatedProceduresandGuidelinesInstanceReportParameters) {
    this.employmentRelatedProceduresandGuidelinesInstanceReportParameters = employmentRelatedProceduresandGuidelinesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return employmentRelatedProceduresandGuidelinesInstanceReport
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesInstanceReport() {
    return employmentRelatedProceduresandGuidelinesInstanceReport;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReport(Object employmentRelatedProceduresandGuidelinesInstanceReport) {
    this.employmentRelatedProceduresandGuidelinesInstanceReport = employmentRelatedProceduresandGuidelinesInstanceReport;
  }


}

