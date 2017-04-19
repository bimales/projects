
public class SingletonClass implements Cloneable{

	private static SingletonClass singetonClass = new SingletonClass();

	private SingletonClass() {
	};

	public static SingletonClass getInstance() {
		return singetonClass;
	}

	public void sayHello() {
		System.out.println("Hi Hello!!!");
	}

//	protected Object clone() throws CloneNotSupportedException {
//		throw new CloneNotSupportedException();
//	}
}
