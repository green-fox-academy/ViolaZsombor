package blogpost;

public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;


  }

  public BlogPost() {
    this.authorName = "abc";
    this.title = "abc";
    this.text = "abc";
    this.publicationDate = "abc";

  }
}
