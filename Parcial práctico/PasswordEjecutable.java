import java.util.Scanner;

public class PasswordEjecutable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de contraseñas que desea generar: ");
        int num = sc.nextInt();

        System.out.println("Introduzca la longitud para sus contraseñas: ");
        int len = sc.nextInt(); 

        String passwords[];
        passwords = new String[num];

        boolean isStrong[];
        isStrong = new boolean[passwords.length];
        
        for(int i = 0; i < passwords.length; i++){
            Password password1 = new Password(len);
            passwords[i] = password1.contraseña;
            for(int j = 0; j < isStrong.length; j++){
                isStrong[i] = password1.esFuerte();
                String pass = " ";
                if(isStrong[i]){
                    pass = ", es fuerte.";
                }
                else{
                    pass = ", es debil";
                }
                System.out.println(passwords[i] + pass); 
            }
        }
    }
}