// Assignment 12: Arizona State University CSE205
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time
//  Description: 

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;


public class WaveControlPane extends Pane {

	private WaveDisplayPane wavePane;
	private int width, height;
	private Color color;
	private ColorPicker picker;

	// ******************************************************************
	// Task #2a: add instance variables for sliders, buttons, and labels
	// ******************************************************************

	Button start;
	Button stop;
	Button clear;
	Button def;
	Slider speedSlider;
	Slider widthSlider;
	Slider heightSlider;
	Label speedLabel;
	Label widthLabel;
	Label heightLabel;

	// constructor to create all components, set their handler/listener,
	// and arrange them using layout panes.
	public WaveControlPane(int h, int w, Color initialColor) {
		this.color = initialColor;
		this.width = (int) (h * 0.68);
		this.height = w - 10;

		// creates a pane to display waves with the specified color
		wavePane = new WaveDisplayPane(width, color);
		wavePane.setMinSize(width, height);
		wavePane.setMaxSize(width, height);

		// create a color picker with the specified initial color
		picker = new ColorPicker(color);
		picker.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		// ************************************************************************
		// Task #2b: create 4 buttons and resize them to the width of the VBox pane,
		// then add them to the VBox buttonPane instantiated below.
		// *************************************************************************

		start = new Button("Start");
		stop = new Button("Stop");
		clear = new Button("Clear");
		def = new Button("Default");

		start.setMaxWidth(Double.MAX_VALUE);
		stop.setMaxWidth(Double.MAX_VALUE);
		clear.setMaxWidth(Double.MAX_VALUE);
		def.setMaxWidth(Double.MAX_VALUE);

		VBox buttonPane = new VBox(start, stop, clear, def, picker);
		
		buttonPane.setPrefSize(100, 100);
		buttonPane.setAlignment(Pos.CENTER);

		// ************************************************************************
		// Task #2c: create 3 sliders and 3 labels and add them to the VBox panes
		// instantiated below. 
		// *************************************************************************

		speedSlider = new Slider(10, 50, 20);
		speedSlider.setMajorTickUnit(10);
		speedSlider.setMinorTickCount(5);
		speedLabel = new Label("Speed");

		widthSlider = new Slider(20, 100, 50);
		widthSlider.setMajorTickUnit(10);
		widthSlider.setMinorTickCount(5);
		widthLabel = new Label("Width");

		heightSlider = new Slider(20, 100, 80);
		heightSlider.setMajorTickUnit(10);
		heightSlider.setMinorTickCount(5);
		heightLabel = new Label("Height");

		VBox speedSliderPane = new VBox(speedSlider, speedLabel);
		VBox waveLengthSliderPane = new VBox(widthSlider, widthLabel);
		VBox waveAmplitudeSliderPane = new VBox(heightSlider, heightLabel);

		TilePane sliderPane = new TilePane();
		sliderPane.setPrefColumns(3);
		sliderPane.setPadding(new Insets(5, 5, 5, 5));
		sliderPane.setAlignment(Pos.CENTER);
		sliderPane.getChildren().addAll(speedSliderPane, waveLengthSliderPane, waveAmplitudeSliderPane);

		HBox controls = new HBox(buttonPane, sliderPane);
		controls.setAlignment(Pos.CENTER);

		BorderPane controlsAndWaves = new BorderPane();
		controlsAndWaves.setLeft(controls);
		controlsAndWaves.setCenter(wavePane);

		this.getChildren().add(controlsAndWaves);

		// ************************************************************************
		// Task #2d: Register the buttons, sliders, and color picker with the
		// appropriate handler object 
		// *************************************************************************

		start.setOnAction(new ButtonHandler());







	}

	// ************************************************************************
	// Task #3: Implement event handlers for the four buttons (task #3a), 
	// the color picker (task #3b), the speed slider (task #3c), and the
	// sliders for wave amplitude and length (tasks #3d, #3e)
	// *************************************************************************

	private class ButtonHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event){
			if(event.getSource() == start){
				wavePane.resume();
			}
			if(event.getSource() == stop){
				wavePane.suspend();
			}
			if(event.getSource() == clear){
				wavePane.clearPane();
			}
			if(event.getSource() == def){
				wavePane.suspend();
				wavePane.setWaveAmplitude(60);
				wavePane.setWaveLength(50);
				wavePane.setRate(30);
			}
		}
	}
	private class ColorHandler{

	}
	private class SpeedHandler{

	}
	private class WaveLengthHandler{

	}
	private class WaveAmplitudeHandler{

	}
}
