package Assignment1;


public class Bean {
	private int taskId;
	private String taskName;
	
	public Bean(int taskID, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int newtaskId) {
		taskId = newtaskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String newtaskName) {
		taskName = newtaskName;
	}

}
