class Animal
{
String breed;
String color;
void speak()
{
System.out.println("Animals speak diff languages");
}
}
class Dog extends Animal
{
void speak()
{
System.out.println("Dog barks");
}
}
class Cat extends Animal
{
void speak()
{
System.out.println("Cat meow");
}
}
class  Animals
{
public static void main(String[] args)
{
Animal a=new Animal();
a.speak();
a=new Dog();
a.speak();
a=new Cat();
a.speak();
}
}