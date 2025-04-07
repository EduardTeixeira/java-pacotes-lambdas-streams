package unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {

	static String CAMINHO_ARQUIVO = "";

	public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.loadFromXML(new FileInputStream(CAMINHO_ARQUIVO + "/sites.xml"));
		System.out.println(properties.getProperty("1"));
		System.out.println(properties.getProperty("2"));
		System.out.println(properties.getProperty("3"));
	}

}
