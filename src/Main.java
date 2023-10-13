import java.util.Scanner; //Para crear el objeto scanner, primero tendremos que importar la clase scanner
public class Main {
    public static void main(String[] args)

    {

        //Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario que ingrese la longitud del lado
        System.out.print("Por favor, ingrese la longitud del lado del cuadrado: ");

        //Leer la longitud del lado desde la entrada del usuario
        int lado = scanner.nextInt();

        //Cerrar el objeto Scanner una vez que hemos terminado de usarlo
        scanner.close();

        //Calculamos el area del cuadrado
        int area = lado * lado;

        //Mostramos el resultado
        System.out.println("El area del cuadrado con lado de longitud " + lado + "es" + area);

    }
}


