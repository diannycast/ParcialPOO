public class Pokemon {
private int id; 
private String nombre; 
private String [] tipos; 
private double puntosVida; 
private int nivel;

public Pokemon (int idPokemon, String nombrePokemon, String [] tiposPokemon, double vidaPokemon, int nivelPokemon){
id = idPokemon;
nombre = nombrePokemon;
tipos = tiposPokemon;
puntosVida = vidaPokemon;
nivel = nivelPokemon;
}

puntosVida -= cantidad; } // hace una resta en el puntaje de vida 
public void recargarVida (int cantidad){
puntosVida += cantidad; } // Suma punto a la vida 
public double obtenerVida (){
return puntosVida;}
public String [] obtenerTipos () {
return tipos;}
} 
