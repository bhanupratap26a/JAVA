class Test{
	public static void main(String[] args) {
		
		int x = 8;
		int y = 7;

		if (x > y){
			System.out.println(8);
			System.out.println("Appreciate That");
		}else{
			System.out.println(7);
			
		}

		int a = 20;
		int b = 10;
		int c = 30;

		if(a > b && a > c){
			System.out.println(a);
		}
		else if(b > c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}

		int  n = 5;
		int product = 0;

		product = n%2==0 ? 10 : 20;
		System.out.println(product);


	}
}