package cn.itcast.test09;

public class Person {
	//����
	private String name;
	private String id;
	//û�в����Ĺ��췽��
	public Person() {}
	//�в����Ĺ���
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}  
	//��ͨ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
