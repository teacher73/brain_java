package generic_test;

public class GenericTestDrive {

	public static void main(String[] args) {
		Cage<Animals> cageObject = new Cage<Animals>();
		Tiger tObj = new Tiger();
		Lion lObj = new Lion();
		cageObject.add(tObj);
		cageObject.add(lObj);

		for(Animals obj:cageObject.getAnimalList()){
			if (obj instanceof Tiger){
				tObj=(Tiger)obj;
				tObj.bow();
				tObj.tigerSleep();
			}else{
				lObj = (Lion)obj;
				lObj.bow();
				lObj.lionSleep();
			}
		}

		
	}

}
