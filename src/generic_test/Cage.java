package generic_test;

import java.util.ArrayList;

public class Cage<T extends Animals> {
	private ArrayList<T> animalList;
	
	public Cage() {
		animalList = new ArrayList<>();
	}

	public void add(T animal){
		animalList.add(animal);
	}
	
	public T remove(){
		T temp = animalList.remove(animalList.size()-1);
		return temp;
	}

	public T getAnimal() {
		return animalList.get(animalList.size()-1);
	}

	public ArrayList<T> getAnimalList() {
		return animalList;
	}
	
	
}
