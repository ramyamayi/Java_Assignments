package Classes_Objects;

import java.util.Arrays;

public class Addamount_main {

	public static void main(String[] args) {
		Addamount amt =  new Addamount();
		Addamount amt1 = new Addamount(60);
		Addamount amt2 = new Addamount(100);
		Addamount amt3 = new Addamount(150);
		Addamount amt4 = new Addamount(40);
		Addamount amt5 =  new Addamount();
		Addamount[] arr = {amt,amt1,amt2,amt3,amt4,amt5};
for(Addamount a : arr) {
	System.out.println(a);
}
	}

}
