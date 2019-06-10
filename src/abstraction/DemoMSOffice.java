package abstraction;

public class DemoMSOffice {

	public static void main(String[] args) {
		MSExcel excel = new MSExcel();
		excel.start();
		excel.save();
		excel.excelDownload();
	}

}
