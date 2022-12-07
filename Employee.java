public class Employee
{
int id;
String name;
int salary;
double yearsofexperience;
void promotion()
{
switch(1)
{
case 1:
//Candidates having years of experience between 2 and 5 will be captured in this class
if(yearsofexperience>=2 && yearsofexperience<5)
{
System.out.println("Promote to Associate");
}
case 2:
//Candidates having years of experience between 5 and 7 will be captured in this class
if(yearsofexperience>=5 && yearsofexperience<7)
{
System.out.println("Promote to Senior Associate");
}
case 3:
//Candidates having years of experience between 7 and 10 will be captured in this class
if(yearsofexperience>=7 && yearsofexperience<10)
{
System.out.println("Promote to Team Lead");
}
case 4:
//Candidates having years of experience between 10 and 12 will be captured in this class
if(yearsofexperience>=10 && yearsofexperience<12)
{
System.out.println("Promote to Manager");
}
case 5:
//Candidates having years of experience between 12 and 15 will be captured in this class
if(yearsofexperience>=12 && yearsofexperience<15)
{
System.out.println("Promote to Senior Manager");
}
case 6:
//Candidates having years of experience between 15 and 18 will be captured in this class
if(yearsofexperience>=15 && yearsofexperience<18)
{
System.out.println("Promote to Asst Vice President");
}
case 7:
//Candidates having years of experience between 18 and 20 will be captured in this class
if(yearsofexperience>=18 && yearsofexperience<20)
{
System.out.println("Promote to Vice President");
}
case 8:
//Candidates having years of experience above 20 will be captured in this class
if(yearsofexperience>20)
{
System.out.println("Promote to Senior Vice President");
}
default:
if(yearsofexperience<2)
{
System.out.println("No promotion");
}
}
}
//Constructor
Employee(int a, String b, int c, double d)
{
id = a;
name = b;
salary = c;
yearsofexperience = d;
}
public static void main(String args[])
{
Employee e1 = new Employee(1, "Viyan", 25000, 0.8);
Employee e2 = new Employee(2, "Aarvalan", 50000, 4.0 );
Employee e3 = new Employee(3, "Nigarila", 60000, 6.5);
Employee e4 = new Employee(4, "Adhigan", 80000, 7.5);
Employee e5 = new Employee(5, "Karnan", 160000, 11.0);
Employee e6 = new Employee(6, "Magizhndhagai", 180000, 13.7);
Employee e7 = new Employee(7, "Mukilmathi", 220000, 17.0);
Employee e8 = new Employee(8, "Nila", 250000, 19.5);
Employee e9 = new Employee(9, "Nivedha", 300000, 21.0);
e1.promotion ();
e2.promotion ();
e3.promotion ();
e4.promotion ();
e5.promotion ();
e6.promotion ();
e7.promotion ();
e8.promotion ();
e9.promotion ();
}
}
