
public class FactorialIterative implements Factorial{

	public int factorial(int n){
		int tempValue = n;
		for(int i = n-1; i > 0; i--){
			tempValue = tempValue * i;
		}
		return tempValue;
	}


}

