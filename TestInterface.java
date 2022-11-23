interface Printable {
int m=50;
void print(); }
class TestInterface implements Printable {
public void print() {
System.out.print("Hello, printable interface"); }
public static void main(String[] arg) {
TestInterface t=new TestInterface();
System.out.println(t.m);
t.print();}}