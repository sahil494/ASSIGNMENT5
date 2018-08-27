class Vehicle 
{
void start()
{
System.out.println("Start");
}
void stop()
{
System.out.println("Stop");
}
}
class Twowheeler extends Vehicle 
{
void start()
{
System.out.println("twowheeler start");
}
void stop()
{
System.out.println("twowheeler stop");
}
}
class Fourwheeler extends Vehicle 
{
void start()
{
System.out.println("fourwheeler start");
}
void stop()
{
System.out.println("fourwheeler stop");
}
}
class Vehicle1
{
public static void main(String[] args)
{
Vehicle v=new Vehicle();
Twowheeler t1=new Twowheeler();
t1.start();
t1.stop();
Fourwheeler t2=new Fourwheeler();
t2.start();
t2.stop();
}
}
