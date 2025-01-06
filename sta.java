class Test {

	static int age;
	static String name;
	void off(){
		age =20;
			name="Amit";
		System.out.println("Name ="+name+": Age ="+age);
	}
	static {
		System.out.println("Static Block");
	}
	public static void main(String[] args)throws ClassNotFoundException {
		// Test obj = new Test();
		// obj.off();
		Class.forName("Test"); // This Method is Used to Load The Class
	}
}