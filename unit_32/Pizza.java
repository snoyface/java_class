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

	Pizza (String name, int s, int sls, int css )
	{
		pizzaType = name;
		size = s;
		numSlices = sls;
		pizzaCost = css;
	}

	Pizza (int s, int sls, int css)
	{
		pizzaType = "not defined";  //in case there is no pizza type
		size = s;
		numSlices = sls;
		pizzaCost = css;
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

	double costPerSquareInch (int pizzaCost, int numSlices,int size  )
	{
		double costPerSlice = pizzaCost/numSlices;
		double wholeArea = Math.PI * Math.pow ((size/2), 2);
        double areaSlice = wholeArea/numSlices;
		double costPerInch = costPerSlice/areaSlice;
		return costPerInch;
	}
}