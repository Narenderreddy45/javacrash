package homework1;

public class Box<T> {
private static Box<Integer> integerBox;

private T value;
public Box() {
	this.value =null;
}
public void set (T newvalue ) {
	this.value=newvalue;	
}
public T get() {
	return this.value;
}
public static void main(String[]args)
{
Box<Integer> integerBox=new Box<>()	;
integerBox.set(10);
System.out.println("Integer value in the box :"+integerBox.get());

Box<String>stringBox =new Box<>();
stringBox.set("Hello,World");
System.out.print("String value in the box:" +stringBox.get());
}
}
