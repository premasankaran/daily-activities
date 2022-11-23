interface Printable {
void print(); }
interface Showable {
void show(); }
class TestInterface3 implements Printable,Showable {
public void print() {
System.out.println("Hi,Printable interface"); }
public void show() {
System.out.println("Hello, Showable interface"); }
public static void main(String args[]) {
TestInterface3 t=new TestInterface3();
t.print(); t.show();}}