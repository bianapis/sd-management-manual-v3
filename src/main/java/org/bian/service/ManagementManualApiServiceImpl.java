/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ManagementManualApiServiceImpl implements ManagementManualApiService {

	public SDManagementManualActivateOutputModel activate(SDManagementManualActivateInputModel request){
		return JsonReader.read("activate-SDManagementManualActivateOutputModel.json",new TypeReference<SDManagementManualActivateOutputModel>(){});
	}
	
	public BQCompanyMissionandPoliciesCaptureOutputModel captureCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCompanyMissionandPoliciesCaptureInputModel request){
		return JsonReader.read("capture-BQCompanyMissionandPoliciesCaptureOutputModel.json",new TypeReference<BQCompanyMissionandPoliciesCaptureOutputModel>(){});
	}
	
	public BQEmploymentRelatedProceduresandGuidelinesCaptureOutputModel captureEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmploymentRelatedProceduresandGuidelinesCaptureInputModel request){
		return JsonReader.read("capture-BQEmploymentRelatedProceduresandGuidelinesCaptureOutputModel.json",new TypeReference<BQEmploymentRelatedProceduresandGuidelinesCaptureOutputModel>(){});
	}
	
	public BQLegalandRegulatoryObligationsandGuidelinesCaptureOutputModel captureLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalandRegulatoryObligationsandGuidelinesCaptureInputModel request){
		return JsonReader.read("capture-BQLegalandRegulatoryObligationsandGuidelinesCaptureOutputModel.json",new TypeReference<BQLegalandRegulatoryObligationsandGuidelinesCaptureOutputModel>(){});
	}
	
	public BQOperationalandProductionProceduresandGuidelinesCaptureOutputModel captureOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalandProductionProceduresandGuidelinesCaptureInputModel request){
		return JsonReader.read("capture-BQOperationalandProductionProceduresandGuidelinesCaptureOutputModel.json",new TypeReference<BQOperationalandProductionProceduresandGuidelinesCaptureOutputModel>(){});
	}
	
	public BQStaffManagementProceduresandGuidelinesCaptureOutputModel captureStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffManagementProceduresandGuidelinesCaptureInputModel request){
		return JsonReader.read("capture-BQStaffManagementProceduresandGuidelinesCaptureOutputModel.json",new TypeReference<BQStaffManagementProceduresandGuidelinesCaptureOutputModel>(){});
	}
	
	public CRManagementManualSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRManagementManualSpecificationCaptureOutputModel.json",new TypeReference<CRManagementManualSpecificationCaptureOutputModel>(){});
	}
	
	public SDManagementManualConfigureOutputModel configure(String sdReferenceId, SDManagementManualConfigureInputModel request){
		return JsonReader.read("configure-SDManagementManualConfigureOutputModel.json",new TypeReference<SDManagementManualConfigureOutputModel>(){});
	}
	
	public CRManagementManualSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationControlInputModel request){
		return JsonReader.read("control-CRManagementManualSpecificationControlOutputModel.json",new TypeReference<CRManagementManualSpecificationControlOutputModel>(){});
	}
	
	public CRManagementManualSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRManagementManualSpecificationExchangeOutputModel.json",new TypeReference<CRManagementManualSpecificationExchangeOutputModel>(){});
	}
	
	public SDManagementManualFeedbackOutputModel feedback(String sdReferenceId, SDManagementManualFeedbackInputModel request){
		return JsonReader.read("feedback-SDManagementManualFeedbackOutputModel.json",new TypeReference<SDManagementManualFeedbackOutputModel>(){});
	}
	
	public CRManagementManualSpecificationInitiateOutputModel initiate(String sdReferenceId, CRManagementManualSpecificationInitiateInputModel request){
		return JsonReader.read("initiate-CRManagementManualSpecificationInitiateOutputModel.json",new TypeReference<CRManagementManualSpecificationInitiateOutputModel>(){});
	}
	
	public BQCompanyMissionandPoliciesInitiateOutputModel initiateCompanymissionandpolicies(String sdReferenceId, String crReferenceId, BQCompanyMissionandPoliciesInitiateInputModel request){
		return JsonReader.read("initiate-BQCompanyMissionandPoliciesInitiateOutputModel.json",new TypeReference<BQCompanyMissionandPoliciesInitiateOutputModel>(){});
	}
	
	public BQEmploymentRelatedProceduresandGuidelinesInitiateOutputModel initiateEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, BQEmploymentRelatedProceduresandGuidelinesInitiateInputModel request){
		return JsonReader.read("initiate-BQEmploymentRelatedProceduresandGuidelinesInitiateOutputModel.json",new TypeReference<BQEmploymentRelatedProceduresandGuidelinesInitiateOutputModel>(){});
	}
	
	public BQLegalandRegulatoryObligationsandGuidelinesInitiateOutputModel initiateLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, BQLegalandRegulatoryObligationsandGuidelinesInitiateInputModel request){
		return JsonReader.read("initiate-BQLegalandRegulatoryObligationsandGuidelinesInitiateOutputModel.json",new TypeReference<BQLegalandRegulatoryObligationsandGuidelinesInitiateOutputModel>(){});
	}
	
	public BQOperationalandProductionProceduresandGuidelinesInitiateOutputModel initiateOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, BQOperationalandProductionProceduresandGuidelinesInitiateInputModel request){
		return JsonReader.read("initiate-BQOperationalandProductionProceduresandGuidelinesInitiateOutputModel.json",new TypeReference<BQOperationalandProductionProceduresandGuidelinesInitiateOutputModel>(){});
	}
	
	public BQStaffManagementProceduresandGuidelinesInitiateOutputModel initiateStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, BQStaffManagementProceduresandGuidelinesInitiateInputModel request){
		return JsonReader.read("initiate-BQStaffManagementProceduresandGuidelinesInitiateOutputModel.json",new TypeReference<BQStaffManagementProceduresandGuidelinesInitiateOutputModel>(){});
	}
	
	public CRManagementManualSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationRequestInputModel request){
		return JsonReader.read("request-CRManagementManualSpecificationRequestOutputModel.json",new TypeReference<CRManagementManualSpecificationRequestOutputModel>(){});
	}
	
	public CRManagementManualSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRManagementManualSpecificationRetrieveOutputModel.json",new TypeReference<CRManagementManualSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCompanyMissionandPoliciesRetrieveOutputModel retrieveCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCompanyMissionandPoliciesRetrieveOutputModel.json",new TypeReference<BQCompanyMissionandPoliciesRetrieveOutputModel>(){});
	}
	
	public BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel retrieveEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel.json",new TypeReference<BQEmploymentRelatedProceduresandGuidelinesRetrieveOutputModel>(){});
	}
	
	public BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModel retrieveLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModel.json",new TypeReference<BQLegalandRegulatoryObligationsandGuidelinesRetrieveOutputModel>(){});
	}
	
	public BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel retrieveOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel.json",new TypeReference<BQOperationalandProductionProceduresandGuidelinesRetrieveOutputModel>(){});
	}
	
	public BQStaffManagementProceduresandGuidelinesRetrieveOutputModel retrieveStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStaffManagementProceduresandGuidelinesRetrieveOutputModel.json",new TypeReference<BQStaffManagementProceduresandGuidelinesRetrieveOutputModel>(){});
	}
	
	public SDManagementManualRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDManagementManualRetrieveOutputModel.json",new TypeReference<SDManagementManualRetrieveOutputModel>(){});
	}
	
	public CRManagementManualSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagementManualSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRManagementManualSpecificationUpdateOutputModel.json",new TypeReference<CRManagementManualSpecificationUpdateOutputModel>(){});
	}
	
	public BQCompanyMissionandPoliciesUpdateOutputModel updateCompanymissionandpolicies(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCompanyMissionandPoliciesUpdateInputModel request){
		return JsonReader.read("update-BQCompanyMissionandPoliciesUpdateOutputModel.json",new TypeReference<BQCompanyMissionandPoliciesUpdateOutputModel>(){});
	}
	
	public BQEmploymentRelatedProceduresandGuidelinesUpdateOutputModel updateEmploymentrelatedproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmploymentRelatedProceduresandGuidelinesUpdateInputModel request){
		return JsonReader.read("update-BQEmploymentRelatedProceduresandGuidelinesUpdateOutputModel.json",new TypeReference<BQEmploymentRelatedProceduresandGuidelinesUpdateOutputModel>(){});
	}
	
	public BQLegalandRegulatoryObligationsandGuidelinesUpdateOutputModel updateLegalandregulatoryobligationsandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalandRegulatoryObligationsandGuidelinesUpdateInputModel request){
		return JsonReader.read("update-BQLegalandRegulatoryObligationsandGuidelinesUpdateOutputModel.json",new TypeReference<BQLegalandRegulatoryObligationsandGuidelinesUpdateOutputModel>(){});
	}
	
	public BQOperationalandProductionProceduresandGuidelinesUpdateOutputModel updateOperationalandproductionproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalandProductionProceduresandGuidelinesUpdateInputModel request){
		return JsonReader.read("update-BQOperationalandProductionProceduresandGuidelinesUpdateOutputModel.json",new TypeReference<BQOperationalandProductionProceduresandGuidelinesUpdateOutputModel>(){});
	}
	
	public BQStaffManagementProceduresandGuidelinesUpdateOutputModel updateStaffmanagementproceduresandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffManagementProceduresandGuidelinesUpdateInputModel request){
		return JsonReader.read("update-BQStaffManagementProceduresandGuidelinesUpdateOutputModel.json",new TypeReference<BQStaffManagementProceduresandGuidelinesUpdateOutputModel>(){});
	}
	
}
