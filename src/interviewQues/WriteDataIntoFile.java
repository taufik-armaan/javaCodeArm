package interviewQues;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) throws IOException {


		FileWriter file = new FileWriter("C:\\Users\\sadiy\\OneDrive\\Desktop\\API Tetsing Practice\\Test.txt");
		BufferedWriter bw = new BufferedWriter(file);
		
		bw.write("Added first line");
		bw.write(" Added second line");
		
		bw.close();
		
	}

}
