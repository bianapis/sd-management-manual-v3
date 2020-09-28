package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport
 */
public class BQCompanyMissionandPoliciesRetrieveOutputModelCompanyMissionandPoliciesInstanceReport   {
  private Object companyMissionandPoliciesInstanceReportRecord = null;

  private String companyMissionandPoliciesInstanceReportType = null;

  private String companyMissionandPoliciesInstanceReportParameters = null;

  private Object companyMissionandPoliciesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return companyMissionandPoliciesInstanceReportRecord
  **/

  public Object getCompanyMissionandPoliciesInstanceReportRecord() {
    return companyMissionandPoliciesInstanceReportRecord;
  }

  public void setCompanyMissionandPoliciesInstanceReportRecord(Object companyMissionandPoliciesInstanceReportRecord) {
    this.companyMissionandPoliciesInstanceReportRecord = companyMissionandPoliciesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return companyMissionandPoliciesInstanceReportType
  **/

  public String getCompanyMissionandPoliciesInstanceReportType() {
    return companyMissionandPoliciesInstanceReportType;
  }

  public void setCompanyMissionandPoliciesInstanceReportType(String companyMissionandPoliciesInstanceReportType) {
    this.companyMissionandPoliciesInstanceReportType = companyMissionandPoliciesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return companyMissionandPoliciesInstanceReportParameters
  **/

  public String getCompanyMissionandPoliciesInstanceReportParameters() {
    return companyMissionandPoliciesInstanceReportParameters;
  }

  public void setCompanyMissionandPoliciesInstanceReportParameters(String companyMissionandPoliciesInstanceReportParameters) {
    this.companyMissionandPoliciesInstanceReportParameters = companyMissionandPoliciesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return companyMissionandPoliciesInstanceReport
  **/

  public Object getCompanyMissionandPoliciesInstanceReport() {
    return companyMissionandPoliciesInstanceReport;
  }

  public void setCompanyMissionandPoliciesInstanceReport(Object companyMissionandPoliciesInstanceReport) {
    this.companyMissionandPoliciesInstanceReport = companyMissionandPoliciesInstanceReport;
  }


}

