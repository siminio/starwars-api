package com.demo.starwars_api.models;

import java.util.List;

public class Species {
    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String skinColors;
    private String hairColors;
    private String eyeColors;
    private String averageLifespan;
    private Object homeworld;
    private String language;
    private List<String> people;
    private List<String> films;
    private String created;
    private String edited;
    private String url;

    public Species(String name, String classification, String designation, String averageHeight, String skinColors,
                   String hairColors, String eyeColors, String averageLifespan, Object homeworld, String language,
                   List<String> people, List<String> films, String created, String edited, String url) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.averageHeight = averageHeight;
        this.skinColors = skinColors;
        this.hairColors = hairColors;
        this.eyeColors = eyeColors;
        this.averageLifespan = averageLifespan;
        this.homeworld = homeworld;
        this.language = language;
        this.people = people;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for classification
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    // Getter and Setter for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter and Setter for averageHeight
    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    // Getter and Setter for skinColors
    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    // Getter and Setter for hairColors
    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    // Getter and Setter for eyeColors
    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    // Getter and Setter for averageLifespan
    public String getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    // Getter and Setter for homeworld
    public Object getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Object homeworld) {
        this.homeworld = homeworld;
    }

    // Getter and Setter for language
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Getter and Setter for people
    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    // Getter and Setter for films
    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    // Getter and Setter for created
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    // Getter and Setter for edited
    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    // Getter and Setter for url
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", designation='" + designation + '\'' +
                ", averageHeight='" + averageHeight + '\'' +
                ", skinColors='" + skinColors + '\'' +
                ", hairColors='" + hairColors + '\'' +
                ", eyeColors='" + eyeColors + '\'' +
                ", averageLifespan='" + averageLifespan + '\'' +
                ", homeworld=" + homeworld +
                ", language='" + language + '\'' +
                ", people=" + people +
                ", films=" + films +
                ", created=" + created +
                ", edited=" + edited +
                ", url='" + url + '\'' +
                '}';
    }
}