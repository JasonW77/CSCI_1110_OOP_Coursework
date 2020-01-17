//Author Jason Waters
//Date 1/16/2020
//CSCI_1110_Exercise_14_28

package exercise14_28;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;	

public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	private boolean secondHandVis;
	// Clock pane width and height.
	private double w = 250, h = 250;
	
	/** construct a default clock with the current time*/
	public ClockPane() {
		setCurrentTime();
	}
	
	//Construct a clock with specified hour, minute, and second
	public ClockPane(int hour, int minute, int second, boolean secondHandVis){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.secondHandVis = secondHandVis;
		paintClock();
	}
	
	/**return hour					*/
	public int getHour(){
		return hour;
	}
	//set hour
	public void setHour(int hour){
		this.hour = hour;
		paintClock();
	}
	
	/**return minute				*/
	public int getMinute(){
		return minute;
	}
	//set minute
	public void setMinute(int minute){
		this.minute = minute;
		paintClock();
	}
	
	/**return second				*/
	public int getSecond(){
		return second;
	}
	//set second
	public void setSecond(int second){
		this.second = second;
		paintClock();
	}
	/**return clock pane width		*/
	public double getW(){
		return w;
	}
	//set clock pane width
	public void setW(double width){
		this.w = width;
		paintClock();
	}
	
	/**return clock pane height		*/
	public double getH(){
		return h;
	}
	//set clock pane height
	public void setH(double height){
		this.h = height;
		paintClock();
	}
	
	/** set the current time for the clock */
	public void setCurrentTime(){
		//construct a current calendar for the current time
		Calendar calendar = new GregorianCalendar();
		
		//set current hour, minute, and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock();
	}
	
	/** paint the clock */
	protected void paintClock(){
		
		//initialize clock parameters
		double clockRadius = Math.min(w,h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;
		
		//Draw the circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		
		//Draw the second hand
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		if (secondHandVis = true) {
			sLine.setStroke(Color.RED);
		}
		else if (secondHandVis = false)
			sLine.setStroke(Color.WHITE);
		
		//Draw minute hand
		double mLength = clockRadius * 0.65;
		double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, minuteX , minuteY);
		mLine.setStroke(Color.BLUE);
		
		//Draw the hour hand
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		
		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
		
	}
}
