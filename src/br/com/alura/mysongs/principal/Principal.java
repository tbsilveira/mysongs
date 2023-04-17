package br.com.alura.mysongs.principal;

import br.com.alura.mysongs.modelos.MinhasPreferidas;
import br.com.alura.mysongs.modelos.Musica;
import br.com.alura.mysongs.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setArtista("SRV");
        minhaMusica.setTitulo("The sky is criyng");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Ringo");
        meuPodcast.setTitulo("Fab Four");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }

}

