package Model;

public interface IStore {
    boolean addDrink(IDrink drink);
    boolean searchDrink(String name);
    IDrink getDrink(String name);
    boolean updateDrink(String name, IDrink drink);
    boolean isFull();
    float howMuch();
    Integer howMany(Integer type);
}
