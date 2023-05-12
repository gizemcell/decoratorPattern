package hospitalManage;
import java.io.*;
import java.util.ArrayList;

public class PatientImpl extends Patient implements PatientDao{
	public PatientImpl(String patientId,String nameSurname,String address,String phoneNumber) {
		super(patientId,nameSurname,address,phoneNumber);
	}
	//File file =new File("patient.txt");
	//ArrayList<String> allLines=readFromFile.readFromFile("C:\\Users\\dell\\Desktop\\patient.txt");
	//int lenght =allLines.size();

	@Override
	public File addPatient(String patientId,String nameSurname,String address,String phoneNumber) {
		File file =new File("patient.txt");
		ArrayList<String> allLines=readFromFile.readFromFile("C:\\Users\\dell\\Desktop\\patient.txt");
		int lenght =allLines.size();
		for (int m=0;m<lenght;m++){
			String[] elements=allLines.get(m).split("\t");
				if(Integer.parseInt(elements[0])<Integer.parseInt(patientId)){
					FileWriter fw = new FileWriter(file);
					PrintWriter pw= new PrintWriter(fw);
					for (int i=0;i<m+1;i++) {
						pw.println(allLines.get(i));
					}
					pw.println(patientId+"\t"+nameSurname+"\t"+address+"\t"+ phoneNumber);
					for(int k=m+1;k<lenght;k++) {
						
						pw.println(allLines.get(k));
					}
					pw.close();
					return file;
				}
				
			}
		}

	@Override
	public File removePatient(String patientId) {
		File file =new File("patient.txt");
		ArrayList<String> allLines=readFromFile.readFromFile("C:\\Users\\dell\\Desktop\\patient.txt");
		int lenght =allLines.size();
		FileWriter fw = new FileWriter(file);
		PrintWriter pw= new PrintWriter(fw);
		for(int m=0;m<lenght;m++) {
			String[] elements=allLines.get(m).split("\t");
			if (Integer.parseInt(elements[0])==Integer.parseInt(patientId)) {
				allLines.remove(m);
			}				
		 }
		for (String line :allLines ) {
			pw.println(line);
		}
		pw.close();
		return file;
		
		}

	@Override
	public File listPatient() {
		File file =new File("patient.txt");
		ArrayList<String> allLines=readFromFile.readFromFile("C:\\Users\\dell\\Desktop\\patient.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw= new PrintWriter(fw);	
		int lenght =allLines.size();
		int i=0;
		String[] newLines= new String[lenght];
		for (int m=0;m<lenght;m++){
			if (allLines.get(m).charAt(2)>allLines.get(m+1).charAt(2)) {
				newLines[i]=allLines.get(m+1);
				newLines[i+1]=allLines.get(m);		
			}
			else {
				newLines[i+1]=allLines.get(m+1);
				newLines[i]=allLines.get(m);
				
			}
			i++;			
		}
		for (String line:newLines) {
		pw.println(newLines);
		}
		pw.close();
		
	}

}
