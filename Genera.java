class Genera{

	public static char getLetra(){
	return(char)(Math.random()+ 'a'+'e'+'i'+'o'+'u');
	}

	public static void main(String[]args){
	
	System.out.println(getLetra());
	System.out.println(getLetra());
	System.out.println(getLetra());
	System.out.println(getLetra());
	System.out.println(getLetra());
	}
}