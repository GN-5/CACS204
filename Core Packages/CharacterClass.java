public class CharacterClass {
    public static void main(String[] args) {
        char[] ch = { '2', 'B', 'v', ' ' };

        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(ch[i])) {
                System.out.println(ch[i] + " = digit");
            }

            if (Character.isLetter(ch[i])) {
                System.out.println(ch[i] + " = letter");
            }

            if (Character.isUpperCase(ch[i])) {
                System.out.println(ch[i] + " = uppercase");
            }

            if (Character.isLowerCase(ch[i])) {
                System.out.println(ch[i] + " = lowercase");
            }

            if (Character.isWhitespace(ch[i])) {
                System.out.println(ch[i] + " = whitespace");
            }
        }
    }
}
