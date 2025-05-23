public class Movie implements MediaItem, Rentable {
    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean available;

    public Movie(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.available = true;

    }


    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String getDisplayString() {
        return "";
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean rent() {
        return false;
    }

    @Override
    public void returnItem() {

    }
}
