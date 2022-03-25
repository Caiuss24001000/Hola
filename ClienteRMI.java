import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) throws Exception{
        //En este caos el objeto remoto se llama "prueba", notar que se utiliza el puerto default 1099
        String url = "rmi://localhost/prueba";

        //Obtiene una referencia que apunta a "prueba" al objeto remoto asociado a la url
        InterfaceRMI r = (InterfaceRMI) Naming.lookup(url);

        System.out.println(r.mayusculas("hola"));
        System.out.println("Suma = "+r.suma(10, 20));

        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("checksum = "+ r.checksum(m));
    }
}
