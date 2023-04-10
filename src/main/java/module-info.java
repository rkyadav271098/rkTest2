module com.example.rktest2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rktest2 to javafx.fxml;
    exports com.example.rktest2;
}