/*
 * This class tests all methods from Building, Business, Residential, Mall,
 * Apartment and SingleFamilyHome classes
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 1 Project)
 * Spring 2023
*/
public class Application {

	public static void main(String[] args) {	
		/*
		 * Building Methods put to the test.
		 * Created a blank Business object by the name "kroger", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<Building class>\n");
		Building clinic = new Building();
		System.out.println("Name: " + clinic.getProjectName());
		clinic.setProjectName("Healix Clinic");
		System.out.println("Address: " + clinic.getCompleteAddress());
		clinic.setCompleteAddress("134 Thrid Street, Louisville, KY 40224");
		System.out.println("Total sq ft: " + clinic.getTotalSquareFeet());
		clinic.setTotalSquareFeet(1000.0);
		System.out.println("Occupancy Group: " + clinic.getOccupancyGroup());
		clinic.setOccupancyGroup("Hospital");
		System.out.println("Subgroup: " + clinic.getSubgroup());
		clinic.setSubgroup("I-2");
		System.out.println(clinic.displayData());
		
		
		/*
		 * Building object "clinic1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		Building clinic1 = new Building("Healix Clinic1", "234 Thrid Street, Louisville, KY 40224", 1000.0, "Hospital", "I-2");
		System.out.println(clinic1.displayData());
		
		
		/*
		 * Business Methods & inherited methods from Building put to the test.
		 * Created a blank Business object by the name "kroger", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<Business & Building classes>\n");
		Business kroger = new Business();
		System.out.println("Name: " + kroger.getProjectName());
		kroger.setProjectName("Kroger");
		System.out.println("Address: " + kroger.getCompleteAddress());
		kroger.setCompleteAddress("5533 New Cut Road, Louisville, KY 40214");
		System.out.println("Total sq ft: " + kroger.getTotalSquareFeet());
		kroger.setTotalSquareFeet(5000.0);
		System.out.println("Occupancy Group: " + kroger.getOccupancyGroup());
		kroger.setOccupancyGroup("Mercantile");
		System.out.println("Subgroup: " + kroger.getSubgroup());
		kroger.setSubgroup("M");
		System.out.println("Rentable units: " + kroger.getNumRentableUnits());
		kroger.setNumRentableUnits(50);
		kroger.draw();
		
		
		/*
		 * Business object "kroger1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		Business kroger1 = new Business("Kroger1", "5544 New Cut Road, Louisville, KY 40214", 5000.0, "Mercantile", "M", 50);
		System.out.println(kroger1.displayData());
		
		
		/*
		 * Mall Methods, inherited methods from Business and Building put to the test.
		 * Created a blank Mall object by the name "jefferson", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<Mall, Business & Building classes>\n");
		Mall jefferson = new Mall();
		System.out.println("Name: " + jefferson.getProjectName());
		jefferson.setProjectName("Jefferson");
		System.out.println("Address: " + jefferson.getCompleteAddress());
		jefferson.setCompleteAddress("4801 Outer Loop, Louisville, KY 40219");
		System.out.println("Total sq ft: " + jefferson.getTotalSquareFeet());
		jefferson.setTotalSquareFeet(950350.0);
		System.out.println("Occupancy Group: " + jefferson.getOccupancyGroup());
		jefferson.setOccupancyGroup("Mercantile");
		System.out.println("Subgroup: " + jefferson.getSubgroup());
		jefferson.setSubgroup("M");
		System.out.println("Rentable units: " + jefferson.getNumRentableUnits());
		jefferson.setNumRentableUnits(100);
		System.out.println("Rented units: " + jefferson.getNumRentedUnits());
		jefferson.setNumRentedUnits(67);
		System.out.println("Median Unit Size: " + jefferson.getMedianUnitSize());
		jefferson.setMedianUnitSize(1000);
		System.out.println("Parking Spaces: " + jefferson.getNumParkingSpaces());
		jefferson.setNumParkingSpaces(500);
		jefferson.draw();
		System.out.println(jefferson.displayData());
		
		
		/*
		 * Mall object "jefferson1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		Mall jefferson1 = new Mall("Jefferson1", "4805 Outer Loop, Louisville, KY 40219", 950350.0, "Mercantile", "M", 100, 67, 1000, 500);
		System.out.println(jefferson1.displayData());
		
		
		/*
		 * Residential Methods & inherited methods from Building put to the test.
		 * Created a blank Residential object by the name "shelter", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<Residential & Building classes>\n");
		Residential shelter = new Residential();
		System.out.println("Name: " + shelter.getProjectName());
		shelter.setProjectName("Homeless Shelter");
		System.out.println("Address:" + shelter.getCompleteAddress());
		shelter.setCompleteAddress("5717 Monroe Drive, Louisville, KY 40223");
		System.out.println("Total sq ft: " + shelter.getTotalSquareFeet());
		shelter.setTotalSquareFeet(3000.0);
		System.out.println("Occupancy Group: " + shelter.getOccupancyGroup());
		shelter.setOccupancyGroup("Institutional");
		System.out.println("Subgroup: " + shelter.getSubgroup());
		shelter.setSubgroup("I-1");
		System.out.println("Bedrooms: " + shelter.getNumBedrooms());
		shelter.setNumBedrooms(50);
		System.out.println("Bathrooms: " + shelter.getNumBathrooms());
		shelter.setNumBathrooms(20);
		System.out.println("Has Laundry Room: " + shelter.getLaundryRoom());
		shelter.setLaundryRoom(true);
		System.out.println(shelter.displayData());
		
		
		/*
		 * Residential object "shelter1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		Residential shelter1 = new Residential("Homeless Shelter1", "7717 Monroe Drive, Louisville, KY 40223", 3000.0, "Institutional", "I-1", 50, 20, true);
		System.out.println(shelter1.displayData());
		
		
		/*
		 * Apartment Methods, inherited methods from Residential and Building put to the test.
		 * Created a blank Apartment object by the name "southview", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<Apartment, Residential & Building classes>\n");
		Apartment southview = new Apartment();
		System.out.println("Name: " + southview.getProjectName());
		southview.setProjectName("Southview Apartments");
		System.out.println("Address:" + southview.getCompleteAddress());
		southview.setCompleteAddress("7420 Southview Drive, Louisville, KY 40220");
		System.out.println("Total sq ft: " + southview.getTotalSquareFeet());
		southview.setTotalSquareFeet(45000.0);
		System.out.println("Occupancy Group: " + southview.getOccupancyGroup());
		southview.setOccupancyGroup("Residential");
		System.out.println("Subgroup: " + southview.getSubgroup());
		southview.setSubgroup("R-2");
		System.out.println("Bedrooms: " + southview.getNumBedrooms());
		southview.setNumBedrooms(100);
		System.out.println("Bathrooms: " + southview.getNumBathrooms());
		southview.setNumBathrooms(50);
		System.out.println("Has Laundry Room: " + southview.getLaundryRoom());
		southview.setLaundryRoom(true);
		System.out.println("Rentable Units: " + southview.getNumRentableUnits());
		southview.setNumRentableUnits(50);
		System.out.println("Avg Unit Size (sq ft): " + southview.getAvgUnitSize());
		southview.setAvgUnitSize(900.0);
		System.out.println("Has Parking: " + southview.getParkingAvailable());
		southview.setParkingAvailable(true);
		southview.draw();
		System.out.println(southview.displayData());
		
		
		/*
		 * Apartment object "southview1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		Apartment southview1 = new Apartment("Southview Apartments1", "7420 Southview Drive, Louisville, KY 40220", 45000.0, "Residential", "R-3", 100, 50, true, 50, 900.0, true);
		System.out.println(southview1.displayData());
		
		
		/*
		 * SingleFamilyHome Methods, inherited methods from Residential and Building put to the test.
		 * Created a blank SingleFamilyHome object by the name "martin", used getters, then the
		 * respected setter for each variable then draw method and finally the display data
		 * method to show that all setters worked along with the display data method itself.
		 */
		System.out.println("<SingleFamilyHome, Residential & Building classes>\n");
		SingleFamilyHome martin = new SingleFamilyHome();
		System.out.println("Name: " + martin.getProjectName());
		martin.setProjectName("Martin's House");
		System.out.println("Address:" + martin.getCompleteAddress());
		martin.setCompleteAddress("1229 Park Avenue, Louisville, KY 40221");
		System.out.println("Total sq ft: " + martin.getTotalSquareFeet());
		martin.setTotalSquareFeet(2000.0);
		System.out.println("Occupancy Group: " + martin.getOccupancyGroup());
		martin.setOccupancyGroup("Residential");
		System.out.println("Subgroup: " + martin.getSubgroup());
		martin.setSubgroup("R-1");
		System.out.println("Bedrooms: " + martin.getNumBedrooms());
		martin.setNumBedrooms(5);
		System.out.println("Bathrooms: " + martin.getNumBathrooms());
		martin.setNumBathrooms(2);
		System.out.println("Has Laundry Room: " + martin.getLaundryRoom());
		martin.setLaundryRoom(true);
		System.out.println("Has Garage: " + martin.getGarage());
		martin.setGarage(true);
		martin.draw();
		System.out.println(martin.displayData());
		
		
		/*
		 * SingleFamilyHome object "martin1" created with preferred constructor & info displayed
		 * to prove the preferred constructor's full functionality.
		 */
		SingleFamilyHome martin1 = new SingleFamilyHome("Martin's House1", "1229 Park Avenue, Louisville, KY 40222", 2000.0, "Residential", "R-1", 5, 2, true, true);
		System.out.println(martin1.displayData());
	}
}