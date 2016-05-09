package base;

/**
 * static关键字（二）：
 * 
 * static修饰方法：叫做静态方法。对于静态方法来说，可以使用“类名.方法名”的
 *                方式来访问。
 *                
 * 
 * 关于静态方法的重写问题：子类可以继承父类的静态方法，但子类不能重写父类的静态方法，
 *                       子类可以隐藏父类的静态方法。调用同名的静态方法时，是调用父
 *                       类的版本还是调用子类的版本，取决于对象的类型；如果是父类的
 *                       对象那么调用的就是父类的静态方法，如果是子类的对象则调用子
 *                       类 的静态方法。
 * 
 * @author fangfuhai
 *
 */
public class StaticTestTwo {
	
	   public static void main(String[] args){
		      
		      MyStaticTwo.output(); //使用类名.方法名来访问
		      
		      M m = new N();
		      m.output();//输出：M，因为m是父类的对象
	   }

}

class MyStaticTwo{
	
	static void output(){
		
		   System.out.println("output");
	}
}

class M{
	
	static void output(){ 
		
		   System.out.println("M");
	}
	
}

class N extends M{
	
	static void output(){ //子类隐藏了父类的静态方法output()，静态方法只能继承不能重写！！！
		   
		   System.out.println("N");
	}
}