package com.lmj.test;

import javax.swing.event.UndoableEditListener;

/**
 * �̳�Thread
 *
 */
public class Dome2 extends Thread{

//	
//	     public void run(){
//	    	 super.run();
//	    	 //��ǰ�̵߳�����
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
	    	//�߳�����
	    	 String name =Thread.currentThread().getName();
	    	 //��Ʊ
	    	 System.out.println(name+"�߳���Ʊ��"+tickets--);
	     }	 
	     
	     public void run1(){
//	    	 super.run();
	    	 
	    	 while (true) {
				if (tickets<=0) {
					System.out.println("Ʊ������");
					break;
				}
				sell();
			}
	     }
}












