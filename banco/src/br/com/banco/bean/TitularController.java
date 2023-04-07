package br.com.banco.bean;

import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;

import br.com.banco.dao.TitularDAO;
import br.com.banco.domain.Titular;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.VBox;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class TitularController implements Initializable{
	@FXML
	private AnchorPane pnAncora;
	@FXML
	private VBox vbxRotulos;
	@FXML
	private Label lblId;
	@FXML
	private Label lblTitular;
	@FXML
	private Label lblCidade;
	@FXML
	private Label lblSexo;
	@FXML
	private VBox vbxCampos;
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtTitular;
	@FXML
	private TextField txtCidade;
	@FXML
	private TextField txtSexo;
	@FXML
	private TableView<Titular> tblTitulares;
	@FXML
	private TableColumn<Titular, Integer> colId;
	@FXML
	private TableColumn<Titular, String> colTitular;
	@FXML
	private TableColumn<Titular, String> colCidade;
	@FXML
	private TableColumn<Titular, String> colSexo;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnExcluir;
	@FXML
	private Button btnLimpar;
	
	public void listar() {
		TitularDAO titularDAO = new TitularDAO();
		ObservableList<Titular> titulares = null;
		try {
			titulares = titularDAO.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colId.setCellValueFactory(new PropertyValueFactory<>("id"));
		colTitular.setCellValueFactory(new PropertyValueFactory<>("titular"));
		colCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
		colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		
		tblTitulares.setItems(titulares);
	}
	
	//------------------------------------------------------------------------------------
	
	public void salvar() {
		
		if(txtTitular.getText() == "" || txtCidade.getText() == "" || txtSexo.getText() == "") {
			
			Alert resultado = new Alert(AlertType.WARNING);
			resultado.setTitle("Aviso");
			resultado.setHeaderText("Campos vazios");
			resultado.setContentText("Todos os campos devem ser preenchidos");
			resultado.show();
			
		}
		else {
			
			Titular titular = new Titular();
			titular.setTitular(txtTitular.getText().toUpperCase());
			titular.setCidade(txtCidade.getText().toUpperCase());
			titular.setSexo(txtSexo.getText().toUpperCase().charAt(0));
			
			TitularDAO titularDAO = new TitularDAO();
			
			if(txtId.getText()== "") {
				try {
					if (titularDAO.inserir(titular)) {
						
						Alert resultado = new Alert(AlertType.INFORMATION);
						resultado.setTitle("Aviso");
						resultado.setHeaderText("Sucesso");
						resultado.setContentText("Registro inserido com sucesso");
						resultado.show();
						
					}
					else {
						Alert resultado = new Alert(AlertType.ERROR);
						resultado.setTitle("Atenção");
						resultado.setHeaderText("Falha");
						resultado.setContentText("Não foi possivel inserir o registro");
						resultado.show();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				titular.setId(Integer.valueOf(txtId.getText()));
				
				try {
					if (titularDAO.editar(titular)) {
						
						Alert resultado = new Alert(AlertType.INFORMATION);
						resultado.setTitle("Aviso");
						resultado.setHeaderText("Sucesso");
						resultado.setContentText("Registro editado com sucesso");
						resultado.show();
						
					}
					else {
						Alert resultado = new Alert(AlertType.ERROR);
						resultado.setTitle("Atenção");
						resultado.setHeaderText("Falha");
						resultado.setContentText("Não foi possivel editar o registro");
						resultado.show();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			atualizarFormulario();
		}
	}
	
	public void excluir() {
		
		if(txtTitular.getText() == "" || txtCidade.getText() == "" || txtSexo.getText() == "") {
			
			Alert resultado = new Alert(AlertType.WARNING);
			resultado.setTitle("Aviso");
			resultado.setHeaderText("Campos vazios");
			resultado.setContentText("Você deve selecionar um campo de dados");
			resultado.show();
			
		}
		else {
		
			Alert confirmacao = new Alert(AlertType.CONFIRMATION);
			confirmacao.setTitle("Atenção");
			confirmacao.setHeaderText("Tem certeza que deseja excluir o registro?");
			
			Optional<ButtonType> resposta = confirmacao.showAndWait();
			
			if (resposta.get() == ButtonType.OK) {
				if(txtId.getText() != "") {
					TitularDAO titularDAO = new TitularDAO();
					try {
						if (titularDAO.excluir(Integer.valueOf(txtId.getText()))) {
							Alert resultado = new Alert(AlertType.INFORMATION);
							resultado.setTitle("Aviso");
							resultado.setHeaderText("Sucesso");
							resultado.setContentText("Registro excluido com sucesso");
							resultado.show();
						}
						else {
							Alert resultado = new Alert(AlertType.ERROR);
							resultado.setTitle("Atenção");
							resultado.setHeaderText("Falha");
							resultado.setContentText("Não foi possivel excluir registro");
							resultado.show();
						}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			atualizarFormulario();
		}
	}
	
	public void atualizarFormulario() {
		txtId.setText("");
		txtTitular.setText("");
		txtCidade.setText("");
		txtSexo.setText("");
		listar();
	}
	
	public void selecionarRegistroFormulario(MouseEvent evento) {
		if(evento.getClickCount() == 1) {
			txtId.setText(String.valueOf(tblTitulares.getSelectionModel().getSelectedItem().getId()));
			txtTitular.setText(String.valueOf(tblTitulares.getSelectionModel().getSelectedItem().getTitular()));
			txtCidade.setText(String.valueOf(tblTitulares.getSelectionModel().getSelectedItem().getCidade()));
			txtSexo.setText(String.valueOf(tblTitulares.getSelectionModel().getSelectedItem().getSexo()));
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listar();
	}

}
