public class Videojuego implements Entregable{
    public String titulo = " ";
    public int horasEstimadas = 10;
    public boolean entregado = false;
    public String genero = " ";
    public String compañia = " ";

    public Videojuego(){};

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = " ";
        this.compañia = " ";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String title) {
        this.titulo = title;
    }

    public int gethorasEstimadas(){
        return horasEstimadas;
    }

    public void setHorasEstimadas(int hours){
        this.horasEstimadas = hours;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genre){
        this.genero = genre;
    }

    public String getCompañia(){
        return compañia;
    }

    public void setCompañia(String company){
        this.compañia = company;
    }

    @Override
    public String toString(){
        return this.titulo + "/" + this.horasEstimadas + "/" + this.entregado + "/" + this.genero + "/" + this.compañia;
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        Series p = (Series)a;

        if(p.getnumTemp() == this.horasEstimadas){
            return true;
        }
        else
            return false;
    }
}
