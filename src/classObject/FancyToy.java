package classObject;

import classObject.interfaces.HasBatteries;
import classObject.interfaces.Shoots;
import classObject.interfaces.Waterproof;

public class FancyToy  extends Toy implements HasBatteries,Shoots,Waterproof{
	FancyToy(){
		super(1);
	}
}
