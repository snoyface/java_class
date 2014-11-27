class Pizza
{
	//defining the object instances 
	String pizzaType;
	int size;
	int pizzaCost;
	int numSlices;


	//constructors
	
	Pizza()
	{
		System.out.println (" Pizza! ");
	}

	Pizza (int s, int sls, int cs)
	{
		pizzaType = "not defined";  //in case there is no pizza type
		size = s;
		numSlices = sls;
		pizzaCost = cs;
	}

	Pizza (String name, int s, int sls, int cs )
	{
		pizzaType = name;
		size = s;
		numSlices = sls;
		pizzaCost = cs;
	}

	//actions of Pizza

	String getName ()
	{
	return pizzaType;
	}

	double areaPerSlice(int size, int slices)
    {
        double wholeArea = Math.PI * Math.pow ((size/2), 2);
        double areaSlice = wholeArea/numSlices;
        return areaSlice;
    }

	double costPerSlice(double pizzaCost, int numSlices)
	{
		double costPerSlice = pizzaCost/numSlices;
		return costPerSlice;
	}

	double costPerSquareInch (double costPerSlice, double areaSlice)
	{
		double costPerInch = costPerSlice/areaSlice;
		return costPerInch;
	}
}