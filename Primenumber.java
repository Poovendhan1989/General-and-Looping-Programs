public class Primenumber
{
void p()
{
int number = 8;
boolean flag = false;
for (int i =2; i<number; i = i + 1)
{
if (number % i == 0)
{
flag = true;
}
}
System.out.println(number);
if (flag)
{
System.out.println ("is not a Prime Number");
}
else
{
System.out.println ("is a Prime Number");
}
}
public static void main (String args[])
{
Primenumber obj = new Primenumber();
obj.p();
}
}
