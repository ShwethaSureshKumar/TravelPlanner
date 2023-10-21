package com.example.travelplanner;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.travelplanner.TravelPackage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class TravelPackageBoxController {
    @FXML
    private ImageView packageImage;
    @FXML
    private Label packageName;
    @FXML
    private Label packageDescription;
    @FXML
    private Label destination;
    @FXML
    private Label duration;
    @FXML
    private Label price;
    @FXML
    private Label inclusions;
    @FXML
    private Label exclusions;
    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label availableSeats;
    @FXML
    private Label averageRating;
    @FXML
    private VBox packageBox;

    public void setPackageData(TravelPackage travelPackage) {
        // Set data for all attributes using the provided TravelPackage object
        packageName.setText(travelPackage.getPackageName());
        destination.setText(travelPackage.getDestination());
        packageDescription.setText(travelPackage.getPackageDescription());
        duration.setText(String.valueOf(travelPackage.getDuration()));
        price.setText(String.valueOf(travelPackage.getPrice()));
        inclusions.setText(travelPackage.getInclusions());
        exclusions.setText(travelPackage.getExclusions());
        startDate.setText(travelPackage.getStartDate());
        endDate.setText(travelPackage.getEndDate());
        availableSeats.setText(String.valueOf(travelPackage.getAvailableSeats()));
        averageRating.setText(String.valueOf(travelPackage.getAverageRating()));

        // You can load the package images from a URL or a file path
        String imageFileName = travelPackage.getPackageImages();
        URL imageUrl = getClass().getResource("/com/example/travelplanner/" + imageFileName);
        packageImage.setImage(new Image(imageUrl.toExternalForm()));
    }

    public void onMouseEntered(MouseEvent event) {
        packageBox.setStyle("-fx-background-color: #E0E0E0; -fx-border-color: #000000; -fx-border-width: 2px; -fx-padding: 10px;");
    }

    public void onMouseExited(MouseEvent event) {
        packageBox.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000; -fx-border-width: 2px; -fx-padding: 10px;");
    }
}
