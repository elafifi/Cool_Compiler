package translation.Env;

import java.util.LinkedList;
import java.util.List;

public class ScopeHandler {
    private static List<Scope> scopeStack;

    static {
        scopeStack = new LinkedList<>();
    }

    public static void pushScope() {
        Scope newScope = new Scope();
        scopeStack.add(0, newScope);
    }

    public static void popScope() {
        scopeStack.remove(0);
    }

    public static Symbol getSymbol(String symbolName) {
        int currentScopeIndex = 0;
        while(currentScopeIndex < scopeStack.size()) {

            Scope curScope = scopeStack.get(currentScopeIndex);
            if(curScope.hasSymbol(symbolName))
                return curScope.getSymbol(symbolName);

            ++currentScopeIndex;
        }

        throw new RuntimeException( String.format("%s is not found in %s Scope.", symbolName, getCurrentScopeName()) );
    }

    public static void addSymbol(Symbol symbol) {
        scopeStack.get(0).addSymbol(symbol);
    }

    public static String getCurrentScopeName() {
        return scopeStack.get(0).toString();
    }

}
