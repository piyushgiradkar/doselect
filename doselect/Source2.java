package doselect;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Source2 {
	public static void main(String args[] ) throws Exception {
		
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));
		}
}
