public class Nodo {
    private String dato;

    public Nodo(char dato)
    {
        this.dato = "";
        this.dato += dato;
    }

    public String toString() 
    {
        return dato;
    }
    
    public boolean esValido(char caracter)
    {
        for(int i=0; i<dato.length(); i++)
            if(dato.charAt(i) == caracter)
                return false;
                
        return true;
    }
    
    public void addCaracter(char caracter)
    {
        dato += caracter;
    }
    
    public void setDato(String dato)
    {
        this.dato = dato;
    }
    
    public boolean esSolucion()
    {
        return (dato.length() == 5);
    }
    
    public String getDato()
    {
        return dato;
    }
}
