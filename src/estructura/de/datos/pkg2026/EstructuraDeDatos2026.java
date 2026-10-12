/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura.de.datos.pkg2026;

/**
 *
 * @author Luisc
 */
public class EstructuraDeDatos2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Java");
	/*sout + tap*/
	/*------------ ENTEROS ------------*/
	byte edad = 18;
	System.out.println("edad " + edad);

	short year = 2026;
	System.out.println("Año " + year);

	int robux = 50000;
	System.out.println("Robux "+ robux);
	System.out.println(robux + 1000);
	System.out.println(robux - 1200);
	System.out.println(robux / 2);
        System.out.println(robux * 2);
	System.out.println(++robux);//Robux = robux+1
	System.out.println(--robux);//Robux = robux-1
        System.out.println(robux==2);// es igual a 2? false
        System.out.println(robux>2);// es mayor a 2? true
        System.out.println(robux<2);// es menor a 2? false
        

        
	long estrellas = 2000000000;
	System.out.println("estrellas " + estrellas);

	/*------------ DECIMALES O FLOTANTES ------------*/
	double estatura = 1.85;
        System.out.println("Tu estatura es "+ estatura);
        
	float deuda = 999.999f ;
	System.out.println("Deuda ITSON $"+ deuda);

	/*------------ CARACTERE ------------*/
	char grupo = 'a';
        char grupo2 = 'D';
        System.out.println(grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(grupo == grupo2);
        System.out.println(grupo<grupo2);
        System.out.println(grupo>grupo2);
        
	System.out.println("grupo: " + grupo);
	boolean pago = true; //false
	System.out.println("Pago? " + pago);
        System.out.println(pago == true);
        System.out.println(pago != true);
        System.out.println(pago == false);
        System.out.println(pago != false);
        System.out.println(true && true && true);
        System.out.println( 5>2 && 'a' == 'a' && 5.5!= 2.5);
        System.out.println( 5>2 && 'a' == 'b' && 5.5!= 2.5);
        System.out.println( 5>20 || 'a' == 'b' || 5.5!= 2.5);
        System.out.println(false || false || true);

	System.out.println("Luis Carlos Rodriguez Medina");
        
        /*-----CADENA DE TEXTO-----*/
        String nombre = "Luis Rodriguez";
        System.out.println("Nombre: " + nombre);
        
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(6));
        System.out.println(nombre.length());
        
        for(int i= 0; i<nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }        
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("Luis Rodriguez"));
        System.out.println(nombre.equals("LuIS Rodriguez"));
        System.out.println(nombre.equalsIgnoreCase("Luis RodrIguez"));     
        
        System.out.println("Luis@gmail.com".indexOf("a"));
        System.out.println("Luis@gmail.com".indexOf("."));
        System.out.println("fass.png".endsWith(".jpg") || "fium.png".endsWith(".jpn"));

        System.out.println("   ".isEmpty());//valida que el String este vacio
        System.out.println("   ".isBlank());//valida que este vacio y espacios en blancos
        System.out.println("Conejo feo".replace("o", "e"));
        System.out.println("Conejo feo".replaceFirst("o", "e"));
        System.out.println("Juanito".substring(3));
        System.out.println("Juanito".substring(3,5));
        /*OPERACIONES ARITMETICAS
        - + * /- ++ -- Retornan una cantidad númerica
        OPERACIONES RELACIONALES
        == > < >= != == Retornan True o False
        OPERACIONES LOGICAS
        && and
        ||  or
         */
    lol producto1;
    producto1 = new lol(
        1, 
        "Playera Maja", 
        "PM-V-M-01", // sku debe ser numérico (int)
        "M", // talla debe ir con comillas dobles (String)
        (byte) 2, // casteo explícito a byte
        (short) 2026, // casteo explícito a short
        1500.00, // precio_unitario (double)
        100, // stokDisponible (int)
        true); // activo (Boolean)
    System.out.println("Producto: " + producto1.getNombre());
    System.out.println("Producto: " + producto1.getPrecio_unitario());


        
    }
    
}
