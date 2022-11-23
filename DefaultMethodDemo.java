interface Sayable {
void sayMore(String msg);// abstract method
default void say() {// default method
System.out.println("Hi, Default method");}}
class DefaultMethodDemo implements Sayable {
public void sayMore(String msg) { // implementation of abstract method
System.out.println(msg);}
public static void main (String args[]) {
Sayable s=new DefaultMethodDemo();
s.say();
s.sayMore("Doing smart work better than hardwork");}}