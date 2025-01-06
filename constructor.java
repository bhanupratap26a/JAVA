class Human{

	private String name;
	private int age;

	public Human(){
		name = "Lolzz";
		age=24;
	}
	public Human(int age,String name){
		this.age=age;
		this.name=name;
	}

	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}	
}

class Test{
	public static void main(String[] args) {
		Human obj = new Human();
		Human obj1= new Human(20,"Amit");

	System.out.println(	obj.getName()+"  :  "+obj.getAge());
	System.out.println(	obj1.getName()+"  :  "+obj1.getAge());
		


	}
}