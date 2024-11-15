module com.example.managmentproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.managmentproj to javafx.fxml;
    exports com.example.managmentproj;
}