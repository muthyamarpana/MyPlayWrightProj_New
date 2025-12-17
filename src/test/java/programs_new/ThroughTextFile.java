package programs_new;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThroughTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fc;
		FileWriter fw;
		BufferedWriter bw;
		FileReader fr;
		BufferedReader br;
		String src="C:\\PlayWright_Automation\\data.txt";
		fc = new File(src);
		fc.createNewFile();  //creates new file
		fw=new FileWriter(src,true);
		bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("this is my First Line");
		bw.newLine();
		bw.write("This is my Second Line");
		bw.close(); //saves the file and closes
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		String cont=null;
		while((cont=br.readLine())!=null)
		{
			System.out.println(cont);
		}
		br.close();
		
		
	}

}
