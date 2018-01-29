import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class JavaGuiHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //System.out.println("Hello GUI Java: 28/01/2018 14:53");

		  Display display = new Display();
		  Shell shell = new Shell(display);
		  shell.setText("Hello GUI Java:29/01/2018 13:25");
		  shell.open();
		  while (!shell.isDisposed()) {
			  if (!display.readAndDispatch()) display.sleep();
		  }	
		  display.dispose();
	}

}
