package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1889; i++) {
			String userSentence = JOptionPane.showInputDialog("Write a sentence");
			if (userSentence == null) System.exit(0);
		    speak(userSentence);
		}
	}

	/* Don't change this! */
	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
