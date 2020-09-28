/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class ManagementManualApiController {

	@Autowired
	ManagementManualApiService service;
	
	@Design.Activate
	public BianResponse<SDManagementManualActivateOutputModel> activate(@RequestBody BianRequest<SDManagementManualActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("companymissionandpolicies")
	@Design.Capture
	public BianResponse<BQCompanyMissionandPoliciesCaptureOutputModel> captureCompanymissionandpolicies(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCompanyMissionandPoliciesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCompanymissionandpolicies(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("employmentrelatedproceduresandguidelines")
	@Design.Capture
	public BianResponse<BQEmploymentRelatedProceduresandGuidelinesCaptureOutputModel> captureEmploymentrelatedproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEmploymentRelatedProceduresandGuidelinesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureEmploymentrelatedproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalandregulatoryobligationsandguidelines")
	@Design.Capture
	public BianResponse<BQLegalandRegulatoryObligationsandGuidelinesCaptureOutputModel> captureLegalandregulatoryobligationsandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLegalandRegulatoryObligationsandGuidelinesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureLegalandregulatoryobligationsandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalandproductionproceduresandguidelines")
	@Design.Capture
	public BianResponse<BQOperationalandProductionProceduresandGuidelinesCaptureOutputModel> captureOperationalandproductionproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationalandProductionProceduresandGuidelinesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureOperationalandproductionproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffmanagementproceduresandguidelines")
	@Design.Capture
	public BianResponse<BQStaffManagementProceduresandGuidelinesCaptureOutputModel> captureStaffmanagementproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffManagementProceduresandGuidelinesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureStaffmanagementproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Capture
	public BianResponse<CRManagementManualSpecificationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDManagementManualConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDManagementManualConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Control
	public BianResponse<CRManagementManualSpecificationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Exchange
	public BianResponse<CRManagementManualSpecificationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDManagementManualFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDManagementManualFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Initiate
	public BianResponse<CRManagementManualSpecificationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("companymissionandpolicies")
	@Design.Initiate
	public BianResponse<BQCompanyMissionandPoliciesInitiateOutputModel> initiateCompanymissionandpolicies(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCompanyMissionandPoliciesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCompanymissionandpolicies(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("employmentrelatedproceduresandguidelines")
	@Design.Initiate
	public BianResponse<BQEmploymentRelatedProceduresandGuidelinesInitiateOutputModel> initiateEmploymentrelatedproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQEmploymentRelatedProceduresandGuidelinesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateEmploymentrelatedproceduresandguidelines(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalandregulatoryobligationsandguidelines")
	@Design.Initiate
	public BianResponse<BQLegalandRegulatoryObligationsandGuidelinesInitiateOutputModel> initiateLegalandregulatoryobligationsandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQLegalandRegulatoryObligationsandGuidelinesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateLegalandregulatoryobligationsandguidelines(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalandproductionproceduresandguidelines")
	@Design.Initiate
	public BianResponse<BQOperationalandProductionProceduresandGuidelinesInitiateOutputModel> initiateOperationalandproductionproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOperationalandProductionProceduresandGuidelinesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOperationalandproductionproceduresandguidelines(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffmanagementproceduresandguidelines")
	@Design.Initiate
	public BianResponse<BQStaffManagementProceduresandGuidelinesInitiateOutputModel> initiateStaffmanagementproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQStaffManagementProceduresandGuidelinesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateStaffmanagementproceduresandguidelines(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRManagementManualSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Retrieve
	public BianResponse<CRManagementManualSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("companymissionandpolicies")
	@Design.Retrieve
	public BianResponse<BQCompanyMissionandPoliciesRetrieveOutputModel> retrieveCompanymissionandpolicies(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompanymissionandpolicies(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("employmentrelatedproceduresandguidelines")
	@Design.Retrieve
	public BianResponse<BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel> retrieveEmploymentrelatedproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEmploymentrelatedproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("legalandregulatoryobligationsandguidelines")
	@Design.Retrieve
	public BianResponse<BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModel> retrieveLegalandregulatoryobligationsandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLegalandregulatoryobligationsandguidelines(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("operationalandproductionproceduresandguidelines")
	@Design.Retrieve
	public BianResponse<BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel> retrieveOperationalandproductionproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOperationalandproductionproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("staffmanagementproceduresandguidelines")
	@Design.Retrieve
	public BianResponse<BQStaffManagementProceduresandGuidelinesRetrieveOutputModel> retrieveStaffmanagementproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStaffmanagementproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDManagementManualRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Design.Update
	public BianResponse<CRManagementManualSpecificationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRManagementManualSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("companymissionandpolicies")
	@Design.Update
	public BianResponse<BQCompanyMissionandPoliciesUpdateOutputModel> updateCompanymissionandpolicies(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCompanyMissionandPoliciesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCompanymissionandpolicies(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("employmentrelatedproceduresandguidelines")
	@Design.Update
	public BianResponse<BQEmploymentRelatedProceduresandGuidelinesUpdateOutputModel> updateEmploymentrelatedproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEmploymentRelatedProceduresandGuidelinesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateEmploymentrelatedproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalandregulatoryobligationsandguidelines")
	@Design.Update
	public BianResponse<BQLegalandRegulatoryObligationsandGuidelinesUpdateOutputModel> updateLegalandregulatoryobligationsandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLegalandRegulatoryObligationsandGuidelinesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLegalandregulatoryobligationsandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalandproductionproceduresandguidelines")
	@Design.Update
	public BianResponse<BQOperationalandProductionProceduresandGuidelinesUpdateOutputModel> updateOperationalandproductionproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationalandProductionProceduresandGuidelinesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOperationalandproductionproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffmanagementproceduresandguidelines")
	@Design.Update
	public BianResponse<BQStaffManagementProceduresandGuidelinesUpdateOutputModel> updateStaffmanagementproceduresandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffManagementProceduresandGuidelinesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateStaffmanagementproceduresandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
