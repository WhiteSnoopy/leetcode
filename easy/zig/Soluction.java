package com.org.zig;

public class Soluction {

	  public static String convert(String s, int numRows) {
	      	char[] array=s.toCharArray();
	    	String constr="";
	    	int index=0;
	    	if(numRows==1) return s;
	    	if(numRows==2) 
	    	{
	    		while(index<array.length)
	    		{
	    			constr+=array[index];
	    			index+=2;
	    		}
	    		index=1;
	    		while(index<array.length)
	    		{
	    			constr+=array[index];
	    			index+=2;
	    		}
	    		return constr;
	    	}
	    	//��һ��
	    	while(index<array.length)
	    	{
	    		constr+=array[index];
	    		index=index+2*(numRows-1);
	    	}
	    	//�ڶ�����numRows-1��
	    	for(int i=1;i<numRows-1;i++)
	    	{
	    		//ÿ�ζ�һ��ʱ���°�index��ʼ��ֵ
	    		index=i;
	    		int count=1;//���� 1 |��2(m-i)  2| 2(i-1)֮��
	    		while(index<=array.length-1)
	    		{
	    			constr+=array[index];
	    			if(count%2!=0)
	    			{
	    				index=index+2*(numRows-i-1);
	    			}
	    			else
	    			{
	    				index=index+2*(i+1-1);
	    			}
	    			++count;
	    		}
	    	}
	    	//���һ��
	    	index=numRows-1;
	    	while(index<array.length)
	    	{
	    		constr+=array[index];
	    		index=index+2*(numRows-1);
	    	}
	    	return constr;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("SDFSADSDSGGA",3));
	}

}
