package learningjava;

public class StaticAndNonStaticKeywords
{
	 static String str1 = "hello";
	 String str2 = "world";
	 static void printStr1()
	 {
		 System.out.println(str1);
		 System.out.println(new StaticAndNonStaticKeywords().str2);
	 }
	 void printStr2()
	 {
		 System.out.println(str1);
		 System.out.println(str2);
	 }
	public static void main(String[] args) 
	{
	printStr1();
	new StaticAndNonStaticKeywords().printStr2();		
	}
}