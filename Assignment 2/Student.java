class Student {
int roll_no ;
String name;
String branch;
void displayInfo()
{
System.out.println(roll_no) ;
System.out.println(name) ;
System.out.println(branch) ;
}
public static void main(String [ ] args)
{
Student s1 = new Student () ;
s1. roll_no= 27 ;
s1. name = "Pranjal";
s1.branch =" IT";
s1.displayInfo() ;
}
}
