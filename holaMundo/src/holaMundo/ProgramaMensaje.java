package holaMundo;

import java.util.ArrayList;

public class ProgramaMensaje {

	public static void main(String[] args) {

		Mensaje m = new Mensaje();
		m.setEmisor("Pepito");
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(m);
			}
		}
	}

}
