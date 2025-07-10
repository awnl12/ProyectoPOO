
package dao;

import java.util.List;


public  interface ICrud <T> {
    List<T> listar();
    T buscar(int id);
    boolean insertar(T objeto);
    boolean actualizar (T objeto);
    boolean eliminar (int id);
}
