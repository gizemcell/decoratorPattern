package hospitalManage;
import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class admissionDao extends Admission{
	public admissionDao(String admissionId,String patientId,String examinationType,String operation) {
		super(admissionId,patientId,examinationType,operation);
	}
	
	public File createAdmission(String admissionId,String patientId){
		File file =new File("C:\\Users\\dell\\Desktop\\admission.txt");
		FileWriter fw= new FileWriter(file);
		PrintWriter pw= new PrintWriter(fw);
		pw.println(admissionId+"\t"+patientId);
		pw.close();	
		return file;
	}
	public File addAdmission(String admissionId,String examinationType,String operation){
		ArrayList<String> allLines=readFromFile.readFromFile("C:\\Users\\dell\\Desktop\\admission.txt");
		File file =new File("admission.txt");
		FileWriter fw=new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		int lenght=allLines.size();
		for (int m=0;m<lenght;m++) {
			String[] tempList=allLines.get(m).split("\t");
			if (Integer.parseInt(tempList[0])>Integer.parseInt(admissionId)) {
				for(int k=0;k<m+1;k++) {
					pw.println(allLines.get(k));
				}
				pw.println(examinationType+"\t"+operation);
				for(int i=m+1;i<lenght;i++) {
					pw.println(allLines.get(i));
				}
				pw.close();
			}
		}
		return file;
	}
	public int totalCost() {
		
	}
	




}
