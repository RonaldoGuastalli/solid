package com.company.ISP.problem;

interface Movie {
    void play();
    void increaseVolume();
}

class TheLionKing implements Movie {
    @Override
    public void play() {}
    @Override
    public void increaseVolume() {}
}

class ModernTimes implements Movie {
    @Override
    public void play() {}

    @Override
    public void increaseVolume() {
        //Este metodo nao sera utilizado, porem tera que ser implementado
    }
}
