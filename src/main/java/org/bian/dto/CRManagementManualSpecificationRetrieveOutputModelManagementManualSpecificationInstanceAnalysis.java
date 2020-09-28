package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRetrieveOutputModelManagementManualSpecificationInstanceAnalysis
 */
public class CRManagementManualSpecificationRetrieveOutputModelManagementManualSpecificationInstanceAnalysis   {
  private String managementManualSpecificationInstanceAnalysisData = null;

  private String managementManualSpecificationInstanceAnalysisReportType = null;

  private Object managementManualSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return managementManualSpecificationInstanceAnalysisData
  **/

  public String getManagementManualSpecificationInstanceAnalysisData() {
    return managementManualSpecificationInstanceAnalysisData;
  }

  public void setManagementManualSpecificationInstanceAnalysisData(String managementManualSpecificationInstanceAnalysisData) {
    this.managementManualSpecificationInstanceAnalysisData = managementManualSpecificationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return managementManualSpecificationInstanceAnalysisReportType
  **/

  public String getManagementManualSpecificationInstanceAnalysisReportType() {
    return managementManualSpecificationInstanceAnalysisReportType;
  }

  public void setManagementManualSpecificationInstanceAnalysisReportType(String managementManualSpecificationInstanceAnalysisReportType) {
    this.managementManualSpecificationInstanceAnalysisReportType = managementManualSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return managementManualSpecificationInstanceAnalysisReport
  **/

  public Object getManagementManualSpecificationInstanceAnalysisReport() {
    return managementManualSpecificationInstanceAnalysisReport;
  }

  public void setManagementManualSpecificationInstanceAnalysisReport(Object managementManualSpecificationInstanceAnalysisReport) {
    this.managementManualSpecificationInstanceAnalysisReport = managementManualSpecificationInstanceAnalysisReport;
  }


}

