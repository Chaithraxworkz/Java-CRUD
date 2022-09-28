class PoliticianDataOperator
{
	static String[] politicianName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		System.out.println("Entering to main");
		politicianName[position]=name;
		
		System.out.println("Name is:" +name+ "position" +position);
		position++;
		System.out.println("closing the main");
		
		static void displayDetails()
		{
			System.out.println("display details");
			for(int i=0; i<politicianName.length; i++)
			{
				System.out.println(i);
				System.out.println("politcian details:"+politicianName[i]);
			}
		}
		
		
		
	}
}