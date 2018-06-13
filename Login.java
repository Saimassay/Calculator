package arrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.control.Labeled;

public class Login extends Application implements EventHandler<ActionEvent>{
	//instantiating attributes
	Scene scene, scene2;
	Button div;
	Button multiply;
	Button erase;
	Button seven;
	Button eight;
	Button nine;
	Button four;
	Button five;
	Button six;
	Button minus;
	Button one;
	Button two;
	Button three;
	Button plus;
	Button zero;
	Button comma;
	Button equal;
	float firstNumber = 0f;
	int operator;
	
	public void start (Stage window) throws Exception{
		//Creating MenuBar
		MenuBar Menu = new MenuBar();
		//Creating menu file
		Menu fileMenu = new Menu("File");
		//Creating items for file
		MenuItem clearMenu = new MenuItem("Clear Result");
		MenuItem exitMenu = new MenuItem("Exit");
		//Setting items in to file Menu
		fileMenu.getItems().addAll(clearMenu,exitMenu);
		//Creating help menu 
		Menu help = new Menu("Help");
		//creating item for help menu
		MenuItem about = new MenuItem("About");
		//setting items in to help menu
		help.getItems().addAll(about);
		//setting file menu and help menu in to menuBar
		Menu.getMenus().addAll(fileMenu,help);
		Menu.setId("MenuBar");
		//creating border Pane
		BorderPane hb = new BorderPane();
		//putting menu bar on top
		hb.setTop(Menu);
		
		//declaring label for about scene 
		Label Info = new Label("Calculator\r\n Version 10.1712.3351.0\r\n" + 
				"© 2017 Microsoft \r\nCorporation.\r\n All rights reserved.");
		//setting size to label
		Info.setStyle("-fx-font-size: 15pt");
		//Info.setStyle("-fx-text-fill: white;");
		Info.setId("Info");
		//declaring button to come back to main scene
		Button back = new Button("Back");
		back.setMinSize(50, 20);
		back.setStyle("-fx-font-size: 12pt");
		//creating vbox to put label and back button in vertical way
		VBox sc2= new VBox();
		//setting background color for vbox
		sc2.setStyle("-fx-background-color: #181818");
		sc2.setId("scene2");
		//setting label and back button in to vbox
		sc2.getChildren().addAll(Info,back);
		//setting size for vbox
		sc2.setPadding(new Insets(50,10,10 ,10));
		//creating scene and giving it size
		Scene scene2 = new Scene(sc2,210,360);
		//methods to show scene
		window.show();
		
		//setting action to exit menu
		exitMenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
		//creating method with definite action for exit menu
            public void handle(ActionEvent event) {
	    		System.out.println("MESSAGE WINDOW CLOSED ...");
	    		//method to close window
	    		window.close();
            }
			});
		
		//setting action to about window
		about.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			//creating method which contains action for about menu
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                //method which switches to scene2
                window.setScene(scene2);
            }

		});
		
		//creating gridpane
		GridPane gp = new GridPane();
		//creating textfiled
		TextField textField =  new TextField();
		//setting size for textfield
		textField.setPadding(new Insets(5,0,11,5));
		//setting font size for textfield
		//textField.setStyle("-fx-font-size: 10pt");
		
		//declaring button divide
		Button div = new Button("/");
		//setting action on divide button
		div.setOnAction(new EventHandler<ActionEvent>() {
			//creating method for division button
			public void handle(ActionEvent event) {
				//changing number from textfield from string to float
				firstNumber = Float.parseFloat(textField.getText());
				//creating operator
				operator = 4;
				//print it
				textField.setText("");
			}
		});
		
		//declaring multiply button
	   Button multiply = new Button ("*");
		//setting action on multiply button
		multiply.setOnAction(new EventHandler<ActionEvent>() {
			//creating method for division button
			public void handle(ActionEvent event) {
				//changing number from textfield from string to float
				firstNumber = Float.parseFloat(textField.getText());
				//creating operator
				operator = 3;
				//print it
				textField.setText("");
			}
		});
		
		//declaring erase button
		Button erase = new Button("x");
		//setting action on erase button
		erase.setOnAction(new EventHandler<ActionEvent>() {
			//method for erase button to clear number
			public void handle(ActionEvent event) {
				//clears numbers when clicked
				textField.clear();
			}
		});
		
		//declaring button
		Button seven = new Button ("7");
		//setting action on button 
		seven.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action on button
			public void handle(ActionEvent event) {
				//prints in textfield 7 when button clicked
				textField.setText(textField.getText()+"7");
			}
		});
		
		//declraing button
		Button eight = new Button("8");
		//setting action on button
		eight.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//prints 8in textfield
				textField.setText(textField.getText()+"8");
			}
		});
		
		//declaring button
		Button nine = new Button ("9");
		//setting action on button
		nine.setOnAction(new EventHandler<ActionEvent>() {
			//creating method on button
			public void handle(ActionEvent event) {
				//prints 9 in textfield
				textField.setText(textField.getText()+"9");
			}
		});
		
		//declaring button
		Button four = new Button ("4");
		//setting action on button
		four.setOnAction(new EventHandler<ActionEvent>() {
			//creating mehtod to set action on button
			public void handle(ActionEvent event) {
				//prints in textfield  
				textField.setText(textField.getText()+"4");
			}
		});
		
		//declaring button
		Button five= new Button("5");
		// setting action on button
		five.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action 
			public void handle(ActionEvent event) {
				//prints  in textfield
				textField.setText(textField.getText()+"5");
			}
		});
		
		//declaring button
		Button six = new Button("6");
		//setting action on button
		six.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//prints 6 in textfield
				textField.setText(textField.getText()+"6");
			}
		});
		
		//declaring button
	    Button minus = new Button ("-");
		//setting action on button
		minus.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//changing string to float in textfield
				firstNumber = Float.parseFloat(textField.getText());
				//set operator for switch
				operator = 2;
				textField.setText("");
			}
		});
		
		//declaring button
		Button one = new Button ("1");
		//setting action on button
		one.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//prints 1 in textfield
				textField.setText(textField.getText()+"1");
			}
		});
		
		//creating button
		Button two = new Button("2");
		//setting action on button
		two.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//prints 2 in textfield
				textField.setText(textField.getText()+"2");
			}
		});
		
		//creating button 
		Button three = new Button("3");
		//setting action on button
		three.setOnAction(new EventHandler<ActionEvent>() {
			//creating method
			public void handle(ActionEvent event) {
				//prints3 in textfield
				textField.setText(textField.getText()+"3");
			}
		});
		
		//creating button
		Button plus = new Button("+");
		//setting action on button
		plus.setOnAction(new EventHandler<ActionEvent>() {
			//creating method to set action
			public void handle(ActionEvent event) {
				//changing string to float in textfield
				firstNumber = Float.parseFloat(textField.getText());
				operator = 1;
				//printing operator
				textField.setText("");
			}
		});
		
		//creating button 
		Button zero = new Button("0");
		//setting action on button
		zero.setOnAction(new EventHandler<ActionEvent>() {
			//creating method for action
			public void handle(ActionEvent event) {
				//prints 0 in textfield
				textField.setText(textField.getText()+"0");
			}
		});
		
		//creating button
		Button comma = new Button(".");
		//setting action on button
		comma.setOnAction(new EventHandler<ActionEvent>() {
			//creating method for action setter
			public void handle(ActionEvent event) {
				//prints , in textfield
				textField.setText(textField.getText()+".");
			}
		});
		Button percent = new Button("%");
		percent.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				//changing string to float in textfield
				firstNumber = Float.parseFloat(textField.getText());
				operator = 5;
				//printing operator
				textField.setText("");
			}
		});
		Button bracket1 = new Button("(");
		bracket1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText(textField.getText()+"(");
			}
		});
		Button bracket2  = new Button(")");
		bracket2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText(textField.getText()+")");
			}
		});
		
		//declaring button
	    Button equal = new Button("=");
		//setting action on button
		equal.setOnAction(new EventHandler<ActionEvent>() {
			//creating method 
			public void handle(ActionEvent event) {
				//if data got from source equals equal it will go switch
				if(event.getSource() == equal) {
					//creating second output 
					float secondNumber = Float.parseFloat(textField.getText());
					//creating switch 
					switch(operator) {
					//declaring first case/ case for addition
					case 1 : 
						//declaring answer variable
						float answer = firstNumber+secondNumber;
						//printing in textfield and changing to string
						textField.setText(String.valueOf(answer));
						//stop the first case 
						break;
						//second case
					case 2 : 
						//finding result/ case for subtraction
						 answer = firstNumber-secondNumber;
						 //output in textfield and changing to string
						textField.setText(String.valueOf(answer));
						//stop the case
						break;
						//third case
					case 3 : 
						//case for multiplication
						answer = firstNumber*secondNumber;
						//output in textfield and changing to string
						textField.setText(String.valueOf(answer));
						//stop the code
						break;
					case 4 :
						//case for division
						//exception handler for division rules
						try {
							//finding division of numbers
						answer = firstNumber/secondNumber;
						//output result in textfield and changing to string
						textField.setText(String.valueOf(answer));
						}
						//catch part to handle the exception
						catch(ArithmeticException e){
							//output error if there is an exception 
							textField.setText("Exception");
							}
						//stop the case
						break;
					case 5:
						answer = firstNumber*secondNumber/100;
						textField.setText(String.valueOf(answer));
						}
				}
			}
		});
		
		
		//putting gridpane in the center
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(3);
		gp.setVgap(3);
		//setting size for gridpane
		gp.setPadding(new Insets(5,5,5,5));
		//put the buttons in positions column-raw
		gp.add(bracket1, 0, 0);
		gp.add(bracket2, 1, 0);
		gp.add(percent,2 , 0);
		gp.add(erase, 3, 0);
		gp.add(seven, 0, 1);
		gp.add(eight, 1, 1);
		gp.add(nine, 2, 1);
		gp.add(multiply, 3, 1);
		gp.add(four, 0, 2);
		gp.add(five, 1, 2);
		gp.add(six, 2, 2);
		gp.add(div, 3, 2);
		gp.add(one, 0, 3);
		gp.add(two, 1, 3);
		gp.add(three, 2, 3);
		gp.add(minus, 3, 3);
		gp.add(zero,0,4);
		gp.add(comma,1,4);
		gp.add(equal,2,4);
		gp.add(plus,3,4);
		//setting size 
		//gp.setHgap(10);
		//gp.setVgap(10);
		//setting font size
		//gp.setStyle("-fx-font-size: 12pt;");
		//giving size to buttons width and height
		bracket1.setMinSize(50,50 );
		bracket2.setMinSize(50,50);
		percent.setMinSize(50,50);
		div.setMinSize(50, 50);
		multiply.setMinSize(50, 50);
		erase.setMinSize(50, 50);
		seven.setMinSize(50, 50);
		eight.setMinSize(50, 50);
		nine.setMinSize(50, 50);
		four.setMinSize(50, 50);
		five.setMinSize(50, 50);
		six.setMinSize(50, 50);
		minus.setMinSize(50, 50);
		one.setMinSize(50, 50);
		two.setMinSize(50, 50);
		three.setMinSize(50, 50);
		plus.setMinSize(50, 50);
		zero.setMinSize(50, 50);
		comma.setMinSize(50, 50);
		equal.setMinSize(50, 50);
	
		//setting background color for buttons
		/*erase.setStyle("-fx-background-color: red;");
		div.setStyle("-fx-background-color: grey;");
		multiply.setStyle("-fx-background-color:grey;");
		minus.setStyle("-fx-background-color:grey;");
		plus.setStyle("-fx-background-color: grey;");
		equal.setStyle("-fx-background-color: grey;");*/
		
		//declaration of vbox to output in vertical way
		VBox vbox = new VBox();
		//setting sizes for vbox
		vbox.setPadding(new Insets(0,0,0,0));
		//putting buttons textfield into vbox
		vbox.getChildren().addAll(hb, textField,gp);
		//setting size between objects
		vbox.setSpacing(5);
		//setting background color
		
		//declaring size and giving size
		Scene scene = new Scene(vbox,220,360);
		
		scene.getStylesheets().add("calculator.css");
        //setting title of window
		window.setTitle("Calculator");
		//putting scene into window
		window.setScene(scene);
		 //window.setResizable(false);

		//method to show window
		window.show();
		//setting action on back button
		back.setOnAction(new EventHandler <ActionEvent>() {
			//creating method 
			public void handle(ActionEvent event) {
				//action to change scene
				window.setScene(scene);
			}
		});
		//declaring action on button clearMenu
		clearMenu.setOnAction(new EventHandler<ActionEvent>() {
			//creating method for setting action
			public void handle(ActionEvent event) {
				//clears textfield
				textField.clear();
			}
		});
	}
	//main method to run the code
	public static void main(String [] args) throws IOException{
		Application.launch(args);
	}
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
