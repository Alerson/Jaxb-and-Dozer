package br.com.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import br.com.beans.CatalogDestination;
import br.com.jaxb.Catalog;
import br.com.utils.ConversorXMLJava;

public class Service {

	public void exemploJAXBComDOZER() {
		List<String> configurationDozerMapper = new ArrayList<String>();
		configurationDozerMapper.add("dozerMappingWS.xml");

		Mapper mapper = new DozerBeanMapper(configurationDozerMapper);

		Catalog catalog = populaCatalogComXML(); //REALIZO A CHAMADA PARA O METODO RESPONSÁVEL POR FAZER A TRADUÇÃO DO XML PARA UM OBJETO JAVA (JAXB)
		CatalogDestination catalogDestination = (CatalogDestination) mapper.map (catalog, CatalogDestination.class, "caseA");

		imprimirCatalogDestination(catalogDestination);
	}

	public Catalog populaCatalogComXML(){
		String xml = lerArquivoTxt();
		Catalog catalog = (Catalog) new ConversorXMLJava().unmarshal(Catalog.class, xml);
		return catalog;
	}

	private void imprimirCatalogDestination(CatalogDestination catalogDestination) {
		for (br.com.beans.CatalogDestination.Book catalogDestinationBook : catalogDestination.getbookDestination()) {
			System.out.println("Author: " + catalogDestinationBook.getAuthor() + "\n" +
					"Title: " + catalogDestinationBook.getTitle() + "\n" +
					"Genre: " + catalogDestinationBook.getGenre() + "\n" +
					"Price: " + catalogDestinationBook.getPrice() + "\n" +
					"PublishDate: " + catalogDestinationBook.getPublishDate() + "\n" +
					"Description: " + catalogDestinationBook.getDescription() + "\n");
		}
	}

	public String lerArquivoTxt() {
		String xmlRetorno = "";
		try {
			FileReader arq = new FileReader("C:\\Users\\alersonr\\Desktop\\Exemplo XML-XSD-JAVA\\livros.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			while (true) {
				String linha = lerArq.readLine();
				if (linha != null) {
					xmlRetorno = xmlRetorno + linha + "\n";
				} else {
					break;
				}
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		return xmlRetorno;
	}
}
