package hospitalManage;
//import java.util.Scanner;
//import java.io.*;

public class Patient {
	private String patientId;
	private String nameSurname;
	private String address;
	private String phoneNumber;
	public Patient(String patientId,String nameSurname,String address,String phoneNumber){
		this.patientId=patientId;
		this.nameSurname=nameSurname;
		this.address=address;
		this.phoneNumber=phoneNumber;	
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	


	
		
		
	
	

}
