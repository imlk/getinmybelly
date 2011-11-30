package Transforms;

/**
 * Creates a spectogram from given data
 * @author Tom Pepels
 */
public class Spectogram {

    public static double[][] create(int window, double[] signal, int overlap) {
        int partitions = signal.length / (window - overlap);// window;
        double[][] specto = new double[partitions][window];
        System.out.println("Partitions: " + partitions);
        for (int i = 0; i < partitions - 1; i++) {

            int start = i * (window - overlap);
            int length = window;

            if (start + window > signal.length) {
                break;
            }

            System.out.println("[" + i + "] Start at: " + start + " end at: " + (start + length));
            double[] fSignals = new double[length];

            System.arraycopy(signal, start, fSignals, 0, length);
            //fSignals = DFT.DiscreteFourier(fSignals);
            fSignals = DFT.forward(fSignals);
            System.arraycopy(fSignals, 0, specto[i], 0, length);
        }

        return specto;
    }

    public static double[] inverse(int window, double[][] specto) {
        return new double[0];
    }
}
