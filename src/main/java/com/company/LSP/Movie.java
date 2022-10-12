package com.company.LSP;

/*
LSP - Liskov Substitution Principle
Subtypes must be substitutable for their base types.
"Subclasses podem ser substituidas por suas classes PAI (Movie)"
 */
class Movie {
    void play(){}
    void protagonistVoice(final String name, final String url) {}
}

class TheLionKing extends Movie {
    @Override
    void protagonistVoice(final String name, final String url) {
        super.protagonistVoice(name, url);
    }
}

class ModernTimes extends Movie {
    @Override
    void protagonistVoice(final String name, final String url) {
        //ERROR, porque???????
        super.protagonistVoice(name, url);
    }
}

class Test {

    public static void main(String[] args) {
        //Como TheLionKing(Filho) é um Movie(Pai) podemos utilizar desta forma
        Movie movieTLK = new TheLionKing();
        movieTLK.protagonistVoice("James Earl Jones: Mufasa", "https://www.imdb.com/title/tt6105098/characters/nm0000469?ref_=tt_mv_close");
        //Esta VIOLANDO o princípio, porque o protagonista neste caso nao tem voz e consequentimente sera lancado um erro.
        //Neste caso a subclasses NAO podem ser substituidas por suas classes PAI, porque ela nao se COMPORTA como a classe pai.
        //Mesmo ModernTimes sendo um Movie, tendo cenas como filme ele não se comporta - viola o principio
        //ModernTimes(filho) Nao poderia extender diretamente de Movie(pai).
        Movie movieMT = new ModernTimes();
        movieMT.protagonistVoice("Charles Chaplin: A Factory Worker", "https://www.imdb.com/title/tt0027977/characters/nm0000122?ref_=tt_cl_c_1");
    }

}
