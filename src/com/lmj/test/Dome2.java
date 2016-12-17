package com.lmj.test;

import javax.swing.event.UndoableEditListener;

/**
 * 继承Thread
 *
 */
public class Dome2 extends Thread{

//	
//	     public void run(){
//	    	 super.run();
//	    	 //当前线程的名字
//	    	 int count = 100;
//	    	 int i = 0;
//	    	 while (i<count) {
//				String name = Thread.currentThread().getName();
//				System.out.println(name+",i="+i);
//				i++;
//				
//			}
//	     }
	   private  int tickets = 100;
	     public void sell(){
	    	//线程名字
	    	 String name =Thread.currentThread().getName();
	    	 //卖票
	    	 System.out.println(name+"线程售票："+tickets--);
	     }	 
	     
	     public void run1(){
//	    	 super.run();
	    	 
	    	 while (true) {
				if (tickets<=0) {
					System.out.println("票卖完了");
					break;
				}
				sell();
			}
	     }
}













