
public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){
		if(n <= 1){
			return n;
		}
		int n0 = 1;
		int n1 = 1;
		for(int i = 2; i < n; i++){
			int prevTemp = n0;
			n0 = n0 + n1;
			n1 = prevTemp;
		}
		return n0;
	}
}