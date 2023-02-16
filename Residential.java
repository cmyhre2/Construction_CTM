/*
 * This class creates and manages Residential type objects that are used to store info about Residences
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Residential extends Building{
	protected int numBedrooms;//int variable for number of bedrooms
	protected int numBathrooms;//int variable for number of bathrooms
	protected boolean laundryRoom;//boolean variable to declare if a residence has a laundry room or not
	
	
	/*
	 * empty argument constructor to create a default Residential object with all fields empty, 0, or false
	 */
	public Residential() {
		super();
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
	}//end default Residential() constructor
	
	
	/*
	 * preferred constructor to create Residential objects with specific attributes
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
	}//end preferred Residential() constructor
	
	
	/*
	 * This method prints all info about the Residential object this method is used on.
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Has Laundry Room: " + getLaundryRoom() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData()
	
	
	/**
	 * getter for variable numBedrooms
	 * @return numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms()
	
	
	/**
	 * setter for variable numBedrooms
	 * @param numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms=numBedrooms;
	}
	
	
	/**
	 * getter for variable numBathrooms
	 * @return numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms()
	
	
	/**
	 * setter for variable numBathrooms
	 * @param numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms=numBathrooms;
	}
	
	
	/**
	 * getter for variable laundryRoom
	 * @return laundryRoom
	 */
	public boolean getLaundryRoom() {
		return laundryRoom;
	}//end getLaundryRoom()
	
	
	/**
	 * setter for variable laundryRoom
	 * @param laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom=laundryRoom;
	}//end setLaundryRoom()
}//end Residential class