package base;

/**
 * 继承（一）：
 * 用关键字extends表示。
 * 
 * 1、子类继承了父类，在子类创建对象时，Java默认首先调用父类的
 *    不带参数的构造方法，生成父类的对象，然后再去调用子类的构
 *    造方法，生成子类的对象；（想要生成子类的对象，首先要生成
 *    父类的对象，没有父类对象就没有子类对象，比如：没有父亲就
 *    没有孩子！）
 *    
 * 2、super关键字：super表示对父类对象的引用，并且跟this()一样
 *    super()必须作为构造方法的第一条语句；
 *    
 * 3、如果子类构造方法使用super()显式的调用父类的某个构造方法,
 *    那么在执行的时候就会寻找与super()参数列表相同的父类的构
 *    造方法，而不会再去寻找不带参数的构造方法；
 * 
 * 4、子类创建对象时，先要生成父类的对象（如果父类也继承其他类，
 *    那么要先生成父类所继承的父类的对象，依此类推），在内存空间
 *    里，子类的对象和父类的对象相邻，父类的属性和方法子类也可以
 *    拿到。
 *       
 * 
 * @author fangfuhai
 *
 */
public class InheritenceTest extends Parent{
	
	   public InheritenceTest(){
		   super(1);
		   System.out.println("child");
	   }

	   public static void main(String[] args){
		   
		   InheritenceTest child = new InheritenceTest(); 
	   }  
}

class Parent{
	
	   public Parent(){
		    System.out.println("no args parent");
	   }
	   
	   public Parent(int i){
		    
		    System.out.println("parent");
	   }
	   
}