package coding.desingpattern.singaltion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTesterReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		 //Create the 1st instance
		SingletonClassEagarInitilization instance1 = SingletonClassEagarInitilization.getInstance();
		
		
		//Create 2nd instance using Java Reflection API.
		SingletonClassEagarInitilization instance2 = null;
        
        
        Class<SingletonClassEagarInitilization> clazz = SingletonClassEagarInitilization.class;
        Constructor<SingletonClassEagarInitilization> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        
        instance2 = cons.newInstance();
        
        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());
        
        //This code created two new class object
	}

}
