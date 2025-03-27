package interfazPokemon;

public class Charmander extends Pokemon implements iFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usó placaje");
    }

    @Override
    protected void atacarRugido() {
        System.out.println("Charmander usó rugido");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usó mordisco");
    }

    @Override
    public void atacarLlamarada() {
        System.out.println("Charmander usó llamarada");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó ascuas");
    }
}
