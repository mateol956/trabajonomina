
package Modelo;

public class Salario {

    int atrValorSalario, atrBonos, atrHorasTrabajadas, atrTipoUsuario;

    /**
     * 
     * @param atrValorSalario Salario del usuario
     * @param atrBonos Valor de bonos
     * @param atrHorasTrabajadas Horas adicionales trabajadas
     * @param atrTipoUsuario El tipo de usuario usado para el calculo del bono
     */
    public Salario(int atrValorSalario, int atrBonos, int atrHorasTrabajadas,int atrTipoUsuario) {
        this.atrValorSalario = atrValorSalario;
        this.atrBonos = atrBonos;
        this.atrHorasTrabajadas = atrHorasTrabajadas;
        
    }

    public int getAtrValorSalario() {
        return atrValorSalario;
    }

    public void setAtrValorSalario(int atrValorSalario) {
        this.atrValorSalario = atrValorSalario;
    }

    public int getAtrBonos() {
        return atrBonos;
    }

    public void setAtrBonos(int atrBonos) {
        this.atrBonos = atrBonos;
    }

    public int getAtrHorasTrabajadas() {
        return atrHorasTrabajadas;
    }

    public void setAtrHorasTrabajadas(int atrHorasTrabajadas) {
        this.atrHorasTrabajadas = atrHorasTrabajadas;
    }
    
    public void calculoHoras()
    {
        int varBono;
        if (atrTipoUsuario == 1) {
            
            atrValorSalario = 3000000;
            varBono = (int) (0.05 * atrValorSalario);
             atrBonos = varBono * atrHorasTrabajadas;
            if (atrBonos != 0) {
                atrValorSalario = atrValorSalario + atrBonos;
            }
        }
        if (atrTipoUsuario == 2) {
             atrValorSalario = 2000000;
            varBono = (int) (0.05 * atrValorSalario);
            atrBonos = varBono * atrHorasTrabajadas;
            if (atrBonos != 0) {
                atrValorSalario = atrValorSalario + atrBonos;
            }
        }
      
    }
    
    
    
    
}
