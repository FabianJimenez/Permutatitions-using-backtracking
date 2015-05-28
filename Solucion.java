import java.util.*;  //para incluir Stack

public class Solucion {
   
    private Stack<Nodo> pila;
    private String dato;
    
    public Solucion(String dato) 
    {
        pila = new Stack();
        this.dato = dato;
    }

    public void init() 
    {
       for(int i = 0; i < dato.length(); i++)
       {
         Nodo nd = new Nodo(dato.charAt(i));
         pila.push(nd);
       }
    }
    
    public Nodo back() 
    {
        Nodo nd = pila.pop();
        
        if(nd.esSolucion()) 
            return nd;
        
        for(int i=0; i<dato.length(); i++)
        {
            Nodo newnd = new Nodo(' ');
            newnd.setDato(nd.getDato());
            
            if(nd.esValido(dato.charAt(i)))
            {
                newnd.addCaracter(dato.charAt(i));
                pila.push(newnd);
            }
        }
        
        return null;
    }
    
    public boolean estaVacia()
    {
       return pila.empty();
    }
}
