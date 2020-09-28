package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffManagementProceduresandGuidelinesRetrieveOutputModelStaffManagementProceduresandGuidelinesInstanceAnalysis
 */
public class BQStaffManagementProceduresandGuidelinesRetrieveOutputModelStaffManagementProceduresandGuidelinesInstanceAnalysis   {
  private Object staffManagementProceduresandGuidelinesInstanceAnalysisRecord = null;

  private String staffManagementProceduresandGuidelinesInstanceAnalysisReportType = null;

  private String staffManagementProceduresandGuidelinesInstanceAnalysisParameters = null;

  private Object staffManagementProceduresandGuidelinesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return staffManagementProceduresandGuidelinesInstanceAnalysisRecord
  **/

  public Object getStaffManagementProceduresandGuidelinesInstanceAnalysisRecord() {
    return staffManagementProceduresandGuidelinesInstanceAnalysisRecord;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceAnalysisRecord(Object staffManagementProceduresandGuidelinesInstanceAnalysisRecord) {
    this.staffManagementProceduresandGuidelinesInstanceAnalysisRecord = staffManagementProceduresandGuidelinesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return staffManagementProceduresandGuidelinesInstanceAnalysisReportType
  **/

  public String getStaffManagementProceduresandGuidelinesInstanceAnalysisReportType() {
    return staffManagementProceduresandGuidelinesInstanceAnalysisReportType;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceAnalysisReportType(String staffManagementProceduresandGuidelinesInstanceAnalysisReportType) {
    this.staffManagementProceduresandGuidelinesInstanceAnalysisReportType = staffManagementProceduresandGuidelinesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return staffManagementProceduresandGuidelinesInstanceAnalysisParameters
  **/

  public String getStaffManagementProceduresandGuidelinesInstanceAnalysisParameters() {
    return staffManagementProceduresandGuidelinesInstanceAnalysisParameters;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceAnalysisParameters(String staffManagementProceduresandGuidelinesInstanceAnalysisParameters) {
    this.staffManagementProceduresandGuidelinesInstanceAnalysisParameters = staffManagementProceduresandGuidelinesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return staffManagementProceduresandGuidelinesInstanceAnalysisReport
  **/

  public Object getStaffManagementProceduresandGuidelinesInstanceAnalysisReport() {
    return staffManagementProceduresandGuidelinesInstanceAnalysisReport;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceAnalysisReport(Object staffManagementProceduresandGuidelinesInstanceAnalysisReport) {
    this.staffManagementProceduresandGuidelinesInstanceAnalysisReport = staffManagementProceduresandGuidelinesInstanceAnalysisReport;
  }


}

