package com.miao.work;

public class FenZhi {
	//   1、	输入一个年份，判断是否是闰年？（闰年的两个条件：（1）能被4整除但不能被100整除，（2）能被400整除。）
       public void text1(int a) {
    	   //参数检查
    	if(a<=0){
    	   System.out.println("输入参数错误");   
    	   }
	    if(((a % 4 == 0) && (a % 100 !=0))||(a % 400 == 0)){
		   System.out.println("是闰年");
	   }else{
		   System.out.println("不是闰年");
	   }
	}
   //    2、  输入QQ等级，返回需要的活跃天数？
       /*     
                   等级	           需要的活跃天数
       1	    5
       4	    32
       8	    96
       12	    192
       16	    320
       32	    1152
       48	    2496
       64	    4352
       */
       public void text2(int level){
    	 //参数检查  
//    	   if( level <=0 && level > 64){
//    		   System.out.println("输入等级错误");
//       }
    	   if(level >=1 && level<4){
    		   System.out.println("5");
    	   }else if(level >=4 && level<8){
    		   System.out.println("32");
    	   }else if(level >=8 && level<12){
    		   System.out.println("96");
    	   }else if(level >=12 && level<=16){
    		   System.out.println("192");
    	   }else if(level >=16 && level<=32){
    		   System.out.println("320");
    	   }else if(level >=32 && level<=48){
    		   System.out.println("1152");
    	   }else if(level >=48 && level<64){
    		   System.out.println("2496");
    	   }else if(level == 64){
        	   System.out.println("4352");
    	   }else{
    		   System.out.println("输入参数有误");
    	   }   
       }
      /* 3、	输入月工资，计算个人所得税？
       2012开始，实行7级个人所得税税率计算，个税起征点为3500元。
                  个税计算公式：税额 =（工资 - 起征点）*税率 - 速算扣除数。
                 级别	      全月工资余额	                税率（%）  扣除数
       1	  <= 1500	       3      0
       2	 1500 - 4500	  10	 105
       3	 4500 - 9000	  20	 555
       4	 9000 - 35000	  25	 1005
       5	35000 - 55000	  30	 2755
       6	55000 - 80000	  35	 5505
       7	   >80000	      45	13505
      */
       public void text3(double wages){
    	   if(wages > 0 && wages <=1500){
    		   
    		   double p1 = (wages - 3500) * 0.03 - 0;
    		   System.out.println("工资：" + wages + "  税额：" + p1);
    		   
    	   }else if(wages > 1500 && wages <=4500 ){
    		   
    		   double p2 = (wages - 3500) * 0.1 - 105;
    		   System.out.println("工资：" + wages + "  税额：" + p2);
    		   
    	   }else if(wages > 4500 && wages <=9000){
    		   
    		   double p3 = (wages - 3500) * 0.2 - 555;
    		   System.out.println("工资：" + wages + "  税额：" + p3);
    		   
    	   }else if(wages > 9000 && wages <=35000){
    		   
    		   double p4 = (wages - 3500) * 0.25 - 1005;
    		   System.out.println("工资：" + wages + "  税额：" + p4);
    		   
    	   }else if(wages > 35000 && wages <=55000){
    		   
    		   double p5 = (wages - 3500) * 0.3 - 2755;
    		   System.out.println("工资：" + wages + "  税额：" + p5);
    		   
    	   }else if(wages > 55000 && wages <=80000){
    		   
    		   double p6 = (wages - 3500) * 0.35 - 5505;
    		   System.out.println("工资：" + wages + "  税额：" + p6);
    		   
    	   }else if(wages > 80000){
    		   
    		   double p7 = (wages - 3500) * 0.45 - 13505;
    		   System.out.println("工资：" + wages + "  税额：" + p7);
    		   
    	   }else{
    		   
    		   System.out.println("输入参数有误");
    	   }
       }
       
