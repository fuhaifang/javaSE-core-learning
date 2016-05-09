package base;

/**
 * 方法重载：
 * 表示在一个类中两个或多个方法的方法名称相同，但方法的参数列表不同。
 * 
 * 参数列表不同包括：1、参数的个数不同； 2、参数的类型不同。
 * 
 * 注意：方法的返回类型对方法是否是重载方法没有任何影响！
 *       返回类型可以相同，也可以不同。
 * @author fangfuhai
 *
 */
public class OverloadTest {
	
	   public int add(int a, int b){
		   System.out.println(a + b);
		   return a + b;
	   }
	   
	   public int add(int a, int b, int c, int d){
		   System.out.println(a + b + c + d);
		   return a + b + c + d;
		   
	   }
	   
	   //返回类型不同，但也是重载方法
	   public String add(int a, int b, String c){
		   System.out.println(a + b + c);
		   return a + b + c;
	   }
	   
	   public static void main(String[] args){
		   OverloadTest test = new OverloadTest();
		   
		   test.add(1, 2);
		   test.add(1, 1, 2, 2);
		   test.add(1, 2, "3");
		   
	   }

}
