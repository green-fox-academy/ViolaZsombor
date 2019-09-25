package blogpost;

public class Main {

  public static void main(String[] args) {
    BlogPost newBlog = new BlogPost("Stephen King", "Madarak", "It was good", "1999.04.05");
    System.out.println(newBlog.authorName);
    System.out.println(newBlog.title);
    System.out.println(newBlog.publicationDate);
    System.out.println(newBlog.text);
  }
}
