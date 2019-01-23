package test123Deeoa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fp=new File("C:\\Users\\deepa.vadivel\\Documents\\text1.txt");
		String a="deepa";
		
		if(fp.isFile())
		{
			FileWriter fout=new FileWriter(fp,true);
			fout.write(a);
			FileReader fin=new FileReader(fp);
			BufferedReader fb=new BufferedReader(fin);
			String g;
			if ((g=fb.readLine())!=null)
			{
				System.out.println(g);
			}
			
			fout.flush();
			fout.close();
			if ((g=fb.readLine())!=null)
			{
				System.out.println(g);
			}
			
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
       
	}

}
