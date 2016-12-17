package com.lmj.test;

public class Dome1 {

	
	public void test1(){
		//打印20遍
		   for (int i = 0; i <20; i++) {
			System.out.println("i="+i);
			//打印一遍休眠一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("线程异常");
			}
		}
	}
	/**
	 * 线程信息
	 */
	public void test2(){
		//线程名字
		String name = Thread.currentThread().getName();
		System.out.println("name="+name);
		//线程id
		long id =Thread.currentThread().getId();
		System.out.println("id="+id);
	}
	/**
	 * 单线程运行程序
	 */
	
	public void test3(){
		
		/**
		 * 耗时操作1
		 */
		int countc=100;
		int i=0;
		while (i<countc) {
		  
			String name =Thread.currentThread().getName();
			
			System.out.println(name+"线程i="+i);
			
			i++;
		}
		
	}
	/**
	 * 耗时线程2
	 */
	public void test4(){
		int countc = 100;
		int j = 0 ;
		while (j<=countc) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"，线程j="+j);
			j++;
		}
	}
	
	
}











