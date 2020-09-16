package courseplanner.util;
import courseplanner.util.student;
import courseplanner.util.course;
import java.util.Arrays;




public class allocater
{
	
		int course_count=0;
		String gp1=new String();
	
		String gp2=new String();
		
		String gp3=new String();
		
		String gp4=new String();
		
		String gp5=new String();
		
		public String allocated=new String();
	
		int track=0;
		public String wait=new String();
		public String temp=new String();
		
		char r2;
		public int getcourse_count()
		{
			return course_count;
		}
		public char getrecent()
		{
			return r2;
		}
		
	public int partof(String gp,char a)
	{//Check if a character is a part of string
		for(int i=0;i<gp.length();i++)
		{
			
			if(gp.charAt(i)==a)
			{
				
				
				return i;
			}
		}
		
		return -1;
		
		
	}
	
	
	
	
	
		public int part1(char p)
		{
			//returns the group number of particular character
			 int num;
			gp1="ABCD";
			gp2="EFGH";
			gp3="IJKL";
			gp4="MNOP";
			gp5="QRSTUVWXYZ";
			
			
								
			
				
				
			int ret=partof(gp1,p);
			
			
			
			
			num=1;
			//check 
			if(ret==-1)
			//so[0].c=so[0].c+gp1.charAt(ret);
			{
			 ret=partof(gp2,p);
				num=2;
				
			}
			 if (ret==-1)
			 {
				 if(partof(gp3,p)!=-1)
				{	
					 ret=partof(gp3,p);
					 num=3;
				}
				else if(partof(gp4,p)!=-1)
				{
					ret=partof(gp4,p);
					num=4;
				}
				else
				{
				
				ret=partof(gp5,p);
				num=5;
				}
				
			 }
			 
			 
			 
			 
			 
			 
			 //after deciding the num, now see if it needs pre requisite or not
			// System.out.println(num);
			 return num;
		}

public void graduating()
{
	
	
}

public String remove(String wait, char val)
{
	//removes a character from waitlist
	char[] chars = wait.toCharArray();
    
	for(int i=0;i<wait.length();i++)
	{
		if(wait.charAt(i)==val)
		{
			chars[i] =' ';
			//wait.charAt(i)=" ";
			
		}
		//wait.charAt(i)=chars[i];
		wait=String.valueOf(chars);
		//System.out.println("chars"+chars[i]);
	}
	
	wait=wait.replace(" ","");
	//System.out.println("remove"+wait);
	return wait;
}


public char part1half(char a)  //checks if waitlist characters need to be added
{String gpname=new String();
char rt='0';

					int r=part1(a);
					//System.out.println(r);
					switch(r)
							{
								case 1:gpname=gp1;
								break;
								case 2:gpname=gp2;
								break;
								case 3:gpname=gp3;
								break;
								case 4:gpname=gp4;
								break;
								case 5:gpname=gp5;
								break;
								
							}
							//System.out.println(gpname);
					int ind=gpname.indexOf(a);
					for(int j=0;j<ind;j++)
					{
						if(partof(allocated,gpname.charAt(j))!=-1)
						{
							
							if(j==ind-1)
							{
								//System.out.println("everything before that is allocated");
								//System.out.println(a);
								return a;
							}
						}
						else
						{
							rt=0;
						}
							
					
					}
			//	}
				
			
			return rt;
}

public void helper(String tempIn)
{ temp=tempIn;  //gets recent 3 allocations from caller.
	
}

public String getalloc()
{ return allocated;
	
}

public int part2(char p,int ret,student[] so)
		{ 
		String gpname=new String();
		String gpname1=new String();
			
			switch(ret)
			{
				case 1:gpname=gp1;
				break;
				case 2:gpname=gp2;
				break;
				case 3:gpname=gp3;
				break;
				case 4:gpname=gp4;
				break;
				case 5:gpname=gp5;
				break;
			}
			int ind=gpname.indexOf(p);
			//finding out index of input
		
				for(int i=0;i<wait.length();i++)
				{
				char val=part1half(wait.charAt(i));
				//check if waitlist needs to be allocated
							
							if(val!='0')
							{
								int gnameforwait=part1(val);
								switch(gnameforwait)
									{
										case 1:gpname1=gp1;
										break;
										case 2:gpname1=gp2;
										break;
										case 3:gpname1=gp3;
										break;
										case 4:gpname1=gp4;
										break;
										case 5:gpname1=gp5;
										break;
									}
									
									int ind1=gpname1.indexOf(val);
								//System.out.println(temp);
								for(int j=0;j<ind1;j++)
							{
								//System.out.println("temp"+temp);
								
								if(partof(temp,gpname1.charAt(j))!=-1)
										{
											//check if it is a part of same semester allocations
											
											track=0;
										}
										else
									{
										track=1;
										
										//remove from wait list and allocate;
										
									}
											
							}
								
								if(track==1)
								{
									
									wait=remove(wait,val);
									//System.out.println("wait after removal"+wait);
									so[0].c=so[0].c+val;
									allocated=allocated+val;
									r2=val;
									
									course_count++;
									
									track=-1;
									return -1;
									
									
									
									
								}
								
							}
							else
							{
								//System.out.println("earlier all not allocated");
							}
			
				
				
			}	
		//}
/*			}
				else
				{
					so[0].c=so[0].c+p;
					allocated=allocated+p;
					course_count++;
					track=1;
					return track;
				}
				*/
				//see where break goes
			if(ind!=0)
			{
				
				for(int i=0;i<ind;i++)
				{
					//System.out.println("alloc"+allocated);
					if(partof(allocated,gpname.charAt(i))!=-1)
					{
						
						
						if(partof(temp,gpname.charAt(i))!=-1)
						{
							//track=0;
							if(gpname.equals(gp5))
							{//can move ahead with allocation as it is group 5
								track=1;
								
							}
							else
							{
								//System.out.println("temp alert");
								//wait=wait+p;
								//System.out.println(temp);
								track=0;
							}
						}
						else
						{track=1;}
						
					}
					else
						track=0;
				}
						if(track==1)
						{
							//all courses before this has been allocated
						
						so[0].c=so[0].c+p;
						allocated=allocated+p;
						//System.out.println(p);
						r2=p;
						course_count++;
						track=1;
						return track;
						}
					
					
				
				
			}
			else
			{ //when input string has 0th index
					so[0].c=so[0].c+p;
					allocated=allocated+p;
					r2=p;
					course_count++;
					//System.out.println("allocated for 0");
					//System.out.println(p);
					//break;
					track=1;
					return 1;
			}
			
				if(track==0)
				{
					wait=wait+p;
				//System.out.println("putting to wait");
				}
				else
				{
					so[0].c=so[0].c+p;
					allocated=allocated+p;
					r2=p;
					course_count++;
					//System.out.println("allocated");
					//System.out.println(p);
					track=1;
					return track;
				}
			
			return track;
			
		}


/*
public int part3(char p,int ret,student[] so)
{
	String gpname=new String();
		String gpname1=new String();
			
			switch(ret)
			{
				case 1:gpname=gp1;
				break;
				case 2:gpname=gp2;
				break;
				case 3:gpname=gp3;
				break;
				case 4:gpname=gp4;
				break;
				case 5:gpname=gp5;
				break;
			}
			int ind=gpname.indexOf(p);
			
	
	
	if(ind!=0)
			{
				
				for(int i=0;i<ind;i++)
				{
					//System.out.println("alloc"+allocated);
					if(partof(allocated,gpname.charAt(i))!=-1)
					{
						//System.out.println(p);
						//so[0].c=so[0].c+p;
						//call some method
						
						if(partof(temp,gpname.charAt(i))!=-1)
						{
							//track=0;
							System.out.println("temp alert");
							//wait=wait+p;
							System.out.println(temp);
							track=0;
						}
						else
						{track=1;}
						
					}
					else
						track=0;
				}
						if(track==1)
						{
						System.out.println("found aage ke + alloted now");
						so[0].c=so[0].c+p;
						allocated=allocated+p;
						System.out.println(p);
						course_count++;
						track=1;
						return track;
						}
					
					
				
				
			}
			else
			{
					so[0].c=so[0].c+p;
					allocated=allocated+p;
					course_count++;
					System.out.println("allocated for 0");
					System.out.println(p);
					//break;
					track=1;
					return 1;
			}
			
				if(track==0)
				{
					wait=wait+p;
				System.out.println("putting to wait");
				}
				else
				{
					so[0].c=so[0].c+p;
					allocated=allocated+p;
					course_count++;
					System.out.println("allocated");
					System.out.println(p);
					track=1;
					return track;
				}
			
			return track;
			
		}
		*/


}

