public class Employee implements java.io.Serializable
{
    
      public String name;
      public String address;
      public transient int pno;
      public int number;
                    
          public void mailcheck()
          {
              System.out.println("mailing check to "+name+" "+address);
           }  
    
}
