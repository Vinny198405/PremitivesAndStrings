package util;

import util.performance.JoinStringsInterface;

public class JoinStringsImplString implements JoinStringsInterface {
    @Override
    public String join(String[] strings, String delimiter) {
        String res = "";
        int size = strings.length;

        for (int i = 0; i < size; i++) {
            if (i != 0) res += delimiter;
            res += strings[i];
        }

        return res;
    }
}

