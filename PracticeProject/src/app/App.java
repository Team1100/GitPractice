package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      App app = new App();
      System.out.println("Woah there Java");
      app.help();
      app.shameOnYou();
      System.out.println(app.random(100));
    }

    public void usefulFunctionNum8() { 
      return;
    }

    public void uselessFunctionNum9() {
      return;
    }

    public void funFunctionNum4() {
      return;
    } 

    public void shameOnYou() {
        System.out.println("Shame x3");
    }

    public double add(int x, int y) {
      return x + y;
    }

    public void brianFunction() {
      System.out.println("Hi, my name is brian");
    }

    public void multiplication() { 
      int i = 2*3;
      System.out.println(i);
    }

    public void help() {
      System.out.println("This is a help message.\n");
      for (int i = 0; i < 10; i++) {
        System.out.println("Help " + i + " message.\n");
      }
	  
	
    }

    public void subtract() {
	    Scanner obj = new Scanner(System.in);
	    System.out.println("number 1");
	    float num1 = obj.nextFloat(); 

	    Scanner obj2 = new Scanner(System.in);
	    System.out.println("number 2");
	    float num2 = obj.nextFloat(); 

	    float dif = num1 - num2
		    System.out.println(dif)

    }

    public int random(int maxNum) {
      // minimum number is 0
      return (int) (Math.random() * (maxNum + 1));
    }
}
