package ru.gb.ex001;

public class CaesarCipher {

    public static String caesarCipher(String text, boolean encrypt, int shift) {
        if (!encrypt) {
            shift = -shift;
        }

        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int offset = character - base;
                char shifted = (char) ((offset + shift + 26) % 26 + base);
                result.append(shifted);
            } else {
                // Если символ не является буквой, оставляем его без изменений
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "Hello, World!";
        int key = 3;

        String encrypted = caesarCipher(originalText, true, key);
        String decrypted = caesarCipher(encrypted, false, key);

        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}

