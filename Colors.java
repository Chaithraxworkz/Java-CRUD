class Colors
{
	static String[] names={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String colorName)
	{
		System.out.println("Start colours counting"+colorName);
		names[position]=colorName;
		position++;
		if(colorName!=null && colorName.length()>3)
		{
			if(position>=7)
			{
				System.out.println("Colors name is exceded");
				return;
			}
			else
			{
				System.out.println("ditails is error less than 3");
			}
		}
	}
	static boolean find(String temp)
	{		
		for(int i=0;i<names.length;i++)
		{
			String ref=names[i];
			if(ref==temp)
			{
				System.err.println("Colours Call"+temp);
				return true;
			}
			else
			{
				System.out.println("does not match");
			}
		}
		return false;
	}
	static void displayDetails()
	{
		for(int i=0; i<names.length;i++)
		{
			System.out.println("names" +names[i]);
		}
	}
	
}