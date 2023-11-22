1)	Java program to implement Multilevel Inheritance 
class Car{
   public Car()
{
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
public class Maruti800 extends Maruti{

   public Maruti800()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
	 Maruti800 obj=new Maruti800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}

2)	Java program for encapsulation and abstraction 
class EncapsulationDemo{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}

//abstract class  
abstract class Shape   
{  
//abstract method  
//note that we have not implemented the functionality of the method  
public abstract void draw();  
}  
class Circle extends Shape  
{  
//implementing functionality of the abstract method  
public void draw()   
{  
System.out.println("Circle!");  
}  
}  
//main class   
public class Test   
{  
public static void main(String[] args)   
{  
Shape circle = new Circle();  
//invoking abstract method draw()  
circle.draw();  
}  
}  

3)	Write a program of java Constructor 
//PROGRAM TO FIND AREA OF RECTANGLE USING DEFAULT AND PARAMETERIZED CONSTRUCTOR
class Rectangle
{
int ar,length,breadth;
Rectangle( )    //DEFAULT CONSTRUCTOR
{
length=10;
breadth=20;
}
Rectangle(int l, int b)  //PARAMETERIZED CONSTRUCTOR
{
length=l;
breadth=b;
}
void area( )        //CALCULATING AREA
{
ar=length*breadth;
System.out.println(” “+ar);
}
public static void main(String args[ ])
{
Rectangle r1=new Rectangle( );    //DEFAULT CONSTRUCTOR IS CALLED
Rectangle r2=new Rectangle(15,15);  //PARAMETERIZED CONSTRUCTOR
System.out.println(“Area of rectangle with default constructor is: “);
r1.area( );
System.out.println(“Area of rectangle with parameterized constructor is: “);
r2.area( );
}
}
