package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/*
Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
При «отсылке» сообщение перекидывается из нижнего поля в центральное.
*/

public class Controller {
    @FXML
    TextArea txtAreaOnMyBtn;
    @FXML
    TextField txtAreaMyMessage;

    public void clickOnMyBtn(ActionEvent actionEvent) {
        txtAreaOnMyBtn.appendText(txtAreaMyMessage.getText()+"\n");
        txtAreaMyMessage.clear();
    }

    public void onEnter(ActionEvent aсt){
        txtAreaOnMyBtn.appendText(txtAreaMyMessage.getText()+"\n");
        txtAreaMyMessage.clear();
    }
}
