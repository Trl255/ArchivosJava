class TareaNumeros implements Runnable { 
  private int n;
  public TareaNumeros(int n) {
    	this.n = n;
  }
  public void run() {
    for (int i=1; i<=n; i++) {
      	System.out.println("Nº " + i + " de " + n);
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  }  
  public static void main(String[] args){
		TareaNumeros tarea = new TareaNumeros(100);
		Thread hilo1 = new Thread(tarea);
		hilo1.start();
	}
}

