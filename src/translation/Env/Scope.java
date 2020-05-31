package translation.Env;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private static int scope_ind = -1;
    private Map<String, Symbol> symbol_table;
    private int symbol_table_id;
    public Scope() {
        scope_ind++;

        this.symbol_table_id = scope_ind;
        this.symbol_table = new HashMap<>();
    }

    public boolean hasSymbol(String symbolName) {
        return this.symbol_table.containsKey(symbolName);
    }

    public Symbol getSymbol(String symbolName) {
        if (!hasSymbol(symbolName)) {
            throw new RuntimeException(
                    String.format(
                            "%s symbol wasn't declared in %s scope this Scope",
                            symbolName
                    ));
        }
        return this.symbol_table.get(symbolName);
    }

    public void addSymbol(Symbol symbol) {

        if (this.hasSymbol(symbol.getName())) {
            throw new RuntimeException(
                String.format(
                        "%s symbol has already declared in this scope",
                        symbol.getName()
                )
            );
        }

        this.symbol_table.put(symbol.getName(), symbol);
    }

    @Override
    public String toString() {
        return String.format(
                "S_%s",
                this.symbol_table_id
        );
    }
}
