public class Students
{
int rollno;
String name;
double percentage;
void printGrade()
{
switch(1)
{
case 1:
//Any number from 71 to 80 will be captured in this case
if(percentage>=71 && percentage<=80)
{
System.out.println("Grade C");
}
case 2:
//Any number from 81 to 90 will be captured in this case
if(percentage>=81 && percentage<=90)
{
System.out.println("Grade B");
}
case 3:
//Any number from 91 to 100 will be captured in this case
if(percentage>=91 && percentage<=100)
{
System.out.println("Grade A");
}
default:
if(percentage<0||percentage>100)
{
System.out.println("Invalid mark");
}
}
}
//Constructor
Students(int a, String b, double c)
{
rollno = a;
name = b;
percentage = c;
}
public static void main(String args[])
{
Students s1 = new Students(1, "Sam", 78.0);
Students s2 = new Students(2, "Ram", 85.0);
Students s3 = new Students(3, "Ziya", 98.0);
s1.printGrade ();
s2.printGrade ();
s3.printGrade ();
}
}
