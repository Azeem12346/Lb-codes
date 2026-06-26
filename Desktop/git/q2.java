import java.util.Scanner;

class user
{
    int user_id;
    String name;
    int borrow_b_id;
   public void setData(int user_id, String name,int borrow_b_id)
   {
   
        this.user_id=user_id;
        this.name=name;
        this.borrow_b_id=borrow_b_id;

    
   }

public void getData()
{
    System.out.println(user_id);
    System.out.println(name);
    System.out.println(borrow_b_id);
}

public void borrow()
{

    System.out.println("This is Borrowed Book id");

    System.out.println(borrow_b_id);
}
public void returnb()
{
    System.out.println("Enter book id which you have to return");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==borrow_b_id)
    {
        System.out.println("Successfully returned book : " + n);
    }else{
        System.out.println("invalid book id ! " + n);
    }

}

}






 public class q2
{
    public static void main(String[] args) {
        user s1=new user();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter  id:");
        int id=sc.nextInt();
        System.out.println("Enter name:");
        String n=sc.next();
        System.out.println("Enter BooK id:");
        int bid=sc.nextInt();

        s1.setData(id, n, bid);
        s1.getData();
        s1.borrow();
        s1.returnb();



        
    }
    
}