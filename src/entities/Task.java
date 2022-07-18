package entities;

public class Task extends Lesson {

	private String description;
	private Integer questionCount;
	
	public Task() {
		super();
	}
	
	public Task(String title, String description, Integer questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int duration() {
		int totalSeconds = this.questionCount * 5 * 60;
		
		return totalSeconds;
	}

}
