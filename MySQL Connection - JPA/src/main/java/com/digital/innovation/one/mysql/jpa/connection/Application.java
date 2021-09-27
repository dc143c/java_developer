package com.digital.innovation.one.mysql.jpa.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db-connection");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Curso cursoParaAdicionar = new Curso("Ciências da Computação", 435, 2);
		Aluno alunoParaAdicionar = new Aluno("Jhony Terra", 22, cursoParaAdicionar);

	}


}
