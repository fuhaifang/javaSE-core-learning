package base;

/**
 * 方法重写：
 * 表示子类与父类的方法名称相同、返回类型相同、参数列表相同，方法体不同。
 * 
 * 1、当两个方法形成重写关系时，可以在子类中采用super.run()的形式
 *    调用父类中的run()方法，此时super.run()不必放在方法的第一行，
 *    因为此时父类的对象已经生成（此时子类的对象已生成，而父类的对
 *    象比子类更早生成），super表示父类对象的引用；
 *    
 * 2、在定义一个类的时候如果没有显式的指定其父类，那么该类就会继承
 *    java.lang.Object类（JDK提供的一个类，Object类是所有类的直接
 *    或间接父类）。   
 * 
 * @author fangfuhai
 *
 */
public class OverrideTest {
	
	   public static void main(String[] args){
		   
		    Dog dog = new Dog();
		    dog.run();
	   }

}

class Animal{
	
	  public void run(){
		  
		  System.out.println("animal is running");
	  }
}


class Dog extends Animal{
	
	  public void run(){
		  
		  System.out.println("dog is running"); 
		  
		  super.run(); //super关键字调用父类的run方法
	  }
	
}





