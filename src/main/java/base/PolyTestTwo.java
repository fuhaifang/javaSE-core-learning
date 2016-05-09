package base;

/**
 * 多态（二）：
 * 
 * 一共有两种类型的强制类型转换：
 * a)向上类型转换：将子类型转换为父类型，比如：将Cats类型转换为Animals类型。
 *                对于向上类型转换，不需要显示指定（即不需要加强制类型转换）。
 *                
 * b)向下类型转换：将父类型的引用转换为子类型，比如：将Animals类型转换为Cats
 *                类型。对于向下类型转换，必须添加强制类型转换。 
 * 
 * 为什么要使用向下类型转换？
 *     在本例中，Cats类继承了Animals类，Animals类型的引用a可以调用Cats类中
 * 所有从父类继承过来的方法和Cats类重写的方法，而对于Cats类自己新增的方法，
 * 引用a无法调用，因为在父类Animals中没有定义这些方法，因此，必须要把Animals
 * 类型的引用a强制转换成Cats类型才能够调用。这就是使用向下类型转换的原因。
 * 
 * @author fangfuhai
 *
 */
public class PolyTestTwo {

	   public static void main(String[] args){
		    
		     /**
		      Animals animal = new Dogs();
		      Dogs dog = (Dogs)animal;
		      dog.sing();
		      **/
		   
		     //向上类型转换
		     Cats cat = new Cats();
		     Animals animal = cat;
		     animal.sing();
		     
		     //向下类型转换
		     Animals a = new Cats();
		     //a.eat();  //编译报错，父类中没有定义这个方法
		     Cats c = (Cats)a;
		     c.sing();
		     c.eat(); //强制转换后，正常调用		   
		   
		   
		   
		   
	   } 
}
 
class Animals{
	  
	  public void sing(){
		  System.out.println("animal is singing");
	  }
}

class Dogs extends Animals{
	  
	  public void sing(){
		  System.out.println("dog is singing");
	  }
}

class Cats extends Animals{
	
	  public void sing(){
		   System.out.println("cat is singing");
	  }
	  
	  public void eat(){
		   System.out.println("cat is eating");
	  }
}



















