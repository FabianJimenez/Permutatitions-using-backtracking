import java.util.*;

public class Main {

    public static void main(String[] args) 
    {
        Solucion sol = new Solucion("abcde");
        
        sol.init();
        
        Nodo aux;
        
        while(!sol.estaVacia())
        {
            aux = sol.back();
            
            if(aux != null)
                System.out.println(aux.getDato());
        }
    }
}
