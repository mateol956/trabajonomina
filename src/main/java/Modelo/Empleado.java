
package Modelo;

public class Empleado {
    
    //Atributos
    /**
     * @param atrDocumento Parametro que almacena el documento de identidad.
     */
    int atrDocumento,atrTipoUsuario;
     /**
     * @param atrNombre Nombre completo del usuario
     * @param atrCorreo Correo del usuario
     * @param atrUsuario Usuario para el ingreo al sistema
     * @param atrContrasena Contraseña para el ingreo al sistema
     * @param atrTipoUsuario Tipo de usuario al sistema.
     */
    String atrNombre, atrCorreo, atrUsuario, atrContrasena;
    
    
    public Salario salario;

    /**
     * 
     * @param atrDocumento Documento de identidad del usuario
     * @param atrNombre    Nombre del usuario
     * @param atrCorreo    Correo del usuario
     * @param atrUsuario   Usuario para el ingreso
     * @param atrContrasena Contraseña para el ingreso  
     * @param atrTipoUsuario Tipo de usuario "Ajuste interno"
     * @param atrSalario Salario del usuario
     * @param atrBonos Bonos del usuario
     * @param atrHorasTrabajadas  Horas EXTRA trabajadas por el usuario
     */
    public Empleado(int atrDocumento, String atrNombre, String atrCorreo, String atrUsuario, String atrContrasena, int atrTipoUsuario,int atrSalario,int atrBonos,int atrHorasTrabajadas) {
        this.atrDocumento = atrDocumento;
        this.atrNombre = atrNombre;
        this.atrCorreo = atrCorreo;
        this.atrUsuario = atrUsuario;
        this.atrContrasena = atrContrasena;
        this.atrTipoUsuario = atrTipoUsuario;
        salario = new Salario(atrSalario,atrBonos,atrHorasTrabajadas,atrTipoUsuario);
    }

    public int getAtrDocumento() {
        return atrDocumento;
    }

    public void setAtrDocumento(int atrDocumento) {
        this.atrDocumento = atrDocumento;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }

    public String getAtrCorreo() {
        return atrCorreo;
    }

    public void setAtrCorreo(String atrCorreo) {
        this.atrCorreo = atrCorreo;
    }

    public String getAtrUsuario() {
        return atrUsuario;
    }

    public void setAtrUsuario(String atrUsuario) {
        this.atrUsuario = atrUsuario;
    }

    public String getAtrContrasena() {
        return atrContrasena;
    }

    public void setAtrContrasena(String atrContrasena) {
        this.atrContrasena = atrContrasena;
    }

    public int getAtrTipoUsuario() {
        return atrTipoUsuario;
    }

    public void setAtrTipoUsuario(int atrTipoUsuario) {
        this.atrTipoUsuario = atrTipoUsuario;
    }
    /**
     * @param prmCIngresada Contraseña ingre
     * @param prmUIngresado Usuarip ingresado
     * @return Retorna un valor entero de 1 Usuario erroneo y 2 si la contraseña es erronea y de 0 si es correcta. 
     */
    public int verificarContrasena(String prmCIngresada, String prmUIngresado) {
           if(prmCIngresada.equals(atrContrasena))
           {
               if(prmUIngresado.equals(atrUsuario))
               {
                   return 0;
               }
               return 1; //Usuario erroneo
           }
           else
           {
              return 2; // Contraseña erronea
           }
        
    }
    
    
    
}
