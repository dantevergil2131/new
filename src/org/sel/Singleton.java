package org.sel;

public class Singleton {
	static Singleton w;
	private Singleton() {
	}
	public static Singleton getId() {
		if(w==null)
		{
			w=new  Singleton();
		}
		System.out.println(System.identityHashCode(w));
		return w;
	}
public void getName() {
System.out.println("Emp name is noob");
}
	public static void main(String[] args) {
		Singleton w=getId();
		w.getName();
	}
}
