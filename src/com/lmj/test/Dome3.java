package com.lmj.test;

import java.nio.channels.SelectableChannel;

/**
 *实现runable接口 
 *
 */
public class Dome3 implements  Runnable {

//
//	@Override
//	public void run() {
//
//		int count = 100;
//		int i = 0;
//		while (i<count) {
////           获取运行这段代码的运行名字
//			String name = Thread.currentThread().getName();
//			System.out.println(name+";i="+i);
//			i++;
//		}
//		
//		
//	}
	    private int tikets= 100;
	    public void Seel(){
	    	String name = Thread.currentThread().getName();
	    	System.out.println(name+"线程售票："+tikets--);
	    			
	    }
	@Override
	public void run() {
		 while (true) {

			 if (tikets<=0) {
//				System.out.println("售票结束");
				break;
			}
			 Seel();
		}
		
	}

}





