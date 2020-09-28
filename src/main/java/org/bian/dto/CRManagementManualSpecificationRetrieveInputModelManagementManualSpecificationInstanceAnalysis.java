package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis
 */
public class CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceAnalysis   {
  private String managementManualSpecificationInstanceAnalysisReference = null;

  private String managementManualSpecificationInstanceAnalysisReportType = null;

  private String managementManualSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return managementManualSpecificationInstanceAnalysisReference
  **/

  public String getManagementManualSpecificationInstanceAnalysisReference() {
    return managementManualSpecificationInstanceAnalysisReference;
  }

  public void setManagementManualSpecificationInstanceAnalysisReference(String managementManualSpecificationInstanceAnalysisReference) {
    this.managementManualSpecificationInstanceAnalysisReference = managementManualSpecificationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return managementManualSpecificationInstanceAnalysisParameters
  **/

  public String getManagementManualSpecificationInstanceAnalysisParameters() {
    return managementManualSpecificationInstanceAnalysisParameters;
  }

  public void setManagementManualSpecificationInstanceAnalysisParameters(String managementManualSpecificationInstanceAnalysisParameters) {
    this.managementManualSpecificationInstanceAnalysisParameters = managementManualSpecificationInstanceAnalysisParameters;
  }


}

