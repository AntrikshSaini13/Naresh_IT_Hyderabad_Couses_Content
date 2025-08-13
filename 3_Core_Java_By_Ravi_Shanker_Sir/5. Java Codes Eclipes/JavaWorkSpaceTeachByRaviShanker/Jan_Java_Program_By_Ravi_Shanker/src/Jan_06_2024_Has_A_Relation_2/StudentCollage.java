package Jan_06_2024_Has_A_Relation_2;

public class StudentCollage {
	
	@Override
	public String toString() {
		return "StudentCollage [collageName=" + collageName + ", collageLoctions=" + collageLoctions + "]";
	}

	private String collageName;
	private String collageLoctions;

	public StudentCollage(String collageName, String collageLoctions) {
		super();
		this.collageName = collageName;
		this.collageLoctions = collageLoctions;
	}
	
	public String getCollageName() {
		return collageName;
	}

	public String getCollageLoctions() {
		return collageLoctions;
	}
	
}
