package base;

/**
 * 抽象类：
 * 使用了abstract关键字修饰的类叫做抽象类。
 * 1、抽象类无法实例化，也就是说不能new出一个抽象类的实例；
 * 2、在子类继承父类（父类是抽象类）的情况下，那么该子类必须实现父类中所定义的
 *    所有的抽象方法，否则，该子类就必须声明为abstract类。
 * 
 * 
 * 
 * 抽象方法：
 * 使用abstract关键字修饰的方法叫做抽象方法。抽象方法只能定义在抽象类中。
 * 1、与抽象方法所对应的叫具体方法（有方法声明，有方法实现）；
 * 
 * 
 * @author fangfuhai
 *
 */
public class AbstractTest {

	   public static void main(String[] args){
		     //T t = new T();  //编译报错，抽象类无法实例化
	   }
}

abstract class T{
	
	   public abstract void method();
	   
	   public void test(){
		   System.out.println("test");
	   }
}


class R extends T{

	@Override
	public void method() {
		
		System.out.println("override abstract method");
	}
	
}








