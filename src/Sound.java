public class Sound {
    /**
     * the array of values in this sound; guaranteed not to be null
     */
    private int[] samples;

    /* constructor not shown */
    public Sound(int[] userSamples) {
        samples = userSamples;
    }

    public int[] getSamples() {
        return samples;
    }

    /**
     * Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     * <p>
     * Precondition: limit ≥ 0
     */
    public int limitAmplitude(int limit) {
        int changed = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] < -(limit)) {
                samples[i] = -(limit);
                changed++;
            }
            if (samples[i] > limit) {
                samples[i] = limit;
                changed++;
            }
        }
        return changed;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * <p>
     * Precondition: samples contains at least one nonzero value
     * <p>
     * Postcondition: the length of samples reflects the removal
     * of starting silence
     */
    public void trimSilenceFromBeginning() {
        int i = 0;
        while (samples[i] == 0) {
            i++;
        }
        int[] newArray = new int[samples.length - i];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = samples[j+i];
        }
        samples = newArray;
    }
}