package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis;
import org.bian.dto.BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModel
 */
public class BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModel   {
  private Object legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord = null;

  private String legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest = null;

  private BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport legalandRegulatoryObligationsandGuidelinesInstanceReport = null;

  private BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis legalandRegulatoryObligationsandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getLegalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord() {
    return legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord(Object legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord) {
    this.legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord = legalandRegulatoryObligationsandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest
  **/

  public String getLegalandRegulatoryObligationsandGuidelinesRetrieveActionRequest() {
    return legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesRetrieveActionRequest(String legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest) {
    this.legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest = legalandRegulatoryObligationsandGuidelinesRetrieveActionRequest;
  }


  /**
   * Get legalandRegulatoryObligationsandGuidelinesInstanceReport
   * @return legalandRegulatoryObligationsandGuidelinesInstanceReport
  **/

  public BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport getLegalandRegulatoryObligationsandGuidelinesInstanceReport() {
    return legalandRegulatoryObligationsandGuidelinesInstanceReport;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceReport(BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceReport legalandRegulatoryObligationsandGuidelinesInstanceReport) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceReport = legalandRegulatoryObligationsandGuidelinesInstanceReport;
  }


  /**
   * Get legalandRegulatoryObligationsandGuidelinesInstanceAnalysis
   * @return legalandRegulatoryObligationsandGuidelinesInstanceAnalysis
  **/

  public BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis getLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis() {
    return legalandRegulatoryObligationsandGuidelinesInstanceAnalysis;
  }

  public void setLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis(BQLegalandRegulatoryObligationsandGuidelinesRetrieveInputModelLegalandRegulatoryObligationsandGuidelinesInstanceAnalysis legalandRegulatoryObligationsandGuidelinesInstanceAnalysis) {
    this.legalandRegulatoryObligationsandGuidelinesInstanceAnalysis = legalandRegulatoryObligationsandGuidelinesInstanceAnalysis;
  }


}

