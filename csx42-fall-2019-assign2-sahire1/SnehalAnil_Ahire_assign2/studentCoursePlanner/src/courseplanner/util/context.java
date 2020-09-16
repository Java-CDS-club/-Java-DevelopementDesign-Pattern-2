package courseplanner.util;
import courseplanner.state.State1;
import courseplanner.state.State2;
import courseplanner.state.State3;
import courseplanner.state.State4;
import courseplanner.state.State5;
import courseplanner.util.allocater;
import courseplanner.util.student;
public class context 
{
	
		int count1,count2,count3,count4,count5;
				State1 s1=new State1();
				State2 s2=new State2();
				State3 s3=new State3();
				State4 s4=new State4();
				State5 s5=new State5();
				
					allocater alo=new allocater();
				int count=0;
				int statecount=0;
				
				
				int final1=0,final2=0,final3=0,final4=0,final5=0;
				public int store,g=1;
				
				
				
	public void inc_count(char a,State1 s1,State2 s2,State3 s3,State4 s4,State5 s5)
	{
			
		
	
					String gp1=new String();
				
					String gp2=new String();
					
					String gp3=new String();
					
					String gp4=new String();
					
					String gp5=new String();
					
					int ret;
					//defining groups
						gp1="ABCD";
						gp2="EFGH";
						gp3="IJKL";
						gp4="MNOP";
						gp5="QRSTUVWXYZ";
						//checking which group is the character of
					ret=alo.partof(gp1,a);
					//Increasing count of that particular state
					if(ret!=-1)
					{
						
						s1.maxcount();
					}else if (alo.partof(gp2,a)!=-1)
						{
						
						s2.maxcount();
					}
					else if (alo.partof(gp3,a)!=-1)
						{
						
						s3.maxcount();
					}
					else if (alo.partof(gp4,a)!=-1)
						{
						
						s4.maxcount();
					}
					else if (alo.partof(gp5,a)!=-1)
						{
						
						s5.maxcount();
					}
					
				
	}
	
	
	public String decide( State1 s1,State2 s2,State3 s3,State4 s4,State5 s5)
	{
		//to decide who has maximum number of allocations
		String track=new String();
		count1=s1.getcount();
		
		count2=s2.getcount();
		
		count3=s3.getcount();
		
		count4=s4.getcount();
		
		count5=s5.getcount();
		
		
		int max=count1;
		
		track="State1";
		if(count2>max)
		{
			max=count2;
			track="State2";
			//System.out.println(count2);
		}
		if(count3>max)
		{
			max=count3;
			track="State3";
			//System.out.println(count3);
		}
		if(count4>max)
		{
			max=count4;
			track="State4";
			//System.out.println(count3);
		}
		if(count5>max)
		{
			max=count5;
			track="State5";
			//System.out.println(count3);
		}
		
		//state done here
		//System.out.println(track);
		return track;
	}
		
		
		
			public void exec(String alok)
			{	
				//to check for graduation
				String gp1=new String();
	
				String gp2=new String();
				
				String gp3=new String();
				
				String gp4=new String();
				
				String gp5=new String();
				gp1="ABCD";
				gp2="EFGH";
				gp3="IJKL";
				gp4="MNOP";
				gp5="QRSTUVWXYZ";
				//System.out.println(alok);
				for(int j=0;j<alok.length();j++)
					{
						int swi=1;
														
														if(alo.partof(gp1,alok.charAt(j))!=-1)
														{
															swi=1;
														}else if(alo.partof(gp2,alok.charAt(j))!=-1)
														{
															swi=2;
														}else if(alo.partof(gp3,alok.charAt(j))!=-1)
														{
															swi=3;
														}else if(alo.partof(gp4,alok.charAt(j))!=-1)
														{
															swi=4;
														}else if(alo.partof(gp5,alok.charAt(j))!=-1)
														{
															swi=5;
														}
														//System.out.println(swi+"swi");
														
														switch(swi)
														{
															case 1:final1++; //System.out.println("final1		"+final1);
															break;
															case 2:final2++; //System.out.println("final2		"+final2);
															break;
															case 3:final3++; //System.out.println("final3		"+final3);
															break;
															case 4:final4++; //System.out.println("final4		"+final4);
															break;
															case 5:final5++; //System.out.println("final5		"+final5);
															
														}
														//System.out.println(swi+"swi");
														if((final1>2) && (final2>2) && (final3>2)&& (final4>2) && (final5>2))
														{
															
															//stop it
															
															//System.out.println("Graduated");
															
															//break;
														}
														else 
														{ store=j-1;
															
															//System.out.println("student does not graduate");
														}
														if(j==alok.length())
														{
															g=0;
														}
											
					}
					
					//System.out.println("store"+store);
				
			}
			
			public void statechange(String alok)
			{
				//to track the change in state
				String[] track=new String[100];
				
				alok=alok.substring(0,store);
				//System.out.println(alok);
				String gp1=new String();
	
				String gp2=new String();
				
				String gp3=new String();
				
				String gp4=new String();
				
				String gp5=new String();
				gp1="ABCD";
				gp2="EFGH";
				gp3="IJKL";
				gp4="MNOP";
				gp5="QRSTUVWXYZ";
				int thing=1;
				int statecount=0;
				//System.out.println(thing);
										
				for(int j=0;j<alok.length();j++)
					{
						
						
						//System.out.println(alok.charAt(j));
										
									inc_count(alok.charAt(j),s1,s2,s3,s4,s5);
											
											
											//cforallocated++;
											
											//if(count)
						//System.out.println(track[thing])
												
						if(thing%3==0)
						{		
		
							track[thing]=decide(s1,s2,s3,s4,s5);
							
							
							if(!track[thing].equals(track[thing-3]))
							{
										statecount++;
							}
										
							
											//System.out.println(track[thing]);

						}
						thing++;
			
					}
				
					
				//System.out.println("statecount"+statecount);
				
			}
		
		public int getstore()
		{
			return store;
		}
		public void setstore(student[] so)
		{
			so[0].store=store;
			//System.out.println("stustoret"+so[0].store);
		}
		public void setstatecount(student[] so)
		{
			so[0].statecount=statecount;
			//System.out.println("stustoret"+so[0].store);
		}
		public void setg(student[] so)
		{
			so[0].g=g;
			//System.out.println("stustoret"+so[0].store);
		}
}