       /*
         4、输入公司利润，计算奖金金额？
                      奖金计算规则：
                  （1）利润小于等于10万元，奖金提10%。
                  （2）利润高于10万，低于20万时，低于10万部分按10%提，高于10万部分按7.5%提。
                  （3）利润20万到40万，高于20万部分按5%提。
                  （4）利润40万到60万，高于40万部分按3%提。
                  （5）利润60万到100万，高与60万部分按1.5%提。
                  （6）利润高于100万，按1%提。
       */ 
       public void text4(double money){
    	   if(money>=0 && money <= 100000){
    		   double m1 = money * 0.1; 
    		   System.out.println("利润："+ money + "奖金：" + m1);
    	   }else if(money>100000 && money<=200000){
    		   double m2 = ((100000 * 0.1) + ((money - 100000)* 0.075));
    		   System.out.println("利润："+ money + "奖金：" + m2);
    	   }else if(money>200000 && money<=400000){
    		   double m3 = (money - 200000)*0.05;
    		   System.out.println("利润："+ money + "奖金：" + m3);
    	   }else if(money>400000 && money<=600000){
    		   double m4 = (money - 400000)*0.03;
    		   System.out.println("利润："+ money + "奖金：" + m4);
    	   }else if(money>600000 && money<=1000000){
    		   double m5 = (money - 600000)*0.015;
    		   System.out.println("利润："+ money + "奖金：" + m5);
    	   }else if(money>1000000){
    		   double m6 = 1000000*0.01;
    		   System.out.println("利润："+ money + "奖金：" + m6);
    	   }else{
    		   System.out.println("输入参数有误");
    	   }
    	   
       }
      /* 5、	输入月份，告诉用户是什么季节？
                                  定义：12，1，2冬季。3，4，5春季。6，7，8夏季。9，10，11秋季。
      */
       public void  text5(int time) {
    	   switch (time) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("输入参数有误");
			break;
		}
    		   
	}

      /* 6、	输入单次消费金额，计算折扣？
                                 消费金额每满200元，提高一个折扣等级，折扣等级共分10级：
            95折，9折，85折，83折，78折，75折，73折，7折，65折，6折。超过折扣最高等级后，一律55折。
      */
       public void text6(int money){
    	   if ( money >= 200 && money <400){
    		   System.out.println("95折");
    	   }else if(money >= 400 && money <600){
    		   System.out.println("9折");
    	   }else if(money >= 600 && money <800){
    		   System.out.println("85折");
    	   }else if(money >= 800 && money <1000){
    		   System.out.println("83折");
    	   }else if(money >= 1000 && money <1200){
    		   System.out.println("78折");
    	   }else if(money >= 1200 && money <1400){
    		   System.out.println("75折");
    	   }else if(money >= 1400 && money <1600){
    		   System.out.println("73折");
    	   }else if(money >= 1600 && money <1800){
    		   System.out.println("7折");
    	   }else if(money >= 1800 && money <2000){
    		   System.out.println("65折");
    	   }else if(money >= 2000 && money <2200){
    		   System.out.println("6折");
    	   }else if(money >=2200){
    		   System.out.println("6折");
    	   }else{
    		   System.out.println("无折扣");
    	   }
       }

      /* 7、	输入学习成绩，成绩大于等于90，A级，60—89分，B级，60分以下，C级。
                               （1）用if语句实现
                               （2）用条件运算符（？：）实现
      */
       public void text7(int mark){
    	  // 用if语句实现
    	   if(mark < 0 || mark > 100){
    		   System.out.println("输入成绩错误");
           }else  if(mark >=0 && mark < 60){
    		   System.out.println("C级");
    	   }else if(mark >=60 && mark <= 89){
    		   System.out.println("B级");
    	   }else{
    		   System.out.println("A级");
    	   }
       }
       // 用条件运算符（？：）实现
       public void text8(int mark){
    	   //检查参数
    	   if(mark < 0 || mark > 100){
    		   System.out.println("输入成绩错误");	   
    	   }
    	   char m = mark >= 90 ? 'A':(mark > 60 ? 'B':'C');
    	   System.out.println("m:" + m);
    	   }

       /*
       8、	随机输入三个数x，y，z，从小到大输出三个数？
       */

       public void text8(int a,int b,int c){
    	   
       }

}























