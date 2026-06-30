package com.example.telalogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroController {

    String nome;
    String usuario;
    String senha;

    @FXML
    private TextField txtNovoUsuario;

    @FXML
    private TextField txtNovaSenha;

    @FXML
    private TextField txtNovoNome;

    @FXML
    public void btnFecharTelaCadastro(ActionEvent actionEvent) {

        nome = txtNovoNome.getText();
        usuario = txtNovoUsuario.getText();
        senha = txtNovaSenha.getText();

        Usuario user = new Usuario(nome, usuario, senha);

        DadosUsuario dao = new DadosUsuario();
        dao.salvar(user);

        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();

        stage.close();
    }
}
