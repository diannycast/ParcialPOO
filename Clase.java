public class Clase {
public static void main (String [] args){
String  [] tipos1={"Planta", "Veneno"}; 
Pokemon bulbasaur = new Pokemon (1, "Bulbasaur", tipos1, 120, 5);
String [] tipos2 = {"normal" , "volador"}; 

Pokemon Pidgeot = new Pokemon (2, "Pidgeot", tipos2, 150, 8); 

System.out.println ("Vida Bulbasaur: " + bulbasaur.obtenerVida());
System.out.println ("Vida Pidgeot: " + Pidgeot.obtenerVida());}
}
      