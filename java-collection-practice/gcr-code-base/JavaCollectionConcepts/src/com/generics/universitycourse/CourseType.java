package com.generics.universitycourse;

public abstract class CourseType {

    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract String getTypeName();

    @Override
    public String toString() {
        return getTypeName() + " (" + evaluationMethod + ")";
    }
}