interface Sayable {
void sayMore(String msg);// abstract method
default void say() { // default method
System.out.println("Hi, Default method"); }
//static void saySomething(String msg1); // static method
static void saySomething(String msg1) {
System.out.println(msg1); }
}//end interface
class DefaultMethodDemo2 implements Sayable {
public void sayMore(String msg) {
System.out.println(msg);}
public static void main(String args[]) {
Sayable s=new DefaultMethodDemo2();
s.say();
s.sayMore("Doing smart work better than hardwork");
Sayable.saySomething("I love to do Smart work");}}