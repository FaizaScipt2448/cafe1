package com.example.cafe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
Stage stage;
    @Override
    public void start(Stage primaryStage) {
        stage= primaryStage;
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 900, 700);

        // Set background image
        Image backgroundImage = new Image("img_2.png");


        ImageView imageView = new ImageView(backgroundImage);
imageView.setFitHeight(900);
imageView.setFitWidth(900);
gridPane.getChildren().add(imageView);
imageView.setOpacity(0.7);

HBox h1=new HBox();
        Rectangle r1=new Rectangle();
        r1.setHeight(300);
        r1.setWidth(400);
       r1.setFill(Color.WHEAT);

      h1.setPadding(new Insets(200,0,0,220));
        double borderRadius = 100.0;
        r1.setArcWidth(borderRadius);
        r1.setArcHeight(borderRadius);
        h1.getChildren().addAll(r1);
        gridPane.add(h1,0,0);

        Text t1=new Text("WELCOME TO JAVA CAFE");
        t1.setFill(Color.CHOCOLATE);
        t1.setFont(Font.font("BAZOOKA", FontWeight.BOLD, 40));
        HBox h2=new HBox();
        h2.getChildren().add(t1);
        gridPane.add(h2,0,0);
        h2.setPadding(new Insets(90,0,0,190));

        HBox h3=new HBox();
        Text t2=new Text("WOULD YOU LIKE A CUP OF COFFEE WITH \n            SOME DELICIOUS DONUT ?");
        t2.setFill(Color.BROWN);
        t2.setFont(Font.font("Times new roman",FontWeight.BOLD,18));
        h3.getChildren().add(t2);
        gridPane.add(h3,0,0);
        h3.setPadding(new Insets(250,0,0,230));


        HBox h4=new HBox();
        Text t3=new Text("      Get wide range of coffee with  \n        some bakery items from us .");
        t3.setFill(Color.BROWN);
        t3.setFont(Font.font("Arial",20));
        h4.getChildren().add(t3);
        gridPane.add(h4,0,0);
        h4.setPadding(new Insets(310,0,0,250));

//        HBox h5=new HBox();
//        Button b1=new Button();
//        b1.setText("Sign Up");
////
//        b1.setOnAction(e -> stage.setScene(signinpage()));
////        h1.setSpacing(500);
//        h5.getChildren().addAll(b1);
//        gridPane.add(h5,0,0);
//
////
//
////        h5.setPadding(new Insets(400,0,0,320));
Button b1 = new Button("Sign Up");
b1.setOnAction(e -> stage.setScene(signuppage()));
        b1.setBackground(Background.fill(Color.CHOCOLATE));
        b1.setStyle("-fx-background-radius: 15; -fx-background-color: Chocolate; -fx-font-size: 16px; -fx-text-fill: White;");
        HBox h6=new HBox();
        Button b2=new Button("LOG IN");
        b2.setBackground(Background.fill(Color.CHOCOLATE));



        h6.getChildren().addAll(b1,b2);
        h6.setSpacing(30);
        b2.setStyle("-fx-background-radius: 15; -fx-background-color: Chocolate; -fx-font-size: 16px; -fx-text-fill: White;");

        gridPane.add(h6,0,0);
        h6.setPadding(new Insets(400,0,0,330));


        b2.setOnAction(event -> {
            stage.setScene(signinpage());
        });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

