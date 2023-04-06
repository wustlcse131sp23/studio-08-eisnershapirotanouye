package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
public int month;
public int day;
public int year;
public boolean holiday;

public Date(int month1, int day1, int year1, boolean holiday1) {
	this.month=month1;
	this.day=day1;
	this.holiday=holiday1;
	this.year=year1;
	holiday1=false;
}
public String toString() {
	if(this.holiday) {
		return "holiday! " + month + "/" + day + "/" + year;
		}	
	else {
		return month + "/" + day + "/" + year;
	}
}

 
    @Override
public int hashCode() {
	return Objects.hash(day, month, year);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}



	public static void main(String[] args) {
    		Date mason = new Date(1, 3, 2004, false);
    		System.out.println("Mason: " +(mason.toString()));
        	
    		Date tori = new Date(11,7,2004,false);
    		System.out.println("Tori: " + (tori.toString()));
    		
    		Date noah= new Date(2, 6, 2004, false);
    		System.out.println("Noah: " + (noah.toString()));
    		
    		Date alsoNoah = new Date(2,6,2004,false);
    		
    		System.out.println(noah.equals(alsoNoah));
    	
    		LinkedList<Date> list = new LinkedList<Date>();
    		list.add(mason);
    		list.add(tori);
    		list.add(noah);
    		list.add(noah);
    		System.out.println(list);
    		
    		HashSet<Date> set = new HashSet<Date>();
    		set.add(mason);
    		set.add(tori);
    		set.add(noah);
    		set.add(noah);
    		System.out.println(set);

    }

}


