package translation;

import translation.Env.Symbol;

public class Temp {
    private static int t_ind = -1;
    private int ind = -1;
    private String constVal;
    private Symbol identifier;
    public Temp() {
        t_ind++;
        ind = t_ind;
    }
    public Temp(String constVal) {
        this.constVal = constVal;
    }

    public Temp(Symbol identifier) {
        this.identifier = identifier;
    }


    @Override
    public String toString() {
        if (ind != -1)
            return String.format("t%d", ind);
        else if (this.constVal != null)
            return this.constVal;
        else if (this.identifier != null)
            return this.identifier.toString();

        throw new RuntimeException("Error temp has invalid value");
    }
}
