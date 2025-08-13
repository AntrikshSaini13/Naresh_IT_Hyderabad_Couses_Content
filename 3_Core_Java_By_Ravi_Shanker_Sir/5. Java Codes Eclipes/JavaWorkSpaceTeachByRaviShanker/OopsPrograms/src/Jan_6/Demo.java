package Jan_6;

public class Demo {
		private int id;
		private String name;
		private String course;
		private double mark;
		private boolean isDone;

		public Demo(int id, String name, String course, double mark) {
			super();
			this.id = id;
			this.name = name;
			this.course = course;
			this.mark = mark;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			if(isDone==false) {
			this.name = name;
			isDone = true;
			}else {
				System.out.println("Invalid Operation");
			}
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public double getMark() {
			return mark;
		}

		public void setMark(double mark) {
			this.mark = mark;
		}

		public void placed() {
			if (mark > 80)
				System.out.println(name + " got placement....");
			else {
				System.out.println(name + " is not eligible...");
			}
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks= " + mark + "]";
		}

	}

class TestGetterAndSetter {
	public static void main(String[] args) {
			Demo s1 = new Demo(101, "Niiiiiiiiiishita", "Java", 90.8);
			Demo s2 = new Demo(102, "Amarjeet", "Java", 30.5);
			s2.placed();
			//s1.name = "Nishita";
			s1.setName("Nishita");
			System.out.println(s1);
			System.out.println(s1.getCourse());
			s1.setName("Amarjeet");
			s1.placed();
	}
}
	
