package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;

public class Controller {

    @FXML
    Canvas _canvas;
    @FXML
    Slider _slider;
    @FXML
    ColorPicker _colorPicker;

    public void initialize() {
        GraphicsContext graphicsContext = _canvas.getGraphicsContext2D();
        _canvas.setOnMouseDragged(event -> {
            double size = _slider.getValue();
            double x = event.getX() - size / 2;
            double y = event.getY() - size / 2;

            graphicsContext.setFill(_colorPicker.getValue());
            graphicsContext.fillOval(x, y, size, size);
        });
    }

    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void onSizeClickBig(ActionEvent actionEvent) {

    }
    public void onSizeClickSmall(ActionEvent actionEvent) {

    }
}
