
public class Planeta {
private String Nombre;
private double Diametro;
private double Gravedad;

Planeta(String Nombre, double Diametro, double Gravedad){
	this.Nombre=Nombre;
	this.Diametro=Diametro;
	this.Gravedad=Gravedad;
	}
	
void  setNombre (String Nombre){
	this.Nombre=Nombre;
}

String getNombre(){
	return Nombre;
}

void setDiametro(double diametro){
	this.Diametro=diametro;
}

double getDiametro(){
	return Diametro;
}

void setGravedad(double gravedad){
	this.Gravedad=gravedad;
}

double getGravedad (){
	return Gravedad;
}

}
