public class Administrador {
    private static Administrador inicializar;
    boolean loginIn ;
    String userName;

    public void setLoginIn(boolean loginIn) {
        this.loginIn = loginIn;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    //Constructor
    public Administrador(){}

    public static Administrador getInicializar(){
        if(inicializar == null){
            inicializar = new Administrador();
        }
        return inicializar;
    }

    public void login(String userName){
        loginIn = true;
        this.userName = userName;
        System.out.println("Usuario: " + userName + ", Has iniciado sesión en el server....");
    }
    public void loginOut(){
        loginIn = false;
        userName = null;
        System.out.println("Sesión cerrada...");
    }

    public String estadoAdministrador() {
        return "Estado del Administrador: " + "\n" +
                "Login: " + loginIn + "\n"+
                "Nombre de usuario: " + userName;
    }
}
