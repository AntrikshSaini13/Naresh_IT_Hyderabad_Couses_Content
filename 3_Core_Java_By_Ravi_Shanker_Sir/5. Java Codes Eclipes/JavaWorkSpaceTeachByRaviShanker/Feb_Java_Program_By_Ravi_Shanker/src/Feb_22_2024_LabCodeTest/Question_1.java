package Feb_22_2024_LabCodeTest;

interface Language{
	public abstract String getMsg();
}


class Hindi implements Language{

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return "Namaste";
	}
}
class Telugu implements Language{

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return "Namaskaram";
	}
}

class Mediator{
    static void mediator(Language language ){
    	System.out.println(language.getMsg());
    }
}


public class Question_1 {
	public static void main(String[] args) {
		Hindi h = new Hindi();
		Telugu t = new Telugu();
		
		Mediator.mediator(h);
		Mediator.mediator(t);
	}
}