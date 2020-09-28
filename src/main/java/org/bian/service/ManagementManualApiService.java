/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ManagementManualApiService {

	SDManagementManualActivateOutputModel activate(SDManagementManualActivateInputModel request);
	
	BQCompanyMissionandPoliciesCaptureOutputModel captureCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCompanyMissionandPoliciesCaptureInputModel request);
	
	BQEmploymentRelatedProceduresandGuidelinesCaptureOutputModel captureEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmploymentRelatedProceduresandGuidelinesCaptureInputModel request);
	
	BQLegalandRegulatoryObligationsandGuidelinesCaptureOutputModel captureLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalandRegulatoryObligationsandGuidelinesCaptureInputModel request);
	
	BQOperationalandProductionProceduresandGuidelinesCaptureOutputModel captureOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalandProductionProceduresandGuidelinesCaptureInputModel request);
	
	BQStaffManagementProceduresandGuidelinesCaptureOutputModel captureStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffManagementProceduresandGuidelinesCaptureInputModel request);
	
	CRManagementManualSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationCaptureInputModel request);
	
	SDManagementManualConfigureOutputModel configure(String sdReferenceId, SDManagementManualConfigureInputModel request);
	
	CRManagementManualSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationControlInputModel request);
	
	CRManagementManualSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationExchangeInputModel request);
	
	SDManagementManualFeedbackOutputModel feedback(String sdReferenceId, SDManagementManualFeedbackInputModel request);
	
	CRManagementManualSpecificationInitiateOutputModel initiate(String sdReferenceId, CRManagementManualSpecificationInitiateInputModel request);
	
	BQCompanyMissionandPoliciesInitiateOutputModel initiateCompanymissionandpolicies(String sdReferenceId, String crReferenceId, BQCompanyMissionandPoliciesInitiateInputModel request);
	
	BQEmploymentRelatedProceduresandGuidelinesInitiateOutputModel initiateEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, BQEmploymentRelatedProceduresandGuidelinesInitiateInputModel request);
	
	BQLegalandRegulatoryObligationsandGuidelinesInitiateOutputModel initiateLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, BQLegalandRegulatoryObligationsandGuidelinesInitiateInputModel request);
	
	BQOperationalandProductionProceduresandGuidelinesInitiateOutputModel initiateOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, BQOperationalandProductionProceduresandGuidelinesInitiateInputModel request);
	
	BQStaffManagementProceduresandGuidelinesInitiateOutputModel initiateStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, BQStaffManagementProceduresandGuidelinesInitiateInputModel request);
	
	CRManagementManualSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationRequestInputModel request);
	
	CRManagementManualSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCompanyMissionandPoliciesRetrieveOutputModel retrieveCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel retrieveEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModel retrieveLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel retrieveOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStaffManagementProceduresandGuidelinesRetrieveOutputModel retrieveStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDManagementManualRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRManagementManualSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationUpdateInputModel request);
	
	BQCompanyMissionandPoliciesUpdateOutputModel updateCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCompanyMissionandPoliciesUpdateInputModel request);
	
	BQEmploymentRelatedProceduresandGuidelinesUpdateOutputModel updateEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmploymentRelatedProceduresandGuidelinesUpdateInputModel request);
	
	BQLegalandRegulatoryObligationsandGuidelinesUpdateOutputModel updateLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalandRegulatoryObligationsandGuidelinesUpdateInputModel request);
	
	BQOperationalandProductionProceduresandGuidelinesUpdateOutputModel updateOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalandProductionProceduresandGuidelinesUpdateInputModel request);
	
	BQStaffManagementProceduresandGuidelinesUpdateOutputModel updateStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffManagementProceduresandGuidelinesUpdateInputModel request);
	
}