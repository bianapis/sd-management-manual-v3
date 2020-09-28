package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRetrieveOutputModelManagementManualSpecificationInstanceReportRecord
 */
public class CRManagementManualSpecificationRetrieveOutputModelManagementManualSpecificationInstanceReportRecord   {
  private String managementManualSpecificationInstanceReportData = null;

  private String managementManualSpecificationInstanceReportType = null;

  private Object managementManualSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return managementManualSpecificationInstanceReportData
  **/

  public String getManagementManualSpecificationInstanceReportData() {
    return managementManualSpecificationInstanceReportData;
  }

  public void setManagementManualSpecificationInstanceReportData(String managementManualSpecificationInstanceReportData) {
    this.managementManualSpecificationInstanceReportData = managementManualSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return managementManualSpecificationInstanceReportType
  **/

  public String getManagementManualSpecificationInstanceReportType() {
    return managementManualSpecificationInstanceReportType;
  }

  public void setManagementManualSpecificationInstanceReportType(String managementManualSpecificationInstanceReportType) {
    this.managementManualSpecificationInstanceReportType = managementManualSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return managementManualSpecificationInstanceReport
  **/

  public Object getManagementManualSpecificationInstanceReport() {
    return managementManualSpecificationInstanceReport;
  }

  public void setManagementManualSpecificationInstanceReport(Object managementManualSpecificationInstanceReport) {
    this.managementManualSpecificationInstanceReport = managementManualSpecificationInstanceReport;
  }


}

