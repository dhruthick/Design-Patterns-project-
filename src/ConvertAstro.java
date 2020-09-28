
public class ConvertAstro implements Command {

	Calculator calculator;
	DistanceDetails dets;
	ConvertAstro(Calculator cal){
		calculator=cal;
		dets=new DistanceDetails();
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		String from, to;
		double fromv,tov;
		from=(String)calculator.afrom.getSelectedItem();
		to=(String)calculator.ato.getSelectedItem();
		fromv=Double.parseDouble(calculator.favalue.getText());
		tov=fromv*dets.astroconversion.get(from)/dets.astroconversion.get(to);
		calculator.tavalue.setText(tov+"");
		return true;
	}
}
