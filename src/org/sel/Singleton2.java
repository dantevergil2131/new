package org.sel;

public class Singleton2 {
	
	
public static void main(String[] args) {
	Singleton w=Singleton.getId();
	w.getName();
	System.out.println(System.identityHashCode(w));
	System.out.println("hii");
}

}
