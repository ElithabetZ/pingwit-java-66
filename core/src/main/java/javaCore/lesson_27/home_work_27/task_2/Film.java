package javaCore.lesson_27.home_work_27.task_2;

import java.util.Objects;
//record :)
public class Film {

    private String name;
    private int releaseYear;
    private String country;
    private String genre;
    private String lasting;
    private String quality;
    private String imdbRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLasting() {
        return lasting;
    }

    public void setLasting(String lasting) {
        this.lasting = lasting;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(String imdbRate) {
        this.imdbRate = imdbRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film film)) return false;
        return releaseYear == film.releaseYear && Objects.equals(name, film.name) && Objects.equals(country, film.country) && Objects.equals(genre, film.genre) && Objects.equals(lasting, film.lasting) && Objects.equals(quality, film.quality) && Objects.equals(imdbRate, film.imdbRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, releaseYear, country, genre, lasting, quality, imdbRate);
    }

    @Override
    public String toString() {
        return   name + '\n' +
                 + releaseYear +'\n'+
                 country + '\n' +
                 genre + '\n' +
                lasting + '\n' +
                quality + '\n' +
                imdbRate + '\n';
    }
}
