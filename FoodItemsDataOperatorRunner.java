class FoodItemsDataOperatorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start aytu");
		FoodItemsDataOperator.save("Pani Puri");
		FoodItemsDataOperator.save("Dosa");
		FoodItemsDataOperator.save("Fried Rice");
		FoodItemsDataOperator.save("Samosa");
		FoodItemsDataOperator.save("Gobi");
		System.out.println("mugitu");
		
		FoodItemsDataOperator.displayDetails();
	}
}