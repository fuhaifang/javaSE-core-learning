package base;

/**
 * 
 * 构造方法的重载：
 * 1、构造方法名称跟类名相同，且构造方法没有返回值，
 *    因此构造方法重载只需看参数即可；
 * 2、如果想在一个构造方法中调用另一个构造方法，可采用
 *    this()的方式调用，this()括号中的参数表示目标构造
 *    方法的参数；
 * 3、 this()必须要作为构造方法中的第一条语句，也就是说
 *    在this()之前不能有任何可执行的代码； 
 * 
 * 4、this()只能用在构造方法中，表示调用其他的重载的构造方法，
 *    在其他的重载方法中不可用！
 * 
 * 
 * @author fangfuhai
 *
 */
public class ConstructorOverloadTest {
	
	   public ConstructorOverloadTest(){
		   this(3); //通过this(i);调用带有int型参数的构造方法
		   System.out.println("test");
	   }
	   
       public ConstructorOverloadTest(int i){
		   //this();  //通过this();调用不带参数的构造方法
    	   System.out.println(i);
	   }
       
       
       public static void main(String[] args){
    	   
    	   ConstructorOverloadTest test = new ConstructorOverloadTest();
    	   
    	   //ConstructorOverloadTest test2 = new ConstructorOverloadTest(3);
    	   
       }
       

}
