package com.lmj.test2;


/**
 * 线程优先级
 * 
 *
 */
public class Dome2 {

	      
	   public void test1 (){
		   //任务
		   work1 w1 = new work1();
		   work2 w2 = new work2();
		   //线程
		   Thread t1 = new Thread(w1);
		   Thread t2 = new Thread(w2);
		   //名字
		   t1.setName("nini");
		   t2.setName("haha");
		   //设置优先级
		   t1.setPriority(Thread.MAX_PRIORITY);
		   t2.setPriority(Thread.MIN_PRIORITY);
		   //运行
		   t1.start();
		   t2.start();
		   
	   }
}
	class work1 implements  Runnable{

		@Override
		public void run() {
			String name =Thread.currentThread().getName();
			for (int i = 0; i < 10; i++) {
				System.out.println(name+"线程i="+i);
			}
		}
		
		
	}
   class work2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j < 10; j++) {
			System.out.println(name+"线程j="+j);
		}
	}
	   
   }














