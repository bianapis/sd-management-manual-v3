package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceAnalysis;
import org.bian.dto.BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStaffManagementProceduresandGuidelinesRetrieveInputModel
 */
public class BQStaffManagementProceduresandGuidelinesRetrieveInputModel   {
  private Object staffManagementProceduresandGuidelinesRetrieveActionTaskRecord = null;

  private String staffManagementProceduresandGuidelinesRetrieveActionRequest = null;

  private BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport staffManagementProceduresandGuidelinesInstanceReport = null;

  private BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceAnalysis staffManagementProceduresandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return staffManagementProceduresandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getStaffManagementProceduresandGuidelinesRetrieveActionTaskRecord() {
    return staffManagementProceduresandGuidelinesRetrieveActionTaskRecord;
  }

  public void setStaffManagementProceduresandGuidelinesRetrieveActionTaskRecord(Object staffManagementProceduresandGuidelinesRetrieveActionTaskRecord) {
    this.staffManagementProceduresandGuidelinesRetrieveActionTaskRecord = staffManagementProceduresandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return staffManagementProceduresandGuidelinesRetrieveActionRequest
  **/

  public String getStaffManagementProceduresandGuidelinesRetrieveActionRequest() {
    return staffManagementProceduresandGuidelinesRetrieveActionRequest;
  }

  public void setStaffManagementProceduresandGuidelinesRetrieveActionRequest(String staffManagementProceduresandGuidelinesRetrieveActionRequest) {
    this.staffManagementProceduresandGuidelinesRetrieveActionRequest = staffManagementProceduresandGuidelinesRetrieveActionRequest;
  }


  /**
   * Get staffManagementProceduresandGuidelinesInstanceReport
   * @return staffManagementProceduresandGuidelinesInstanceReport
  **/

  public BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport getStaffManagementProceduresandGuidelinesInstanceReport() {
    return staffManagementProceduresandGuidelinesInstanceReport;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReport(BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport staffManagementProceduresandGuidelinesInstanceReport) {
    this.staffManagementProceduresandGuidelinesInstanceReport = staffManagementProceduresandGuidelinesInstanceReport;
  }


  /**
   * Get staffManagementProceduresandGuidelinesInstanceAnalysis
   * @return staffManagementProceduresandGuidelinesInstanceAnalysis
  **/

  public BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceAnalysis getStaffManagementProceduresandGuidelinesInstanceAnalysis() {
    return staffManagementProceduresandGuidelinesInstanceAnalysis;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceAnalysis(BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceAnalysis staffManagementProceduresandGuidelinesInstanceAnalysis) {
    this.staffManagementProceduresandGuidelinesInstanceAnalysis = staffManagementProceduresandGuidelinesInstanceAnalysis;
  }


}

