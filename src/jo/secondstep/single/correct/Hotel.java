package jo.secondstep.single.correct;
import java.util.*;


public class Hotel {
	private String hotelName;
	private String ownerName;
	private HotelRating hotelRating;

	List<Employee> employeelist = new ArrayList<Employee>();



	 public void setHotelName(String t){
	   hotelName=t;
	 }
	 public String getHotelName(){
	   return hotelName; 
	 }

	 public void setownerName(String t){
	   ownerName=t;
	 }

	public String getowner(){
	   return ownerName; 
	 }
}
