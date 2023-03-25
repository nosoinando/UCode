public class Cuenta{
    public String titular;
    public double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String variable) {
        this.titular = variable;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double variable) {
        this.cantidad = variable;
    }

    public String toString(){
        return this.titular + "/" + this.cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad < 0){}
            else
                this.cantidad = this.cantidad + cantidad;
    }

    public void retirar(double cantidad){
        double retiro = this.cantidad - cantidad;
        if(retiro < 0){
            retiro = 0;
        }
        this.cantidad = retiro;
    }
}