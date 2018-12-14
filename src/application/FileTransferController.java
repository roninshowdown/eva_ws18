package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FileTransferController {

    @FXML
    private ImageView conView_indic, downloadView_indic, settingsView_indic;

    @FXML
    private AnchorPane downloadView;

    @FXML
    private ImageView button_download;

    @FXML
    private ImageView button_explorer;

    @FXML
    private ImageView button_refresh;

    @FXML
    private AnchorPane settingsView;

    @FXML
    private TextField textfield_dpath;

    @FXML
    private ImageView button_explorer2;

    @FXML
    private AnchorPane topbar;

    @FXML
    private ImageView openConView;

    @FXML
    private ImageView openDownloadView;

    @FXML
    private ImageView openSettingsView;

    @FXML
    private ImageView shutdown;

    @FXML
    private AnchorPane connectionView;

    @FXML
    private ImageView connectToServer;

    @FXML
    private ImageView conEstablished;

    @FXML
    private TextField textfield_port;

    @FXML
    private TextField textfield_ip;
    
    @FXML
    public void topBarIconClicked(MouseEvent e) {
    	ImageView source = (ImageView) e.getSource();
    	if(source.getId().equals("openConView")) {
    		if(connectionView.isVisible()) {
    			visibilityControll(connectionView, conView_indic, false);
    		}
    		else {
    			visibilityControll(connectionView, conView_indic, true);
    			visibilityControll(downloadView, downloadView_indic, false);
    			visibilityControll(settingsView, settingsView_indic, false);
    		}
    	}
    	else if(source.getId().equals("openDownloadView")) {
      		if(downloadView.isVisible()) {
    			visibilityControll(downloadView, downloadView_indic, false);
    		}
    		else {
    			visibilityControll(downloadView, downloadView_indic, true);
    			visibilityControll(connectionView, conView_indic, false);
    			visibilityControll(settingsView, settingsView_indic, false);
    		}
    	}
    	else if(source.getId().equals("openSettingsView")) {
      		if(settingsView.isVisible()) {
    			visibilityControll(settingsView, settingsView_indic, false);
    		}
    		else {
    			visibilityControll(settingsView, settingsView_indic, true);
    			visibilityControll(downloadView, downloadView_indic, false);
    			visibilityControll(connectionView, conView_indic, false);
    		}
    	}
    	else if(source.getId().equals("shutdown")) {
    		Platform.exit();
    	}
    	
    }
    
    private void visibilityControll(AnchorPane ap, ImageView iv_indic, boolean visible) {
    	if(visible) {
    		ap.setVisible(true);
    		iv_indic.setVisible(true);
    	} else {
    		ap.setVisible(false);
    		iv_indic.setVisible(false);
    	}
    }
}
    	

