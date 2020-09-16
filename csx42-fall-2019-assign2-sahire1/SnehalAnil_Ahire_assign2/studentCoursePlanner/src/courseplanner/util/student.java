package courseplanner.util;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class student implements FileReadInterface
{
public int sid;
//public String level;
public String pref;
//public String t;
//public int[] t=new int[3];
public String c;
public int store;
public int statecount;
public int g;
//public int sat;
public int readfile(String input)  
	{ 
	//Student reader
	//CITE CODE https://www.tutorialspoint.com/java/java_files_io.htm
	      FileInputStream in = null;
		  		  //System.out.println(input);

		try 
		{
         in = new FileInputStream("input.txt");
		 BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		 int lines = 0;
		 while (reader.readLine() != null) lines++;
		 reader.close();
		 //System.out.println(lines);
		 return lines;	
		 /*int c;
         while ((c = in.read()) != -1)
		 {  //CITE http://www.avajava.com/tutorials/lessons/how-do-i-write-the-contents-of-a-file-to-standard-output.html
		 //System.out.write(c);
		 return 0;
		 }*/
		}
		catch(IOException e) {
		e.printStackTrace();
			}
		 finally {
         if (in != null) 
		 {
			 try{
            in.close();
			 }
			 catch(IOException e) {
		e.printStackTrace();
			}
         }
				}
				return 0;
	}
	

}