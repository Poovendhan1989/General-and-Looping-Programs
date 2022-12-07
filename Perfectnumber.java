public class Perfectnumber
{
void m()
{

int sum = 0;
int number = 20;
for (int i = 1; i<number; i = i + 1)
{
 if (number%i == 0)
{
 sum = sum + i;
}
}
System.out.println (sum);
if (number == sum)
{
System.out.println ("Perfect Number");
}
else
{
System.out.println ("Not a Perfect Number");
}

}
public static void main (String args[])
{
Perfectnumber obj = new Perfectnumber ();
obj.m();
}
}
