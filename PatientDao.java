package hospitalManage;
import java.io.*;

public interface PatientDao {
	public File addPatient(String patientId,String nameSurname,String address,String phoneNumber);
	public File removePatient(String patientId);
	public File listPatient();
	

}
