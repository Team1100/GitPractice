package app;

public class App {
    public static void main(String[] args) throws Exception {
      App app = new App();
      System.out.println("Woah there Java");
      app.help();
      app.shameOnYou();
    }

    public void usefulFunctionNum8() { 
      return;
    }

    public void uselessFunctionNum9() {
      return;
    }

    public void uselessFunctionNum4() {
      return;
    } 

    public void shameOnYou() {
        System.out.println("Shame x3");
    }

    public void uselessFunction1(int what) {
      return;
    }

    public void help() {
      System.out.println("This is a help message.\n");
      for (int i = 0; i < 10; i++) {
        System.out.println("Help " + i + " message.\n");
      }
    }
}
