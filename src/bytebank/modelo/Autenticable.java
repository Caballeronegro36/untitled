package bytebank.modelo;

public interface Autenticable{

    public void setClave(String clave);
    public abstract boolean iniciarSesiom(String clave);
}

