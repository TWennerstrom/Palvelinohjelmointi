package fi.k2021.Week2Exe1.domain;

public class Message {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Message [name=" + name + ", age=" + age + "]";
	}
	
}
