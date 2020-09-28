package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis
 */
public class BQCompanyMissionandPoliciesRetrieveInputModelCompanyMissionandPoliciesInstanceAnalysis   {
  private String companyMissionandPoliciesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return companyMissionandPoliciesInstanceAnalysisReference
  **/

  public String getCompanyMissionandPoliciesInstanceAnalysisReference() {
    return companyMissionandPoliciesInstanceAnalysisReference;
  }

  public void setCompanyMissionandPoliciesInstanceAnalysisReference(String companyMissionandPoliciesInstanceAnalysisReference) {
    this.companyMissionandPoliciesInstanceAnalysisReference = companyMissionandPoliciesInstanceAnalysisReference;
  }


}

