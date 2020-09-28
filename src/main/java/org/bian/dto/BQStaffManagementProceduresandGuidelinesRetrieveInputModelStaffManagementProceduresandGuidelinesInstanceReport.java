package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport
 */
public class BQStaffManagementProceduresandGuidelinesRetrieveInputModelStaffManagementProceduresandGuidelinesInstanceReport   {
  private String staffManagementProceduresandGuidelinesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return staffManagementProceduresandGuidelinesInstanceReportReference
  **/

  public String getStaffManagementProceduresandGuidelinesInstanceReportReference() {
    return staffManagementProceduresandGuidelinesInstanceReportReference;
  }

  public void setStaffManagementProceduresandGuidelinesInstanceReportReference(String staffManagementProceduresandGuidelinesInstanceReportReference) {
    this.staffManagementProceduresandGuidelinesInstanceReportReference = staffManagementProceduresandGuidelinesInstanceReportReference;
  }


}

