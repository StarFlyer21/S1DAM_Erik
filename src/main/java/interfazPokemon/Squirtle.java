package interfazPokemon;

public class Squirtle extends Pokemon implements iAgua{

    public Squirtle() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usó placaje");
    }

    @Override
    protected void atacarRugido() {
        System.out.println("Squirtle usó rugido");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usó mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usó hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usó burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usó pistola agua");
    }
}
