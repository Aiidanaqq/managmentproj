package com.example.managmentproj;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private TextField nameField, rateField, hoursField;
    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private TableColumn<Employee, String> nameColumn, typeColumn;
    @FXML
    private TableColumn<Employee, Double> salaryColumn;

    private final ObservableList<Employee> employeeList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Инициализируем ComboBox
        typeComboBox.setItems(FXCollections.observableArrayList("Full-time", "Part-time", "Contractor"));

        // Настраиваем колонки TableView
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type")); // Добавляем отображение поля type
        salaryColumn.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().calculateSalary()).asObject());

        employeeTableView.setItems(employeeList);
    }

    @FXML
    private void handleAddEmployee() {
        try {
            String name = nameField.getText();
            String type = typeComboBox.getValue();
            double rate = Double.parseDouble(rateField.getText());
            int hours = hoursField.getText().isEmpty() ? 0 : Integer.parseInt(hoursField.getText());

            if (name.isEmpty() || type == null || rate <= 0 || (hours < 0 && !type.equals("Full-time"))) {
                showError("Invalid Input", "Please fill out all fields correctly.");
                return;
            }

            Employee employee;
            switch (type) {
                case "Full-time":
                    employee = new FullTimeEmployee(name, rate);
                    break;
                case "Part-time":
                    employee = new PartTimeEmployee(name, rate, hours);
                    break;
                case "Contractor":
                    employee = new Contractor(name, rate, hours);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid employee type");
            }

            // Добавляем сотрудника в список
            employeeList.add(employee);
            clearFields();
        } catch (NumberFormatException e) {
            showError("Invalid Number Format", "Please enter valid numeric values.");
        }
    }

    @FXML
    private void handleRemoveEmployee() {
        Employee selected = employeeTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            employeeList.remove(selected);
        }
    }

    private void clearFields() {
        nameField.clear();
        rateField.clear();
        hoursField.clear();
        typeComboBox.getSelectionModel().clearSelection();
    }

    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
