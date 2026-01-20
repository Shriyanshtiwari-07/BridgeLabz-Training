package com.cropmonitor;

public class CropMonitor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Sensor[] sensors = {new Sensor(20120229, 29.5), new Sensor(73099202, 27.8), new Sensor(17054030, 30.2), new Sensor(89439090, 28.6)};

	        QuickSort.quickSort(sensors, 0, sensors.length - 1);

	        System.out.print("After Sorting (by timestamp).....: ");
	        for (Sensor s : sensors) {
	            System.out.println(s.timeStamp + " - " + s.temp);
	        }
	}
}