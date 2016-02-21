package com.org.Happy_Number;

public class Soluction1 {
	public static boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x) ;
            if(x==1) return true ;
            y = cal(cal(y));
            if(y==1) return true ;

            if(x==y) return false;
        }
        return true ;
    }
    public static int cal(int n){
        int x = n;
        int s = 0;
        while(x>0){
            s = s+(x%10)*(x%10);
            x = x/10;
        }
        return s ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(9));

	}

}