public Scene signinpage() {
GridPane pane1 = new GridPane();
Scene scene1 = new Scene(pane1,600,400);

pane1.setStyle("-fx-background-color: Wheat");
Image image1 = new Image("C:/Users/husna/Downloads/wooden-pattern-coffee-beverage-delicious (1).jpg");
ImageView image = new ImageView(image1);
image.setFitWidth(300);
image.setFitHeight(300);
pane1.setPadding(new Insets(40, 20, 20, 40));
    Rectangle clip = new Rectangle(image.getFitWidth(), image.getFitHeight());
    clip.setArcWidth(30); // Set the width of the arc
    clip.setArcHeight(30); // Set the height of the arc

    // Apply the clip to the ImageView
    image.setClip(clip);
pane1.getChildren().add(image);
    TextField emailField = new TextField();
    emailField.setPromptText("Enter Email");
    TextField passwordField = new TextField();
    passwordField.setPromptText("Enter Password");

    // Adding labels for email and password


    // Setting alignment for labels and text fields
    Button loginButton = new Button("Log in");
    // Set the action for the login button
    loginButton.setOnAction(e -> {
        // When Log in button is clicked, transition to a new scene (you can replace 'newScene()' with your desired scene)
        stage.setScene(newScene());
    });

    loginButton.setStyle("-fx-background-color: Chocolate; -fx-text-fill: white;");
    loginButton.setPrefWidth(80); // Adjust the width as needed
    loginButton.setPrefHeight(30);

    VBox vBox = new VBox(emailField,passwordField,loginButton);
    vBox.setAlignment(Pos.CENTER_RIGHT);
    vBox.setSpacing(15);
    vBox.setPadding(new Insets(0,0,0,25));


    GridPane.setConstraints(vBox, 2, 0);


    pane1.getChildren().add(vBox);



//stage.setScene(scene1);
//return stage;
    return scene1;
}

    public Scene signuppage()
    {
        GridPane pane1 = new GridPane();

        Button signupButton = new Button("Signup");
//        signupButton.setOnAction(event -> {
//            // Create the scene of the sign up page
//            Scene signUpScene = signuppage();
//
//            // Set the scene of the stage
//            stage.setScene();
//        });
        pane1.setStyle("-fx-background-color: Wheat");
        Image image1 = new Image("C:/Users/husna/Downloads/wooden-pattern-coffee-beverage-delicious (1).jpg");
        ImageView image = new ImageView(image1);
        image.setFitWidth(250);
        image.setFitHeight(250);
        pane1.getChildren().add(image);
        pane1.add(signupButton,2,3);
        Scene scene2 = new Scene(pane1,600,400);
//stage.setScene(scene1);
//return stage;
        return scene2;
//        stage.setScene(scene2);
    }
    // Define a new scene for demonstration purposes
    private Scene newScene() {
        GridPane pane = new GridPane();
        pane.setVgap(40);

        Image backgroundImage = new Image("C:\\Users\\husna\\Downloads\\breakslow-E6RTpqvOasU-unsplash.jpg");
        double desiredWidth = 700;
        BackgroundSize backgroundSize = new BackgroundSize(desiredWidth, BackgroundSize.AUTO, true, true, true, false);

        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, backgroundSize);
    Background b=new Background(background);
    pane.setBackground(b);


        Scene newScene = new Scene(pane, 700, 500, Color.LIGHTGRAY);
        stage.setScene(newScene);
        stage.show();

    pane.setPadding(new Insets(30,0,0,70));
        Text newText = new Text("*******JAVA CAFE*******");
        newText.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        pane.add(newText,0,0);

        Button b3= new Button("View Menu");
        b3.setBackground (Background.fill(Color.CHOCOLATE));
        styleButton(b3);
        b3.setOnAction(p->{
            GridPane pane2 = new GridPane();
            pane2.setVgap(40);
            pane2.setHgap(40);

            Image logo= new Image("i69.jpg");
            ImageView i1=new ImageView(logo);
            i1.setFitHeight(100);
            i1.setFitWidth(100);
            Text t1=new Text("Mocha");
            t1.setFont(Font.font("times new Roman",20));
            Text p1=new Text("15");
            t1.setFont(Font.font("times new Roman",30));
            VBox v3= new VBox();
            v3.getChildren().addAll(t1,p1);
            v3.setSpacing(15);
            HBox h1=new HBox();
            h1.getChildren().addAll(i1,v3);
            h1.setSpacing(30);
pane2.add(h1,0,0);


            Scene newScene2 = new Scene(pane2, 700, 500, Color.LIGHTGRAY);
            stage.setScene(newScene2);
            stage.show();


        });
        Button b4 = new Button("Order Service");
        styleButton(b4);
        HBox h1=new HBox();
        h1.getChildren().addAll(b3,b4);
h1.setSpacing(50);
        Button b5 = new Button("Print Bill");
        styleButton(b5);

        Button b6 = new Button("Customer Service");
        styleButton(b6);
        HBox h2=new HBox();
        h2.getChildren().addAll(b5,b6);
        h2.setSpacing(80);
        Button b7 = new Button("Exit");
        styleButton(b7);

        Button b8 = new Button("Back");
        styleButton(b8);
        HBox h3=new HBox();
        h3.getChildren().addAll(b7,b8);
        h3.setSpacing(140);
VBox v1=new VBox();
v1.getChildren().addAll(h1,h2,h3);
v1.setSpacing(50);
pane.add(v1,0,1);

        return newScene;
    }
    private void styleButton(Button button) {
        button.setFont(javafx.scene.text.Font.font("Arial", 25)); // Set font size
        button.setStyle("-fx-background-color: chocolate; -fx-background-radius: 15; -fx-text-fill: white;");
    }
    public static void main(String[] args) {
        launch(args);
    }

}