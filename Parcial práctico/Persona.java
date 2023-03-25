public class Persona{
    final char genre = 'H';
    private String nombre = " ";
    private int edad = 0;
    private int dni;
    private char sexo = genre;
    private double peso = 0;
    private double altura = 0;
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona() {
        comprobarSexo(sexo);
        generaDNI();
    };

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = 0;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        comprobarSexo(sexo);
        generaDNI();
    };

    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generaDNI();
    }

    public int calcularIMC(){
        int imc = 0;
        double formula = (this.peso)/(Math.pow(altura, 2));
        if(formula < 20){
            imc = -1;
        }
        else if(formula >= 20 && formula <= 25){
            imc = 0;
        }
        else{
            imc = 1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(){
        if(this.edad < 18) return false;

        return true;
    }

    private void comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        }
        else{
            this.sexo = this.genre;
        }
    }

    public String toString(){
        return this.nombre + "/" + this.edad + "/" + this.dni + "/" + this.sexo + "/" + this.peso + "/" + this.altura;
    }

    private void generaDNI(){
        double dniRandom = 10000000 + Math.random() * 90000000;
        this.dni = (int) dniRandom;
    }
}
