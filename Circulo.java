class Circulo{
	public static void main(String[]args){
	int r = 5;
	double pi = 3.1416, circunferencia, area;
	circunferencia = (2*pi) * r;
	area = pi * (Math.pow(r,2));
	System.out.println ("Radio:" + r);
	System.out.println ("Longitud de circunferencia:" + circunferencia);
	System.out.println ("Area de circulo:" + area);
	}
}