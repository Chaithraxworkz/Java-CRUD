class MovieDataOperatorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start aytu");
		MovieDataOperator.save("Vikranth Rona");
		MovieDataOperator.save("Lucky Man");
		MovieDataOperator.save("Mungarumale");
		MovieDataOperator.save("Ikkat");
		MovieDataOperator.save("Hridayam");
		System.out.println("mugitu");
		
		TempleDataOperator.displayDetails();
	}
}