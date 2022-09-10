package mypackage;

class Student{
	private String name;
	private int roll;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setName("Jay");
		obj.setAge(23);
		obj.setRoll(555);
		System.out.println("My Name:"+obj.getName());
		System.out.println("My age:"+obj.getAge());
		System.out.println("My Roll:"+obj.getRoll());
	}

}
