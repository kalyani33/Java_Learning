# Java_Learning
Core java concepts
Static keyword:
when we want to make a variable(with same value) common to all the objects of a class
if there is a usecase where one of my variable with same value across all the objects
object will be created in heap memory
class will be created in different memory loads by class loader
before creating objects first we should load the class first
So if we declare a varible as static then this varible will be loading while loading the class itself
we can access the static variable with class eg: Emp.varibleName;
So constructor is used initalize objects i.e to set the default values to the objects varibles.this constructor will be called every time whenver the object is created.
but static varible will be common to all the classess ,so to initialize static varibles we have use static block inside class as shown below,so that static varible will be set only one time while loading the class.
class Emp
{
  int name;
  double salary;
  static String ceo;
  
  static            // when you load class
  {
    ceo = "kalyani";
  }
  public Emp()    // when you crate object
  {
    name = "ABC";
    salary = 9999999;
  }
}


we can declare functions as static also 

*** we can access static varibles or functions without creating an object***
** we cannot call non-static functions or varibles within static functions***
