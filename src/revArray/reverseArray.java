package revArray;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,4,3,2};
		int[] revArr = reverseArray(array);
		
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int num : revArr) {
			System.out.print(num + " ");
		}
	}
	static int[] reverseArray(int[] a) {
        int[] arr = new int[a.length];
        for(int i = 0, j = a.length - 1; i < a.length; i++, j--){
            arr[i] = a[j];
        }
        return arr;
    }
}
