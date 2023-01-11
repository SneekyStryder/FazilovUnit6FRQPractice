public class VocabRunner {
    public static void main(String[] args) {
        String[] theVocab = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
        Vocab vocab = new Vocab(theVocab);

        String[] wordArray = {"dogs", "toys", "sun", "plants", "time"};

        // test countNotInVocab method, which should return 2
        System.out.println(vocab.countNotInVocab(wordArray)); // should print 2

        // test notInVocab method, which should return ["toys", "sun"]
        String[] notInVocab = vocab.notInVocab(wordArray);
        for (String str : notInVocab)
        {
            System.out.print(str + " ");  // should print: toys sun
        }

        System.out.println();

    }
}
