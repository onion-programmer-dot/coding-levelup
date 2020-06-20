package coding.desingpattern.singaltion;

public class SingletonTester {

	public static void main(String[] args) {
		
		//Instance 1
		SingletonClassEagarInitilization instance1 = SingletonClassEagarInitilization.getInstance();

        //Instance 2
		SingletonClassEagarInitilization instance2 = SingletonClassEagarInitilization.getInstance();

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());  
		
	}

}
