import java.util.*;

public class Insert {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int A[] = new int[20000];
		
		for (int i = 0; i <A.length; i++) {
			A[i] = aleatorio.nextInt(25000);
		}
		
		System.out.println("Original Array:" + Arrays.toString(A));
		
		for (int j = 1; j < A.length-1; j++){
			int key = A[j];
			int i = j - 1;
			while (i >= 0 && A[i] >= key) {
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = key;
		}
		System.out.println();
		System.out.println("New Array:" + Arrays.toString(A));
	}

}
