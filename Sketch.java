import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(128); // color
    line(150, 25, 270, 350); // x and y locations

    stroke(255); // color
    line(50, 125, 70, 50);  // x and y locations

    if (mousePressed) {
    fill(0);
    } else {
    fill(255);
    } ellipse(mouseX, mouseY, 80, 80); // draw a ellispe at a certain location, x and y location of the mouse
    }
  
  // define other methods down here.
}