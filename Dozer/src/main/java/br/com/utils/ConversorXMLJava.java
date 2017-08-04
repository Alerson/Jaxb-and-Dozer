package br.com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class ConversorXMLJava {

	private Unmarshaller unmarshaller;

	/**
	 * Converte um string com estrutura XML em um objeto.
	 * 
	 * @param clazz
	 *            classe referente ao tipo do objeto a ser retornado.
	 * @param stringXml
	 *            string com o conteudo XML a ser convertido em objeto.
	 * @return retorna um novo objeto de clazz.
	 */
	public Object unmarshal(Class<?> clazz, String stringXml) {
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(clazz);
			unmarshaller = context.createUnmarshaller();
			return unmarshaller.unmarshal(new StreamSource(new StringReader(stringXml)));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Realiza a conversao (unmarshal) de um arquivo XML em um objeto do seu
	 * tipo.
	 * 
	 * @param clazz
	 *            classe referente ao objeto a ser criado a partir do XML.
	 * @param fileXml
	 *            nome do arquivo XML a ser convertido em objeto.
	 * @return novo objeto.
	 */
	public Object unmarshalFromFile(Class<?> clazz, String fileXml) {
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(clazz);
			unmarshaller = context.createUnmarshaller();
			return unmarshaller.unmarshal(new FileInputStream(fileXml));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
