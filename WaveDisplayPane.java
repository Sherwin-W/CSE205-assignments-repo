// Assignment 12: Arizona State University CSE205
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Creates components of GUI.

import java.awt.*;
import java.security.Key;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class WaveDisplayPane extends Pane {

	// Task #1: implement instance variables, constructor, and methods
	// as outlned in the UML diagram and assignment description

	Timeline timeline;
	private int time;
	private int temp;
	private int waveLength;
	private int waveAmplitude;
	private int paneWidth;
	private Color color;

	public WaveDisplayPane(int paneWidth, Color color){
		this.waveAmplitude = 100;
		this.time = 0;
		this.waveLength = 50;
		this.paneWidth = paneWidth;
		this.color = color;

		this.setStyle("-fx-background-color: white");
		this.setStyle("-fx-border-color: black");

		KeyFrame keyframe = new KeyFrame(Duration.millis(500), new WaveHandler());;
		timeline = new Timeline(keyframe);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.setRate(20);
		timeline.play();
	}

	// defines an event listener to draw a new point
	private class WaveHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			time++;
			int x = (waveLength * time) / 314;
			int y = (int) (waveAmplitude * Math.sin((0.0174533) * time) + 115);

			if (x < paneWidth) {
				Circle dot = new Circle(x, y, 2);
				dot.setFill(color);
				getChildren().add(dot);
			} else suspend();
		}
	}

	public void resume(){
		this.time = this.temp;
	}

	public void suspend(){
		this.temp = this.time;
		this.time = 0;
	}

	public void changeColor(Color chosen){
		this.color = chosen;
	}

	public void clearPane(){
		this.getChildren().clear();
		this.time = 0;
	}

	public void setWaveLength(int waveLength){
		this.waveLength = waveLength;
	}

	public void setWaveAmplitude(int waveAmplitude){
		this.waveAmplitude = waveAmplitude;
	}

	public void setRate(int rate){
		this.time = rate;
		timeline.setRate(rate);
	}
}
