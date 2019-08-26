package practice01;

public class Practice01MathIterative implements Practice01Math {

	@Override
	public int fact(int n) throws Exception {
		int fact=1;
		if(n<0)
			throw new Exception();
		for(int i =1;i<=n;i++)
			fact*=i;
		return fact;
	}

	@Override
	public int fib(int n) throws Exception {
		int first=0, second=1, fib=0;
		if(n<0)
			throw new Exception();
		if(n<2)
			return n;
		for(int i=2; i<=n;i++) {
			fib=first+second;
			first=second;
			second=fib;
		}
		return fib;
	}

}
