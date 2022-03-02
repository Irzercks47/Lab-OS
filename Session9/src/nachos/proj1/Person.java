package nachos.proj1;

public class Person {
	private String name;
	private int age;
	public Person() {//s = "alberic;21"
		String []arr = s.split(";");
		this.name = arr[0];
		this.age = Integer.parseInt(arr[1]);
	}
	public String serialize() {
		String str = new String();
		str+=name;
		str+=";";
		str+=Integer.toString(age);
		return str;
	}
}
