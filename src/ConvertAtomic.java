
public class ConvertAtomic implements Command {

	Calculator calculator;
	DistanceDetails dets;
	ConvertAtomic(Calculator cal){
		calculator=cal;
		dets=new DistanceDetails();
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		String from, to;
		double fromv,tov;
		from=(String)calculator.pfrom.getSelectedItem();
		to=(String)calculator.pto.getSelectedItem();
		fromv=Double.parseDouble(calculator.fpvalue.getText());
		tov=fromv*dets.atomicconversion.get(from)/dets.atomicconversion.get(to);
		calculator.tpvalue.setText(tov+"");
		return true;
	}

}
