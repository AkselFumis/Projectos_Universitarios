
package Inventario;


public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        
        Arma espada = new Arma("Espada de fuego", "Una espada ardiente", "espada", 10);
        Armadura escudo = new Armadura("Escudo de hierro", "Un escudo resistente", "escudo", 5);
        Pocion pocionCura = new Pocion("Poción de cura", "Restaura salud", "cura", 50);
        
        personaje.agregarObjeto(espada);
        personaje.agregarObjeto(escudo);
        personaje.agregarObjeto(pocionCura);
        
        personaje.mostrarInventario();
    }
}

