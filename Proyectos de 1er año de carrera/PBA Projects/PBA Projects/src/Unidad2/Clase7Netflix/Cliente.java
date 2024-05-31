package Unidad2.Clase7Netflix;

public class Cliente {

    public static void main(String[] args) {
        Video videos[] = new Video[10];

        videos[0] = new Pelicula(2022, "titanic", "drama", 120, true);
        videos[1] = new Pelicula(2022, "forest gump", "epica", 90, false);
        videos[2] = new Serie(5, "el reino", "drama", 52, false);
        videos[3] = new Serie(2, "Trapperd", "drama", 160, true);

        System.out.println("Lista de Videos");
        listarVideos(videos);
        System.out.println("Actualizando Series a vistas...");
        seriesVista(videos);
        System.out.println("Peliculas vistas en 2022");
        peliculas2022(videos);
        System.out.println("El video de mayor duracion");
        mayorDuracion(videos);

    }

    private static void listarVideos(Video[] videos) {
        for (int i = 0; i < 4; i++) {
            System.out.println(videos[i]);
        }
    }

    private static void seriesVista(Video[] videos) {
        for (int i = 0; i < 4; i++) {
            if (videos[i] instanceof Serie) {
                videos[i].setVisto(true);
            }
        }
    }

    private static void peliculas2022(Video[] videos) {
        for (int i = 0; i < 4; i++) {
            if (videos[i] instanceof Pelicula && ((Pelicula) videos[i]).getAño() == 2022) {
                System.out.println(videos[i]);
            }
        }
    }

    private static void mayorDuracion(Video[] videos) {
        boolean flag = true;
        Video mayorDuracion[] = new Video[1];

        for (int i = 0; i < 4; i++) {
            if (flag) {
                mayorDuracion[0] = videos[i];
                flag = false;
            }
            if (mayorDuracion[0].getDuracion() < videos[i].getDuracion()) {
                mayorDuracion[0] = videos[i];
            }

        }
        System.out.println(mayorDuracion[0]);
    }

}
