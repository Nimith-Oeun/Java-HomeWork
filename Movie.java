package classAndObject.homeWork;

import java.util.Date;

public class Movie {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private Date releaseDate;
    private String[] category;


    public void setMovie(Integer id, String uuid, String title, String description, Date releaseDate, String [] category) {
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", category='" + category + '\'' +
                '}';
    }
}
