
                     package datosdinamicos;

                     import java.util.Stack;


                     public class Ejercicios {
                     Stack pila = new Stack();
       
               
                     public void _1(){
                     pila.push("ping pong");
                     pila.push("gran turismo");
                     pila.push("al teto");
       
       
                     System.out.println("mostrar todo ");
                     System.out.println("pila:"+pila);
                     System.out.println("tamaño pila "+pila.size());
                     System.out.println("mostrar ultimo elemento:"+pila.peek());
                     System.out.println("posicion del elemento "+pila.search("al teto"));
                     System.out.println("eliminar ultimo elemento "+pila.pop());
                     System.out.println("esta pila esta vacia? "+pila.empty());
       
       
       
    
                     }
       
    
                     public void _2(){
         
                     for (int i =0 ; i < 5; i++) {
                    pila.push(6.0);
                    pila.push(5.5);
                    pila.push(3.6);
                    pila.push(7.0);
                    pila.push(2.0); 
              
              
              
                  System.out.println(pila.get(i));
                 }
         
         
    
     
    
    
    
    
                 }
                  public void _3(){
               
                 Stack otrapila = new Stack();
                 
                 otrapila.push(6.0);
                 otrapila.push(2.0);
                 otrapila.push(3.0);
                 otrapila.push(4.0);
                 otrapila.push(5.0);
                 
                    for(Object datos: otrapila){
                        System.out.println(datos);
                    
                    
                    }
             
             
             
             
             
             
             
             
             
                 }
    
                 public void _4(){
                 
                 Stack otrapilados=new Stack();
                 otrapilados.push("kamasutra");
                 otrapilados.push("sexo con amor ");
                 
                     while (otrapilados.empty()== false){
                       System.out.println("vaciando la pila!"+otrapilados.empty());
                   
                   }
                 
                 
                 
                 
                 
                 }
    
       }
    
    
    
    
    
    
    
    
    
    
    

