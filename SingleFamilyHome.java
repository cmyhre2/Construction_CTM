/*
 * This class creates and manages SingleFamilyHome type objects that are used to store info about
 * single family homes
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class SingleFamilyHome extends Residential{
	private boolean garage;//boolean to declare if a single family home has a garage or not
	
	
	/**
	 * getter for variable garage
	 * @return garage
	 */
	public boolean getGarage() {
		return garage;
	}//end getGarage
	
	
	/**
	 * setter for variable garage
	 * @param garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	
	/*
	 * empty argument constructor to create a default SingleFamilyHome object with all fields empty or 0
	 */
	public SingleFamilyHome() {
		super();
		garage=false;
	}//end default SingleFamilyHome() constructor
	
	
	/*
	 * preferred constructor to create SingleFamilyHome objects with specific attributes
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage=garage;
	}//end preferred SingleFamilyHome() constructor
	
	
	/*
	 * Prints the drawing code for SingleFamilyHome type objects
	 */
	public void draw(){
		System.out.println("Drawing Code for <<Single Family Home>>");
	}//end draw()
	
	
	/*
	 * Prints all info of the SingleFamilyHome type object this method is used on
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Bathrooms : " + getNumBathrooms() + "\n");
		sb.append("Has Laundry Room : " + getLaundryRoom() + "\n");
		sb.append("Has Garage : " + getGarage() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData()
}//end SingleFamilyHome class
