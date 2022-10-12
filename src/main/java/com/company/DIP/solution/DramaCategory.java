package com.company.DIP.solution;

class DramaCategory extends Category {
}
class ComedyCategory extends Category {
}

class Movie {
    private String name;
    private Category category;

    //Neste caso a dependencia ocorre ao instanciar Objeto Movie (qualquer)
    //Ou seja, NAO ocorre a instancia do objeto DramaCategory DENTRO de Movie
    //new Movie("TheLionKing", new DramaCategory())
    public Movie(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public void setCategory(Category category) {
        //Aceita qualquer Category
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}

abstract class Category {
}

class Test {
    public static void main(String[] args) {
        Movie theLionKing = new Movie("TheLionKing", new DramaCategory());
        Movie modernTimes = new Movie("ModernTimes", new ComedyCategory());
    }
}
