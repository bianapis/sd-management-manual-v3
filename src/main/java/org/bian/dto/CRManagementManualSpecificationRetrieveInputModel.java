package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis;
import org.bian.dto.CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRetrieveInputModel
 */
public class CRManagementManualSpecificationRetrieveInputModel   {
  private Object managementManualSpecificationRetrieveActionTaskRecord = null;

  private String managementManualSpecificationRetrieveActionRequest = null;

  private CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord managementManualSpecificationInstanceReportRecord = null;

  private CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis managementManualSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return managementManualSpecificationRetrieveActionTaskRecord
  **/

  public Object getManagementManualSpecificationRetrieveActionTaskRecord() {
    return managementManualSpecificationRetrieveActionTaskRecord;
  }

  public void setManagementManualSpecificationRetrieveActionTaskRecord(Object managementManualSpecificationRetrieveActionTaskRecord) {
    this.managementManualSpecificationRetrieveActionTaskRecord = managementManualSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return managementManualSpecificationRetrieveActionRequest
  **/

  public String getManagementManualSpecificationRetrieveActionRequest() {
    return managementManualSpecificationRetrieveActionRequest;
  }

  public void setManagementManualSpecificationRetrieveActionRequest(String managementManualSpecificationRetrieveActionRequest) {
    this.managementManualSpecificationRetrieveActionRequest = managementManualSpecificationRetrieveActionRequest;
  }


  /**
   * Get managementManualSpecificationInstanceReportRecord
   * @return managementManualSpecificationInstanceReportRecord
  **/

  public CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord getManagementManualSpecificationInstanceReportRecord() {
    return managementManualSpecificationInstanceReportRecord;
  }

  public void setManagementManualSpecificationInstanceReportRecord(CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord managementManualSpecificationInstanceReportRecord) {
    this.managementManualSpecificationInstanceReportRecord = managementManualSpecificationInstanceReportRecord;
  }


  /**
   * Get managementManualSpecificationInstanceAnalysis
   * @return managementManualSpecificationInstanceAnalysis
  **/

  public CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis getManagementManualSpecificationInstanceAnalysis() {
    return managementManualSpecificationInstanceAnalysis;
  }

  public void setManagementManualSpecificationInstanceAnalysis(CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis managementManualSpecificationInstanceAnalysis) {
    this.managementManualSpecificationInstanceAnalysis = managementManualSpecificationInstanceAnalysis;
  }


}

