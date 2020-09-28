package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis;
import org.bian.dto.SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord
 */
public class SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecord   {
  private SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis managementManualActivityAnalysis = null;

  private SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis managementManualPerformanceAnalysis = null;

  private SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get managementManualActivityAnalysis
   * @return managementManualActivityAnalysis
  **/

  public SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis getManagementManualActivityAnalysis() {
    return managementManualActivityAnalysis;
  }

  public void setManagementManualActivityAnalysis(SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualActivityAnalysis managementManualActivityAnalysis) {
    this.managementManualActivityAnalysis = managementManualActivityAnalysis;
  }


  /**
   * Get managementManualPerformanceAnalysis
   * @return managementManualPerformanceAnalysis
  **/

  public SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis getManagementManualPerformanceAnalysis() {
    return managementManualPerformanceAnalysis;
  }

  public void setManagementManualPerformanceAnalysis(SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordManagementManualPerformanceAnalysis managementManualPerformanceAnalysis) {
    this.managementManualPerformanceAnalysis = managementManualPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDManagementManualRetrieveInputModelManagementManualRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

