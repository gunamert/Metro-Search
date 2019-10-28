//Mert Gunay
//21.05.2017


package asg4;

import java.util.ArrayList;

public class Station {
	public String name;
	public int x;
	public int y;
	public ArrayList Destinations =new ArrayList();
	Station(){
	}
	Station( String name, int x,int y, ArrayList Destinations ){
		this.name=name;
		this.x=x;
		this.y=y;
		this.Destinations=Destinations;
	}
}
