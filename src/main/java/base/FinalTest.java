package base;

/**
 * final关键字：
 * final可以修饰属性、方法和类。
 * 
 * 1、final修饰类：当一个类被final所修饰时，表示该类是一个终态类，即不能被继承。
 * 
 * 2、final修饰方法：当一个方法被final所修饰时，表示该方法是一个终态方法，即不能重写（override）。
 * 
 * 3、final修饰属性：当一个属性被final所修饰时，表示该属性不能被改写（是一个常量）。
 * 
 * 注意：当final修饰一个原生数据类型时，表示该原生数据类型的值不能发生变化；
 *      如果final修饰一个引用类型时，表示该引用类型不能再指向其他对象了，但
 *      是该引用指向的对象的内容是可以发生变化的。
 * 
 * @author fangfuhai
 *
 */
public class FinalTest {

	   public static void main(String[] args){
		   
		    Human xiaoming = new Human();
		    //xiaoming.age = 10; //编译报错，常量不能被修改
		    
		    //xiaoming.address = new Address(); //编译报错，Address类的引用address被final修饰，
		                                        //表示引用的值不能被改变，即只能指向那一个对象。
		    
		    xiaoming.address.name = "shanghai";
		    
		   
	   }
}

class Human{
	
	// final int age = 20;
	final Address address = new Address();
}

class Address{
	
	  String name = "beijing";
	
}









