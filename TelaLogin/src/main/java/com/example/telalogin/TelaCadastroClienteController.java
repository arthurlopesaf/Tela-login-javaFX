package com.example.telalogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TelaCadastroClienteController {

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtObservacao;

    @FXML
    private TextField txtEndereco;

    public void btnCadastrarCliente(ActionEvent actionEvent) {

        String nomeCliente = txtNomeCliente.getText();
        String telefoneCliente = txtTelefone.getText();
        String emailCliente = txtEmail.getText();
        String observacaoCliente = txtObservacao.getText();
        String enderecoCliente = txtEndereco.getText();

        if (nomeCliente.isBlank() ||
                telefoneCliente.isBlank() ||
                emailCliente.isBlank() ||
                observacaoCliente.isBlank() ||
                enderecoCliente.isBlank()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validação");
            alert.setHeaderText("Campos obrigatórios");
            alert.setContentText("Todos os campos devem ser preenchidos.");
            alert.showAndWait();
            return;
        }

        Cliente client = new Cliente(
                nomeCliente,
                enderecoCliente,
                emailCliente,
                observacaoCliente,
                telefoneCliente
        );

        DadosCliente dados = new DadosCliente();
        dados.salvar(client);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cliente cadastrado");
        alert.setHeaderText("Sucesso");
        alert.setContentText("Cliente cadastrado com sucesso!");
        alert.showAndWait();

        limparCampos();
    }

    public void btnLimparCampo(ActionEvent actionEvent) {
        limparCampos();
    }

    private void limparCampos() {
        txtNomeCliente.clear();
        txtTelefone.clear();
        txtEmail.clear();
        txtObservacao.clear();
        txtEndereco.clear();
    }
}