package base;

/**
 *引用以及对象在内存中的存储模型：
 * 1、引用是用在对象上，引用的值是对象在内存中的地址，
 *    比如在本例中：person是一个引用，new Person()才是一个对象；
 * 2、8种原生数据类型以及引用类型存储在内存中的栈（stack）上，
 *    对象存储在内存中的堆（heap）上；
 * 3、一个引用只能指向内存中的一个对象，但是一个对象可以被多个引用所指向；
 * 4、可以把一个引用的值赋给了另外一个引用，因此这两个引用指向同一块内存空间
 *    
 * @author fangfuhai
 *
 */

public class ReferenceTest {
	
	   public static void main(String[] args){
		   Person person = new Person();
		   System.out.println(person.age);
		   
		   person.change(person);
		   System.out.println(person.age);
		   
		   Person person2 = new Person();
		   person2 = person;  //把引用person的值赋给了引用person2
		   System.out.println(person2.age);
		   
	   }

}


//创建Person类
class Person {
	
	   int age = 20;
	   
	   void change(Person person){
		   
		   person.age = 30;
		   
	   }
	
}




