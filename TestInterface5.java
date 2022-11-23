interface Showable {
void draw();
default void Msg(){
System.out.println("Method in interface");}}
class TestInterface5 implements Showable{
public void draw() {
System.out.println("Hello Showable");}
public static void main(String args[]) {
Showable s=new TestInterface5();
s.draw(); s.Msg();}}