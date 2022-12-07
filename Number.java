public class Number
{
void tocheckpositive(int number)
{
if(number>0)
{
System.out.println("Positive Number");
}
else
{
System.out.println("Negative Number");
}
}
void oddoreven(int number)
{
if(number%2 == 0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd Number");
}
}
int modulus(int number)
{
if(number<0)
{
number = -1 * number;
System.out.println(number);
}
return number;
}
void tocheckprimenumber(int number)
{
boolean flag = false;
for(int i =2; i<number; i = i + 1)
{
if(number % i == 0)
{
flag = true;
}
}
System.out.println (flag);
if(flag)
{
System.out.println ("Not a Prime Number");
}
else
{
System.out.println ("Prime Number");
}
}
public static void main(String args[])
{
Number obj = new Number();
obj.tocheckpositive (-7);
obj.oddoreven(8);
obj.modulus(9);
obj.tocheckprimenumber(17);
}
}
