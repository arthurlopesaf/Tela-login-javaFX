package com.example.telalogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DadosUsuario {

    public void salvar(Usuario usuario) {

        // language=SQL
        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";

        try (Connection conectar = ConexaoBanco.conectar();
             PreparedStatement stmt = conectar.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(Usuario usuario) {

        // language=SQL
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

        try (Connection connection = ConexaoBanco.conectar();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());

            return stmt.executeQuery().next();

        } catch (Exception e ){
            e.printStackTrace();
        }
        return false;
    }
}
