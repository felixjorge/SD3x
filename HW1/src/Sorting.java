
public class Sorting {
	
	/**
	 * Implement the mergesort function, which should sort the array of
	 * integers in place
	 * 
	 * You will probably want to use helper functions here, as described in the lecture recordings
	 * (ex. merge(), a helper mergesort function)
	 * @param arr
	 */
	public static void mergeSort(CompareInt[] arr) {
		//TODO
		CompareInt[] aux = new CompareInt[arr.length];
		sort(arr, aux, 0, arr.length - 1);
	}
	
	public static void sort(CompareInt[] arr, CompareInt[] aux, int low, int high) {
		if (high <= low) return;
		int mid = (high + low) / 2; // = low + (high - low) / 2
		sort(arr, aux, low, mid);
		sort(arr, aux, mid + 1, high);
		merge(arr, aux, low, mid, high);
	}
	
	public static void merge(CompareInt[] arr, CompareInt[] aux, int low, int mid, int high) {
		for (int i = 0; i <= high; i++) {
			aux[i] = arr[i];
		}
		
		int i = 0; int j = mid + 1; int k = 0;
		
		while (i <= mid && j <= high) {
			int comp = aux[i].compareTo(aux[j]);
			if (comp < 0) {
				arr[k++] = aux[i++];
			} else {
				arr[k++] = aux[j++];
			}
		}
		
		while (i <= mid) {
			arr[k++] = aux[i++];
		}
		while (j <= high) {
			arr[k++] = aux[j++];
		}
	}
	
	
	
	/**
	 * Implement the quickSelect
	 * 
	 * Again, you will probably want to use helper functions here
	 * (ex. partition(), a helper quickselect function)
	 */
	public static CompareInt quickSelect(int k, CompareInt[] arr) {
		//TODO
		return null;
	}

}
