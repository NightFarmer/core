package junit4;

public class SampleCalculator {
	private static int result; // ��̬���������ڴ洢���н��

	public SampleCalculator() {
		System.out.println("����");// TODO Auto-generated constructor stub
	}
	
	
	public void add(int n) {
		result = result + n;
	}

	public void substract(int n) {
		result = result - 1; // Bug����ȷ��Ӧ����result=result-n;
	}

	public void multiply(int n) {
		// �˷�����δд��
	}

	public void divide(int n) {
		result = result / n;
	}

	public void square(int n) {
		result = n * n;
	}

	public void squareRoot(int n) {
		for (;;)
			; // Bug:��ѭ��
	}

	public void clear() {
		result = 0; // ���������
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
