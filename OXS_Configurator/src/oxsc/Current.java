package oxsc;

import gui.TabData;
import processing.core.PApplet;
import controlP5.ControlP5;

public class Current extends Sensor {
	
	//private int parameters;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2337303733439030951L;

	public void addOXSdata() {
		new OXSdata("CURRENTMA", "Current (mA)", this.getName(), null);
		new OXSdata("MILLIAH", "Consumption (mAh)", this.getName(), null);
	}

	public void removeSensor() {
		OXSdata.removeFromList(this);
		TabData.resetSentDataFields();
		//updateUIoXSdataList();
		Sensor.getSensorList().remove(this);
	}

	public Current(PApplet p, ControlP5 cp5, String name) {
		super(p, cp5, name);
	}
}
