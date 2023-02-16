/*
 * This class creates and manages Business type objects that are used to store info about businesses
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Business extends Building {
	protected int numRentableUnits;//int variable for number of rentable units
	
	
	/**
	 * empty argument constructor to create a default Business object with all fields empty or 0
	 */
	public Business() {
		super();
		numRentableUnits=0;
	}//end default Business() constructor
	
	
	/*
	 * preferred constructor to create Business objects with specific attributes
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
	}//end preferred Business() constructor
	
	
	/*
	 * Prints the drawing code for Mall type objects
	 */
	public void draw() {
		System.out.println("Drawing Code for <<Business>>");
	}//end draw()
	
	
	/*
	 * This method prints all info about the Business object this method is used on.
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end toString()
	
	
	/**
	 * getter for variable numRentableUnits
	 * @return numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits()
	
	
	/**
	 * setter for variable numRentableUnits
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits=numRentableUnits;
	}//end setNumRentableUnits()
}//end Business class