
public class MyGeneric<T> {
	
	private final Class<?> clazz;

	public MyGeneric(Class<?> class1) {
		this.clazz = class1;
	}

	public Class<?> getGenericClassType() {
		return clazz;
	}

}
