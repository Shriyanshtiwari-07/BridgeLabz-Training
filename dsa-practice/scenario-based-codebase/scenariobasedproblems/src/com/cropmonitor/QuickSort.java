package com.cropmonitor;

public class QuickSort {
	
	public static void quickSort(Sensor[] sensors, int low, int high) {
		if(low < high) {
			int pivotIdx = partition(sensors, low, high);
			
			quickSort(sensors, low, pivotIdx-1);
			quickSort(sensors, pivotIdx+1, high);
		}
	}
	
	public static int partition(Sensor[] sensors, int low, int high) {
		int pivot = sensors[high].timeStamp;
		int i = low - 1;
		
		for(int j = low; j<high; j++) {
			if(sensors[j].timeStamp <= pivot) {
				i++;
				
				Sensor temp = sensors[i];
				sensors[i] = sensors[j];
				sensors[j] = temp;
			}
		}
		
		Sensor temp = sensors[i + 1];
		sensors[i + 1] = sensors[high];
		sensors[high] = temp;
		
		return i+1;
	}
}