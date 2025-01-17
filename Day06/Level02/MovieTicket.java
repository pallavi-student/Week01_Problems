package Day06.Level02;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Ticket booked for " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avatar 2", 12, 350);
        ticket.bookTicket();
        ticket.displayTicketDetails();
    }
}
