import java.util.Date;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	private Date due = null;
	
	//test
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public Task(String description, boolean isComplete, Date due) {
		super();
		this.description = description;
		this.isComplete = isComplete;
		this.due = due;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
	}

}
