public class Main {
	
	public static void main(String[] args) {

		MyGeneric<String> sut1 = new MyGeneric<>(String.class);
		System.out.println(sut1.getGenericClassType());
		
		MyGeneric2<String> sut2 = new MyGeneric2Sub<>();
		System.out.println(sut2.getGenericClassType());
		System.out.println(sut2.getGenericType().getTypeName());
	}

}
