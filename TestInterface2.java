interface Bank {
double rateOfInterest(); }
class SBI implements Bank {
public double rateOfInterest() { return 9.15; } }
class BOI implements Bank {
public double rateOfInterest() { return 12.5; } }
class TestInterface2 {
public static void main(String args[]) {
Bank b=new SBI();
System.out.println(b.rateOfInterest());
Bank b1=new BOI();
System.out.println(b1.rateOfInterest()); }}