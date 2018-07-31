package cn.itcast.domain;

/*
 * 必须要为成员提供get/set方法（两者只提供一个也是可以的！）
 * 必须要有默认构造器！（没参的！）
 * 一般对于具有get/set方法的成员变量称之为属性
 * 
 * 其实就算一个属性没有对应的成员变量，只有get/set方法也是可以的！
 *   属性的名称就是get/set方法去除get/set后，再把首字母小写了！
 */
public class Person {
	private String name;
	private int age;
	private String gender;
	private boolean bool;
	
	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public String getId() {
		return "fdsafdafdas";
	}

	public String getName() {
		return name;
	}

	public void setName(String username) {
		this.name = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

}
