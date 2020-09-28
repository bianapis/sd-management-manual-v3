package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis;
import org.bian.dto.SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord
 */
public class SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecord   {
  private SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis managementManualActivityAnalysis = null;

  private SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis managementManualPerformanceAnalysis = null;

  private SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get managementManualActivityAnalysis
   * @return managementManualActivityAnalysis
  **/

  public SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis getManagementManualActivityAnalysis() {
    return managementManualActivityAnalysis;
  }

  public void setManagementManualActivityAnalysis(SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis managementManualActivityAnalysis) {
    this.managementManualActivityAnalysis = managementManualActivityAnalysis;
  }


  /**
   * Get managementManualPerformanceAnalysis
   * @return managementManualPerformanceAnalysis
  **/

  public SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis getManagementManualPerformanceAnalysis() {
    return managementManualPerformanceAnalysis;
  }

  public void setManagementManualPerformanceAnalysis(SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis managementManualPerformanceAnalysis) {
    this.managementManualPerformanceAnalysis = managementManualPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDManagementManualRetrieveOutputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

