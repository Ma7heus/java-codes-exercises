package br.matheus.nerdflix;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlComands {

    
    public static void setVeiculo(Connection connection,String modelo, String placa, BigDecimal valorFrete) throws Exception {
    	String comandoSQL = "insert into veiculos(idveiculo,modelo,placa,valorFrete) values(nextval('sequence_idestoque'),'"
        		+ modelo + "','" + placa + "'," + valorFrete + ")"; 
    	
    	Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(comandoSQL);
        System.out.printf("Veiculo Adicionado ao DB");
    }
    
    public static void UpdateValorFreteByPlaca(Connection connection, String placa, BigDecimal valorFrete) throws Exception {
    	String comandoSQL = "update veiculos set valorFrete  = " + valorFrete + " where placa = '" + placa + "'";
    	
    	Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(comandoSQL);
        System.out.printf("Valor atualizado no DB");
    }
    
    
    public static void deleteVeiculoByPlaca(Connection connection, String placa) throws Exception{
    	String comandoSQL = "delete from veiculos where placa = '" + placa + "'";
    	
    	Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(comandoSQL);
        System.out.printf(" A placa" + placa + " foi excluida do DB");
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
}

