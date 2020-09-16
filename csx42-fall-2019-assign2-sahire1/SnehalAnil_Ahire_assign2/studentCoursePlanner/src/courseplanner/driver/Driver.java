package courseplanner.driver;
import courseplanner.util.FileProcessor;
import java.io.FileNotFoundException;
import courseplanner.util.student;
import courseplanner.util.course;
import courseplanner.util.Results;
import courseplanner.util.context;
import courseplanner.util.allocater;



public class Driver {
	//create a waitlist 
	public String waitlist=new String();
	public static void main(String[] args) throws FileNotFoundException {

		
		if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}") ) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		//FileProcessor f=new FileProcessor();
		course c=new course();
		student s=new student();
		//Read 1st file
		
		//counting number of courses in the preference list
		int a=c.readfile(args[0]);
		
		FileProcessor f=new FileProcessor();
		
		course[] co=f.readfile1(args[0],a);
		int b=s.readfile(args[0]);
		
		student[] so=f.readfile2(args[0],b);
		allocater al=new allocater();
		
			so[0].pref=so[0].pref.replace(" ","");
		//checks which gp is iot a part of
		int count=0,i=0,cforallocated=0;
			String temp=new String();
			char t1;
			
			
				
					
						temp="";
				while(i<so[0].pref.length()-1)
					{
						
						int ret=al.part1(so[0].pref.charAt(i));
						//System.out.println(ret);
						
						int ret1=al.part2(so[0].pref.charAt(i),ret,so);
							while(ret1==-1)
							{ //when allocated course is from waitlist
								count++;
								//System.out.println("count"+count);
								if(count!=3)
										{
											
											//keep the part that has been allocated in a semester
											temp=temp+al.allocated.substring(al.allocated.length()- 1);
											al.helper(temp);
											
										
										}
										else
										{
											count=0;
											temp="";
											al.helper(temp);
										}
								
								ret1=al.part2(so[0].pref.charAt(i),ret,so);
								
								
								//System.out.println("TEMP"+temp);
							}
							if(ret1==1)
							{
								count++;
								//System.out.println("count"+count);
								//cforallocated++;
								if(count!=3)
										{
											
											//allocated ka last part
											temp=temp+al.allocated.substring(al.allocated.length()- 1);
											//t1=al.allocated.substring(al.allocated.length()- 1);
											al.helper(temp);
											
														
										}
										else
										{
											count=0;
											temp="";
											al.helper(temp);
										}
								
								
								
							}
							
										
									
							
							
							i++;
						
					}
					//System.out.println(al.allocated);
				context cont=new context();
				cont.exec(al.allocated);
				cont.setstore(so);
				cont.statechange(al.allocated);
				cont.setg(so);
				Results r=new Results();
				r.write(args[1],so);
				r.write1(so);
		
	}
}
