class PizzaTest
	{
		public static void main (String [] args)
		{
			String pizzaType = "Cheese";		//name of pizza
        	int size = 10;                  	//size of pizza, diameter
        	int numSlices = 10;            //number of slices
        	int pizzaCost = 20;					//cost 
        	double a = 0.0;							//used in costPerSquareInch
        	double b;							

        	Pizza myPizza = new Pizza (pizzaType, size, numSlices, pizzaCost);
		
			System.out.printf ("Your %s pizza has %.2f square inches " +
			" per slice.\n", myPizza.getName(),
			myPizza.areaPerSlice(size, numSlices) );
		
			System.out.printf ("One slice costs $%.2f, which comes" +
			" to $%.3f per square inch.\n",myPizza.costPerSlice(pizzaCost, numSlices),
			myPizza.costPerSquareInch(pizzaCost, numSlices, size) );
		}
	}