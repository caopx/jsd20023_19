package apidoc;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String person=sc.next();
		Person a=new Person("Tom",22,"男","是一个帅气的人");
		a.toString();
		

	}

}
