package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis
 */
public class BQEmploymentRelatedProceduresandGuidelinesRetrieveInputModelEmploymentRelatedProceduresandGuidelinesInstanceAnalysis   {
  private String employmentRelatedProceduresandGuidelinesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return employmentRelatedProceduresandGuidelinesInstanceAnalysisReference
  **/

  public String getEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReference() {
    return employmentRelatedProceduresandGuidelinesInstanceAnalysisReference;
  }

  public void setEmploymentRelatedProceduresandGuidelinesInstanceAnalysisReference(String employmentRelatedProceduresandGuidelinesInstanceAnalysisReference) {
    this.employmentRelatedProceduresandGuidelinesInstanceAnalysisReference = employmentRelatedProceduresandGuidelinesInstanceAnalysisReference;
  }


}

