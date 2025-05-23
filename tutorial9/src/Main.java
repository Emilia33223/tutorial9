public class Main {
    public static void main(String[] args) {
// Display library name
        System.out.println("Welcome to " + MediaItem.LIBRARY_NAME);
        System.out.println("Maximum rental period: " + Rentable.MAX_RENTAL_DAYS + " days\n");
// Create and test a book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
                System.out.println(book1.getDisplayString());
        System.out.println("Available: " + book1.isAvailable(), 1925, 978-0-7432-7356-5");
// Rent the book
        if (book1.rent()) {
            System.out.println("Book rented successfully!");
        }
        System.out.println("Available after rental: " + book1.isAvailable());
// Calculate late fee
        System.out.println("Late fee for 3 days: $" + Rentable.calculateLateFee(3));
// Return the book
        book1.returnItem();
        System.out.println("Available after return: " + book1.isAvailable() + "\n");
// Create and test a movie
        Movie movie1 = new Movie("Inception"
                ,
                System.out.println(movie1.getDisplayString());
        "Christopher Nolan", 2010, 148);
// Add ratings to the movie
        movie1.addRating(5);
        movie1.addRating(4);
        movie1.addRating(5);
        System.out.println("Average rating: " + movie1.getAverageRating() + " stars");
// Rent the movie
        if (movie1.rent()) {
            System.out.println("Movie rented successfully!");
        }
// Try to rent again (should fail)
        if (!movie1.rent()) {
            System.out.println("Movie is already rented!");
        }
    }
}



}

