/*
 * This class creates and manages Apartment type objects that are used to store info about apartments 
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Apartment extends Residential {
	private int numRentableUnits;//int variable for number of rentable units
	private double avgUnitSize;//double variable for average unit size
	private boolean parkingAvailable;//boolean variable to declare if parking is available or not
	
	
	/*
	 * empty argument constructor to create a default Apartment object with all fields empty or 0
	 */
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
	}//end default Apratment() constructor
	
	
	/*
	 * preferred constructor to create Apartment objects with specific attributes
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
	}//end preferred Apartment() constructor
	
	
	/*
	 * Prints the drawing code for Apartment type objects
	 */
	public void draw() {
		System.out.println("Drawing Code for <<Apartment>>");
	}//end draw()
	
	
	/*
	 * Prints all info of the Apartment type object this method is used on
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + "\n");
		sb.append("Parking Available: " + getParkingAvailable() + "\n");
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Has Laundry Room: " + getLaundryRoom() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData()

	
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
	
	
	/**
	 * getter for variable avgUnitSize
	 * @return avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize()
	
	
	/**
	 * setter for variable avgUnitSize
	 * @param avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize=avgUnitSize;
	}//end setAvgUnitSize()
	
	
	/**
	 * getter for variable parkingAvailable
	 * @return parkingAvailable
	 */
	public boolean getParkingAvailable() {
		return parkingAvailable;
	}//end getParkingAvailable()
	
	
	/**
	 * setter for variable parkingAvailable
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable=parkingAvailable;
	}//end setParkingAvailable()
}//end Apartment class