package blogpost;

public class Main {

  public static void main(String[] args) {
    BlogPost newBlog = new BlogPost("Stephen King", "Madarak", "It was good", "1999.04.05");
    System.out.println(newBlog.authorName);
    System.out.println(newBlog.title);
    System.out.println(newBlog.publicationDate);
    System.out.println(newBlog.text);

    System.out.println("----------------------------");

    BlogPost secondblog = new BlogPost();
    System.out.println(secondblog.authorName = "Tim Urban");
    System.out.println(secondblog.title = "Wait but why");
    System.out.println(secondblog.text = "A popular long-form, stick-figure-illustrated blog about almost everything.");
    System.out.println(secondblog.publicationDate = "2010.10.10");
  }
}
