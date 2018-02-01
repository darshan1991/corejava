package Practice;

public class Overloading {
static int max(int a, int b) {
	if(a > b)
		return a;
	else
		return b;
}
static String max(String a, String b) {
	if(a.compareTo(b) > 0)
		return a;
	else
		return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Mysuru";
String s2 = "Tum";
int a = 10;
int b = 20;
System.out.println(Overloading.max(a,b));
System.out.println(Overloading.max(s1,s2));
	}

}
