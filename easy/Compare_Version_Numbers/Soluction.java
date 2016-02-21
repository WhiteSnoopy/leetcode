package com.org.Compare_Version_Numbers;
/*
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, 
 * if version1 < version2 return -1, 
 * otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 */
public class Soluction {
	public static int compareVersion(String version1, String version2) {
		//split 分割.时需要添加
		String[] versionA=version1.trim().split("\\.");
		String[] versionB=version2.trim().split("\\.");
		int lenA=versionA.length;
		int lenB=versionB.length;
		for(int i=0;i<lenA && i<lenB;i++)
		{
			if(Integer.parseInt(versionA[i])>Integer.parseInt(versionB[i]))
				return 1;
			if(Integer.parseInt(versionA[i])<Integer.parseInt(versionB[i]))
				return -1;
		}
		if(lenA<lenB)
		{
			for(int i=lenA;i<lenB;i++)
				if(Integer.parseInt(versionB[i])!=0)
					return -1;
			return 0;
		}
		if(lenA>lenB)
		{
			for(int i=lenB;i<lenA;i++)
				if(Integer.parseInt(versionA[i])!=0)
					return 1;
			return 0;
		}
		return 0;
	}
	public static void main(String[] args) {
		String version1="3.1";
		String version2="3.0.1";
		System.out.println(compareVersion(version1,version2));
	}
}
