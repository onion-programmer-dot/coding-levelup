package coding.desingpattern.singaltion;


/**
 * 
 * @author alok.kumar
 *	
 * Lazy initialization when this call first time then the object created and serve for every call
 */
public class SingletonClassLazyInitilization {

	private static SingletonClassLazyInitilization instance = null;
	
	
	private SingletonClassLazyInitilization(){
		super();
	}
	
	
	public static SingletonClassLazyInitilization getInstance(){
		if(instance == null){
			instance = new SingletonClassLazyInitilization();
		}
		
		return instance;
	}
	
}
