package converter;

// The fine tuning data includes a prompt and the desired response from the language model
public class TuningData {
	
	private String prompt;
	
	private String completion;
	
	public TuningData(String prompt, String completion) {
		this.prompt = prompt;
		this.completion = completion;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getCompletion() {
		return completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
	}
	
	public String toString() {
		String outPut = "";
		outPut += "Prompt: " + prompt + "->" + "\n";
		outPut += "Completion: " + completion + "\n";
		return outPut;
	}

}
