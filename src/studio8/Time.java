package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	public int hour;
	public int minute;
	public boolean format;
	
	public Time(int hour1, int minute1, boolean format1) {
		this.hour=hour1;
		this.minute=minute1;
		this.format=format1;
		format1=false;
		
	}
	
	public String toString() {
		if(this.format) {
			return hour%12 + ":" + minute;
			}	
		else {
			return hour + ":" + minute;
		}
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time now = new Time(1,28,false);
		System.out.println(now.toString());
    	
		Time now1 = new Time (14,47, true);
		System.out.println(now1.toString());
		
		Time now2= new Time(16, 58, false);
		System.out.println(now2.toString());
		
		System.out.println(now.equals(now1));
		System.out.println(now.equals(now));
		
		LinkedList<Time> list = new LinkedList<Time>();
		list.add(now);
		list.add(now1);
		list.add(now2);
		list.add(now2);
		System.out.println(list);
		
		HashSet<Time> set = new HashSet<Time>();
		set.add(now);
		set.add(now1);
		set.add(now2);
		set.add(now2);
		System.out.println(set);
    }

}