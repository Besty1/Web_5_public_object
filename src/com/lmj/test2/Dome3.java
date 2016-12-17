package com.lmj.test2;
/**
 * 线程调度
 *
 */
public class Dome3 {
/**
 * 线程休眠.单线程
 */
	
	    public void test(){
	    	//任务
	    	task1 t1 = new task1();
	    	task2 t2 = new task2();
	    	//调用
	    	t1.run();
	    	t2.run();
	    }
	  /**
	   * 线程休眠。多线程切换
	   */
	    public void test1(){
	    	//任务
	    	task1 t1 = new task1();
	    	task2 t2 = new task2();
	    	//线程
	    	Thread th1 = new Thread(t1);
	    	Thread th2 = new Thread(t2);
	    	//运行
	    	th1.start();
	    	th2.start();
	    }
	    /**
	     * 线程让步
	     */
	    public void test2(){
	    	//任务
	    	task3  t3 = new task3();
	    	task3  t4 = new task3();
	    	
	    	//线程
	    	Thread th1 = new Thread(t3);
	    	Thread th2 = new Thread(t4);
	    	//运行
	    	th1.start();
	    	th2.start();
	    }
	    /**
	     * 线程插队
	     */
	    
	    public void test3(){
	    	//任务
	    	task2  t2 = new task2();
	    	//线程
	    	Thread th = new Thread(t2, "ni");
	    	//运行
	    	th.start();
	    	//插队
	    	String name = Thread.currentThread().getName();
	    	for (int i = 0; i < 10; i++) {
	    		System.out.println(name+"线程，i="+i);
		        if (i==4) {
		        	System.out.println(name+"让nini线程插队，i="+4);
		        	try {
						th.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
	    }
}
class task1 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(name+"线程。i="+i);
			if (i==4) {
				System.out.println("线程休眠");
				try {
					Thread.sleep(2*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
	
}
class task2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j < 10; j++) {
			System.out.println(name+"线程。j="+j);
		}
		
	}
	
}
class task3 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int k = 0; k <10; k++) {
			System.out.println(name+"k线程="+k);
			if (k==4) {
				System.out.println(name+"线程作出让步，k="+k);
				Thread.yield();
				System.out.println(name+"线程让步之后");
			}
			
		}
		
	}
	
}
