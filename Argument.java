class Overload
{
void print(String str)
{
System.out.println("Null Arguments");
}
void print(int i,double f)
{
System.out.println("One integer and one float");
System.out.println(i);
System.out.println(f);
}
}
class Argument
{
public static void main(String[] args)
{
Overload o=new Overload();
o.print("null");
o.print(5,7.8);
}
}