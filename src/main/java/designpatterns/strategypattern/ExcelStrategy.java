package designpatterns.strategypattern;

public class ExcelStrategy implements FileTypeStrategy{

	@Override
	public String GetFileType() {
		// TODO Auto-generated method stub
		return "This is Excel";
	}
		

}
