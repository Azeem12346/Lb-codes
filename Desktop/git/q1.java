class book1 {
    int book_id;
    String title;
    String author;
    String genre;
    String avail;
    
    
     public  void setData(int book_id, String title, String author, String genre,String avail)
     {
        this.book_id=book_id;
        this.title=title;
        this.author=author;
        this.genre=genre;
        
        
     }
      public void  getData()
     {
        System.out.println(book_id);
        System.out.println(title);
        System.out.println(author);
        System.out.println(genre);
        System.out.println(avail);
      
        
     }

     

    
}





public class q1 {
    public static void main(String[] args) {
        book1 s1=new book1();
        s1.setData(101, "story of my life", "hellen keler", "aDVENTURE", "YES");
        s1.getData();
        
    }
}
