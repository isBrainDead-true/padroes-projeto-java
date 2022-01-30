package one.digitalinnovation.gof.singleton;

/**
 * Singleton Apressado
 * @author Inacio
 *
 */
public class SingletonLazyHolder{
	
	private static class Holder{
		public static SingletonLazyHolder intance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		return Holder.intance;
	}
	
	
}
