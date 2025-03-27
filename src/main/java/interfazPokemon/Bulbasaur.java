package interfazPokemon;

public class Bulbasaur extends Pokemon implements iPlanta{//Con alt+enter traemos todos los métodos abstractos


    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur usó placaje");
    }

    @Override
    protected void atacarRugido() {
        System.out.println("Bulbasaur usó rugido");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur usó mordisco");
    }

    @Override
    public void atacarDrenadoras() {
        System.out.println("Bulbasaur usó drenadoras");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usó paralizar");
    }
}
