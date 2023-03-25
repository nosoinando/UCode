public class VideojuegosSeriesEjecutable {
    public static void main(String[] args){
        
        Series series[] = {new Series("La primera vez", "Mateo"), new Series("Skins", 7, "Drama", "Andres"), new Series(), new Series("You", "David"), new Series("Breaking Bad", 10,"Drama, Acción", "Julian")};
        series[2].setTitulo("Cyberpunk");
        series[2].setCreador("Hiroyuki");
        series[2].setnumTemp(2);

        Videojuego videojuegos[] = {new Videojuego(), new Videojuego("Valorant", 5), new Videojuego("Counter Strike 1.6", 1, "Acción", "Valve"), new Videojuego("League of legends", 2), new Videojuego("Super Smash Bros", 3)};
        videojuegos[0].setTitulo("The Last Of Us II");
        videojuegos[0].setCompañia("Ubisoft");
        videojuegos[0].setHorasEstimadas(4);

        int contSeries = 0;
        int masTemporadas, menosTemporadas;
        masTemporadas = menosTemporadas = series[0].numTemp;
        String masTemp = " ", menosTemp = " ";

        for(int i = 0; i < series.length; i++){

            if((i + 2)  < series.length){
                series[i + 2].entregar();
            }

            if(series[i].entregado){
                contSeries++;
            }

            if(series[i].numTemp > masTemporadas){
                masTemp = series[i].toString();   
            }

            if(series[i].numTemp < menosTemporadas){
                menosTemp = series[i].toString();
            }
        }

        int contVideojuegos = 0;
        int masHoras, menosHoras;
        masHoras = menosHoras = videojuegos[0].horasEstimadas;
        String masHours = " ", menosHours = " ";

        for(int i = 0; i < videojuegos.length; i++){
            if((i + 3)  < videojuegos.length){
                videojuegos[i + 3].entregar();
            }

            if(videojuegos[i].entregado){
                contVideojuegos++;
            }

            if(videojuegos[i].horasEstimadas > masHoras){
                masHours = videojuegos[i].toString();
            }

            if(videojuegos[i].horasEstimadas < menosHoras){
                menosHours = videojuegos[i].toString();
            }
        }

        System.out.println("\nSe han entregado " + contSeries + " series, las cuales son: \n");
        for(int i = 0; i < series.length; i++){
            if(series[i].entregado){
                System.out.println("  " + series[i].toString());
            }
        }

        System.out.println("\nSe han entregado " + contVideojuegos + " videojuegos, los cuales son: \n");
        for(int i = 0; i < videojuegos.length; i++){
            if(videojuegos[i].entregado){
                System.out.println("  " + videojuegos[i].toString());
            }
        }

        System.out.println("\nLa serie con más temporadas es: \n  " + masTemp + "\n\nLa serie con menos temporadas es: \n  " + menosTemp);
        System.out.println("\nEl videojuego con más horas es: \n  " + masHours + "\n\nEl videojuego con menos horas es: \n  " + menosHours);
    }
}
