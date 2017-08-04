package br.com.dozer;

import org.apache.log4j.BasicConfigurator;

import br.com.services.Service;

public class MainDozer {

	public static void main(String[] args) {
		BasicConfigurator.configure();

		Service service = new Service();
		//1 - CHAMADA PARA O METODO RESPONSÁVEL EM REALIZAR A TRADUÇÃO DO XML PARA UMA OBJETO JAVA
		//2 - UTILIZANDO O FRAMWORK DOZER, É REALIZADO A TRANSFERENCIA DESSE OBJETO PARA OUTRO OBJETO JAVA.
		service.exemploJAXBComDOZER();

	}

}
