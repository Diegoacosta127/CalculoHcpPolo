
package calculohcppolo;

/**
 *
 * @author diegote
 */
public class Partido {
    
    public Equipo Home;
    public Equipo Away;
    public int Diferencia;
    
    Partido(){
        
    }

    public Equipo getHome() {
        return Home;
    }

    public void setHome(Equipo Home) {
        this.Home = Home;
    }

    public Equipo getAway() {
        return Away;
    }

    public void setAway(Equipo Away) {
        this.Away = Away;
    }

    public int getDiferencia() {
        return Diferencia;
    }

    public void setDiferencia(int Diferencia) {
        this.Diferencia = this.Home.GolesAnotados-this.Away.GolesAnotados;
    }
    
    
}
