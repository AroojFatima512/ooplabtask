package week3Task;

import java.util.Objects;

    public class Music {
    private String title;


    public boolean equals(Object o) {
        Music m = (Music)o; //Down Cast
      return this.title.equals(m.title)?true:false;
    }


    private String duration;
    private String genre;
    private Date releaseDate;
    private Singer singer;

    public Music(String title, String duration, String genre, Date releaseDate, Singer singer){
        this.title=title;
        this.duration=duration;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.singer=singer;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String toString(){
        return String.format("Song Name: %s\n Duration: %s\n Genre: %s\n Release Date: %s\n  %s \n", title, duration, genre, releaseDate, singer);
    }

}
