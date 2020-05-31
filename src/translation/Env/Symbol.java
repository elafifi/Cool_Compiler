package translation.Env;

public class Symbol {
    private String name;
    private String type;

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format("%s_%s", this.name, this.type);
    }

}
