interface Showable {
void print(); }
class TestInterface7{
public static void main(String args[]) {
Showable obj =new Showable() {
public void print(){
System.out.println("Hellooo Draw");} };
obj.print();}}