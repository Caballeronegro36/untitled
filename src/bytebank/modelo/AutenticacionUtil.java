package bytebank.modelo;

public class AutenticacionUtil {
    public String clave;
    public boolean iniciarSesion(String clave){
        return this.clave == clave;
     }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
