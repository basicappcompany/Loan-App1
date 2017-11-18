import com.hackathon.loanapp.dao.Loan;
import com.hackathon.loanapp.dao.LoanDaoImpl;

public class LoanTest {

	public static void main(String[] args) {

		LoanDaoImpl impl = new LoanDaoImpl();
		Loan loanApp = new Loan();
		impl.getLoan(loanApp);
		System.out.println("Done.");

	}

}
