package com.org.Valid_Sudoku;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * A00 A01 A02
 * A10 A11 A12
 * A20 A21 A22
 *使用set来解决此问题
 *不允许出现重复的元素
 *不保证顺序
 *最多只有一个null元素
 * 
 */
public class Soluction {
	public static boolean isValidSudoku(char[][] board) {
		int lenA=board.length;
		int lenB=board[0].length;
		//先对行进行比较
		//board[i][j]
		//board[0][j]  [1][j]
		for(int i=0;i<lenA;i++)
		{
			for(int j=0;j<lenB;j++)
			{
				int index=j+1;
				while(index<lenB)
				{
					if(board[i][j]==board[i][index] && board[i][j]!='.')
					{
						return false;
					}
					index++;
				}
			}
		}
		//接下来比较列
		for(int i=0;i<lenB;i++)
		{
			for(int j=0;j<lenA;j++)
			{
				int index=j+1;
				while(index<lenA)
				{
					if(board[j][i]==board[index][i] && board[j][i]!='.')
					{
						return false;
					}
					index++;
				}
			}
		}
		//检查9个3x3的正方形，查看是否有1-9的重复元素
		
		return true;
	}
	/*
	 * 判断一行中是否有重复的个数
	 */
	public static  boolean compare(char[] board){
		int N=board.length;
		for(int i=0;i<N;i++)
		{
			int j=i+1;
			while(j<N)
			{
				if(board[i] == board[j] && board[i]!='.')
					return false;
				j++;
			}
		}
		return true;
		
	}
	/*public static void asd(){
		 for(int i = 0; i<9; i++){
		        HashSet<Character> rows = new HashSet<Character>();
		        HashSet<Character> columns = new HashSet<Character>();
		        HashSet<Character> cube = new HashSet<Character>();
		        for (int j = 0; j < 9;j++){
		            if(board[i][j]!='.' && !rows.add(board[i][j]))
		                return false;
		            if(board[j][i]!='.' && !columns.add(board[j][i]))
		                return false;
		            int RowIndex = 3*(i/3);
		            int ColIndex = 3*(i%3);
		            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
		                return false;
		        }
		    }
		    return true;
	}*/
	public static boolean chc(char[][] board){
		for(int i=0;i<9;i++)
		{
			HashSet<Character> row=new HashSet<Character>();
			HashSet<Character> col=new HashSet<Character>();
			HashSet<Character> cube=new HashSet<Character>();
			for(int j=0;j<9;j++)
			{
				if(board[i][j]!='.'&& !row.add(board[i][j]))
					return false;
				if(board[j][i]!='.'&& !col.add(board[j][i]))
					return false;
				int rowindex=3*(i/3);
				int colindex=3*(i%3);
				if(board[rowindex+j/3][colindex+j%3]!='.' && !cube.add(board[rowindex + j/3][colindex + j%3]))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		char[] test={'.','.','.','.','1','4','.','.','.'};
		char[][] test1={{'.','.','5','.','.','.','.','.','6'},{'.','.','.','.','1','4','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','9','2','.','.'},{'5','.','.','.','.','2','.','.','.'},{'.','.','.','.','.','.','.','3','.'},{'.','.','.','5','4','.','.','.','.'},{'3','.','.','.','.','.','4','2','.'},{'.','.','.','2','7','.','6','.','.'}};
		char[][] test2={{'.','.','.','2','7','.','6','.','.'}};
//	System.out.println(isValidSudoku(test1));
		Set<Integer> h=new HashSet<Integer>();
		h.add(1);
		h.add(2);
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(10);
		h.addAll(list);
		System.out.println(h.size());
	}
}
