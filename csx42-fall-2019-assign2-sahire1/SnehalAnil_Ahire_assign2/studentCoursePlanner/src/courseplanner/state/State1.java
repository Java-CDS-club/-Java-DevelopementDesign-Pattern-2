package courseplanner.state;

public class State1 implements CoursePlannerStateI
{
	
	
	public int count=0;

		public void maxcount()
		{
			count++;
			
		}
		
		public int getcount()
		{
			return count;
		}
}