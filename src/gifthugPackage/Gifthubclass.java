package gifthugPackage;

public class Gifthubclass {
	public static void main(String[] args) {
		Parent parent = new Parent ("prenomParent", "nomParent", 10);
		parent.FaireEnfants();
		
		parent.grandir();
		parent.FaireEnfants();
		
		List<Parent>list1 = new ArrayList<>() ;

		for (Person s:list1) {
			System.out.println(s);
			
		}
	}
}
