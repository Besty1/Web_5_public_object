package com.miao.work;

public class FenZhi {
	//   1��	����һ����ݣ��ж��Ƿ������ꣿ�������������������1���ܱ�4���������ܱ�100��������2���ܱ�400��������
       public void text1(int a) {
    	   //�������
    	if(a<=0){
    	   System.out.println("�����������");   
    	   }
	    if(((a % 4 == 0) && (a % 100 !=0))||(a % 400 == 0)){
		   System.out.println("������");
	   }else{
		   System.out.println("��������");
	   }
	}
   //    2��  ����QQ�ȼ���������Ҫ�Ļ�Ծ������
       /*     
                   �ȼ�	           ��Ҫ�Ļ�Ծ����
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
    	 //�������  
//    	   if( level <=0 && level > 64){
//    		   System.out.println("����ȼ�����");
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
    		   System.out.println("�����������");
    	   }   
       }
      /* 3��	�����¹��ʣ������������˰��
       2012��ʼ��ʵ��7����������˰˰�ʼ��㣬��˰������Ϊ3500Ԫ��
                  ��˰���㹫ʽ��˰�� =������ - �����㣩*˰�� - ����۳�����
                 ����	      ȫ�¹������	                ˰�ʣ�%��  �۳���
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
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p1);
    		   
    	   }else if(wages > 1500 && wages <=4500 ){
    		   
    		   double p2 = (wages - 3500) * 0.1 - 105;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p2);
    		   
    	   }else if(wages > 4500 && wages <=9000){
    		   
    		   double p3 = (wages - 3500) * 0.2 - 555;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p3);
    		   
    	   }else if(wages > 9000 && wages <=35000){
    		   
    		   double p4 = (wages - 3500) * 0.25 - 1005;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p4);
    		   
    	   }else if(wages > 35000 && wages <=55000){
    		   
    		   double p5 = (wages - 3500) * 0.3 - 2755;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p5);
    		   
    	   }else if(wages > 55000 && wages <=80000){
    		   
    		   double p6 = (wages - 3500) * 0.35 - 5505;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p6);
    		   
    	   }else if(wages > 80000){
    		   
    		   double p7 = (wages - 3500) * 0.45 - 13505;
    		   System.out.println("���ʣ�" + wages + "  ˰�" + p7);
    		   
    	   }else{
    		   
    		   System.out.println("�����������");
    	   }
       }
       
       /*
         4�����빫˾���󣬼��㽱���
                      ����������
                  ��1������С�ڵ���10��Ԫ��������10%��
                  ��2���������10�򣬵���20��ʱ������10�򲿷ְ�10%�ᣬ����10�򲿷ְ�7.5%�ᡣ
                  ��3������20��40�򣬸���20�򲿷ְ�5%�ᡣ
                  ��4������40��60�򣬸���40�򲿷ְ�3%�ᡣ
                  ��5������60��100�򣬸���60�򲿷ְ�1.5%�ᡣ
                  ��6���������100�򣬰�1%�ᡣ
       */ 
       public void text4(double money){
    	   if(money>=0 && money <= 100000){
    		   double m1 = money * 0.1; 
    		   System.out.println("����"+ money + "����" + m1);
    	   }else if(money>100000 && money<=200000){
    		   double m2 = ((100000 * 0.1) + ((money - 100000)* 0.075));
    		   System.out.println("����"+ money + "����" + m2);
    	   }else if(money>200000 && money<=400000){
    		   double m3 = (money - 200000)*0.05;
    		   System.out.println("����"+ money + "����" + m3);
    	   }else if(money>400000 && money<=600000){
    		   double m4 = (money - 400000)*0.03;
    		   System.out.println("����"+ money + "����" + m4);
    	   }else if(money>600000 && money<=1000000){
    		   double m5 = (money - 600000)*0.015;
    		   System.out.println("����"+ money + "����" + m5);
    	   }else if(money>1000000){
    		   double m6 = 1000000*0.01;
    		   System.out.println("����"+ money + "����" + m6);
    	   }else{
    		   System.out.println("�����������");
    	   }
    	   
       }
      /* 5��	�����·ݣ������û���ʲô���ڣ�
                                  ���壺12��1��2������3��4��5������6��7��8�ļ���9��10��11�＾��
      */
       public void  text5(int time) {
    	   switch (time) {
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		default:
			System.out.println("�����������");
			break;
		}
    		   
	}

      /* 6��	���뵥�����ѽ������ۿۣ�
                                 ���ѽ��ÿ��200Ԫ�����һ���ۿ۵ȼ����ۿ۵ȼ�����10����
            95�ۣ�9�ۣ�85�ۣ�83�ۣ�78�ۣ�75�ۣ�73�ۣ�7�ۣ�65�ۣ�6�ۡ������ۿ���ߵȼ���һ��55�ۡ�
      */
       public void text6(int money){
    	   if ( money >= 200 && money <400){
    		   System.out.println("95��");
    	   }else if(money >= 400 && money <600){
    		   System.out.println("9��");
    	   }else if(money >= 600 && money <800){
    		   System.out.println("85��");
    	   }else if(money >= 800 && money <1000){
    		   System.out.println("83��");
    	   }else if(money >= 1000 && money <1200){
    		   System.out.println("78��");
    	   }else if(money >= 1200 && money <1400){
    		   System.out.println("75��");
    	   }else if(money >= 1400 && money <1600){
    		   System.out.println("73��");
    	   }else if(money >= 1600 && money <1800){
    		   System.out.println("7��");
    	   }else if(money >= 1800 && money <2000){
    		   System.out.println("65��");
    	   }else if(money >= 2000 && money <2200){
    		   System.out.println("6��");
    	   }else if(money >=2200){
    		   System.out.println("6��");
    	   }else{
    		   System.out.println("���ۿ�");
    	   }
       }

      /* 7��	����ѧϰ�ɼ����ɼ����ڵ���90��A����60��89�֣�B����60�����£�C����
                               ��1����if���ʵ��
                               ��2���������������������ʵ��
      */
       public void text7(int mark){
    	  // ��if���ʵ��
    	   if(mark < 0 || mark > 100){
    		   System.out.println("����ɼ�����");
           }else  if(mark >=0 && mark < 60){
    		   System.out.println("C��");
    	   }else if(mark >=60 && mark <= 89){
    		   System.out.println("B��");
    	   }else{
    		   System.out.println("A��");
    	   }
       }
       // �������������������ʵ��
       public void text8(int mark){
    	   //������
    	   if(mark < 0 || mark > 100){
    		   System.out.println("����ɼ�����");	   
    	   }
    	   char m = mark >= 90 ? 'A':(mark > 60 ? 'B':'C');
    	   System.out.println("m:" + m);
    	   }

       /*
       8��	�������������x��y��z����С���������������
       */

       public void text8(int a,int b,int c){
    	   
       }

}























