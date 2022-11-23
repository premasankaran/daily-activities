interface Printable { // parent
void print();}
interface Showable extends Printable { // child
void show();}
class TestInterface4 implements Showable{
public void print() {
System.out.println("Welcome,Printable interface"); }
public void show() {
System.out.println("Hi, Showable interface"); }
public static void main(String args[]) {
TestInterface4 t=new TestInterface4();
t.print(); t.show(); } }