package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport
 */
public class BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport   {
  private Object legalandRegulatoryObligationsandGuidelinesInstanceReportRecord = null;

  private String legalandRegulatoryObligationsandGuidelinesInstanceReportType = null;

  private String legalandRegulatoryObligationsandGuidelinesInstanceReportParameters = null;

  private Object legalandRegulatoryObligationsandGuidelinesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReportRecord
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesInstanceReportRecord() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReportRecord;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReportRecord(Object legalandRegulatoryObligationsandGuidelinesInstanceReportRecord) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReportRecord = legalandRegulatoryObligationsandGuidelinesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReportType
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesInstanceReportType() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReportType;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReportType(String legalandRegulatoryObligationsandGuidelinesInstanceReportType) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReportType = legalandRegulatoryObligationsandGuidelinesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReportParameters
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesInstanceReportParameters() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReportParameters;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReportParameters(String legalandRegulatoryObligationsandGuidelinesInstanceReportParameters) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReportParameters = legalandRegulatoryObligationsandGuidelinesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReport
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesInstanceReport() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReport;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReport(Object legalandRegulatoryObligationsandGuidelinesInstanceReport) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReport = legalandRegulatoryObligationsandGuidelinesInstanceReport;
  }


}

