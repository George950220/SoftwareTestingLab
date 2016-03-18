package ÉíÌå;

public class tri {
	public int a,b,c;
	public tri(int a, int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public tri(){
		System.out.println("Create an empty triangle");
	}
	
	public String judgement(){
		if( a+b<=c || a+c<=b || b+c <=a){
			return "Not a triangle";
		}else{
			if(a==b&&a==c){
				return "equilateral";
			}else if( a != b && a!=c && b!=c ){
				return "scalene";
			}else{
				return "isosceles";
			}
		}
	}
	
}
