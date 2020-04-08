package util;

import util.performance.JoinStringsInterface;

public class JoinStringsImplBuilder implements JoinStringsInterface {
    @Override
    public String join(String[] strings, String delimiter) {
        StringBuilder res = new StringBuilder();
        int size = strings.length;

        for (int i = 0; i < size; i++) {
            if (i != 0) res.append(delimiter);
            res.append(strings[i]);
        }

        return res.toString();
    }
}
