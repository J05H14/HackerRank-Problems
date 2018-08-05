package countBubbleSort;

public class BubbleSortCount {
	
	public static void main(String[] args) {
		int[] list = {3, 2, 1};
		
		count(list);
	}
	
	public static void count(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
