module com.example.javafxmodeltest2_3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxmodeltest2_3 to javafx.fxml;
    exports com.example.javafxmodeltest2_3;
}