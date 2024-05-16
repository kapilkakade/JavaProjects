package Interface;


public class AustrailianTraffic implements CentralTraffic, AsianTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new AustrailianTraffic();  // created object for AustrailianTraffic which are referring to CentralTraffic
		a.greenGo(); // called the methods from CentralTraffic interface in regular way
		a.redStop();
		a.yellowWait();
		
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("This is Green Signal");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("This is Red Signal");

		
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("This is Yellow Signal");

		
	}

	@Override
	public void greenStop() {
		// TODO Auto-generated method stub
		System.out.println("This is AsianGreen Signal");
		
	}

	@Override
	public void redGo() {
		// TODO Auto-generated method stub
		System.out.println("This is AsianRed Signal");
		
	}

	@Override
	public void yellowSeeAndGo() {
		// TODO Auto-generated method stub
		System.out.println("This is AsianYellow Signal");
		
	}

}
