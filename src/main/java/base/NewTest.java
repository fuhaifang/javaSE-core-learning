package base;

/**
 * new 关键字在创建对象时包含的三个动作
 * 按顺序如下：
 * 1、给对象开辟内存空间；
 * 2、调用类的构造方法；
 * 3、返回对象的引用；
 * 
 * 注意：a、如果一个类没有定义构造方法，那么编译器会默认加上一个
 *         没有参数并且方法体为空的构造方法，反之则不添加，使用
 *         我们自己定义的构造方法；
 *       b、创建一个对象时，new关键字后面的构造方法是否含有参数
 *          取决于类中的构造方法；
 *       c、我们不能显式的调用构造方法，构造方法一般通过new关键
 *          字隐式的调用。    
 * 
 * @author fangfuhai
 *
 */

public class NewTest {
	
	  public static void main(String[] args){
		  
		  People people = new People(30);//这里new一个对象时调用的是带参数的构造方法
		  System.out.println(people.age);
		  
	  }

}


class People{
	  
	  int age;
	  
	  //带参数的构造方法
	  public People(int i){
		  age = i;
	  }
	
}