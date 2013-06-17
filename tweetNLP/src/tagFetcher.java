import java.io.IOException;
import java.util.ArrayList;

import cmu.arktweetnlp.Tagger;
import cmu.arktweetnlp.Tagger.TaggedToken;


public class tagFetcher {
	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Supply the model filename as first argument.");
		}
		String modelFilename = "model.20120919"; //args[0];

		Tagger tagger = new Tagger();
		tagger.loadModel(modelFilename);

		String text = "ikr smh he asked fir yo last name so he can add u on fb lololol";
		ArrayList<TaggedToken> taggedTokens = (ArrayList<TaggedToken>) tagger.tokenizeAndTag(text);

		for (TaggedToken token : taggedTokens) {
			System.out.printf("%s\t%s\n", token.tag, token.token);
			
		}
	}

}
