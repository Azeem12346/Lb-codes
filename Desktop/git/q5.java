
  class Book
{
    String title;
    void  displayDetails(String title)
    {
        this.title=title;
       
    }
    
}

class FictionBook extends Book
{
    
void displayDetails(String title)
    {
        super.displayDetails(title);
        System.out.println("Fiction book  title :" + title );
    }
}

class NonFictionBook extends Book
{
    
  void displayDetails(String title)
    {
        super.displayDetails(title);
        System.out.println(" Nonfction book :"+ title);
    }
}

public class q5 {
    public static void main(String[] args) {
        FictionBook s1=new FictionBook();
        NonFictionBook s2=new NonFictionBook();
        s1.displayDetails("harry potter");
        s2.displayDetails("caption america");


        
    }
    
}
