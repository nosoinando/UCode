public class Series implements Entregable{
    public String titulo = " ";
    public int numTemp = 3;
    public boolean entregado = false;
    public String genero = " ";
    public String creador = " "; 

    public Series(){};

    public Series(String titulo, String creador){
        this.titulo = titulo;
        this.numTemp = 3;
        this.entregado = false;
        this.genero = " ";
        this.creador = creador;
    };

    public Series(String titulo, int numTemp, String genero, String creador){
        this.titulo = titulo;
        this.numTemp = numTemp;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String title) {
        this.titulo = title;
    }

    public int getnumTemp(){
        return numTemp;
    }

    public void setnumTemp(int temps){
        this.numTemp = temps;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genre){
        this.genero = genre;
    }

    public String getCreador(){
        return creador;
    }

    public void setCreador(String creator){
        this.creador = creator;
    }

    @Override
    public String toString(){
        return this.titulo + "/" + this.numTemp + "/" + this.entregado + "/" + this.genero + "/" + this.creador;
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
        Videojuego e = (Videojuego) a;

        if(e.gethorasEstimadas() == this.numTemp){
            return true;
        }
        else
            return false;
    }
}
