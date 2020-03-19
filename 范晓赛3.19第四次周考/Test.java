package exam319;

import java.io.File;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("tom",22,"男","是一个帅气的人！");
		File f = new File("person.obj");
		if(f.exists()) {
			ObjectOutputStream bos = null;
			System.out.println();
		}		
	}
}
