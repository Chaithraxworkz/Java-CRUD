class TempleDataOperator
{
	static int temp=0;
	static String[] templeName={null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("Entering to main");
		templeName[temp]=name;
		
		System.out.println("Name is:" +name+ "Temp" +temp);
		temp++;
		System.out.println("closing the main");
		
		
			for(int i=0; i<templeName.length; i++)
			{
				System.out.println("Temple details:"+templeName[i]);
			}
		
		
		
		
	}
}









