public class Car
{
	//attributes
	private double mpg;
	private double gas;
	
	/**
		Sets the fuel efficiency to the given value.
		@ param mpg fuel efficiency of the car
	*/
	public void setMpg(double mpg)
	{
		this.mpg = mpg;
	}
	
	/**
		Retrives the fuel efficiency of the car.
		@return the fuel efficiency of the car in miles/gallons
	*/
	public double getMpg()
	{
		return mpg;
	}
	
	/**
		Sets the gas in the tank.
		@param gas the amount of gas to add to the tank
	*/
	
	public void setGas(double gas)
	{
		this.gas += gas;
	}
	
	/**
		Retrives the amount of gas in the tank.
		@return the amount of gas currently in the car's tank
	*/
	public double getGas()
	{
		return gas;
	}
	
	/**
		Initalizes a car with a given fuel efficiency.
		@param mpg default fuel efficiency of the car
	*/
	//constructor with a single parameter
	public Car(double mpg)
	{
		this.mpg = mpg;
		this.gas = 0;
	}
	
	/**
		Simulate driving the car for a distance, thus using fuel.
		@param distance the distance the car travelled
	*/
	
	public void drive(double distance)
	{
		gas = gas-(distance/mpg);
		//gas -= (distance/mpg); or this
	}
}