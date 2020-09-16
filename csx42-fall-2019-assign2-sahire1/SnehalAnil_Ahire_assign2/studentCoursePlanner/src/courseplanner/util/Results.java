package courseplanner.util;
import courseplanner.util.course;
import courseplanner.util.student;
import java.io.FileWriter;  
import courseplanner.util.context;

public class Results implements FileDisplayInterface,StdoutDisplayInterface{
	
	
	//To write in a file
	public void write(String nameIn,student[] so)
	{
		
		try{    
           FileWriter fw=new FileWriter(nameIn);   
			fw.write(so[0].sid+":");	
			String temp=so[0].c.replace("null","");
		   for(int i=0;i<so[0].store;i++)
		{
			//String temp=so[i].c.replace("null","");
           
		   fw.write(temp.charAt(i));
		   fw.write(" ");
		   

		 
		}
		fw.write("--");
		int t=so[0].store%3;
		if(t==0)
		{
			 t=so[0].store/3;
			fw.write("t");
			
		}
		else
		{
			 t=so[0].store/3;
			t=t+1;
			fw.write("t");
			//System.out.println(t);
			
		}
		fw.write(" ");
		fw.write(so[0].statecount);
		
		if(so[0].g==0)
		{
			fw.write("student does not graduate");
		}
		
		
           fw.close();    
          }catch(Exception e){System.out.println(e);} 
		
		
	}	
	//To write to standard output
	public void write1(student[] so)
	{
		
		
		System.out.print(so[0].sid+":");
		String temp=so[0].c.replace("null","");
		for(int i=0;i<so[0].store;i++)
		{
			//String temp=so[i].c.replace("null","");
           
		   System.out.print(temp.charAt(i));
		   System.out.print(" ");
		   

		  // fw.write(temp+"\n");   
		 //  fw.write(so[i].sat+"\n");
		}
		System.out.print("--");
		if(so[0].store%3==0)
		{
			int t=so[0].store/3;
			System.out.print(t);
		}
		else
		{
			int t=so[0].store/3;
			t=t+1;
			System.out.print(t);
			
		}
		System.out.print(" "+so[0].statecount);
	}
	
	
}
