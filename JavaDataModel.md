# Java Data Model        
Java Data Model is the java class which contains variables  and getters setters method for the variables. Data can used by any method via java object. 

**Java Data Model Types**        
1. JavaBeans       
2. POJO    
3. Value Object    
4. Data Transfer Object   
  
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

**Value Object**        

**Data Transfer Object**          



