package Chapter1_VariablesAndDataType;

public class variableAndDatatype {
    public static void main(String[] args) {
        byte a = 100;
        System.out.println(a);

        short b = 20000;
        System.out.println(b);

        long c = 20000000000000l;
        System.out.println(c);

        int d = 62;
        System.out.println(d);

        float e = 3.14f;
        System.out.println(e);

        double f = 2.000000009;
        System.out.printf("%.2f\n",f);

        char g = 'X';
        System.out.println(g);

        boolean h = false;
        System.out.println(h);

        System.out.println(3.0+5.0);
    }
}

//understanding
/*
Variable is a named memory location used to store data.

-----------------------
Syntax:
datatype varName = value;

------------------------
Rules:
✅ Valid
age
studentName
salary
num1
_myAge

------------------------
❌ Invalid
1age ->not number
student age -> not space
my-name ->not hyphen
class ->not reserved word
int ->not reserved word

------------------------
Primitive Datatypes
Java me 8 Primitive Datatypes hote hain.
Datatype	Use	Example
byte	Small Integer	100
short	Medium Integer	2000
int	Integer	21
long	Large Integer	10000000000L
float	Decimal	3.14f
double	Decimal	3.14159
char	Single Character	'A'
boolean	true/false	true

*String is not primitive data type it is a class
 */
