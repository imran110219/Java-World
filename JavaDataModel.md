# Java Data Model        
Java Data Model is the java class which contains variables  and getters setters method for the variables. Java class object can used for passing data one method to another method. 

**Java Data Model Types**        
1. JavaBeans       
2. POJO    
3. Data Transfer Object   
  
  
**JavaBeans**    
JavaBeans is a portable, platform-independent model written in Java Programming Language. Its components are referred to as beans. In simple terms, JavaBeans are classes which encapsulate several objects into a single object. It helps in accessing these object from multiple places. JavaBeans contains several elements like Constructors, Getter/Setter Methods and much more.          
The required conventions are:    
1. It should have a no-arg constructor.
2. It should be Serializable.
3. It should provide methods to set and get the values of the properties, known as getter and setter methods.   

**Code Example:**     
```
public class Employee implements java.io.Serializable{  
   private int id;  
   private String name;  
   public Employee(){
   }  
   public void setId(int id){
      this.id=id;
   }  
   public int getId(){
      return id;
   }  
   public void setName(String name){
      this.name=name;
   }  
   public String getName(){
      return name;
   }  
}  
```


**POJO**   
POJO is an acronym for Plain Old Java Object. The name is used to emphasize that the object in question is an ordinary Java Object, not a special object, and in particular not an Enterprise JavaBean (especially before EJB 3). POJOs are used for increasing the readability and re-usability of a program. The term was coined by Martin Fowler, Rebecca Parsons and Josh MacKenzie in September 2000.      
A POJO should not:    
1. Extend prespecified classes, as in      
```
public class Foo extends javax.servlet.http.HttpServlet { ...      
```       
2. Implement prespecified interfaces, as in       
```
public class Bar implements javax.ejb.EntityBean { ...     
```
3. Contain prespecified annotations, as in    
```
@javax.persistence.Entity public class Baz { ...      
```

**Code Example**   
```
public class Employee {  
   private int id;  
   private String name;  
   public Employee(String name, String id){
      this.name = name; 
      this.id = id; 
   }  
   public void setId(int id){
      this.id=id;
   }  
   public int getId(){
      return id;
   }  
   public void setName(String name){
      this.name=name;
   }  
   public String getName(){
      return name;
   }  
}  
```              


**Data Transfer Object**          
Data Transfer Object or DTO is a (anti) pattern introduced with EJB. Instead of performing many remote calls on EJBs, the idea was to encapsulate data in a value object that could be transfered over the network: a Data Transfer Object. DTOs can either contain all the data from a source, or partial data. They can hold data from single or multiple sources as well. When implemented, DTOs become the means of data transport between systems.                 

**Code Example**    
```    
/* Employee */
public class Employee {  
   private int employeeId;  
   private String name;  
}  

/* Location */
public class Location {  
   private int id;  
   private double lat;  
   private double lng;  
} 

/* DTO Model */ 
puvlic class EmployeeLocation {
   private int employeeId;  
   private String name;
   private double lat;  
   private double lng;
}
``` 
 



