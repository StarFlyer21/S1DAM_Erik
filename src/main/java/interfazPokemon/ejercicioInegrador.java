package interfazPokemon;

public class ejercicioInegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarPlacaje();
        squirtle.atacarPistolaAgua();
        charmander.atacarAscuas();
        charmander.atacarLlamarada();
        bulbasaur.atacarDrenadoras();
        bulbasaur.atacarPlacaje();
        pikachu.atacarImpactrueno();
        pikachu.atacarPlacaje();
    }

}
