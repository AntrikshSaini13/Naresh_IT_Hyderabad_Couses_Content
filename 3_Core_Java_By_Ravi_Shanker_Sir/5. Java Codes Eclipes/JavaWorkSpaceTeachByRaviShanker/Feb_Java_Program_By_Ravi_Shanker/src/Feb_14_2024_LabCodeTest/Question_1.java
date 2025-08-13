package Feb_14_2024_LabCodeTest;

abstract class Task{
	public String taskName;
	public int priority;
	
	public Task(String taskName, int priority) {
		super();
		this.taskName = taskName;
		this.priority = priority;
	}
	public abstract String completeTask();
	public abstract int displayTaskInfo();
	
	
	public int displayPriority() {
		return  priority;
	}
}

class AssignmentTask extends Task{
	
	public String dueDate ;

	public AssignmentTask(String taskName, int priority, String dueDate) {
		super(taskName, priority);
		this.dueDate = dueDate;
	}

	public AssignmentTask(String taskName, int priority) {
		super(taskName, priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String completeTask() {
		// TODO Auto-generated method stub
		return dueDate;
	}

	@Override
	public int displayTaskInfo() {
	
		return priority;
	}

	@Override
	public String toString() {
		return "AssignmentTask [dueDate=" + dueDate + ", taskName=" + taskName + ", priority=" + priority
				+ ", completeTask()=" + completeTask() + ", displayTaskInfo()=" + displayTaskInfo() + "]";
	}
	
}

class HomeWorkTask extends Task{

	public String dueDate;
		
	public HomeWorkTask(String taskName, int priority, String dueDate) {
		super(taskName, priority);
		this.dueDate = dueDate;
	}

	public HomeWorkTask(String taskName, int priority) {
		super(taskName, priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String completeTask() {
		return dueDate;
	}

	@Override
	public int displayTaskInfo() {
		return priority;
	}

	@Override
	public String toString() {
		return "HomeWorkTask [dueDate=" + dueDate + ", taskName=" + taskName + ", priority=" + priority
				+ ", completeTask()=" + completeTask() + ", displayTaskInfo()=" + displayTaskInfo() + "]";
	}
	
	
}




public class Question_1 {
	public static void main(String[] args) {
		Task t1;
		
		t1 = new AssignmentTask("12/02/2024",1);
		System.out.println(t1);
		t1 = new HomeWorkTask("13/02/2024",2);
		System.out.println(t1);
	}
}
