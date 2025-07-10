
package modelo;


public class Usuario {
    private String nombre;
    private String username;
    private String password;
    private int id;
    
    public Usuario(String username,String nombre, String password, int id){
    this.username = username;
    this.username = password;
    this.id = id;
    this.nombre = nombre;
    }
    public Usuario(){};
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
}
