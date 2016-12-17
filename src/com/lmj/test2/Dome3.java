package com.lmj.test2;
/**
 * �̵߳���
 *
 */
public class Dome3 {
/**
 * �߳�����.���߳�
 */
	
	    public void test(){
	    	//����
	    	task1 t1 = new task1();
	    	task2 t2 = new task2();
	    	//����
	    	t1.run();
	    	t2.run();
	    }
	  /**
	   * �߳����ߡ����߳��л�
	   */
	    public void test1(){
	    	//����
	    	task1 t1 = new task1();
	    	task2 t2 = new task2();
	    	//�߳�
	    	Thread th1 = new Thread(t1);
	    	Thread th2 = new Thread(t2);
	    	//����
	    	th1.start();
	    	th2.start();
	    }
	    /**
	     * �߳��ò�
	     */
	    public void test2(){
	    	//����
	    	task3  t3 = new task3();
	    	task3  t4 = new task3();
	    	
	    	//�߳�
	    	Thread th1 = new Thread(t3);
	    	Thread th2 = new Thread(t4);
	    	//����
	    	th1.start();
	    	th2.start();
	    }
	    /**
	     * �̲߳��
	     */
	    
	    public void test3(){
	    	//����
	    	task2  t2 = new task2();
	    	//�߳�
	    	Thread th = new Thread(t2, "ni");
	    	//����
	    	th.start();
	    	//���
	    	String name = Thread.currentThread().getName();
	    	for (int i = 0; i < 10; i++) {
	    		System.out.println(name+"�̣߳�i="+i);
		        if (i==4) {
		        	System.out.println(name+"��nini�̲߳�ӣ�i="+4);
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
			System.out.println(name+"�̡߳�i="+i);
			if (i==4) {
				System.out.println("�߳�����");
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
			System.out.println(name+"�̡߳�j="+j);
		}
		
	}
	
}
class task3 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int k = 0; k <10; k++) {
			System.out.println(name+"k�߳�="+k);
			if (k==4) {
				System.out.println(name+"�߳������ò���k="+k);
				Thread.yield();
				System.out.println(name+"�߳��ò�֮��");
			}
			
		}
		
	}
	
}