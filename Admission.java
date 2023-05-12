package hospitalManage;

public class Admission {
	private String admissionId;
	private String patientId; 
	private String examinationType;
	private String operation;
	public Admission(String admissionId,String patientId,String examinationType,String operation){
		this.admissionId=admissionId; 
		this.patientId=patientId;
		this.examinationType=examinationType;
		this.operation=operation;
		
	}
	

}
