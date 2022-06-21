
import java.util.ArrayList;

public class TestPharmacy4 {
	// Метод добавления лекарств в список
	public static void AddingToTheList() {
		ArrayList<Pharmacy> medecineList = new ArrayList<>(); 
		ListOfMedicines listofmedicines = new ListOfMedicines(medecineList);
		
		//Добавление нового лекарства
		PharMedecineFund pharmedecinefund1 = new PharMedecineFund();
		pharmedecinefund1.setPhName("Зеленая аптека");
		pharmedecinefund1.setMedecineName("Гальцивин");
		pharmedecinefund1.setMedecineType("Тип Б");
		pharmedecinefund1.setMedecinePrice(499);
		pharmedecinefund1.setOriginCountry("Германия");
		
		listofmedicines.addList(pharmedecinefund1);
		
		//Добавление нового лекарства
		PharMedecineFund pharmedecinefund2 = new PharMedecineFund();
		pharmedecinefund2.setPhName("Аптека");
		pharmedecinefund2.setMedecineName("Когацел");
		pharmedecinefund2.setMedecineType("Тип А");
		pharmedecinefund2.setMedecinePrice(600);
		pharmedecinefund2.setOriginCountry("Швеция");
		
		listofmedicines.addList(pharmedecinefund2);
		
		//Добавление нового лекарства
		PharMedecineFund pharmedecinefund3 = new PharMedecineFund();
		pharmedecinefund3.setPhName("Аптека Вита");
		pharmedecinefund3.setMedecineName("Ношпа");
		pharmedecinefund3.setMedecineType("От боли в голове");
		pharmedecinefund3.setMedecinePrice(120);
		pharmedecinefund3.setOriginCountry("Россия");
		
		listofmedicines.addList(pharmedecinefund3);
		
		System.out.println(listofmedicines.getList());
	}
	public static void main(String[] args) {
		
		AddingToTheList();
	}
}