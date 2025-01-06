// Method Overloading
class MethodOver{
	public int add(int n1,int n2,int n3){
		return n1+n2+n3;
	}
	public int add(int n1,int n2){
		return n1+n2;
	}


}
class Test{
	public static void main(String[] args) {
		
		MethodOver obj = new MethodOver();

	System.out.println(obj.add(10,40));	
	System.out.println(obj.add(10,20,30));


	}
} 
