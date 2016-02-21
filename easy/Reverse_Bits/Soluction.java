package com.org.Reverse_Bits;
/*
 * ����λ�������<<���ܽ��������ߵ�������������ƶ�������Ҳ�ָ����λ�����ڵ�λ��0��
 * ����λ�������>>�����������ߵ�������������ƶ�������Ҳ�ָ����λ���� ���з��š�����λ�����ʹ���ˡ�������չ������ֵΪ�������ڸ�λ����0����ֵΪ�������ڸ�λ����1��
 * �޷��š�����λ�������>>>������ʹ���ˡ�����չ�����������������ڸ�λ����0����һ�������C��C++û�еġ� 
 */
/*
 * ������Nת��Ϊ�����ƣ������λ��ʼ��������1���������㣬���ж��Ƿ�Ϊ1����0����Ϊ1����������ı��������ƶ�1λ������1���粻Ϊ1����ֻ�ƶ���������N��Ϊ1����Ҫ����N��λ32��
 */
public class Soluction {
	public static int reverseBits(int n) {
		int result = 0;
		System.out.println(Integer.toBinaryString(n));
		for (int i = 0; i < 32; i++){
			result += n & 1;
			n >>>= 1;   // CATCH: must do unsigned shift
			if (i < 31) // CATCH: for last digit, don't shift!
				result <<= 1;
		}
		System.out.println(Integer.toBinaryString(result));
		return result;
	}
	public static int reverseBits1(int n){
		int res = 0;
		for (int i = 0; i < 32; ++i) 
		{
			if ((n & 1) == 1) 
			{
				//����
				res = (res << 1) + 1;
				n = n >> 1;
			} 
			else 
			{
				res = res << 1;
				n = (n >> 1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(reverseBits1(1));
	}
}
