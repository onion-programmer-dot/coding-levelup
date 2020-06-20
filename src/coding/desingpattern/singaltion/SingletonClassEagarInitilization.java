package coding.desingpattern.singaltion;

/**
 * 
 * @author alok.kumar
 *
 * Singaltion with Eagar initilization
 */
public class SingletonClassEagarInitilization {
	
	private static volatile SingletonClassEagarInitilization instance = new SingletonClassEagarInitilization();
	
	private SingletonClassEagarInitilization(){
		super();
	}
	
	public static SingletonClassEagarInitilization getInstance(){
		return instance;
	}
}
