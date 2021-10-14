package design_patterns_cod3r.Estrura.adapter.tvPort.devices;


import design_patterns_cod3r.Estrura.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
