import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import と classの間で1行あけること
public class Main {
// classとmainメソッドの間で1行あけること
    public static void main(String[] args){
        List<String> pokemonParty = new ArrayList<>();
        pokemonParty.add("Sprigatito");
        pokemonParty.add("Quaxly");
        pokemonParty.add("Fuecoco");
        pokemonParty.add("Pikachu");
        pokemonParty.add("Bulbasaur");
        pokemonParty.add("Charmander");
        pokemonParty.add("Squirtle");
        System.out.println(pokemonParty.stream().findFirst());
        System.out.println(pokemonParty.stream().count());
        System.out.println(pokemonParty.stream().filter(pokemon -> pokemon.startsWith("S")).toList());

        Map<String, String> pokemonInfo = new HashMap<>();
        pokemonInfo.put("Sprigatito","It can use its plant powers to soak up whatever water you throw at it");
        pokemonInfo.put("Quaxly","The burning-hot sparks it scatters will fry any and all plants in a flash");
        pokemonInfo.put("Fuecoco","It may seem quiet, but its mighty stream of water can put out any fire - you'll see");
        pokemonInfo.put("Pikachu","Pikachu that can generate powerful electricity have check sacs that are extra soft and super strechy.");
        pokemonInfo.put("Bulbasaur", "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.");
        pokemonInfo.put("Charmander","It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
        pokemonInfo.put("Squirtle","When it retracts its long neck into its shell, it squirts out water with vigorous force.");
        pokemonInfo.entrySet().stream()
                .map(pokemon -> pokemon.getKey() + ":" + pokemon.getValue())
                .forEach(System.out::println);

        pokemonInfo.entrySet().stream()
                .map(pokemon -> pokemon.getValue().replace(pokemon.getValue(),"No information is availiable at this time"))
                .forEach(System.out::println);
    }
}
