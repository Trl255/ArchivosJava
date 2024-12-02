import java.util.concurrent.Callable;

class TareaSuma implements Callable<Integer> {
  private int a;
  private int b;
  public TareaSuma(int a, int b) {
this.a = a;
this.b = b;
  }
  public Integer call() {
return a + b;
  } 
  public static void main(String[] args){
		TareaSuma tarea = new TareaSuma(4,3);
		System.out.println(tarea.call());
	}
}

