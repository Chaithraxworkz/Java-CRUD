class ColorsRunner
{
	public static void main(String[] args)
	{
		System.out.println("Entering to main");
		Colors.save("Pink");
		Colors.save("Red");
		Colors.save("Black");
		Colors.save("Gold");
		Colors.save("White");
		Colors.save("Blue");
		Colors.save("Purple");
		
		Colors.displayDetails();
		
		boolean found=Colors.find("yellow");
		System.out.println("found" +found);
		
		System.out.println("main is closed");
	}
}