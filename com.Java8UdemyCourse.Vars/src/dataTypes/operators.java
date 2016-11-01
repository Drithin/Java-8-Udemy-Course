package dataTypes;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c = 1+2;
       System.out.println("1 + 2 = "+ c);
       
       int newD = c % 2;
       
       System.out.println("new element D = "+ newD);
       
       newD *= c;
       /**
        * Here one observation is that, += or any other operator holds good when
        * the vars are already declared and they use += to equal to other, not when you
        * declare them initially.
        */
       
       boolean isAlien = true;
       if(isAlien = true){
    	   System.out.println("It is an Alien!");
       }
       /**
        * Another IMPORTANT obs is, if conditions tests boolean case,
        * so if the var is a bool data type, we use only 1 '=' sign to
        * write the conditional and not '=='
        */
       
       boolean wasAlien = isAlien ? true : false;
       /**
        * the above syntax is called elvis operator or an iternary operator
        * it is shortcut for an IF condition in Java 8
        */
       if(wasAlien){
    	   System.out.println("wasALien is an ALien!");
       }
	}

}
