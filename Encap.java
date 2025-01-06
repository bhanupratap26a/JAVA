class Human{

	private String name;
	private int age;

	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public void setName(String n){
		name = n;
	}

	
}

class Test{
	public static void main(String[] args) {
		Human obj = new Human();
		obj.setName("Amit");
		obj.setAge(20);

	System.out.println(	obj.getName()+"  :  "+obj.getAge());
		


	}
}