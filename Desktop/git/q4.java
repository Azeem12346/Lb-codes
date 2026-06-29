  class book
{
     private int id;
     private String title;
    public void setData(int id , String title)
    {
        this.id=id;
        this.title=title;

    }
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    }
    class user
    {
       private int user_id;
       private String user_name;

       public void setUser(int user_id, String user_name)
       {
        this.user_id=user_id;
        this.user_name=user_name;
       }
       public void getUser(book s1)
       {
        System.out.println( "This is the book id: " +s1.getId() +" Acessed by user id "+user_id);
    System.out.println("This is the Book title: "+s1.getTitle() + " Acessed by user " + user_name);
        
       }
    }

class q4
{

    public static void main(String[] args) {
        book s1= new book();
        s1.setData(101, "The story of my life");
        
        user b1=new user();
        b1.setUser(1, "Azeem");
        b1.getUser(s1);

        
    }
}