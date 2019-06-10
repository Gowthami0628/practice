package abstraction;

public class MSWord implements MSOffice {

	@Override
	public void start() {
		System.out.println("Start method from MS word");
		
	}

	@Override
	public void newFile() {
		System.out.println("newFile method from MS word");
		
	}

	@Override
	public void save() {
		System.out.println("save method from MS word");
		
	}

	@Override
	public void saveAs() {
		System.out.println("saveAs method from MS word");
		
	}

}
