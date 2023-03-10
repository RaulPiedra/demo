module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jasperreports;
    requires java.sql;
    requires org.slf4j;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}