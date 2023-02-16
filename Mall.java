/*
 * This class creates and manages Mall type objects that are used to store info about malls
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Mall extends Business {
	private int numRentedUnits;//int variable for number of rented units
	private double medianUnitSize;//double variable for median unit size
	private int numParkingSpaces;//int variable for number of parking spaces
	
	
	/*
	 * empty argument constructor to create a default Mall object with all fields empty or 0
	 */
	public Mall () {
		super();
		numRentedUnits=0;
		medianUnitSize=0;
		numParkingSpaces=0;
	}//end default Mall() constructor
	
	
	/*
	 * preferred constructor to create Mall objects with specific attributes
	 */
	public Mall (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits=numRentedUnits;
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
	}//end preferred Mall() constructor
	
	
	/*
	 * Prints the drawing code for Mall type objects
	 */
	public void draw() {
		System.out.println("Drawing Code for <<Mall>>");
	}//end draw()
	
	
	/*
	 * Prints all info of the Mall type object this method is used on
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		sb.append("Parking Spaces: " + getNumParkingSpaces() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData()
	
	
	/**
	 * getter for variable numRentedUnits
	 * @return numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits()
	
	
	/**
	 * setter for variable numRentedUnits
	 * @param numRentedUnits
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits=numRentedUnits;
	}//end setNumRentedUnits()
	
	
	/**
	 * getter for variable medianUnitSize
	 * @return medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize()
	
	
	/**
	 * setter for variable medianUnitSize
	 * @param medianUnitSize
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize=medianUnitSize;
	}//end setMedianUnitsSize()
	
	
	/**
	 * getter for variable numParkingSpaces
	 * @return numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces()
	
	
	/**
	 * setter for variable numParkingSpaces
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces=numParkingSpaces;
	}//end setNumParkingSpaces()
}//end Mall class