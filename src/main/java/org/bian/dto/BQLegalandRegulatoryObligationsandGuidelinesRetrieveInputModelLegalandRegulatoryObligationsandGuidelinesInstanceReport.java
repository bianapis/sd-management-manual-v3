package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport
 */
public class BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport   {
  private String legalandRegulatoryObligationsandGuidelinesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReportReference
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesInstanceReportReference() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReportReference;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReportReference(String legalandRegulatoryObligationsandGuidelinesInstanceReportReference) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReportReference = legalandRegulatoryObligationsandGuidelinesInstanceReportReference;
  }


}

