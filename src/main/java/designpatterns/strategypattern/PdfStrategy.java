package designpatterns.strategypattern;

public class PdfStrategy implements FileTypeStrategy{

	@Override
	public String GetFileType() {
		// TODO Auto-generated method stub
		return "This is PDF";
	}
		

}
