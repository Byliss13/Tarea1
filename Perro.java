/**
 * Esta es una clase sencilla de un perro.
 * 
 * @author (Jose Lisandro Vargas Muñoz) 
 * @version (14/04/2021)
 */
public class Perro
{
    private String nombrePerro;
    private double edadPerro;
    private String colorPerro;
    private boolean estaDormido;
    private int felicidadPerro;
    
    /**
     * Asignaremos el 
     * nombre
     * edad
     * y color 
     * del perro
     */
    public Perro(String nombre,double edad,String color)
    {
        nombrePerro = nombre;
        edadPerro = edad;
        colorPerro = color;
        estaDormido = false;
        felicidadPerro = 1;
    }
    
    public String emitirLadrido()
    {
        String ladrido;
        ladrido = "guau";
        return ladrido;
    }
    
    public void  dormirse()
    {
        estaDormido = true;
    }
    
    public void  despertarse()
    {
        estaDormido = false;
    }
    
    public void  jugar()
    {
        felicidadPerro++;
    }
    
    public int  mostrarNivelFelicidad()
    {
        return felicidadPerro;
    }
    
    public String  getNombre()
    {
        return nombrePerro;
    }
    
    public void  setNombre(String nuevoNombre)
    {
        nombrePerro = nuevoNombre;
    }

    public double  getEdad()
    {
        return edadPerro;
    }
    
    public String  getColor()
    {
        return colorPerro;
    }
    
}

