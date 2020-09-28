package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceReport   {
  private String employmentRelatedProceduresandGuidelinesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return employmentRelatedProceduresandGuidelinesInstanceReportReference
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceReportReference() {
    return employmentRelatedProceduresandGuidelinesInstanceReportReference;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceReportReference(String employmentRelatedProceduresandGuidelinesInstanceReportReference) {
    this.employmentRelatedProceduresandGuidelinesInstanceReportReference = employmentRelatedProceduresandGuidelinesInstanceReportReference;
  }


}

