package com.company.OCP;

public class VideoProblem {
    private String type;

    public Double calculateInterest() {
        if ("MOVIE".equals(type)) {
            //calculate interest in Movies
            return 0.0;
        } else if ("TV_SHOW".equals(type)) {
            //calculate interest in TVShow
            return 0.0;
        }
        return 0.0;
    }

}
