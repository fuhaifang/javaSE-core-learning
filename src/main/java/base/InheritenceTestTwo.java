package base;

/**
 * 继承（二）：
 * 1、关于继承的3点：
 *    1)父类有的属性和方法，子类也有；
 *    2)父类没有的属性和方法，子类可以自己增加；
 *    3)父类有的属性和方法，子类可以修改。
 *  
 * 2、关于继承的注意事项：
 *    1)父类的构造方法不能被子类继承（子类创建对象时要调用父类的构造方法！）；
 *    2)子类的构造方法会隐式的调用父类没有参数的构造方法；
 *    3)当父类没有不带参数的构造方法，子类需要用super()来
 *      显式的调用父类的构造方法；   
 * 
 * @author fangfuhai
 *
 */
public class InheritenceTestTwo {
	
	   public static void main(String[] args){
		   
		   Apple apple = new Apple();
		   System.out.println(apple.name);
	   }

}


class Fruit{

	String name = "fruit";
	
}

class Apple extends Fruit{
	
	String name = "apple";
	
}