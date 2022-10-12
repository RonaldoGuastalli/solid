package com.company.SRP;

class Course {
    private final String name;
    private final Category category;
    private String description;
    Course(String name, Category category){
        this.name = name;
        this.category = category;
    }
}
class Category {
    private String name;
    private String description;
}


class CourseService {
    private CourseRepository courseRepository;
    private CategoryService  categoryService;
    public Course createNewCourse() {
        return courseRepository.save(new Course("Clean Code", categoryService.getCategoryByName("IT")));
    }
}
class CategoryService {
    private CategoryRepository categoryRepository;
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }
    public Category createNewCategory() {
        return categoryRepository.save();
    }
}



interface CourseRepository {
    Course save(Course course);
}
interface CategoryRepository {
    Category save();
    Category findByName(String name);
}


