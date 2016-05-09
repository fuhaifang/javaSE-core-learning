package base;

/**
 * 多态（一）：
 * 子类就是父类（比如：玫瑰是花），因此多态的意思是：父类型的引用
 * 可以指向子类的对象（实例）。
 * 
 * 1、Flower flower = new Rose();当使用多态方式调用方法时，首先
 *    检查父类中是否有sing()方法，如果没有，则编译错误（因为引用
 *    是父类型的，父类型中必须同样定义有sing()方法才能调用），如
 *    果有，就会去调用子类的sing()方法。
 * 
 * 
 * @author fangfuhai
 *
 */
public class PolyTest {
	
	   public static void main(String[] args){
		   
		      Flower flower = new Rose();//多态，父类型的引用指向子类的对象
		      flower.sing();
	   }

}


class Flower{
	
	//这里注释掉sing()方法则会编译报错
	public void sing(){
		System.out.println("Flower is singing");
	}
	
}

class Rose extends Flower{
	
	public void sing(){
		
		System.out.println("Rose is singing");
	}
}




