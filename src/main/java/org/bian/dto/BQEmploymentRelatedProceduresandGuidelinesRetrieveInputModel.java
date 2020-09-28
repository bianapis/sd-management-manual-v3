package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis;
import org.bian.dto.BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModel
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModel   {
  private Object employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord = null;

  private String employmentRelatedProceduresandGuidelinesRetrieveActionRequest = null;

  private BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport employmentRelatedProceduresandGuidelinesInstanceReport = null;

  private BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis employmentRelatedProceduresandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskRecord() {
    return employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord;
  }

  public void setEmploymentRelatedProceduresandGuidelinesRetrieveActionTaskRecord(Object employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord) {
    this.employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord = employmentRelatedProceduresandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return employmentRelatedProceduresandGuidelinesRetrieveActionRequest
  **/

  public String getEmploymentRelatedProceduresandGuidelinesRetrieveActionRequest() {
    return employmentRelatedProceduresandGuidelinesRetrieveActionRequest;
  }

  public void setEmploymentRelatedProceduresandGuidelinesRetrieveActionRequest(String employmentRelatedProceduresandGuidelinesRetrieveActionRequest) {
    this.employmentRelatedProceduresandGuidelinesRetrieveActionRequest = employmentRelatedProceduresandGuidelinesRetrieveActionRequest;
  }


  /**
   * Get employmentRelatedProceduresandGuidelinesInstanceReport
   * @return employmentRelatedProceduresandGuidelinesInstanceReport
  **/

  public BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport getEmploymentRelatedProceduresandGuidelinesInstanceReport() {
    return employmentRelatedProceduresandGuidelinesInstanceReport;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReport(BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport employmentRelatedProceduresandGuidelinesInstanceReport) {
    this.employmentRelatedProceduresandGuidelinesInstanceReport = employmentRelatedProceduresandGuidelinesInstanceReport;
  }


  /**
   * Get employmentRelatedProceduresandGuidelinesInstanceAnalysis
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysis
  **/

  public BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis getEmploymentRelatedProceduresandGuidelinesInstanceAnalysis() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysis;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysis(BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis employmentRelatedProceduresandGuidelinesInstanceAnalysis) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysis = employmentRelatedProceduresandGuidelinesInstanceAnalysis;
  }


}

