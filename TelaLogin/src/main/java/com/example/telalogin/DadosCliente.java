package com.example.telalogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DadosCliente {

    public void salvar(Cliente cliente) {

        // language=SQL
        String sql = "INSERT INTO clientes (nome, endereco, email, observacao, telefone) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getObservacao());
            stmt.setString(5, cliente.getTelefone());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}