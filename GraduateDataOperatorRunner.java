class GraduateDataOperatorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start aytu");
		GraduateDataOperator.save("Engineering");
		GraduateDataOperator.save("B.com");
		GraduateDataOperator.save("BSC");
		GraduateDataOperator.save("BCA");
		GraduateDataOperator.save("M.Tec");
		System.out.println("mugitu");
		
		GraduateDataOperator.displayDetails();
	}
}