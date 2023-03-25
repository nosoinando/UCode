import java.util.concurrent.ThreadLocalRandom;

public class Password {
    public int longitud = 8;
    public String contraseña;

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public String randomPassword(int longitud){
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    
    public Password() {};

    public Password(int longitud){
        this.contraseña = randomPassword(longitud);
    }

    public boolean esFuerte(){
        int minusculas = 0;
        int mayusculas = 0;
        int numeros = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            char letra = contraseña.charAt(i);
            if(Character.isUpperCase(letra)){
                mayusculas++;
            }
            else if(Character.isLowerCase(letra)){
                minusculas++;
            }
            else if(Character.isDigit(letra)){
                numeros++;
            }
        }
        
        if(mayusculas > 2 && minusculas > 1 && numeros > 5){
            return true;
        }
        else
            return false;
    }

    public void generarPassword(){

    }

    public String getPassword() {
        return contraseña;
    }

    public int getLenght() {
        return longitud;
    }

    public void setLenght(int variable) {
        this.longitud = variable;
    }
}
