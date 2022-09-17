package br.matheus.nerdflix;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSqlExample extends SqlComands{	
	private static String urlJBDC = "jdbc:postgresql://PC36117:5432/matheus";
	private static String usuario = "postgres";
	private static String senha = "postgres@engenharia";
	
    public static void main(String[] args) throws Exception {    	
		Class.forName("org.postgresql.Driver");		
        
		try (Connection connection = DriverManager.getConnection(urlJBDC, usuario, senha)) {        	
			//setVeiculo(connection,"GEEP","KAP-0932",new BigDecimal(23)); 
        	
			//UpdateValorFreteByPlaca(connection,"AGE-1234",new BigDecimal(54));
			//getVeiculos(connection);
			 deleteVeiculoByPlaca(connection,"abc-1234");
        	
        	}  catch (Exception exception) {
        		throw new RuntimeException(exception);
        }        
    }     
}

