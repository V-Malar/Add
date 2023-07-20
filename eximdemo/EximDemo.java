package eximdemo;

public class EximDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExIm exportHouse = new GokulExportImport();

		exportHouse.doImportExport();
	}

}
interface ExIm {
    default void doImportExport() {
        permittedItemsToExport();
        permittedItemsToImport();
        raiseLetterOfCredit();
        currencyForPayment();
        transport();
    }

    void permittedItemsToImport();

    void permittedItemsToExport();

    void currencyForPayment();

    void raiseLetterOfCredit();

    void transport();
}
class GokulExportImport implements ExIm {
    @Override
    public void raiseLetterOfCredit() {
        System.out.println("gokul raises LC as per gokul's requirements...");
    }

    @Override
    public void transport() {
        System.out.println("gokul supplies tea to America in a cycle....");
    }

    @Override
    public void permittedItemsToImport() {
        System.out.println("Import items as per Indian government standards....");
    }

    @Override
    public void permittedItemsToExport() {
        System.out.println("Export items as per Indian government standards.....");
    }

    @Override
    public void currencyForPayment() {
        System.out.println("Payment currency chosen as per Indian standard.....");
    }
}