package org.string;

import java.util.Scanner;

public class Stringsssss {
	public static void main(String[]args) {
		String s1="GreensTechnology";
		String s2="SeleniumAutomationTool";
		String s3="velmurugan";
		String s4="j a v a p r o g r a m";
		String s5="9095484678";
		
		System.out.println("S1 "+s1.length());
		System.out.println("S2 "+s2.length());
		System.out.println("S3 "+s3.length());
		System.out.println("S4 "+s4.length());
		System.out.println("S5 "+s5.length());
		System.out.println("===================");
		
		int lo=s1.lastIndexOf('o');
		System.out.println(lo);
		int l=s2.indexOf('o');
		System.out.println(l);
		int a=s3.indexOf('n');
		System.out.println(a);
		int b = s4.lastIndexOf(' ');
		System.out.println(b);
		int c = s5.indexOf('8');
		System.out.println(c);
		System.out.println("====================");
		char a1 = s1.charAt(9);
		System.out.println(a1);
		char a2=s2.charAt(11);
		System.out.println(a2);
		char a3=s3.charAt(4);
		System.out.println(a3);
		char a4=s4.charAt(8);
		System.out.println(a4);
		char a5=s5.charAt(8);
		System.out.println(a5);
		System.out.println("=================");
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Case check");
		System.out.println("Enter z");
		String z = s.nextLine();
		System.out.println("Enter z1");
		String z1=s.nextLine();
		boolean equals = z.equalsIgnoreCase(z1);
		System.out.println(equals);
		System.out.println("Enter mail id");
	String z3=s.nextLine();
	boolean t = z3.contains("@");
	System.out.println(t);
	if(t==true) {
		System.out.println("VALID MAIL ID");
	}
	else {
		System.out.println("Invalid");
	}
		System.out.println("============");
	System.out.println("Enter phone number");
	String ph=s.nextLine();
	int length=ph.length();
	if(length>10) {
		System.out.println("Invalid phone number");
	}
	else {
		System.out.println("OK");
	}
		System.out.println("=======================");
		String address=s.nextLine();
		System.out.println("Enter Address");
		boolean contains = address.contains("pincode");
		if(contains==true) {
	System.out.println("Valid address");
		}
		else {
			System.out.println("Invalid Address");
		}
		System.out.println("=================");
		String d="Welcome to class java";
		String f = d.replaceAll("java", "sql");
		System.out.println(f);
		System.out.println("==================");
		String q="Greens Adayar";
		String rp=q.replaceAll("Adayar", "OMR");
		System.out.println(rp);
		System.out.println("===============");
		String m="Welcome to JAVA";
		String rm=m.replaceAll(" ", "#");
		System.out.println(rm);
		System.out.println("===================");
		System.out.println("Enter mail id");
		String mid=s.nextLine();
		boolean contains1=mid.contains("gmail");
		if(contains1==true) {
			String ar = mid.replaceAll("gmail", "yahoo");
			System.out.println(ar);
		}
		else {
			System.err.println("Error");
		}
		System.out.println("==================");
		System.out.println("Enter address");
		String ad=s.nextLine();
		boolean adc=ad.contains("pincode");
		if(adc==true) {
			String adcr=ad.replaceAll("pincode", " ");
			System.out.println(adcr);
			System.out.println("===========");
		}
System.out.println("Enter name in lower case");
String n=s.nextLine();
String nu=n.toUpperCase();
System.out.println(nu);
System.out.println("Enter name in upper case");
String u=s.nextLine();
String nl=u.toLowerCase();
System.out.println(nl);
System.out.println("==============");
String a11="WelcomE";
a11.replaceAll("WelcomE", "wELCOMe");
System.out.println(a11);
System.out.println("===================");
String z11="WelcomeToJava";
boolean sw = z11.startsWith("Welcome");
System.out.println(sw);
boolean ew = z11.endsWith("Java");
System.out.println(ew);
boolean empty = z11.isEmpty();
System.out.println(empty);
System.out.println("==================");
System.out.println("Enter two string");
String a111=s.nextLine();
String a21=s.nextLine();
int cp = a111.compareTo(a21);
System.out.println(cp);
System.out.println("===============");
		System.out.println("Literal String");
		String S11="WELCOME";
		String S12="WELCOME";
		String S13="WELCOMEWELCOME";
		System.out.println(System.identityHashCode(S11));
		System.out.println(System.identityHashCode(S12));
		System.out.println(System.identityHashCode(S13));
		System.out.println("Non Literal String");
		String S1=new String("WELCOME");
		String S2=new String("WELCOME");
		String S3=new String("WELCOMEWELCOME");
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		System.out.println(System.identityHashCode(S3));
		System.out.println("=====================");
		String xz="Welcome to java class";
		String[] split = xz.split(" ");
		System.out.println(split.length);
      for(int i=0; i<split.length;i++) {
    	  System.out.println(split[i]);
}
      String[] ssd=xz.split("l");
      for(String x:ssd) {
    	  System.out.println(x);
      }
System.out.println("substring");
String substring = xz.substring(0,7 );
System.out.println(substring);
		System.out.println("======================");
		System.out.println("Sentence");
		String com=s.nextLine();
		System.out.println(com);
		int upper=0;
		int lower=0;
		int special=0;
		int space=0;
		int number=0;
		
		for(int i=0;i<com.length();i++) {
			char c1 = com.charAt(i);
			if(c1>='A' && c1<='Z')
				upper++;
			else if(c1>='a' && c1<='z')
				lower++;
			else if(c1>='0' && c1<='9')
				number++;
			else if(c1==' ')
				space++;
			else
				special++;
				
		}
		System.out.println("Uppercase "+upper);
		System.out.println("LowerCase "+lower);
		System.out.println("Number "+number);
		System.out.println("Special "+special);
		System.out.println("Space "+space);
		System.out.println("======================");
		System.out.println("Sentene");
		String ss=s.nextLine();
		String lc = ss.toLowerCase();	
		int vowel=0,consonants=0,others=0;
		for(int i=0;i<lc.length();i++) {
			char qw=lc.charAt(i);
			 if(qw=='a'||qw=='e'||qw=='i'||qw=='o'||qw=='u')
					vowel++;
			 else if(qw>='a'&&qw<='z')
				consonants++;
			
			else
				others++;
		}
		System.out.println("Count of vowels "+vowel);
		System.out.println("Count of consonants "+consonants);
		System.out.println("Count of others "+others);	
	System.out.println("=======================");
	System.out.println("Enter ph no");
	String ph1=s.nextLine();
	int num=0,other=0;
	for(int i=0; i<ph1.length();i++) {
		char cp1=ph1.charAt(i);
		if(cp1>='0'&&cp1<='9')
			num++;
		else
			other++;
			}
	if(num>10||other>0) {
		System.out.println("Invalid");
	}
	else {
		System.out.println("Valid phone number");
	}
	
	}





















}

	


