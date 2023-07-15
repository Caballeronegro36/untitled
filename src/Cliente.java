public class Cliente implements Autenticable {
    private String Nombre;
    private String Documento;
    private String Tefono;
    private AutenticacionUtil util;

    public Cliente() {
        this.util= new AutenticacionUtil();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getTefono() {
        return Tefono;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public void setTefono(String tefono) {
        Tefono = tefono;
    }

    @Override
    public boolean iniciarSesiom(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }
}
