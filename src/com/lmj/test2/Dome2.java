package com.lmj.test2;


/**
 * �߳����ȼ�
 * 
 *
 */
public class Dome2 {

	      
	   public void test1 (){
		   //����
		   work1 w1 = new work1();
		   work2 w2 = new work2();
		   //�߳�
		   Thread t1 = new Thread(w1);
		   Thread t2 = new Thread(w2);
		   //����
		   t1.setName("nini");
		   t2.setName("haha");
		   //�������ȼ�
		   t1.setPriority(Thread.MAX_PRIORITY);
		   t2.setPriority(Thread.MIN_PRIORITY);
		   //����
		   t1.start();
		   t2.start();
		   
	   }
}
	class work1 implements  Runnable{

		@Override
		public void run() {
			String name =Thread.currentThread().getName();
			for (int i = 0; i < 10; i++) {
				System.out.println(name+"�߳�i="+i);
			}
		}
		
		
	}
   class work2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j < 10; j++) {
			System.out.println(name+"�߳�j="+j);
		}
	}
	   
   }













