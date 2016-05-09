package base;

/**
 * 多态（三）：
 * 多态的用法
 * 
 * 
 * 
 * @author fangfuhai
 *
 */
public class PolyTestThree {
	
	  /** 
	   public void run(BMW bmw){
		   bmw.run();
	   }
	   
	   public void run(BZ bz){
		   bz.run();
	   }
	   **/
	
	   
	   public void run(Car car){
		   car.run();
	   }

	   public static void main(String[] args){
		   
		    /**
		      PolyTestThree test = new PolyTestThree();
		      BMW bmw = new BMW();
		      test.run(bmw);
		      BZ bz = new BZ();
		      test.run(bz);
		     **/ 
		   
		   PolyTestThree test = new PolyTestThree();
		   Car car = new BMW();//多态
		   car.run();
		   
		   Car c = new BZ();
		   c.run();
		   
		      
	   }
}

class Car{
	
	  public void run(){
		   System.out.println("car is running");
	  }
}

class BMW extends Car{
	
	  public void run(){
		   System.out.println("BMW is running");
	  }
}

class BZ extends Car{
	
	  public void run(){
		  
		    System.out.println("BZ is running");
	  }
	  
}

