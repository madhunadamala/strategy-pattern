package designpatterns.strategypattern;

import java.util.EnumMap;

import java.util.Map;

public class Context {
	private static Map<FileTypes,FileTypeStrategy> strategies = new EnumMap<>(FileTypes.class);
	
	public Context()
	{
		strategies.put(FileTypes.xls, new ExcelStrategy());
		strategies.put(FileTypes.pdf, new PdfStrategy());
	}
	
	public String GetFileType(FileTypes fileTypes)
	{
		return strategies.get(fileTypes).GetFileType();
	}
	
	
}
