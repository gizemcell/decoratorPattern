package hospitalManage;
import java.util.Scanner;
//import java.io.*;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class readFromFile {
	public static ArrayList<String> readFromFile(String path) throws FileNotFoundException{
		File readingFile= new File(path);
		Scanner scan = new Scanner(readingFile);
		ArrayList<String> allLine= new ArrayList();
		while(scan.hasNextLine()){
			allLine.add(scan.nextLine());
			System.out.println(allLine.add(scan.nextLine()));
		}
		return allLine;
		
		
	}
	
	
	

}
