import java.util.*;

interface materialData{

	public void materialNameMethod();
	public double specificGravityMethod();
	public double UTSMethod();
	
}


interface materialCosting extends materialData{
	public double materialCostMethod();
}

interface materialTemperature extends materialCosting{
	public double meltingTemperatureMethod();
	public double glassTransitionTemperatureMethod();
}




class materialProperties implements materialTemperature{
	public String materialName;
	public double specificGravity, uts,  meltingTemperature, glassTransitionTemperature, materialCost,partVolume; 

	public materialProperties(String a, double b, double c, double d, double e, double f, double g){

		this.materialName =a;
		this.specificGravity =b;
		this.uts =c;
		this.meltingTemperature=d;
		this.glassTransitionTemperature =e;
		this.materialCost=f;
		this.partVolume=g;

	}

	public void materialNameMethod(){
		System.out.println("The material to be added in Database is "+this.materialName);

	}

	public double specificGravityMethod(){
		return this.specificGravity;

	}
	public double UTSMethod(){
		return this.uts;
	}

	public double materialCostMethod(){
		double partcost = this.specificGravity*this.partVolume*this.materialCost*0.001;
		return partcost;
	}
	public double meltingTemperatureMethod(){
		return this.meltingTemperature;
	}
	public double glassTransitionTemperatureMethod(){
		return this.glassTransitionTemperature;
	}
}





class InterfaceExtends  {

public static void main(String[] args) {

	materialProperties m = new materialProperties("ABS", 1.04,222,220,110,750,125000);

	m.materialNameMethod();
	System.out.println("The specificGravity of the material is "+m.specificGravityMethod());
	System.out.println("The ultimate tesnsile strength is  "+m.specificGravityMethod() + "N/mm2");
	System.out.println("The manufacturing cost of the part is "+m.materialCostMethod() +"INR");
	System.out.println("The meltingTemperature is " +m.meltingTemperatureMethod() + " . The glass transition temperature is "+m.glassTransitionTemperatureMethod());

}	

}