package primitivesAndStringsTests;

class Encoder {
    private String encodingString;
    private int len;

    Encoder(String encodingString) {
        this.encodingString = encodingString;
        len = encodingString.length();
    }

    String code(int num) {
        StringBuilder res = new StringBuilder();
        do {
            res.insert(0, encodingString.charAt(num % len));
            num /= len;
        } while (num != 0);
        return res.toString();
    }

    int decode(String str) {
        int res = 0;
        for (char e : str.toCharArray()) {
            int index = encodingString.indexOf(e);
            if (index < 0) return -1;
            res = res * len + index;
        }
        return res;
    }
}
