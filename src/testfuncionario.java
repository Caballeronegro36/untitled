public class testfuncionario {
    public static void main(String[] args) {

        Funcionario diego = new Contador("diego","444556565",2000);
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());

        Funcionario jovani = new Contador("jovani","445266541",5000);
        System.out.println(jovani.getSalario());
        System.out.println(jovani.getBonificacion());
    }
}
