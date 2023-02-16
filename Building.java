/*
 * This class creates and manages Building type objects that are used to store info about buildings
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Building {
	protected String projectName;//String variabe used for the project name
	protected String completeAddress;//String variable used for a building's address
	protected double totalSquareFeet;//double variable used for a building's space in sq ft
	protected String occupancyGroup;//String variable used for a building's occupancy group
	protected String subgroup;//String variable used for a building's subgroup
	
	
	/*
	 * empty argument constructor to create a default Building object with all fields empty or 0
	 */
	public Building() {
	projectName="";
	completeAddress="";
	totalSquareFeet=0.0;
	occupancyGroup="";
	subgroup="";
	}//end default Building() constructor
	
	
	/*
	 * Preferred constructor for creating Building objects with specific attributes
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	}//end preferred Building() constructor
	
	
	/*
	 * This method prints the drawing code for Building type objects
	 */
	public void draw() {
		System.out.println("Drawing Code for <<Building>>");
	}//end draw()
	
	
	/*
	 * This method prints all info about the Building object this method is used on.
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+ getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData()
	
	
	/**
	 * getter for variable projectName
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName()
	
	
	/**
	 * setter for variable 
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName=projectName;
	}//end setProjectName()
	
	
	/**
	 * getter for variable completeAddress
	 * @return completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end setCompleteAddress()
	
	
	/**
	 * setter for variable completeAddress
	 * @param completeAddress
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress=completeAddress;
	}//end getCompleteAddress()
	
	
	/**
	 * getter for variable totalSquareFeet
	 * @return totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet()
	
	
	/**
	 * setter for variable totalSquareFeet
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet=totalSquareFeet;
	}//end setTotalSquareFeet()
	
	
	/**
	 * getter for variable occupancyGroup
	 * @return occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup()
	
	
	/**
	 * setter for variable occupancyGroup
	 * @param occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup=occupancyGroup;
	}//setOccupancyGroup()
	
	
	/**
	 * getter for variable subgroup
	 * @return subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup()
	
	
	/**
	 * setter for variable subgroup
	 * @param subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup=subgroup;
	}//end setSubgroup()
}//end Building class