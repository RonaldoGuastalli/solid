package com.company.SRP;

class CourseProblem {
    private String name;
    private Category category;
    private String description;

    public Category createCategory() {
        connection();
        return (Category) save(new Category());
    }

    public CourseProblem createCourse() {
        connection();
        return (CourseProblem) save(new CourseProblem());
    }

    public void connection() {
        //Connection database
    }

    public Object save(final Object objectToSave) {
        //Save to database
        return category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

}
