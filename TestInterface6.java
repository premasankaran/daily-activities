interface Showable {
default void draw(){
System.out.println("Msg()method in interface"); }}
class TestInterface6 implements Showable{
public static void main(String args[]) {
Showable s=new TestInterface6();
s.draw(); } }