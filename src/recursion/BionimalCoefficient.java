package recursion;

public class BionimalCoefficient {
	
	public static int amount(int n, int k) {
		if(n==0 | n==k) {
			return 1;
		}else {
			return amount(n-1, k+1)+amount(n-1, k);
		}
	}

	public static void main(String[] args) {

		System.out.println(amount(4,2));
	}

}
