class Human{

	private String name;
	private int age;

	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}

	
}

class Test{
	public static void main(String[] args) {
		Human obj = new Human();
		obj.setName("Invinsible");
		obj.setAge(21);

	System.out.println(	obj.getName()+"  :  "+obj.getAge());
		


	}
}