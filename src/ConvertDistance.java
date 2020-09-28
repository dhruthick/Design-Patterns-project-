
public class ConvertDistance implements Command {
	Calculator calculator;
	DistanceDetails dets;
	ConvertDistance(Calculator cal){
		calculator=cal;
		dets=new DistanceDetails();
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		String from, to;
		double fromv,tov;
		from=(String)calculator.tfrom.getSelectedItem();
		to=(String)calculator.tto.getSelectedItem();
		fromv=Double.parseDouble(calculator.fvalue.getText());
		tov=fromv*dets.generalconversion.get(from)/dets.generalconversion.get(to);
		calculator.tvalue.setText(tov+"");
		return true;
	}

} 