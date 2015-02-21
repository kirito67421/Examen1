
public class Alumno {
private String Nombre;
private double Nota1;
private double Nota2;
private double Nota3;

Alumno(String Nombre, double Nota1,double Nota2,double Nota3){
	this.Nombre=Nombre;
	this.Nota1=Nota1;
	this.Nota2=Nota2;
	this.Nota3=Nota3;
}

void setNombre(String nombre){
	this.Nombre=nombre;
}

String getNombre(){
	return Nombre;
}

void setNotas(double nota1,double nota2,double nota3){
	this.Nota1=nota1;
	this.Nota2=nota2;
	this.Nota3=nota3;
}

double getPromedio(){
	double suma, resultado;
	suma=(this.Nota1+this.Nota2+this.Nota3);
	resultado=(suma/3);
	return resultado;
}

boolean aprobado(){
	double suma, res;
	suma=(this.Nota1+this.Nota2+this.Nota3);
	res=(suma/3);
	if (res>59)
	{
		return true;
	}
	else
	{
		return false;
	}

}


}
