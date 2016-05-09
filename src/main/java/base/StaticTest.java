package base;

/**
 * static关键字（一）：
 * static关键字表示静态的，static可以修饰属性和方法，也可以修饰类。
 * 
 * static修饰属性：称为静态成员变量。无论类生成了多少个对象，在内存里静态成员变量
 *                只有唯一一份，所有这些对象共同使用这一份静态的成员变量，一个对
 *                象对该静态成员变量做出了修改，其他对象的该静态成员变量的值也会
 *                随之发生改变。   如果一个成员变量是static的，那么我们可以通过“
 *                类名.静态成员变量名”  的方式来使用它。
 *                   
 * 
 * 
 * @author fangfuhai
 *
 */
public class StaticTest {

	   public static void main(String[] args){
		      
		   /**
			   MyStatic myStatic = new MyStatic();
			   MyStatic myStatic2 = new MyStatic();
			   myStatic.a = 10;
			   System.out.println(myStatic2.a); //输出：10，因为所有对象共用一份
		   **/
		   
		   MyStatic.a = 10;  //通过类名直接使用静态成员变量
		   MyStatic myStatic = new MyStatic();
		   System.out.println(myStatic.a);
		   
		   
	   } 
	   
	   
	   
}

class MyStatic{
	
	  static int a ;
	
	
}