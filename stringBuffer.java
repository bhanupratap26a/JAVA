class Test{
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Invinsible");

		sb.append(" President");
		sb.deleteCharAt(2);


		System.out.println(sb);
	}
}