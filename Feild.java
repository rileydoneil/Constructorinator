// constructor creator
//Riley O'Neil
//automatically creates constructors

public class Feild  {
   
   //feilds
   private String type;
   private String name;
   
   //constructors
   public Feild(){
      this.type = "empty";
      this.name = "empty";
   }
   
   public Feild(String type, String name){
      
      this.type = type.replace(";","");
      this.name = name.replace(";","");
   }
   
   //accessors
   public String getType() {return this.type;}
   public String getName() {return this.name;}
   
   public String toString()   {return type + " " + name;}
}