module ru.guru.lesson2_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.guru.lesson2_git to javafx.fxml;
    exports ru.guru.lesson2_git;
}