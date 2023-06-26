public class Main {
    public static void main(String[] args) {
        Administrador loginAdmin = Administrador.getInicializar();
        loginAdmin.login("fabian");
        System.out.println(loginAdmin.estadoAdministrador());

        Administrador loginAdmin2 = Administrador.getInicializar();
        loginAdmin2.login("Admin");
        System.out.println(loginAdmin2.estadoAdministrador());

        System.out.println(loginAdmin + " tiene el mismo espacio de memoria: " + loginAdmin2);

        loginAdmin.loginOut();

        System.out.println(loginAdmin.estadoAdministrador());
    }
}