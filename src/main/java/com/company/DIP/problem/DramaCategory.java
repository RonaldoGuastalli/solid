package com.company.DIP.problem;

class DramaCategory {
}

class Movie {
    private String name;
    private DramaCategory category; //Move esta com uma category (DramaCategory) muito especifica

    public void setCategory(DramaCategory dramaCategory) {
        //Para uma classe de ActionCategory ou ComedyCategory nao vai funcionar
        //Esta dependendo da implementacao de DramaCategory
        this.category = dramaCategory;
    }

    public DramaCategory getCategory() {
        //Depender da implementacao de DramaCategory
        return new DramaCategory();
    }
}

abstract class Category {
}

class Test {
    public static void main(String[] args) {
        Movie theLionKing = new Movie();
        theLionKing.setCategory(new DramaCategory());
        DramaCategory category = theLionKing.getCategory();
    }
}
