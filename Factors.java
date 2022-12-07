public class Factors
//Optimized code to find factors of 48
{
void f()
{
int number = 48;
for (int i = 1; i<=number/2; i = i + 1)
{
 if (number%i == 0)
{
System.out.println(i);
}
}
System.out.println(48);
}
public static void main (String args[])
{
Factors obj = new Factors();
obj.f();
}
}
