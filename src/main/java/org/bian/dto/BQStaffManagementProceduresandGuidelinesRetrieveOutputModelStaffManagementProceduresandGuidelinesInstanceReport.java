package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffManagementProceduresandGuidelinesRetrieveOutputModelStaffManagementProceduresandGuidelinesInstanceReport
 */
public class BQStaffManagementProceduresandGuidelinesRetrieveOutputModelStaffManagementProceduresandGuidelinesInstanceReport   {
  private Object staffManagementProceduresandGuidelinesInstanceReportRecord = null;

  private String staffManagementProceduresandGuidelinesInstanceReportType = null;

  private String staffManagementProceduresandGuidelinesInstanceReportParameters = null;

  private Object staffManagementProceduresandGuidelinesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return staffManagementProceduresandGuidelinesInstanceReportRecord
  **/

  public Object getStaffManagementProceduresandGuidelinesInstanceReportRecord() {
    return staffManagementProceduresandGuidelinesInstanceReportRecord;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReportRecord(Object staffManagementProceduresandGuidelinesInstanceReportRecord) {
    this.staffManagementProceduresandGuidelinesInstanceReportRecord = staffManagementProceduresandGuidelinesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return staffManagementProceduresandGuidelinesInstanceReportType
  **/

  public String getStaffManagementProceduresandGuidelinesInstanceReportType() {
    return staffManagementProceduresandGuidelinesInstanceReportType;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReportType(String staffManagementProceduresandGuidelinesInstanceReportType) {
    this.staffManagementProceduresandGuidelinesInstanceReportType = staffManagementProceduresandGuidelinesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return staffManagementProceduresandGuidelinesInstanceReportParameters
  **/

  public String getStaffManagementProceduresandGuidelinesInstanceReportParameters() {
    return staffManagementProceduresandGuidelinesInstanceReportParameters;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReportParameters(String staffManagementProceduresandGuidelinesInstanceReportParameters) {
    this.staffManagementProceduresandGuidelinesInstanceReportParameters = staffManagementProceduresandGuidelinesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return staffManagementProceduresandGuidelinesInstanceReport
  **/

  public Object getStaffManagementProceduresandGuidelinesInstanceReport() {
    return staffManagementProceduresandGuidelinesInstanceReport;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReport(Object staffManagementProceduresandGuidelinesInstanceReport) {
    this.staffManagementProceduresandGuidelinesInstanceReport = staffManagementProceduresandGuidelinesInstanceReport;
  }


}

