public class Sistemainterno {
    private String clave ="Alura";
    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesiom(clave);
        if (puedeIniciarSesion){
            System.out.println("login Exitoso");
            return true;
        }else {
            System.out.println("Error de login");
            return false;
        }

    }
}
