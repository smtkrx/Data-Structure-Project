import java.util.Objects;
import java.util.PriorityQueue;
import java.util.*;
public class TestSpecialCustomer {
	  public static void main(String[] args) {
		  Random rnd = new Random();
		  PriorityQueue<SpecialCustomer> pq = new PriorityQueue<>();
		  String[]  customer_names    = {"hasan", "ali", "veli", "murat", "ayşe", "naz", "cenk", "hülya", "barış", "akın"} ;
		  for(int i=0; i<5; i++) {
		  pq.add(customer_names[i]);
		  }
	  }
}
