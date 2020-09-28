package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport   {
  private String operationalandProductionProceduresandGuidelinesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return operationalandProductionProceduresandGuidelinesInstanceReportReference
  **/

  public String getOperationalandProductionProceduresandGuidelinesInstanceReportReference() {
    return operationalandProductionProceduresandGuidelinesInstanceReportReference;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReportReference(String operationalandProductionProceduresandGuidelinesInstanceReportReference) {
    this.operationalandProductionProceduresandGuidelinesInstanceReportReference = operationalandProductionProceduresandGuidelinesInstanceReportReference;
  }


}

