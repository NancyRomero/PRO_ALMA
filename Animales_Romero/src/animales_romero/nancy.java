/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_romero;

/**
 *
 * @author windows 8
 */
public class nancy {
     public enum clase {Vertebrado,Invertebrado};
    public enum tipo {oviparos,mamiferos};
    
   private int _id;
   private String _nombre;
   private Date _apareamiento ;
   private float _peso;
   private clase _clase;
   private tipo _tipo;

    public Animales_Nancy() {
    }

    public Animales_Nancy(int _id, String _nombre, Date _apareamiento, float _peso, clase _clase, tipo _tipo) {
        this._id = _id;
        this._nombre = _nombre;
        this._apareamiento = _apareamiento;
        this._peso = _peso;
        this._clase = _clase;
        this._tipo = _tipo;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date Apareamiento() {
        return _apareamiento;
    }

    public void Apareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public clase Clase() {
        return _clase;
    }

    public void Clase(clase _clase) {
        this._clase = _clase;
    }

    public tipo Tipo() {
        return _tipo;
    }

    public void Tipo(tipo _tipo) {
        this._tipo = _tipo;
    }

    
}

}
