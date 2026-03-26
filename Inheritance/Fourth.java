class Book {
    int publicationYear;
    String title;

    public void setpublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void settitle(String title){
        this.title = title;
    }

    void display(){
        System.out.println("Basic Information Of Book:");
        System.out.println("Title: " + title);
        System.out.println("Year: " + publicationYear);
    }
}

class Author {
    String name;
    String bio;
    Book book;  

    public void setname(String name){
        this.name = name;
    }

    public void setbio(String bio){
        this.bio = bio;
    }

    public void setBook(Book book){
        this.book = book;
    }

    void display(){
        book.display(); 
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class Fourth {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setpublicationYear(1910);
        b1.settitle("Gitanjali");

        Author a1 = new Author();
        a1.setname("Rabindranath Tagore");
        a1.setbio("Famous Indian poet and Nobel Prize winner.");
        a1.setBook(b1);

        a1.display();
    }
}