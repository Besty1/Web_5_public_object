package com.lmj.test2;
/**
 * 线程状态
 * 1.新建状态
 * 2.就绪状态
 * 3.运行。阻塞状态
 * 4.死亡状态
 */
public class Dome1 extends Thread {

	public Dome1 (String name){
		super(name);
		
		System.out.println(name+"线程新建状态");
	}
	
	public synchronized void start(){
		
		super.start();
		
		String name = getName();
		System.out.println(name+"线程就绪状态");
		
	}
	
	public void run(){
		super.run();
		
		
	    String name = Thread.currentThread().getName();
			
	    for (int i = 0; i <10; i++) {
			System.out.println(name +"线程运行状态="+i);
			if (i==5) {
				try {
					System.out.println(name+"线程阻塞状态");
					Thread.sleep(3*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	       System.out.println("线程死亡状态");
	    
	}
}















