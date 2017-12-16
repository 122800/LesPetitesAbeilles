package bonnetZone;

import main.Displayable;

public class Abeille implements Displayable {

	public Abeille() {
		// TODO Auto-generated constructor stub
	}
	
	private String colour = "0x00CCCC";
	private String name;
	private String status;

	@Override
	public String getColour() {return colour;}
	@Override
	public String getName() {return name;}
	@Override
	public String getStatus() {return status;}

}
