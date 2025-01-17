public class HandelBookDetails {
    public class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayDetailsOfBook() {
            System.out.println("Title of the book is " + title + " author of the book is " + author + " price of the book is " + price);

        }

    }
    public static void main(String[] args) {
        HandelBookDetails bookDetails = new HandelBookDetails();
        Book b = bookDetails.new Book("HoneyComb", "Da Raseed", 100);
        b.displayDetailsOfBook();
    }



    }

