package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		while (true) {
			String userAnimal = JOptionPane.showInputDialog(
					"Which animal do you want to hear?\n Llama,\n Cow,\n Duck,\n Dog,\n Cat\n or Pig?");
			if (userAnimal == null) System.exit(0);
			
			if (userAnimal.equalsIgnoreCase("llama")) {
				playLlama();
			} else if (userAnimal.equalsIgnoreCase("pig")) {
				playPig();
			} else if (userAnimal.equalsIgnoreCase("cow")) {
				playMoo();
			} else if (userAnimal.equalsIgnoreCase("duck")) {
				playQuack();
			} else if (userAnimal.equalsIgnoreCase("dog")) {
				playWoof();
			} else if (userAnimal.equalsIgnoreCase("cat")) {
				playMeow();
			} else {
				JOptionPane.showMessageDialog(null, "Incorect Animal!");
			}
			 
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	void playPig() {
		playNoise(pigFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String pigFile = "sound/oink2.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
