class Computer{

	public void playmusic(){
		System.out.println("Playing Music....");
	}

	public String getAPen(int x){

		if (x>=10)
			return "Pen";

		return "Nothing";
	}
}
class Demo{
	public static void main(String[] args) {
			
		Computer obj = new Computer();
		obj.playmusic();
		String pen = obj.getAPen(2);
		System.out.println(pen);		


	}
}