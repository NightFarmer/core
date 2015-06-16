package junit4;

public class SampleCalculator {
	private static int result; // 静态变量，用于存储运行结果

	public SampleCalculator() {
		System.out.println("构造");// TODO Auto-generated constructor stub
	}
	
	
	public void add(int n) {
		result = result + n;
	}

	public void substract(int n) {
		result = result - 1; // Bug：正确的应该是result=result-n;
	}

	public void multiply(int n) {
		// 此方法尚未写好
	}

	public void divide(int n) {
		result = result / n;
	}

	public void square(int n) {
		result = n * n;
	}

	public void squareRoot(int n) {
		for (;;)
			; // Bug:死循环
	}

	public void clear() {
		result = 0; // 将结果清零
	}

	public int getResult() {
		return result;
	}


	public int sum(int o1, int o2) {
		if (o1 > 200) {
			throw new RuntimeException("o1 is too big");
		}
		if (o2 > 200) {
			throw new RuntimeException("o2 is too big");
		}
		return o1 + o2;
	}
}
