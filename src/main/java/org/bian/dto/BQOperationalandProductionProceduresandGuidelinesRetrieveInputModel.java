package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis;
import org.bian.dto.BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationalandProductionProceduresandGuidelinesRetrieveInputModel
 */
public class BQOperationalandProductionProceduresandGuidelinesRetrieveInputModel   {
  private Object operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord = null;

  private String operationalandProductionProceduresandGuidelinesRetrieveActionRequest = null;

  private BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport operationalandProductionProceduresandGuidelinesInstanceReport = null;

  private BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis operationalandProductionProceduresandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getOperationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord() {
    return operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord;
  }

  public void setOperationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord(Object operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord) {
    this.operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord = operationalandProductionProceduresandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return operationalandProductionProceduresandGuidelinesRetrieveActionRequest
  **/

  public String getOperationalandProductionProceduresandGuidelinesRetrieveActionRequest() {
    return operationalandProductionProceduresandGuidelinesRetrieveActionRequest;
  }

  public void setOperationalandProductionProceduresandGuidelinesRetrieveActionRequest(String operationalandProductionProceduresandGuidelinesRetrieveActionRequest) {
    this.operationalandProductionProceduresandGuidelinesRetrieveActionRequest = operationalandProductionProceduresandGuidelinesRetrieveActionRequest;
  }


  /**
   * Get operationalandProductionProceduresandGuidelinesInstanceReport
   * @return operationalandProductionProceduresandGuidelinesInstanceReport
  **/

  public BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport getOperationalandProductionProceduresandGuidelinesInstanceReport() {
    return operationalandProductionProceduresandGuidelinesInstanceReport;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceReport(BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceReport operationalandProductionProceduresandGuidelinesInstanceReport) {
    this.operationalandProductionProceduresandGuidelinesInstanceReport = operationalandProductionProceduresandGuidelinesInstanceReport;
  }


  /**
   * Get operationalandProductionProceduresandGuidelinesInstanceAnalysis
   * @return operationalandProductionProceduresandGuidelinesInstanceAnalysis
  **/

  public BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis getOperationalandProductionProceduresandGuidelinesInstanceAnalysis() {
    return operationalandProductionProceduresandGuidelinesInstanceAnalysis;
  }

  public void setOperationalandProductionProceduresandGuidelinesInstanceAnalysis(BQOperationalandProductionProceduresandGuidelinesRetrieveInputModelOperationalandProductionProceduresandGuidelinesInstanceAnalysis operationalandProductionProceduresandGuidelinesInstanceAnalysis) {
    this.operationalandProductionProceduresandGuidelinesInstanceAnalysis = operationalandProductionProceduresandGuidelinesInstanceAnalysis;
  }


}

