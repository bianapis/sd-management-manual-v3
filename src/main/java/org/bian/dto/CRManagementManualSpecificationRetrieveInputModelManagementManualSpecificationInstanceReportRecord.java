package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord
 */
public class CRManagementManualSpecificationRetrieveInputModelManagementManualSpecificationInstanceReportRecord   {
  private String managementManualSpecificationInstanceReportReference = null;

  private String managementManualSpecificationInstanceReportType = null;

  private String managementManualSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return managementManualSpecificationInstanceReportReference
  **/

  public String getManagementManualSpecificationInstanceReportReference() {
    return managementManualSpecificationInstanceReportReference;
  }

  public void setManagementManualSpecificationInstanceReportReference(String managementManualSpecificationInstanceReportReference) {
    this.managementManualSpecificationInstanceReportReference = managementManualSpecificationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return managementManualSpecificationInstanceReportParameters
  **/

  public String getManagementManualSpecificationInstanceReportParameters() {
    return managementManualSpecificationInstanceReportParameters;
  }

  public void setManagementManualSpecificationInstanceReportParameters(String managementManualSpecificationInstanceReportParameters) {
    this.managementManualSpecificationInstanceReportParameters = managementManualSpecificationInstanceReportParameters;
  }


}

