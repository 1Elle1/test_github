package Exceptions;

public class ElectronicDeviceTest {

	public static void main(String[] args) {
		
		ElectronicDevice ed = new ElectronicDevice();
		try {
			ed.setWatt(-30);
		} catch(IllegalWattException e) {
			System.out.println("Watt können nicht negativ sein.");
		}

	}

}
