package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis   {
  private String operationalandProductionProceduresandGuidelinesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysisReference
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceAnalysisReference() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysisReference;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysisReference(String operationalandProductionProceduresandGuidelinesInstanceAnalysisReference) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysisReference = operationalandProductionProceduresandGuidelinesInstanceAnalysisReference;
  }


}

