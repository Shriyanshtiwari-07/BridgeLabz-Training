package com.oops.skillforge;


public class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;
    private double rating;
    private final String[] reviews; // read-only internal reviews

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Final Project"};
        this.reviews = new String[]{"Good", "Very Informative"};
        this.rating = 0.0;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Excellent Content"};
        this.rating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public String[] getModules() {
        return modules;
    }

    // Read-only access to reviews
    public String[] getReviews() {
        return reviews.clone();
    }

    // Protected rating logic (Encapsulation)
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = (this.rating + newRating) / 2;
        }
    }

    public double getRating() {
        return rating;
    }
}