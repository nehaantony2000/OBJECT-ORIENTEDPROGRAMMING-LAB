class Outer
{
int x=10;
class Inner
{
int y=5;
}
}
public class InnerClassExample
{
public static void main (String[] args)
{
Outer MyOuterobj = new Outer();
Outer.Inner MyInnerobj = MyOuterobj.new Inner();
System.out.println(MyOuterobj.x);
System.out.println(MyInnerobj.y);

}
}