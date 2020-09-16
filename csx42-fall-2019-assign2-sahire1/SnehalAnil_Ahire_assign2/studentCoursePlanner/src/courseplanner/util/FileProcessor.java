package courseplanner.util;
//import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import org.apache.commons.lang3.ArrayUtils;
public class FileProcessor 
{
	
	public course[] readfile1(String input,int linesIn)  
	{
		course[] co=new course[linesIn];
		String name;
		int cap;
		int time;
	
		  //CITED CODE https://www.journaldev.com/709/java-read-file-line-by-line
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader(input));
					String line = reader.readLine();
					//int i=1;
					int conum=0;
					while (line != null) 
					{
						co[conum]=new course();
						//System.out.println(line);
						// read next line
						//L1 has cname
										String[] l1 = line.split(" ");
										//check output
									//L2 has capacity and timing
										//String[] l2=l1[1].split(";");
										
									
										
										for(int j=1;j<l1.length;j++)
										{
										//name=l1[j].charAt(0);
										
											name=l1[j];
											co[conum].cname=name;
											int ascii =(int)name.charAt(0);
											//System.out.println(name);
											if(ascii>64 && ascii <89)
											{
												
											}
											else
											{
												System.out.println("Input value is not a valid course name, give value between A and Z ");
											}
											//System.out.println(name);
											//System.out.println(l1[j]);
										
											
											
										}
										//co[conum].course(cap,time,name);
													line = reader.readLine();
													conum++;

					}
			
			reader.close();
			
			} catch (IOException e) 
				{
					e.printStackTrace();
				}
				finally
				{
					
				}
			 
				
		return co;
				//return 0;
	}
	
	
	
	
	//read student pref course
	public student[] readfile2(String input,int linesIn)  
	{
		student so[]=new student[linesIn];
		int id;
		//String lev;
		String cf;
	//CITE CODE https://www.tutorialspoint.com/java/java_files_io.htm
	      //FileInputStream in = null;
		  //System.out.println(input);
		  //CITE CODE https://www.journaldev.com/709/java-read-file-line-by-line
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader(input));
					String line = reader.readLine();
					//int i=1;
					int sonum=0;
					while (line != null) 
					{
						//System.out.println(line);
										so[sonum]=new student();
										
										
										String[] l1 = line.split(" ");
										//check output
									//L2 has capacity and timing
								//System.out.println(l1[0]);
									
										String[] l2=l1[0].split(":");
										//System.out.println(l2[0]);
										
									
										for(int i=0;i<l2.length;i++)
										{
											if(i==0)
										{
											//System.out.println(l1[i]);
											//ID IS HERE
											id=Integer.parseInt(l2[i]);
											//System.out.println(id);
											/*
											if(id>=100 && id<=999)
										{
											
										}else
										{
											System.out.println("Input is not 3 digit");
										}
										*/
											so[sonum].sid=id;
											
										}
											
										}
										
										l1 = line.split(":");
													//System.out.println(l1[1]);							
										
										for(int j=0;j<l1.length;j++)
										{
											if(j==1)
											{
												cf=l1[j];
												//cf=cf.replace(",", "");
												/*
												if(cf.length()!=9)
												{
													System.out.println("More than 9 preferences are given");
												}
												*/
												so[sonum].pref=cf;
												//System.out.println(cf);
												//COURSE PREF
											}
											
											//System.out.println(l2[j]);
											
										}
										
													line = reader.readLine();
					
				sonum++;
					
					}
			
			reader.close();
			
			
			} catch (IOException e) 
				{
					e.printStackTrace();
				}
				finally
				{
					
				}
			 
				
		return so;
				//return 0;
	}
	
	
	
	
}


