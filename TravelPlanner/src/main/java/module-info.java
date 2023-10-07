module com.example.travelplanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.travelplanner to javafx.fxml;
    exports com.example.travelplanner;
}