package abstraction;

public class MSExcel implements MSOffice {

	@Override
	public void start() {
		System.out.println("Start method from MS excel");
		
	}

	@Override
	public void newFile() {
		System.out.println("newFile method from MS excel");
		
	}

	@Override
	public void save() {
		System.out.println("save method from MS excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("saveAs method from MS excel");
		
	}
	public void excelDownload() {
		System.out.println("excelDownload from MS excel");
		
	}

}
