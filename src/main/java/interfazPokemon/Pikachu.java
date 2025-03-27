package interfazPokemon;

public class Pikachu extends Pokemon implements iElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usó placaje");
    }

    @Override
    protected void atacarRugido() {
        System.out.println("Pikachu usó rugido");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usó mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usó impactrueno");
    }

    @Override
    public void atacarPuñotrueno() {
        System.out.println("Pikachu usó puño trueno");
    }
}
