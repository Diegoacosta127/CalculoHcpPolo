
package calculohcppolo;

/**
 *
 * @author diegote
 */
import java.util.Scanner;

public class CalculoHcpPolo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equipo = new Equipo();
        String nombre;
        int handicap;
        Scanner leer = new Scanner(System.in);
        Scanner otroScan = new Scanner(System.in);
        System.out.println("Ingresar nombre de equipo a calcular handicap");
        equipo.setNombre(nombre = leer.nextLine());
        System.out.println("Ingresar handicap de " +equipo.getNombre() + " al iniciar la temporada");
        equipo.setHandicap(handicap = leer.nextInt());
        char flag;
        
        int acum = 1;
        do {
            Scanner golesL = new Scanner(System.in);
            Scanner golesV = new Scanner(System.in);
            Scanner unScan = new Scanner (System.in);
            Partido partido = new Partido();
            partido.Home = equipo;
            System.out.println("Partido #"+acum + " de " + partido.Home.Nombre + " contra: ");
            Equipo rival = new Equipo();
            partido.setAway(rival);
            partido.Away.setNombre(nombre = unScan.nextLine());
            System.out.println("Cantidad de goles de " + partido.Home.getNombre());
            partido.Home.GolesAnotados = golesL.nextInt();
            System.out.println("Cantidad de goles de " + partido.Away.getNombre());
            partido.Away.GolesAnotados = golesV.nextInt();
            partido.setDiferencia(partido.Home.GolesAnotados-partido.Away.GolesAnotados);
            acum ++;
            System.out.println("¿Ingresar otro partido para " + equipo.getNombre() + "? S/N" );
            flag = otroScan.nextLine().charAt(0);
            
        }while(flag != 'n' && flag != 'N');
        
        
    }
        
}
