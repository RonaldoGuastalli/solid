package com.company.OCP;

public abstract class Video {
    public abstract Double calculateInterest();
}

class Movie extends Video {

    @Override
    public Double calculateInterest() {
        //calculate interest in Movies
        return null;
    }
}

class TVShow extends Video {

    @Override
    public Double calculateInterest() {
        //calculate interest in TVShow
        return null;
    }
}