
package modelo;


public abstract class  Persona {
  String nombre, apellido, dni;
  char sexo;
  ;
public Persona() {
        
    }
  Persona(String nombre, String apellido, String dni, char sexo){
  this.nombre = nombre;
  this.apellido = apellido;
  this.dni = dni;
  this.sexo = sexo;
  
  }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

  
   @Override
    public String toString() {
        return nombre + " " + apellido;
    }
  
}
