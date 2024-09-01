package srujan;
import java.util.Arrays;
public class CheckAnagrams {

	public static void main(String[] args) {
		String str1 = "earth";
		String str2 = "heart";
		
		//convert Strings to lowercase.
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//first check if the length is same
		if(str1.length()== str2.length()) {
			//convert Strings into char arrays.
			char[] str1charArray= str1.toCharArray();
			char[] str2charArray= str2.toCharArray();
			//sort array
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);
			//if the sorted char arrys are same then the string are anagrams
			boolean result= Arrays.equals(str1charArray, str2charArray);
			if(result==true) {
				System.out.println(str1+ " and "+str2+" are anagrams to each other");
			}
			else {
				System.out.println("they are not anagrams");
			} 
		}
		else {
			//case when lengths are not same
			System.out.println(str1+" and "+ str2+"are not anagrams");
		}
	}

}  
