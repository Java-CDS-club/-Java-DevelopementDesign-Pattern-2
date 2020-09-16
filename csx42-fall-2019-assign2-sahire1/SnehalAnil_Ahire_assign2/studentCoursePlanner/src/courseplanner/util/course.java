package courseplanner.util;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

//import coursesRegistration.courseInfo.txt;
public class course implements FileReadInterface
{
	//public int capacity;
	//public int ctime;
	public String cname;
	
	
	public int readfile(String input)  
	{
		int lines = 0;
	//CITE CODE https://www.tutorialspoint.com/java/java_files_io.htm
	      FileInputStream in = null;
		  //System.out.println(input);
		
         
		try 
		{
			in = new FileInputStream("input.txt");
			//C:\apache-ant-1.10.7\bin\SnehalAnil_Ahire_assign1\coursesRegistration\src
		 //CITE https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way/1277904
		 BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		 String line = reader.readLine();
		 
			 
			 
			 String[] l1 = line.split(" ");
			 for(int i=1;i<l1.length;i++)
			 {lines++;
				 
			 }
		 
		 reader.close();
		 //System.out.println(lines);
		}
		 
		
		 /*int c;
         while ((c = in.read()) != -1)
		 {  //CITE http://www.avajava.com/tutorials/lessons/how-do-i-write-the-contents-of-a-file-to-standard-output.html
		 //System.out.write(c);
		 
		 }*/
		
		catch(FileNotFoundException e) 
		{
					e.printStackTrace();
		}
		catch(IOException ex) 
		{
					ex.printStackTrace();
		}
		 finally 
		 {
				if (in != null) 
					{
						try{
							in.close();
							}
						catch(IOException ex)
						{
						ex.printStackTrace();
						}
					}
		}
			return lines;
	}
	//public static void main(Str) 
	
	
				//return 0;
	}
	
	

