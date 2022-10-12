package com.company.ISP.solution;

interface Movie {
    void play();
}

interface AudioControl {
    void increaseVolume();
}

class TheLionKing implements Movie, AudioControl {
    @Override
    public void play() {}
    @Override
    public void increaseVolume() {}
}

class ModernTimes implements Movie {
    @Override
    public void play() {}
}
