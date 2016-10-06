package testing;

import java.util.ArrayList;

public class Test {
	
	double z = 0;
	double eps = 1/Math.pow(100, 5); //vary the power and see what happens
	
	double[] iterationNumber = new double[10000000];
	double[] zOutputs = new double[10000000];
	
	public static void main(String[] args){
		Test GO = new Test();
		GO.go();
	}//main
	
	//https://people.math.osu.edu/edgar.2/piand.html
	
	private void go(){
		zOutputs[0] = eps + .25;
		iterationNumber[0] = 1;
		for(int i = 1; i < 10000000; i ++){
			iterationNumber[i] = i+1;
			zOutputs[i] = mandelbrot(zOutputs[i-1]);
			if(zOutputs[i] > 2){
				System.out.println((iterationNumber[i-1] + 1) + " iterations taken");
				return;
			}
		}
		/*
		for(int i = 0; i < 31420; i ++){
			System.out.println(iterationNumber[i] + "\t" + zOutputs[i]);
		}
		*/
		System.out.println("That's PI ^, almost.. kind of..");
	}//go
	
	private double mandelbrot(double x){
		return x*x + .25 + eps;
	}
	
}//class
