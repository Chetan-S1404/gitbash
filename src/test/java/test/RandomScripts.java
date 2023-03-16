package test;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RandomScripts {
///commit by github
	

	@Test
		public void Alphabets() 
	{
		 int a[]= {5,6,7,120,121,122};
			
			for (int i=0;i<a.length;i++) {
				int length=a[i];
		    //int length = 10;
		    boolean useLetters = true;
		    boolean useNumbers = false;
		    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

		    System.out.println(generatedString);}
		}

@Test
public void Numbers() {
 int a[]= {5,6,7,120,121,122};
	
	for (int i=0;i<a.length;i++) {
		int length=a[i];
    //int length = 10;
    boolean useLetters = false;
    boolean useNumbers = true;
    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

    System.out.println(generatedString);}
}

@Test
public void SpecialChars() {
 int a[]= {5,6,7,120,121,122};
	
for (int i=0;i<a.length;i++) {

final String alphabet = "<>/!@#$^&-,.";
final int N = alphabet.length();
Random rd = new Random();

int iLength = a[i];
StringBuilder sb = new StringBuilder(iLength);
for (int j = 0; j < iLength; j++) {
sb.append(alphabet.charAt(rd.nextInt(N)));

}
String str = sb.toString();

System.out.println(str);

	}}
@Test
public void Blank() {
 int a[]= {5,6,7,120,121,122};
	
for (int i=0;i<a.length;i++) {

final String alphabet ="_";
final int N = alphabet.length();
Random rd = new Random();

int iLength = a[i];
StringBuilder sb = new StringBuilder(iLength);
for (int j = 0; j < iLength; j++) {
sb.append(alphabet.charAt(rd.nextInt(N)));

}
String str = sb.toString();
System.out.println(str);

	}}



		@Test
		public void Alpha_Numeric() {
			int a[]= {5,6,7,120,121,122};
			
			for (int i=0;i<a.length;i++) {
				int length=a[i];
				//int length = 0; 
			    boolean useLetters = true;
			    boolean useNumbers = true;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				
			    System.out.println(generatedString);
			}
		} 
		
		@Test
		public void AlphabetwithSpecial() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		      	        
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		        
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
			}
		
		@Test
		public void AlphabetwithBlank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String alphabet ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         sb.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
		     
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
				}
		
		@Test
		public void Numberwith_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String blank ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         
		         
		         sb.append(blank.charAt(rnd.nextInt(blank.length())));
		         sb.append(numbers .charAt(rnd.nextInt(numbers .length())));
		         
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		@Test
		public void Number_special() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@_!#%&()*+,-.~";
			String blank ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
		         
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		        
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		@Test
		public void Special_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String blank ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(blank.charAt(rnd.nextInt(blank.length())));
		         
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		        
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		@Test
		public void AlphabetwithNumber_special() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         
		         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		@Test
		public void AlphabetwithNumber_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String alphabet ="_";

			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         
		         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
		         sb.append(alphabet .charAt(rnd.nextInt(alphabet .length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		@Test
		public void AlphabetwithSpecial_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String blank ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         
		         sb.append(blank.charAt(rnd.nextInt(blank.length())));
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}
		
		
		@Test
		public void NumberwithSpecial_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@!#%&()*+,-.~";
			String blank ="_";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = a[j];
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
		         
		         sb.append(blank.charAt(rnd.nextInt(blank.length())));
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		         
    		}
		    String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;}
		}

		
		
	/*	@Test
		public void SpecialChars() {
			Source s=new Source();
			
		 int a[]= {5,6,7,120,121,122};
			
			for (int i=0;i<a.length;i++) {
		
		final String alphabet = "<>/!@#$^&-,.";
		final int N = alphabet.length();
		Random rd = new Random();
		
		int iLength = a[i];
		StringBuilder sb = new StringBuilder(iLength);
		for (int j = 0; j < iLength; j++) {
		sb.append(alphabet.charAt(rd.nextInt(N)));
		
		}
		String str = sb.toString();
		//System.out.println("Enter "+a[i]+" "+b[i]);
		System.out.println("Input: ");
		System.out.println(str);
		
			}
			return ;
			}*/
		
/*		@Test
		public void Alphanumericwithspecial() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@_!#%&()*+,-.~";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = (a[j])-1;
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
		    }

		    // Generate an index to replace with a number
		    int numberIndex = rnd.nextInt(len);
		    // Generate an index to replace with a special character
		    int specialIndex;
		    do {
		        specialIndex = rnd.nextInt(len);
		    } 
		    while (specialIndex == numberIndex);
		    // Replace one letter with a number
		    sb.setCharAt(numberIndex, numbers.charAt(rnd.nextInt(numbers.length())));
		    // Replace one letter (or the number if you're unlucky) with a special character
		    sb.setCharAt(specialIndex, specials.charAt(rnd.nextInt(specials.length())));
		    System.out.println(sb.toString());
			
		}}*/
		
		@Test
		public void Alpha_NumericwithSpecial_Blank() {
			String AB = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";
			String specials = ":<=>?@_!#%&()*+,-.~";
			String blank=" ";
			int a[]= {5,6,7,120,121,122};
			
			for (int j=0;j<a.length;j++) {
		    StringBuilder sb = new StringBuilder();
		    Random rnd =new Random();
		    int le = (a[j]);
			int len = le;

		    // Generate password with letters first. This part is the same as the original code.
		    for (int i = 0; i <= len; i++) {
		         sb.append(AB.charAt(rnd.nextInt(AB.length())));
 				 sb.append(numbers.charAt(rnd.nextInt(numbers.length())));
		         sb.append(specials .charAt(rnd.nextInt(specials .length())));
		         sb.append(blank.charAt(rnd.nextInt(blank.length())));

		    }
 			String S = (sb.toString());
	
		    System.out.println(S.substring(0, len));;
	
		}}
		
		
		
		
		
		
		
	}




