package springtest;

import java.util.List;

public class ShowMessage {
	private String msg;
	private List<Integer> intarray;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public List<Integer> getIntarray() {
		return intarray;
	}

	public void setIntarray(List<Integer> intarray) {
		this.intarray = intarray;
	}

	public void show(){
		System.out.println(msg);
	}
	
	public void showList(){
		for (Integer iterable_element : intarray) {
			System.out.println(iterable_element);
		}
	}
}
