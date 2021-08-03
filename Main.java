package zkouska;
import java.util.ArrayList;

public class Main {
	
	public static Device findID(int id,ArrayList<Device> devices) {
		for (int i = 0; i < devices.size();i++) {
			if (devices.get(i).getId() == id) {
				return devices.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Device> d = new ArrayList<Device>();
		ArrayList<Laptop> l = new ArrayList<Laptop>();
		ArrayList<PC> p = new ArrayList<PC>();
		
		
		Device d1 = new Device(1,"John", 2, 6);
		Laptop l1 = new Laptop(2, "Franny",6,8,new Monitors("1920x1080", "OLED"));
		PC p1 = new PC(3,"Sirius", 16, 32, new Monitors("3840×2160", "LCD"),new Periferie("Printer"));
		Device d2 = new Device(4,"Vicki", 4, 16);
		Laptop l2 = new Laptop(5, "Jason",8,16,new Monitors("3840×2160", "LCD"));
		PC p2 = new PC(6,"Ali", 12, 32, new Monitors("1920x1080", "LCD"),new Periferie("Keyboard"));
		Device d3 = new Device(7,"Dougie", 4, 8);
		Laptop l3 = new Laptop(8, "Logan",8,32,new Monitors("1920x1080", "LCD"));
		PC p3 = new PC(9,"Herman", 16, 64, new Monitors("3840×2160", "QLED"),new Periferie("Mouse"));
		
		d.add(d1);
		d.add(d2);
		d.add(d3);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		//Vypíše, jelikož našel dle ID
		if (findID(1,d) != null) {
			System.out.println("\n" + "Nalezeno dle ID (" + findID(1,d).getId() + ") - " + findID(1,d));
		} else {
			System.out.println("\n" + "Nenalezeno");
		}
		//Nevypíše, jelikož nenašel dle ID
		if (findID(3,d) != null) {
			System.out.println("\n" + "Nalezeno dle ID (" + findID(3,d).getId() + ") - " + findID(3,d));
		} else { 
			System.out.println("\n" + "Nenalezeno");
		}
		
		System.out.println("\n" + d);
		System.out.println("\n" + l);
		System.out.println("\n" + p);
	}
}
